package com.tenpay.android.wechat;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Editable;
import android.text.TextPaint;
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
import com.tenpay.ndk.FitNativeEvent;
import com.tenpay.ndk.FitScUtil;
import com.tenpay.ndk.HkWxCryptoUtil;
import com.tenpay.ndk.MessageDigestUtil;
import j20.C117292a;
import java.lang.reflect.Field;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kg3.C76577a;
import kj2.C117407d;
import p206nj.C11171e;

public final class TenpaySecureEditText extends EditText {
    public static final int AREA_ID_CARD_TYPE_HUIXIANG = 5;
    public static final int AREA_ID_CARD_TYPE_SHENFEN = 1;
    public static final int AREA_ID_CARD_TYPE_TAIBAO = 9;
    private static int PASSWD_BLACK_DOT_SIZE = 7;
    private static int PASSWD_LEFT_PADDING = -1500000;
    private static String mTimeStamp;
    private int BANK_CARD_LENGTH_LIMIT;
    private int CARD_TAIL_SPACE;
    private int CVV_4_PAYMENT_LENGTH;
    private int CVV_PAYMENT_LENGTH;
    private int PASSWD_LENGTH;
    private int VALID_THRU_LEN;
    private ArrayList<TextWatcher> mBackupListeners;
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
    private I993EnvListener m_envCallBackListener;
    private boolean noUpdate;
    private byte[] randomKey;
    private byte[] realContent;
    private int realLength;
    private String regExFilterInput;

