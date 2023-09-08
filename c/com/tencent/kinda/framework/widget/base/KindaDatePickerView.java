package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.DatePickerType;
import com.tencent.kinda.gen.KDate;
import com.tencent.kinda.gen.KDatePickerView;
import com.tencent.kinda.gen.KDatePickerViewOnSelectCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import com.tencent.p014mm.p136ui.widget.picker.CustomDatePickerNew;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class KindaDatePickerView extends MMKView<View> implements KDatePickerView {
    private static final String TAG = "KindaDatePickerView";
    private UIPageFragmentActivity activity;
    /* access modifiers changed from: private */
    public KDatePickerViewOnSelectCallback callback;
    /* access modifiers changed from: private */
    public C19877i datePicker;
    /* access modifiers changed from: private */
    public boolean isLongTerm = false;
    private Calendar mCalendar;
    /* access modifiers changed from: private */
    public LinearLayout mContainer;
    /* access modifiers changed from: private */
    public int mDay = -1;
    /* access modifiers changed from: private */
    public TenpaySecureEditText mEditText;
    /* access modifiers changed from: private */
    public int mMonthOfYear = -1;
    /* access modifiers changed from: private */
    public String mShowResult = "";
    private DatePickerType mType = DatePickerType.BIRTH_DAY;
    /* access modifiers changed from: private */
    public int mYear = -1;

    private Calendar calendar() {
        if (this.mCalendar == null) {
            this.mCalendar = Calendar.getInstance();
        }
        return this.mCalendar;
    }

    /* access modifiers changed from: private */
    public String getEncString() {
        int i;
        if (!this.isLongTerm || (i = this.mYear) != 9999) {
            return this.mEditText.get3DesEncrptData(this.mShowResult.replaceAll("/", ""));
        }
        return this.mEditText.get3DesEncrptData(String.format("%04d%02d%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.mMonthOfYear), Integer.valueOf(this.mDay)}));
    }

    private void initDatePicker() {
        UIPageFragmentActivity uIPageFragmentActivity = this.activity;
        if (uIPageFragmentActivity == null) {
            Log.m105920e(TAG, "activity is null!");
        } else {
            this.datePicker = new C19877i(uIPageFragmentActivity);
        }
    }

    private void initDatePickerData() {
        String[] split = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date()).split("-");
        this.mYear = Util.safeParseInt(split[0]);
        this.mMonthOfYear = Util.safeParseInt(split[1]);
        this.mDay = Util.safeParseInt(split[2]);
    }

    private void setMinAndMaxDate(DatePickerType datePickerType) {
        CustomDatePickerNew customDatePickerNew;
        C19877i iVar = this.datePicker;
        if (iVar != null) {
            if (datePickerType == DatePickerType.BIRTH_DAY) {
                iVar.mo26535e(WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID, 1, 1);
                String[] split = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date()).split("-");
                if (split.length >= 3) {
                    this.datePicker.mo26534d(Util.safeParseInt(split[0]), Util.safeParseInt(split[1]), Util.safeParseInt(split[2]));
                }
            } else if (datePickerType == DatePickerType.IDENTITY_VALID_DATE) {
                String[] split2 = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date()).split("-");
                if (split2.length >= 3) {
                    this.datePicker.mo26535e(Util.safeParseInt(split2[0]), Util.safeParseInt(split2[1]), Util.safeParseInt(split2[2]));
                    this.datePicker.mo26534d(Util.safeParseInt(split2[0]) + 100, 12, 31);
                }
                if (this.isLongTerm && (customDatePickerNew = this.datePicker.f56637n) != null) {
                    customDatePickerNew.setLongTermYear(true);
                }
            } else if (datePickerType == DatePickerType.IDENTITY_EFFECT_DATE) {
                String[] split3 = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date()).split("-");
                if (split3.length >= 3) {
                    this.datePicker.mo26534d(Util.safeParseInt(split3[0]), Util.safeParseInt(split3[1]), Util.safeParseInt(split3[2]));
                    int safeParseInt = Util.safeParseInt(split3[0]) - 100;
                    if (safeParseInt < 1) {
                        safeParseInt = 1;
                    }
                    this.datePicker.mo26535e(safeParseInt, 1, 1);
                }
            }
        }
    }

    public KDate currentDate() {
        Calendar calendar = calendar();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return new KDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
    }

    public boolean getCanBeLongTerm() {
        return this.isLongTerm;
    }

    public KDate getEndDate() {
        return null;
    }

    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    public KDate getSelectedDate() {
        return new KDate(this.mYear, this.mMonthOfYear, this.mDay);
    }

    public KDate getStartDate() {
        return null;
    }

    public DatePickerType getType() {
        return this.mType;
    }

    public String getValue() {
        return getEncString();
    }

    public void setCanBeLongTerm(boolean z) {
        this.isLongTerm = z;
        CustomDatePickerNew customDatePickerNew = this.datePicker.f56637n;
        if (customDatePickerNew != null) {
            customDatePickerNew.setLongTermYear(z);
        }
    }

    public void setEndDate(KDate kDate) {
    }

    public void setFocus(boolean z) {
        if (z) {
            UIPageFragmentActivity uIPageFragmentActivity = this.activity;
            if (uIPageFragmentActivity == null) {
                Log.m105920e(TAG, "activity is null!");
                return;
            }
            uIPageFragmentActivity.hideVKB();
            this.activity.hideTenpayKB();
            this.datePicker = new C19877i(this.activity);
            setMinAndMaxDate(this.mType);
            C19877i iVar = this.datePicker;
            CustomDatePickerNew customDatePickerNew = iVar.f56637n;
            if (customDatePickerNew != null) {
                customDatePickerNew.f56579o = true;
                customDatePickerNew.f56580p = true;
                customDatePickerNew.f56581q = true;
            }
            iVar.f56638o = new C19877i.C19878a() {
                public void onResult(boolean z, int i, int i2, int i3) {
                    KindaDatePickerView.this.datePicker.mo26532b();
                    Log.m105918d(KindaDatePickerView.TAG, "onDateChanged，year：" + i + "，month：" + i2 + "，day：" + i3 + "，hasSetResult：" + z);
                    if (z) {
                        int unused = KindaDatePickerView.this.mYear = i;
                        int unused2 = KindaDatePickerView.this.mMonthOfYear = i2;
                        int unused3 = KindaDatePickerView.this.mDay = i3;
                        if (!KindaDatePickerView.this.isLongTerm || i != 1) {
                            String unused4 = KindaDatePickerView.this.mShowResult = String.format("%04d/%02d/%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
                        } else {
                            int unused5 = KindaDatePickerView.this.mYear = 9999;
                            int unused6 = KindaDatePickerView.this.mMonthOfYear = 12;
                            int unused7 = KindaDatePickerView.this.mDay = 31;
                            String unused8 = KindaDatePickerView.this.mShowResult = MMApplicationContext.getContext().getString(C67448R.string.ldh);
                        }
                        KindaDatePickerView.this.mEditText.setText(KindaDatePickerView.this.mShowResult);
                        KindaDatePickerView.this.mContainer.setContentDescription(KindaDatePickerView.this.mShowResult);
                        KindaDatePickerView.this.callback.onSelect(KindaDatePickerView.this.getEncString());
                    }
                }
            };
            int i = this.mYear;
            if (i == 9999) {
                Log.m105924i(TAG, "init long term");
                this.datePicker.mo26533c(1, 1, 1);
            } else {
                this.datePicker.mo26533c(i, this.mMonthOfYear, this.mDay);
            }
            this.datePicker.mo26536f();
            return;
        }
        C19877i iVar2 = this.datePicker;
        if (iVar2 != null) {
            iVar2.mo26532b();
        }
    }

    public void setHint(String str) {
        TenpaySecureEditText tenpaySecureEditText = this.mEditText;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setHint(str);
            if (this.mContainer != null && Util.isNullOrNil((CharSequence) this.mEditText.getText())) {
                this.mContainer.setContentDescription(str);
            }
        }
    }

    public void setOnSelectCallback(KDatePickerViewOnSelectCallback kDatePickerViewOnSelectCallback) {
        this.callback = kDatePickerViewOnSelectCallback;
    }

    public void setOriginDate(int i, int i2, int i3) {
        this.mYear = i;
        this.mMonthOfYear = i2;
        this.mDay = i3;
        if (!this.isLongTerm || i != 9999) {
            String format = String.format("%04d/%02d/%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            this.mShowResult = format;
            this.mEditText.setText(format);
        } else {
            String string = MMApplicationContext.getContext().getString(C67448R.string.ldh);
            this.mShowResult = string;
            this.mEditText.setText(string);
        }
        this.mContainer.setContentDescription(this.mShowResult);
    }

    public void setStartDate(KDate kDate) {
    }

    public void setType(DatePickerType datePickerType) {
        this.mType = datePickerType;
        if (datePickerType == DatePickerType.BIRTH_DAY) {
            this.mEditText.setHint(C0966R.string.f361548kq0);
            if (Util.isNullOrNil((CharSequence) this.mEditText.getText())) {
                this.mContainer.setContentDescription(MMApplicationContext.getContext().getString(C0966R.string.f361548kq0));
            }
        } else if (datePickerType == DatePickerType.IDENTITY_VALID_DATE) {
            this.mEditText.setHint(C0966R.string.koi);
            if (Util.isNullOrNil((CharSequence) this.mEditText.getText())) {
                this.mContainer.setContentDescription(MMApplicationContext.getContext().getString(C0966R.string.koi));
            }
        }
        setMinAndMaxDate(datePickerType);
    }

    public void setValue(String str) {
    }

    public long timeForDate(KDate kDate) {
        if (kDate == null) {
            return 0;
        }
        Calendar calendar = calendar();
        calendar.clear();
        calendar.set(kDate.mYear, kDate.mMonth - 1, kDate.mDay);
        return calendar.getTimeInMillis();
    }

    public int yearOfNow() {
        Calendar calendar = calendar();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return calendar.get(1);
    }

    public LinearLayout createView(Context context) {
        TenpaySecureEditText tenpaySecureEditText = new TenpaySecureEditText(context);
        this.mEditText = tenpaySecureEditText;
        tenpaySecureEditText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground((Drawable) null);
        this.mEditText.setTextSize(0, MMKViewUtil.dpToPx(MMApplicationContext.getContext(), 17.0f));
        this.mEditText.setPadding(0, 0, 0, 0);
        this.mEditText.setTextColor(context.getResources().getColor(C0966R.color.aj4));
        if (context instanceof UIPageFragmentActivity) {
            this.activity = (UIPageFragmentActivity) context;
        }
        initDatePickerData();
        initDatePicker();
        LayoutWrapper layoutWrapper = new LayoutWrapper(context, this.mEditText);
        this.mContainer = layoutWrapper;
        return layoutWrapper;
    }
}
