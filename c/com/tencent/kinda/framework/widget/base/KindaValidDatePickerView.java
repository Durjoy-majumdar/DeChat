package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.EditText;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.KValidDatePickerView;
import com.tencent.kinda.gen.KValidDatePickerViewOnSelectCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import com.tencent.p014mm.p136ui.widget.picker.CustomDatePickerNew;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import yq3.C79145c;

public class KindaValidDatePickerView extends MMKView<EditText> implements KValidDatePickerView {
    private UIPageFragmentActivity activity;
    public KValidDatePickerViewOnSelectCallback callback;
    /* access modifiers changed from: private */
    public C19877i datePicker;
    /* access modifiers changed from: private */
    public TenpaySecureEditText mEditText;
    /* access modifiers changed from: private */
    public int mMonthOfYear = -1;
    /* access modifiers changed from: private */
    public String mSelected;
    /* access modifiers changed from: private */
    public int mYear = -1;

    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    public String getText() {
        return this.mSelected;
    }

    public void setFocus(boolean z) {
        if (z) {
            this.activity.hideVKB();
            this.activity.hideTenpayKB();
            C19877i iVar = new C19877i(this.activity);
            this.datePicker = iVar;
            CustomDatePickerNew customDatePickerNew = iVar.f56637n;
            if (customDatePickerNew != null) {
                customDatePickerNew.f56579o = false;
                customDatePickerNew.f56580p = true;
                customDatePickerNew.f56581q = true;
            }
            iVar.f56638o = new C19877i.C19878a() {
                public void onResult(boolean z, int i, int i2, int i3) {
                    KindaValidDatePickerView.this.datePicker.mo26532b();
                    if (z) {
                        String a = KindaValidDatePickerView.this.datePicker.mo26531a();
                        if (!Util.isNullOrNil(a)) {
                            String[] split = a.split("-");
                            if (split.length >= 2) {
                                Log.m105919d(MMKView.TAG, "result: %s", a);
                                int unused = KindaValidDatePickerView.this.mYear = Util.safeParseInt(split[0]);
                                int unused2 = KindaValidDatePickerView.this.mMonthOfYear = Util.safeParseInt(split[1]) - 1;
                                Log.m105919d(MMKView.TAG, "year: %s, month: %s", Integer.valueOf(KindaValidDatePickerView.this.mYear), Integer.valueOf(KindaValidDatePickerView.this.mMonthOfYear));
                                DecimalFormat decimalFormat = new DecimalFormat("00");
                                TenpaySecureEditText access$300 = KindaValidDatePickerView.this.mEditText;
                                access$300.setText(decimalFormat.format((long) (KindaValidDatePickerView.this.mMonthOfYear + 1)) + decimalFormat.format((long) KindaValidDatePickerView.this.mYear).substring(2));
                                KindaValidDatePickerView kindaValidDatePickerView = KindaValidDatePickerView.this;
                                String unused3 = kindaValidDatePickerView.mSelected = decimalFormat.format((long) KindaValidDatePickerView.this.mYear).substring(2) + decimalFormat.format((long) (KindaValidDatePickerView.this.mMonthOfYear + 1));
                                KindaValidDatePickerView kindaValidDatePickerView2 = KindaValidDatePickerView.this;
                                kindaValidDatePickerView2.callback.onSelect(kindaValidDatePickerView2.mSelected);
                            }
                        }
                    }
                }
            };
            String[] split = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date()).split("-");
            if (split.length >= 3) {
                this.datePicker.mo26535e(Util.safeParseInt(split[0]), Util.safeParseInt(split[1]), Util.safeParseInt(split[2]));
                this.datePicker.mo26534d(Util.safeParseInt(split[0]) + 30, 12, 31);
            } else {
                this.datePicker.mo26535e(Util.safeParseInt(split[0]), 1, 1);
                this.datePicker.mo26534d(Util.safeParseInt(split[0]) + 30, 12, 31);
            }
            this.datePicker.mo26533c(this.mYear, this.mMonthOfYear + 1, 1);
            this.datePicker.mo26536f();
            return;
        }
        C19877i iVar2 = this.datePicker;
        if (iVar2 != null) {
            iVar2.mo26532b();
        }
    }

    public void setOnSelectCallback(KValidDatePickerViewOnSelectCallback kValidDatePickerViewOnSelectCallback) {
        this.callback = kValidDatePickerViewOnSelectCallback;
    }

    public TenpaySecureEditText createView(Context context) {
        TenpaySecureEditText tenpaySecureEditText = new TenpaySecureEditText(context);
        this.mEditText = tenpaySecureEditText;
        tenpaySecureEditText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground((Drawable) null);
        this.mEditText.setIsValidThru(true);
        this.mEditText.setHint(C0966R.string.kon);
        this.mEditText.setSingleLine(false);
        this.mEditText.setPadding(0, 0, 0, 0);
        this.mEditText.setTextSize(0, MMKViewUtil.dpToPx(context, MMKViewUtil.getScaleSize(context) * 17.0f));
        this.mEditText.setAccessibilityDelegate(new C79145c() {
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(Button.class.getName());
            }
        });
        if (context instanceof UIPageFragmentActivity) {
            this.activity = (UIPageFragmentActivity) context;
        }
        return this.mEditText;
    }
}
