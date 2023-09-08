package com.tencent.kinda.framework.widget.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.KCountryCallingCodeView;
import com.tencent.kinda.gen.KCountryCallingCodeViewOnSelectCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.shareutil.ShareElfFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import nc0.C76850a;

public class KCountryCallingCodeViewImpl extends MMKView implements KCountryCallingCodeView {
    private static final String TAG = "KCountryCallingCodeView";
    private String[] mBannedCountryIsoCodes;
    /* access modifiers changed from: private */
    public KCountryCallingCodeViewOnSelectCallback mCallback;
    /* access modifiers changed from: private */
    public String mCountryCode;
    private HashMap<String, C76850a.C76851a> mCountryCodeMap;
    /* access modifiers changed from: private */
    public String mCountryIsoCode;
    /* access modifiers changed from: private */
    public String mCountryName;
    private EditText mEditText;
    private boolean mHideCode;
    private HashMap<String, C76850a.C76851a> mISOCountryCodeMap;
    private UIPageFragmentActivity mUIPageFragmentActivity;

    private void initData(Activity activity) {
        List<C76850a.C76851a> b = C76850a.m92630b(activity, activity.getString(C0966R.string.bvs));
        this.mCountryCodeMap = new HashMap<>();
        this.mISOCountryCodeMap = new HashMap<>();
        Iterator it = ((ArrayList) b).iterator();
        while (it.hasNext()) {
            C76850a.C76851a aVar = (C76850a.C76851a) it.next();
            if (aVar != null) {
                this.mCountryCodeMap.put(aVar.f224676b, aVar);
                this.mISOCountryCodeMap.put(aVar.f224675a, aVar);
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateCountryName() {
        String str = this.mCountryName;
        if (str == null || str.length() <= 0) {
            String str2 = null;
            if (this.mEditText.getHint() != null) {
                str2 = this.mEditText.getHint().toString();
            }
            if (str2 == null || str2.length() == 0) {
                this.mEditText.setText(C0966R.string.l5l);
                this.mEditText.setTextColor(this.mUIPageFragmentActivity.getResources().getColor(C0966R.color.a_3));
                return;
            }
            return;
        }
        this.mEditText.setText(this.mCountryName);
        this.mEditText.setTextColor(this.mUIPageFragmentActivity.getResources().getColor(C0966R.color.a7f));
    }

    public View createView(Context context) {
        EditText editText = new EditText(context);
        this.mEditText = editText;
        editText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground((Drawable) null);
        this.mEditText.setTextSize(0, MMKViewUtil.dpToPx(context, MMKViewUtil.getScaleSize(context) * 16.0f));
        this.mEditText.setPadding(0, 0, 0, 0);
        Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity instanceof UIPageFragmentActivity) {
            this.mUIPageFragmentActivity = (UIPageFragmentActivity) topOrUIPageFragmentActivity;
            initData(topOrUIPageFragmentActivity);
        } else {
            Log.m105920e(TAG, "没有找到UIPageFragmentActivity，却展示了KCountryCallingCodeView");
        }
        return this.mEditText;
    }

    public String getCountryCode() {
        return this.mCountryCode;
    }

    public boolean getFocus() {
        return false;
    }

    public boolean getHideCode() {
        return this.mHideCode;
    }

    public String getNationality() {
        return this.mCountryIsoCode;
    }

    public String getPlaceHolder() {
        return this.mEditText.getHint().toString();
    }

    public void setCountryCode(String str) {
        if (this.mCountryCodeMap != null) {
            if (str.contains("+")) {
                str = str.substring(1);
            }
            if (str.equals("1") && this.mCountryIsoCode.equals("CA")) {
                return;
            }
            if (str.equals("1") && this.mCountryIsoCode.equals("US")) {
                return;
            }
            if (!this.mCountryCodeMap.containsKey(str) || this.mCountryCodeMap.get(str) == null) {
                Log.m105925i(TAG, "country code is %s, can not found valid data, reset data to null", str);
                this.mCountryName = "";
                this.mCountryCode = "";
                this.mCountryIsoCode = "";
            } else {
                C76850a.C76851a aVar = this.mCountryCodeMap.get(str);
                Log.m105925i(TAG, "country code is %s, find target data, country name is %s", str, this.mCountryName);
                this.mCountryCode = str;
                this.mCountryName = aVar.f224677c;
                this.mCountryIsoCode = aVar.f224675a;
            }
        } else {
            Log.m105920e(TAG, "输入国家代码后无法找到国家名称，因为国家代码、名称映射表为空！");
        }
        updateCountryName();
    }

    public void setFocus(boolean z) {
        if (z && this.mUIPageFragmentActivity != null) {
            Log.m105918d(TAG, "click area");
            Intent intent = new Intent();
            intent.putExtra("CountryCodeUI_isShowCountryCode", !this.mHideCode);
            intent.putExtra("exclude_countries_iso", this.mBannedCountryIsoCodes);
            intent.setClassName(this.mUIPageFragmentActivity, "com.tencent.mm.ui.tools.CountryCodeUI");
            this.mUIPageFragmentActivity.startActivityForResult(intent, (hashCode() & 16777215) + ShareElfFile.SectionHeader.SHN_ABS);
        }
    }

    public void setHideCode(boolean z) {
        this.mHideCode = z;
    }

    public void setNationality(String str) {
        HashMap<String, C76850a.C76851a> hashMap = this.mISOCountryCodeMap;
        if (hashMap != null) {
            Iterator<C76850a.C76851a> it = hashMap.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C76850a.C76851a next = it.next();
                if (next.f224675a.equals(str)) {
                    this.mCountryCode = next.f224676b;
                    this.mCountryName = next.f224677c;
                    this.mCountryIsoCode = next.f224675a;
                    break;
                }
            }
        }
        updateCountryName();
    }

    public void setNationalityExcludeArray(ArrayList<String> arrayList) {
        if (arrayList != null) {
            this.mBannedCountryIsoCodes = Util.listToStrings(arrayList);
        }
    }

    public void setOnSelectCallback(KCountryCallingCodeViewOnSelectCallback kCountryCallingCodeViewOnSelectCallback) {
        this.mCallback = kCountryCallingCodeViewOnSelectCallback;
        C675871 r5 = new UIPageFragmentActivity.C68049b() {
            public void handle(int i, Intent intent) {
                String stringExtra = intent.getStringExtra("country_name");
                String stringExtra2 = intent.getStringExtra("couttry_code");
                String stringExtra3 = intent.getStringExtra("iso_code");
                if (Util.isNullOrNil(stringExtra) || Util.isNullOrNil(stringExtra2)) {
                    Log.m105924i(KCountryCallingCodeViewImpl.TAG, "countryName or countrycode is null , user cancel case");
                    return;
                }
                String unused = KCountryCallingCodeViewImpl.this.mCountryName = stringExtra;
                String unused2 = KCountryCallingCodeViewImpl.this.mCountryCode = stringExtra2;
                String unused3 = KCountryCallingCodeViewImpl.this.mCountryIsoCode = stringExtra3;
                Log.m105925i(KCountryCallingCodeViewImpl.TAG, "handle back mCountryName:%s.mCountryCode:%s mCountryIsoCode:%s", KCountryCallingCodeViewImpl.this.mCountryName, KCountryCallingCodeViewImpl.this.mCountryCode, KCountryCallingCodeViewImpl.this.mCountryIsoCode);
                KCountryCallingCodeViewImpl.this.updateCountryName();
                KCountryCallingCodeViewImpl.this.mCallback.onSelect(KCountryCallingCodeViewImpl.this.mCountryCode, KCountryCallingCodeViewImpl.this.mCountryIsoCode);
            }
        };
        UIPageFragmentActivity uIPageFragmentActivity = this.mUIPageFragmentActivity;
        if (uIPageFragmentActivity != null) {
            uIPageFragmentActivity.f195318s.put(Integer.valueOf((hashCode() & 16777215) + ShareElfFile.SectionHeader.SHN_ABS), r5);
        }
    }

    public void setPlaceHolder(String str) {
        this.mEditText.setHint(str);
    }
}
