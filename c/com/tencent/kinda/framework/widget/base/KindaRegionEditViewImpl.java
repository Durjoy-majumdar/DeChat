package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.KRegionEditView;
import com.tencent.kinda.gen.KRegionEditViewOnRegionSelectedCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;

public class KindaRegionEditViewImpl extends MMKView<View> implements KRegionEditView {
    private int REQUEST_CODE;
    /* access modifiers changed from: private */
    public String cityCode;
    /* access modifiers changed from: private */
    public String countryCode;
    private ArrayList<String> excludeAreaList;
    private UIPageFragmentActivity.C68049b intentHandler = new UIPageFragmentActivity.C68049b() {
        public void handle(int i, Intent intent) {
            if (i == -1) {
                String unused = KindaRegionEditViewImpl.this.countryCode = intent.getStringExtra("Country");
                if (!Util.isNullOrNil(intent.getStringExtra("Contact_City"))) {
                    String unused2 = KindaRegionEditViewImpl.this.provinceCode = intent.getStringExtra("Contact_Province");
                    String unused3 = KindaRegionEditViewImpl.this.cityCode = intent.getStringExtra("Contact_City");
                } else if (!Util.isNullOrNil(intent.getStringExtra("Contact_Province"))) {
                    String unused4 = KindaRegionEditViewImpl.this.cityCode = intent.getStringExtra("Contact_Province");
                } else {
                    KindaRegionEditViewImpl kindaRegionEditViewImpl = KindaRegionEditViewImpl.this;
                    String unused5 = kindaRegionEditViewImpl.cityCode = kindaRegionEditViewImpl.countryCode;
                }
                String stringExtra = intent.getStringExtra("CountryName");
                String stringExtra2 = intent.getStringExtra("ProviceName");
                String stringExtra3 = intent.getStringExtra("CityName");
                StringBuilder sb = new StringBuilder();
                if (!Util.isNullOrNil(stringExtra)) {
                    sb.append(stringExtra);
                }
                if (!Util.isNullOrNil(stringExtra2)) {
                    sb.append(" ");
                    sb.append(stringExtra2);
                }
                if (!Util.isNullOrNil(stringExtra3)) {
                    sb.append(" ");
                    sb.append(stringExtra3);
                }
                KindaRegionEditViewImpl.this.mEditText.setText(sb.toString());
                KindaRegionEditViewImpl.this.mContainer.setContentDescription(sb.toString());
                if (KindaRegionEditViewImpl.this.mCallback != null) {
                    KindaRegionEditViewImpl.this.mCallback.onRegionSelected();
                }
            }
        }
    };
    private boolean mAutoLocation = false;
    /* access modifiers changed from: private */
    public KRegionEditViewOnRegionSelectedCallback mCallback;
    /* access modifiers changed from: private */
    public LinearLayout mContainer;
    private Context mContext;
    /* access modifiers changed from: private */
    public EditText mEditText;
    private boolean mShowDomesticCity = false;
    private boolean mShowSelectedLocation = true;
    /* access modifiers changed from: private */
    public String provinceCode;

    public View createView(Context context) {
        EditText editText = new EditText(context);
        this.mEditText = editText;
        editText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground((Drawable) null);
        this.mEditText.setSingleLine(false);
        this.mEditText.setHint(C0966R.string.kpx);
        this.mEditText.setTextSize(0, MMKViewUtil.dpToPx(context, MMKViewUtil.getScaleSize(context) * 17.0f));
        this.mEditText.setPadding(0, 0, 0, 0);
        this.mContext = context;
        if (context instanceof UIPageFragmentActivity) {
            int andIncrement = ((UIPageFragmentActivity) context).f195317r.getAndIncrement();
            this.REQUEST_CODE = andIncrement;
            ((UIPageFragmentActivity) this.mContext).f195318s.put(Integer.valueOf(andIncrement), this.intentHandler);
        }
        LayoutWrapper layoutWrapper = new LayoutWrapper(context, this.mEditText);
        this.mContainer = layoutWrapper;
        layoutWrapper.setContentDescription(context.getString(C0966R.string.kpx));
        return this.mContainer;
    }

    public boolean getAutoLocation() {
        return this.mAutoLocation;
    }

    public String getCity() {
        return this.cityCode;
    }

    public String getCountry() {
        return this.countryCode;
    }

    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    public String getProvince() {
        return this.provinceCode;
    }

    public boolean getShowDomesticCity() {
        return this.mShowDomesticCity;
    }

    public boolean getShowSelectedLocation() {
        return this.mShowSelectedLocation;
    }

    public boolean isUSOrCA() {
        if (Util.isNullOrNil(this.countryCode)) {
            return false;
        }
        return "US".equals(this.countryCode) || "CA".equals(this.countryCode);
    }

    public void setAreaExcludeArray(ArrayList<String> arrayList) {
        this.excludeAreaList = arrayList;
    }

    public void setAutoLocation(boolean z) {
        this.mAutoLocation = z;
    }

    public void setFocus(boolean z) {
        if (z) {
            Context context = this.mContext;
            if (context instanceof BaseFrActivity) {
                ((BaseFrActivity) context).hideTenpayKB();
                Intent intent = new Intent();
                String packageName = MMApplicationContext.getPackageName();
                intent.setClassName(packageName, MMApplicationContext.getSourcePackageName() + ".ui.tools.MultiStageCitySelectUI");
                intent.putExtra("GetAddress", true);
                intent.putExtra("IsNeedShowSearchBar", this.mShowDomesticCity);
                intent.putExtra("IsRealNameVerifyScene", this.mShowDomesticCity);
                intent.putExtra("ShowSelectedLocation", this.mShowSelectedLocation);
                intent.putExtra("IsAutoPosition", this.mAutoLocation);
                ArrayList<String> arrayList = this.excludeAreaList;
                if (arrayList != null && !arrayList.isEmpty()) {
                    intent.putStringArrayListExtra("BlockedCountries", this.excludeAreaList);
                }
                ((BaseFrActivity) this.mContext).startActivityForResult(intent, this.REQUEST_CODE);
            }
        }
    }

    public void setOnRegionSelectedCallback(KRegionEditViewOnRegionSelectedCallback kRegionEditViewOnRegionSelectedCallback) {
        this.mCallback = kRegionEditViewOnRegionSelectedCallback;
    }

    public void setOriginRegion(String str, String str2, String str3, String str4) {
        this.countryCode = str;
        this.provinceCode = str2;
        this.cityCode = str3;
        if (!Util.isNullOrNil(str4)) {
            this.mEditText.setText(str4);
            this.mContainer.setContentDescription(str4);
        }
    }

    public void setShowDomesticCity(boolean z) {
        this.mShowDomesticCity = z;
    }

    public void setShowSelectedLocation(boolean z) {
        this.mShowSelectedLocation = z;
    }
}