    /* renamed from: com.tenpay.android.wechat.TenpaySecureEditText$6 */
    public static /* synthetic */ class C752606 {

        /* renamed from: $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EditState */
        public static final /* synthetic */ int[] f221391x7d9c686f;

        /* renamed from: $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$EncryptMode */
        public static final /* synthetic */ int[] f221392x9df91f70;

        /* renamed from: $SwitchMap$com$tenpay$android$wechat$TenpaySecureEditText$HKSoftEncryMode */
        public static final /* synthetic */ int[] f221393x6f70ba7f;

        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|(2:19|20)|21|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|5|6|7|9|10|(2:11|12)|13|15|16|17|(2:19|20)|21|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|(2:19|20)|21|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00aa */
        static {
            /*
                com.tenpay.android.wechat.TenpaySecureEditText$HKSoftEncryMode[] r0 = com.tenpay.android.wechat.TenpaySecureEditText.HKSoftEncryMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f221393x6f70ba7f = r0
                r1 = 1
                com.tenpay.android.wechat.TenpaySecureEditText$HKSoftEncryMode r2 = com.tenpay.android.wechat.TenpaySecureEditText.HKSoftEncryMode.HKSOFT_RSA2048_WITH_MD5     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f221393x6f70ba7f     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tenpay.android.wechat.TenpaySecureEditText$HKSoftEncryMode r3 = com.tenpay.android.wechat.TenpaySecureEditText.HKSoftEncryMode.HKSOFT_RSA2048_WITH_PBKDF2     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.tenpay.android.wechat.TenpaySecureEditText$EncryptMode[] r2 = com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f221392x9df91f70 = r2
                com.tenpay.android.wechat.TenpaySecureEditText$EncryptMode r3 = com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.RSA1024_WITH_MD5     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f221392x9df91f70     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.tenpay.android.wechat.TenpaySecureEditText$EncryptMode r3 = com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.RSA2048_WITH_MD5     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f221392x9df91f70     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.tenpay.android.wechat.TenpaySecureEditText$EncryptMode r4 = com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.SM2_WITH_MD5     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                r3 = 4
                int[] r4 = f221392x9df91f70     // Catch:{ NoSuchFieldError -> 0x004e }
                com.tenpay.android.wechat.TenpaySecureEditText$EncryptMode r5 = com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.SM2_WITH_PBKDF2     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                com.tenpay.android.wechat.TenpaySecureEditText$EditState[] r4 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f221391x7d9c686f = r4
                com.tenpay.android.wechat.TenpaySecureEditText$EditState r5 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.BANKCARD     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r1 = f221391x7d9c686f     // Catch:{ NoSuchFieldError -> 0x0069 }
                com.tenpay.android.wechat.TenpaySecureEditText$EditState r4 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.BANKCARD_WITH_TAILNUM     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f221391x7d9c686f     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.tenpay.android.wechat.TenpaySecureEditText$EditState r1 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.VALID_THRU     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f221391x7d9c686f     // Catch:{ NoSuchFieldError -> 0x007d }
                com.tenpay.android.wechat.TenpaySecureEditText$EditState r1 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.SECURITY_ANSWER     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = f221391x7d9c686f     // Catch:{ NoSuchFieldError -> 0x0088 }
                com.tenpay.android.wechat.TenpaySecureEditText$EditState r1 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.COMMON_TEXT     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r0 = f221391x7d9c686f     // Catch:{ NoSuchFieldError -> 0x0093 }
                com.tenpay.android.wechat.TenpaySecureEditText$EditState r1 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r0 = f221391x7d9c686f     // Catch:{ NoSuchFieldError -> 0x009e }
                com.tenpay.android.wechat.TenpaySecureEditText$EditState r1 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_PAYMENT     // Catch:{ NoSuchFieldError -> 0x009e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r0 = f221391x7d9c686f     // Catch:{ NoSuchFieldError -> 0x00aa }
                com.tenpay.android.wechat.TenpaySecureEditText$EditState r1 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_4_PAYMENT     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                int[] r0 = f221391x7d9c686f     // Catch:{ NoSuchFieldError -> 0x00b6 }
                com.tenpay.android.wechat.TenpaySecureEditText$EditState r1 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.DEFAULT     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tenpay.android.wechat.TenpaySecureEditText.C752606.<clinit>():void");
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
        IDCARD_TAIL,
        COMMON_TEXT
    }

    public enum EncryptMode {
        RSA1024_WITH_MD5,
        RSA2048_WITH_MD5,
        SM2_WITH_MD5,
        SM2_WITH_PBKDF2
    }

    public static class EventLogger implements FitNativeEvent.Logger {
        private EventLogger() {
        }

        public void onLog(int i, String str) {
            Log.m105924i("TenpaySMLogger", "native event: [" + i + "], [" + str + "]");
        }
    }

    public enum HKSoftEncryMode {
        HKSOFT_RSA2048_WITH_MD5,
        HKSOFT_RSA2048_WITH_PBKDF2
    }

    public interface I993EnvListener {
        boolean is993Env();
    }

    public interface IKindaEditTextCallBackListener {
        void onCallBackKinda();
    }

    public TenpaySecureEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    private void drawCardTailNum(Canvas canvas) {
        if (EditState.BANKCARD_WITH_TAILNUM == this.mEditState && this.mIsCardTailNumCanDisplay) {
            int baseline = getBaseline();
            if (baseline == -1) {
                baseline = 44;
            }
            canvas.drawText(this.mCardTailNum, (((float) this.CARD_TAIL_SPACE) * this.mDensity) + getPaint().measureText(getText().toString()), (float) baseline, this.mTitlePaint);
        }
    }

    private void drawCvv4PaymentDot(Canvas canvas) {
        if (EditState.CVV_4_PAYMENT == this.mEditState && this.mPaintBackground != null) {
            int width = getWidth();
            int height = getHeight();
            int i = width / this.CVV_4_PAYMENT_LENGTH;
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
            int i = width / this.CVV_PAYMENT_LENGTH;
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

    private void eventLog(int i, String str) {
        Log.m105925i("TenpaySecureEditText", "err:%d %s" + i, str);
        FitNativeEvent.Logger listener = FitNativeEvent.getListener();
        if (listener != null) {
            listener.onLog(i, str);
        }
    }

    private String getInputText() {
        String obj = this.mEditState == EditState.SECURITY_ANSWER ? getText().toString() : getText().toString().trim();
        if (obj == null || obj.length() == 0) {
            return null;
        }
        int i = C752606.f221391x7d9c686f[this.mEditState.ordinal()];
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
            if (obj != null && obj.length() == this.VALID_THRU_LEN) {
                String substring = obj.substring(0, 2);
                obj = obj.substring(2) + substring;
            }
        } else if (!(i == 4 || i == 5)) {
            obj = obj.replaceAll(" ", "").replaceAll("x", "X");
        }
        if (Util.isNullOrNil(this.regExFilterInput)) {
            return obj;
        }
        String trim = Pattern.compile(this.regExFilterInput).matcher(obj).replaceAll("").trim();
        Log.m105924i("TenpaySecureEditText", "use filter");
        return trim;
    }

    private void init(Context context, AttributeSet attributeSet) {
        int[] resourceDeclareStyleableIntArray;
        TypedArray obtainStyledAttributes;
        this.mDensity = getResources().getDisplayMetrics().density;
        initLogger();
        if (!(attributeSet == null || (resourceDeclareStyleableIntArray = TenpayUtil.getResourceDeclareStyleableIntArray(context, "TenpaySecureEditText")) == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resourceDeclareStyleableIntArray)) == null)) {
            setIsPasswordFormat(obtainStyledAttributes.getBoolean(TenpayUtil.getResourceDeclareStyleableIndex(context, "TenpaySecureEditText_isPassword"), false), true);
            setIsBankcardFormat(obtainStyledAttributes.getBoolean(TenpayUtil.getResourceDeclareStyleableIndex(context, "TenpaySecureEditText_isBankcard"), false));
            setIsValidThru(obtainStyledAttributes.getBoolean(TenpayUtil.getResourceDeclareStyleableIndex(context, "TenpaySecureEditText_isValidThru"), false));
            setBankcardTailNum(obtainStyledAttributes.getString(TenpayUtil.getResourceDeclareStyleableIndex(context, "TenpaySecureEditText_bankcardTailNum")));
            int resourceId = obtainStyledAttributes.getResourceId(TenpayUtil.getResourceDeclareStyleableIndex(context, "TenpaySecureEditText_rightClearDrawable"), 0);
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

    private void initLogger() {
        FitNativeEvent.setListener(new EventLogger());
    }

    private boolean is993Abtest() {
        I993EnvListener i993EnvListener = this.m_envCallBackListener;
        if (i993EnvListener != null) {
            return i993EnvListener.is993Env();
        }
        return false;
    }

    private void removeAllListeners() {
        ArrayList<TextWatcher> arrayList = this.mBackupListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                super.removeTextChangedListener(arrayList.get(i));
            }
        }
    }

    private void restoreAllListeners() {
        ArrayList<TextWatcher> arrayList = this.mBackupListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                super.addTextChangedListener(arrayList.get(i));
            }
        }
    }

    public static void setSalt(String str) {
        Log.m105925i("TenpaySecureEditText", "check salt: %s", str);
        if ((Integer.decode(BuildInfo.CLIENT_VERSION).intValue() & 255) < 48) {
            Log.m105925i("TenpaySecureEditText", "check salt stack: %s", Util.getStack());
        }
        mTimeStamp = str;
    }

    private void updateText(String str) {
        if (this.noUpdate) {
            this.noUpdate = false;
            return;
        }
        int length = str.length();
        if (this.randomKey != null && length <= this.PASSWD_LENGTH) {
            if (this.realLength == 0) {
                new SecureRandom().nextBytes(this.randomKey);
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
            removeAllListeners();
            setText(stringBuffer.toString());
            setSelection(this.realLength);
            restoreAllListeners();
        }
    }

    public void ClearInput() {
        setText("");
        this.realLength = 0;
        for (int i = 0; i < this.PASSWD_LENGTH; i++) {
            this.realContent[i] = 0;
        }
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.mBackupListeners == null) {
            this.mBackupListeners = new ArrayList<>();
        }
        this.mBackupListeners.add(textWatcher);
        super.addTextChangedListener(textWatcher);
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

    public String get993EncryptPassword(long j, String str, String str2, int i) {
        FitScUtil fitScUtil = new FitScUtil();
        fitScUtil.initTsm();
        return fitScUtil.encryptPassWithCert("-----BEGIN CERTIFICATE-----\nMIICcTCCAhigAwIBAgIKMTIzNDU2Nzg5MDAKBggqgRzPVQGDdTB5MRMwEQYDVQQD\nDAp0ZW5wYXkuY29tMQswCQYDVQQGEwJDTjESMBAGA1UECAwJR3VhbmdEb25nMREw\nDwYDVQQHDAhTaGVuWmhlbjEUMBIGA1UECgwLVGVucGF5IEluYy4xGDAWBgkqhkiG\n9w0BCQEWCWNhQHFxLmNvbTAiGA8yMDIyMDYxMzExNDAyN1oYDzIwMjcwNjEyMTE0\nMDI3WjCBoTETMBEGA1UEAwwKdGVucGF5LmNvbTELMAkGA1UEBhMCQ04xEDAOBgNV\nBAgMB0JlaWppbmcxEDAOBgNVBAcMB0JlaWppbmcxHjAcBgkqhkiG9w0BCQEWDzM0\nNTM4NDU2QHFxLmNvbTEQMA4GA1UECwwHT1UtRklUMTEQMA4GA1UECwwHT1UtRklU\nMjEVMBMGA1UECgwMQ3J5b3RvZ3JhcGh5MFkwEwYHKoZIzj0CAQYIKoEcz1UBgi0D\nQgAE1JmRUm1KUMdQHqSZuQu+5VreMmgzKsAIiMMltBxV9ofXvB/P7PGm+ih3ZaFl\nmT7KYaRm38p2CcuIhDiCiaSd8KNbMFkwHwYDVR0jBBgwFoAUV8nOG6rZPfnCPMWW\nMYZERrLJgGgwHQYDVR0OBBYEFPDKv4y/f8TYo2yPaa/ZnrbYg/V6MAkGA1UdEwQC\nMAAwDAYDVR0PBAUDAwc4ADAKBggqgRzPVQGDdQNHADBEAiASVMWU+SxnJdLppc11\nup7KAgFrCV/CJFYclN+OEb7chAIgGMV7ihaSfnEkRz3GInIWTVDhHubW3JXdNhXj\nCKObm4k=\n-----END CERTIFICATE-----", str2.getBytes(), "wxpay-pbkdf2".getBytes(), j, str, i, false);
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

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getEncryptPassword(com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode r18, long r19, java.lang.String r21) {
        /*
            r17 = this;
            r7 = r17
            int r0 = r7.realLength
            int r1 = r7.PASSWD_LENGTH
            r2 = 0
            if (r0 == r1) goto L_0x000a
            return r2
        L_0x000a:
            byte[] r0 = new byte[r0]
            r8 = 0
            r1 = 0
        L_0x000e:
            int r3 = r7.realLength
            if (r1 >= r3) goto L_0x0021
            byte[] r3 = r7.realContent
            byte r3 = r3[r1]
            byte[] r4 = r7.randomKey
            byte r4 = r4[r1]
            r3 = r3 ^ r4
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r1 + 1
            goto L_0x000e
        L_0x0021:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            java.lang.String r5 = com.tenpay.android.wechat.TenpayUtil.md5HexDigest(r1)
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r3 = r18.ordinal()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r8] = r3
            int r3 = r5.length()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r15 = 1
            r1[r15] = r3
            int r3 = r21.length()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 2
            r1[r6] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r19)
            r4 = 3
            r1[r4] = r3
            java.lang.String r3 = "TenpaySecureEditText"
            java.lang.String r9 = "encrypt mode %d, md5 text length:%d, nonce length:%d, timestamp:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r1)
            int[] r1 = com.tenpay.android.wechat.TenpaySecureEditText.C752606.f221392x9df91f70
            int r3 = r18.ordinal()
            r1 = r1[r3]
            if (r1 == r15) goto L_0x01fd
            if (r1 == r6) goto L_0x01ec
            java.lang.String r3 = ""
            r14 = 25425(0x6351, float:3.5628E-41)
            java.lang.String r13 = "WxSmCryptoUtil"
            if (r1 == r4) goto L_0x012e
            if (r1 == r0) goto L_0x0072
            return r2
        L_0x0072:
            com.tenpay.ndk.WxSmCryptoUtil r9 = com.tenpay.ndk.WxSmCryptoUtil.getInstance()     // Catch:{ Exception -> 0x00b0 }
            r0 = 7
            r10 = r5
            r11 = r19
            r1 = r13
            r13 = r21
            r14 = r0
            java.lang.String r9 = r9.encryptPassword(r10, r11, r13, r14)     // Catch:{ Exception -> 0x00a9 }
            boolean r0 = r17.is993Abtest()     // Catch:{ Exception -> 0x00a1 }
            if (r0 == 0) goto L_0x009c
            r0 = 7
            r14 = r1
            r1 = r17
            r13 = r3
            r2 = r19
            r11 = 3
            r4 = r21
            r16 = 2
            r6 = r0
            java.lang.String r9 = r1.get993EncryptPassword(r2, r4, r5, r6)     // Catch:{ Exception -> 0x009a }
            goto L_0x00c9
        L_0x009a:
            r0 = move-exception
            goto L_0x00a7
        L_0x009c:
            r14 = r1
            r11 = 3
            r16 = 2
            goto L_0x00c9
        L_0x00a1:
            r0 = move-exception
            r14 = r1
            r13 = r3
            r11 = 3
            r16 = 2
        L_0x00a7:
            r2 = r9
            goto L_0x00b6
        L_0x00a9:
            r0 = move-exception
            r14 = r1
            r13 = r3
            r11 = 3
            r16 = 2
            goto L_0x00b6
        L_0x00b0:
            r0 = move-exception
            r14 = r13
            r11 = 3
            r16 = 2
            r13 = r3
        L_0x00b6:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r13, r1)
            com.tenpay.ndk.WxSmCryptoUtil r0 = com.tenpay.ndk.WxSmCryptoUtil.getInstance()
            int r0 = r0.getLastError()
            java.lang.String r1 = "SM2_WITH_PBKDF2, getLastError"
            r7.eventLog(r0, r1)
            r9 = r2
        L_0x00c9:
            com.tenpay.ndk.WxSmCryptoUtil r0 = com.tenpay.ndk.WxSmCryptoUtil.getInstance()
            int r0 = r0.getLastError()
            if (r0 != 0) goto L_0x00db
            if (r9 == 0) goto L_0x00db
            int r1 = r9.length()
            if (r1 != 0) goto L_0x012d
        L_0x00db:
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1[r8] = r2
            java.lang.String r2 = "SM2_WITH_PBKDF2 encryptPassword error, error code:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r2, r1)
            if (r9 == 0) goto L_0x010d
            int r1 = r9.length()
            if (r1 != 0) goto L_0x00f1
            goto L_0x010d
        L_0x00f1:
            kj2.d r1 = kj2.C117407d.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r2[r8] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r15] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2[r16] = r0
            r6 = 25425(0x6351, float:3.5628E-41)
            r1.mo160131h(r6, r2)
            goto L_0x012d
        L_0x010d:
            r6 = 25425(0x6351, float:3.5628E-41)
            java.lang.String r1 = "SM2_WITH_PBKDF2 pwd is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r1)
            kj2.d r1 = kj2.C117407d.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r2[r8] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r15] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r2[r16] = r0
            r1.mo160131h(r6, r2)
        L_0x012d:
            return r9
        L_0x012e:
            r14 = r13
            r6 = 25425(0x6351, float:3.5628E-41)
            r11 = 3
            r16 = 2
            r13 = r3
            com.tenpay.ndk.WxSmCryptoUtil r9 = com.tenpay.ndk.WxSmCryptoUtil.getInstance()     // Catch:{ Exception -> 0x0172 }
            r0 = 6
            r10 = r5
            r4 = 3
            r11 = r19
            r3 = r13
            r13 = r21
            r1 = r14
            r14 = r0
            java.lang.String r9 = r9.encryptPassword(r10, r11, r13, r14)     // Catch:{ Exception -> 0x016e }
            boolean r0 = r17.is993Abtest()     // Catch:{ Exception -> 0x0166 }
            if (r0 == 0) goto L_0x0161
            r0 = 6
            r10 = r1
            r1 = r17
            r11 = r3
            r2 = r19
            r12 = 3
            r4 = r21
            r13 = 25425(0x6351, float:3.5628E-41)
            r6 = r0
            java.lang.String r9 = r1.get993EncryptPassword(r2, r4, r5, r6)     // Catch:{ Exception -> 0x015f }
            goto L_0x018b
        L_0x015f:
            r0 = move-exception
            goto L_0x016c
        L_0x0161:
            r10 = r1
            r12 = 3
            r13 = 25425(0x6351, float:3.5628E-41)
            goto L_0x018b
        L_0x0166:
            r0 = move-exception
            r10 = r1
            r11 = r3
            r12 = 3
            r13 = 25425(0x6351, float:3.5628E-41)
        L_0x016c:
            r2 = r9
            goto L_0x0178
        L_0x016e:
            r0 = move-exception
            r10 = r1
            r11 = r3
            goto L_0x0175
        L_0x0172:
            r0 = move-exception
            r11 = r13
            r10 = r14
        L_0x0175:
            r12 = 3
            r13 = 25425(0x6351, float:3.5628E-41)
        L_0x0178:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r11, r1)
            com.tenpay.ndk.WxSmCryptoUtil r0 = com.tenpay.ndk.WxSmCryptoUtil.getInstance()
            int r0 = r0.getLastError()
            java.lang.String r1 = "SM2_WITH_MD5, getLastError"
            r7.eventLog(r0, r1)
            r9 = r2
        L_0x018b:
            com.tenpay.ndk.WxSmCryptoUtil r0 = com.tenpay.ndk.WxSmCryptoUtil.getInstance()
            int r0 = r0.getLastError()
            if (r0 != 0) goto L_0x019d
            if (r9 == 0) goto L_0x019d
            int r1 = r9.length()
            if (r1 != 0) goto L_0x01eb
        L_0x019d:
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1[r8] = r2
            java.lang.String r2 = "SM2_WITH_MD5 encryptPassword error, error code:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r1)
            if (r9 == 0) goto L_0x01cd
            int r1 = r9.length()
            if (r1 != 0) goto L_0x01b3
            goto L_0x01cd
        L_0x01b3:
            kj2.d r1 = kj2.C117407d.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r2[r8] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r15] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2[r16] = r0
            r1.mo160131h(r13, r2)
            goto L_0x01eb
        L_0x01cd:
            java.lang.String r1 = "SM2_WITH_MD5 pwd is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            kj2.d r1 = kj2.C117407d.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r2[r8] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r15] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r2[r16] = r0
            r1.mo160131h(r13, r2)
        L_0x01eb:
            return r9
        L_0x01ec:
            com.tenpay.ndk.Encrypt r0 = new com.tenpay.ndk.Encrypt
            r0.<init>()
            java.lang.String r1 = mTimeStamp
            if (r1 == 0) goto L_0x01f8
            r0.setTimeStamp(r1)
        L_0x01f8:
            java.lang.String r0 = r0.encryptPasswdWithRSA2048(r5)
            return r0
        L_0x01fd:
            com.tenpay.ndk.Encrypt r0 = new com.tenpay.ndk.Encrypt
            r0.<init>()
            java.lang.String r1 = mTimeStamp
            if (r1 == 0) goto L_0x0209
            r0.setTimeStamp(r1)
        L_0x0209:
            java.lang.String r0 = r0.encryptPasswd(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.android.wechat.TenpaySecureEditText.getEncryptPassword(com.tenpay.android.wechat.TenpaySecureEditText$EncryptMode, long, java.lang.String):java.lang.String");
    }

    public String getHKSoftEncryptPassword(HKSoftEncryMode hKSoftEncryMode, long j, String str, String str2) {
        int i = this.realLength;
        if (i != this.PASSWD_LENGTH) {
            return null;
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < this.realLength; i2++) {
            bArr[i2] = (byte) (this.realContent[i2] ^ this.randomKey[i2]);
        }
        if (str2 == null || j == 0) {
            return null;
        }
        return HkWxCryptoUtil.encryptPassword(bArr, str2.getBytes(), j, str, C752606.f221393x6f70ba7f[hKSoftEncryMode.ordinal()] != 1 ? 2 : 1);
    }

    public int getInputLength() {
        String inputText = getInputText();
        if (inputText == null) {
            return 0;
        }
        return inputText.length();
    }

    public String getPasswordHash() {
        if (this.mEditState != EditState.PASSWORD) {
            return null;
        }
        byte[] bArr = new byte[this.realLength];
        for (int i = 0; i < this.realLength; i++) {
            bArr[i] = (byte) (this.realContent[i] ^ this.randomKey[i]);
        }
        return new MessageDigestUtil().getSHA256Hex(bArr);
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
        return getInputLength() >= this.BANK_CARD_LENGTH_LIMIT || getText().toString().contains("**");
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
        if (!TextUtils.isEmpty(this.mFixedHeaderText) && getText().length() > 0) {
            TextPaint paint = getPaint();
            canvas.drawText(this.mFixedHeaderText, ((float) getWidth()) - paint.measureText(this.mFixedHeaderText + getText().toString()), (float) getBaseline(), getPaint());
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
        if (!(this.mFilterChar == null || TextUtils.isEmpty(charSequence) || this.mEditState == EditState.PASSWORD)) {
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
                int i7 = C752606.f221391x7d9c686f[editState2.ordinal()];
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
                    if (i7 == 6) {
                        updateText(obj);
                        if (obj.length() == this.PASSWD_LENGTH && (onPasswdInputListener = this.mPasswdListener) != null) {
                            onPasswdInputListener.onDone();
                        }
                    } else if (i7 != 7) {
                        if (i7 == 8) {
                            if (obj.length() == this.CVV_4_PAYMENT_LENGTH && (onPasswdInputListener3 = this.mPasswdListener) != null) {
                                onPasswdInputListener3.onDone();
                            }
                        }
                    } else if (obj.length() == this.CVV_PAYMENT_LENGTH && (onPasswdInputListener2 = this.mPasswdListener) != null) {
                        onPasswdInputListener2.onDone();
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

    public void removeTextChangedListener(TextWatcher textWatcher) {
        int indexOf;
        ArrayList<TextWatcher> arrayList = this.mBackupListeners;
        if (arrayList != null && (indexOf = arrayList.indexOf(textWatcher)) >= 0) {
            this.mBackupListeners.remove(indexOf);
        }
        super.removeTextChangedListener(textWatcher);
    }

    public void set3DesEncrptData(String str) {
        if (str != null && str.length() != 0) {
            Encrypt encrypt = new Encrypt();
            setText(encrypt.desedeDecode(str, encrypt.getRandomKey()));
        }
    }

    public void set993EnvCallBackListener(I993EnvListener i993EnvListener) {
        this.m_envCallBackListener = i993EnvListener;
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
            if (C11171e.m11046c(29)) {
                Drawable drawable = getContext().getDrawable(i);
                if (drawable != null) {
                    setCursorStyle(drawable);
                    return;
                }
                return;
            }
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

    public void setIsCommonTextFormat(boolean z) {
        if (z) {
            this.mEditState = EditState.COMMON_TEXT;
        } else {
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
        if (str != null && str.length() == this.VALID_THRU_LEN) {
            setText(str);
            this.mEditState = EditState.VALID_THRU;
        }
    }

    public void setregExFilterInput(String str) {
        this.regExFilterInput = str;
    }

    public TenpaySecureEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mEditState = EditState.DEFAULT;
        this.mNewPwdStyle = true;
        this.PASSWD_LENGTH = 6;
        this.CVV_PAYMENT_LENGTH = 3;
        this.CVV_4_PAYMENT_LENGTH = 4;
        this.BANK_CARD_LENGTH_LIMIT = 14;
        this.CARD_TAIL_SPACE = 15;
        this.VALID_THRU_LEN = 4;
        this.mIEncrypt = new TenpaySecureEncrypt();
        int i = this.PASSWD_LENGTH;
        this.randomKey = new byte[i];
        this.realContent = new byte[i];
        this.realLength = 0;
        this.noUpdate = false;
        init(context, attributeSet);
    }

    public String getEncryptDataWithHash(boolean z, boolean z2) {
        String str;
        if (this.mEditState == EditState.PASSWORD) {
            int i = this.realLength;
            if (i != this.PASSWD_LENGTH) {
                return null;
            }
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < this.realLength; i2++) {
                bArr[i2] = (byte) (this.realContent[i2] ^ this.randomKey[i2]);
            }
            str = new String(bArr);
        } else {
            str = getInputText();
            if (str == null || str.length() == 0) {
                return null;
            }
        }
        Log.m105925i("TenpaySecureEditText", "timestamp: %s, 2048: %s", mTimeStamp, Boolean.valueOf(z2));
        ISecureEncrypt iSecureEncrypt = this.mIEncrypt;
        if (iSecureEncrypt == null) {
            if (z) {
                str = TenpayUtil.md5HexDigest(str);
            }
            Encrypt encrypt = new Encrypt();
            String str2 = mTimeStamp;
            if (str2 != null) {
                encrypt.setTimeStamp(str2);
            }
            if (z2) {
                return encrypt.encryptPasswdWithRSA2048(str);
            }
            return encrypt.encryptPasswd(str);
        } else if (z2) {
            String encryptPasswdWithRSA2048 = iSecureEncrypt.encryptPasswdWithRSA2048(z, str, mTimeStamp);
            if (encryptPasswdWithRSA2048 == null || encryptPasswdWithRSA2048.length() == 0) {
                C117407d.INSTANCE.mo160131h(25425, 1, 1, 1);
            }
            return encryptPasswdWithRSA2048;
        } else {
            String encryptPasswd = iSecureEncrypt.encryptPasswd(z, str, mTimeStamp);
            if (encryptPasswd == null || encryptPasswd.length() == 0) {
                C117407d.INSTANCE.mo160131h(25425, 0, 1, 1);
            }
            return encryptPasswd;
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
                    r6 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD;
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
                        com.tenpay.android.wechat.TenpaySecureEditText r6 = com.tenpay.android.wechat.TenpaySecureEditText.this
                        android.graphics.drawable.Drawable[] r2 = r6.getCompoundDrawables()
                        r1 = r2[r1]
                        com.tenpay.android.wechat.TenpaySecureEditText r2 = com.tenpay.android.wechat.TenpaySecureEditText.this
                        android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawables()
                        r0 = r2[r0]
                        r2 = 0
                        com.tenpay.android.wechat.TenpaySecureEditText r3 = com.tenpay.android.wechat.TenpaySecureEditText.this
                        android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawables()
                        r5 = r3[r5]
                        r6.setCompoundDrawables(r1, r0, r2, r5)
                        goto L_0x0063
                    L_0x0022:
                        com.tenpay.android.wechat.TenpaySecureEditText r6 = com.tenpay.android.wechat.TenpaySecureEditText.this
                        android.text.Editable r6 = r6.getText()
                        java.lang.String r6 = r6.toString()
                        java.lang.String r2 = ""
                        boolean r6 = r6.equals(r2)
                        if (r6 != 0) goto L_0x0063
                        com.tenpay.android.wechat.TenpaySecureEditText$EditState r6 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.PASSWORD
                        com.tenpay.android.wechat.TenpaySecureEditText r2 = com.tenpay.android.wechat.TenpaySecureEditText.this
                        com.tenpay.android.wechat.TenpaySecureEditText$EditState r3 = r2.mEditState
                        if (r6 == r3) goto L_0x0063
                        com.tenpay.android.wechat.TenpaySecureEditText$EditState r6 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_PAYMENT
                        if (r6 == r3) goto L_0x0063
                        com.tenpay.android.wechat.TenpaySecureEditText$EditState r6 = com.tenpay.android.wechat.TenpaySecureEditText.EditState.CVV_4_PAYMENT
                        if (r6 == r3) goto L_0x0063
                        android.graphics.drawable.Drawable[] r6 = r2.getCompoundDrawables()
                        r6 = r6[r1]
                        com.tenpay.android.wechat.TenpaySecureEditText r1 = com.tenpay.android.wechat.TenpaySecureEditText.this
                        android.graphics.drawable.Drawable[] r1 = r1.getCompoundDrawables()
                        r0 = r1[r0]
                        com.tenpay.android.wechat.TenpaySecureEditText r1 = com.tenpay.android.wechat.TenpaySecureEditText.this
                        android.graphics.drawable.Drawable r1 = r1.mClearBtnImg
                        com.tenpay.android.wechat.TenpaySecureEditText r3 = com.tenpay.android.wechat.TenpaySecureEditText.this
                        android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawables()
                        r5 = r3[r5]
                        r2.setCompoundDrawables(r6, r0, r1, r5)
                    L_0x0063:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tenpay.android.wechat.TenpaySecureEditText.C752562.onFocusChange(android.view.View, boolean):void");
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
                    C117292a.m165356b("com/tenpay/android/wechat/TenpaySecureEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    EditState editState = EditState.PASSWORD;
                    TenpaySecureEditText tenpaySecureEditText = TenpaySecureEditText.this;
                    EditState editState2 = tenpaySecureEditText.mEditState;
                    if (!(editState == editState2 || EditState.CVV_PAYMENT == editState2 || EditState.CVV_4_PAYMENT == editState2)) {
                        if (motionEvent.getAction() == 1 && !tenpaySecureEditText.isFocused() && TenpaySecureEditText.this.mKindaEditTextCallBackListener != null) {
                            TenpaySecureEditText.this.mKindaEditTextCallBackListener.onCallBackKinda();
                        }
                        if (tenpaySecureEditText.getCompoundDrawables()[2] == null) {
                            C117292a.m165362h(false, this, "com/tenpay/android/wechat/TenpaySecureEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            return false;
                        } else if (motionEvent.getAction() != 1) {
                            C117292a.m165362h(false, this, "com/tenpay/android/wechat/TenpaySecureEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            return false;
                        } else if (motionEvent.getX() > ((float) ((tenpaySecureEditText.getWidth() - tenpaySecureEditText.getPaddingRight()) - TenpaySecureEditText.this.mClearBtnImg.getIntrinsicWidth()))) {
                            tenpaySecureEditText.setText("");
                        }
                    }
                    C117292a.m165362h(false, this, "com/tenpay/android/wechat/TenpaySecureEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
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
                C117292a.m165356b("com/tenpay/android/wechat/TenpaySecureEditText$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                C117292a.m165362h(false, this, "com/tenpay/android/wechat/TenpaySecureEditText$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
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

    public void setCursorStyle(Drawable drawable) {
        Drawable textCursorDrawable = getTextCursorDrawable();
        if (textCursorDrawable == null) {
            setTextCursorDrawable(new LayerDrawable(new Drawable[]{drawable}));
        } else if (textCursorDrawable instanceof LayerDrawable) {
            ((LayerDrawable) textCursorDrawable).setDrawable(0, drawable);
        } else {
            Log.m105928w("TenpaySecureEditText", "can't change cursor drawable, check if you have set cursor on xml");
        }
    }

    public TenpaySecureEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mEditState = EditState.DEFAULT;
        this.mNewPwdStyle = true;
        this.PASSWD_LENGTH = 6;
        this.CVV_PAYMENT_LENGTH = 3;
        this.CVV_4_PAYMENT_LENGTH = 4;
        this.BANK_CARD_LENGTH_LIMIT = 14;
        this.CARD_TAIL_SPACE = 15;
        this.VALID_THRU_LEN = 4;
        this.mIEncrypt = new TenpaySecureEncrypt();
        int i2 = this.PASSWD_LENGTH;
        this.randomKey = new byte[i2];
        this.realContent = new byte[i2];
        this.realLength = 0;
        this.noUpdate = false;
        init(context, attributeSet);
    }
}
