package gn2;

import android.content.Context;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.setting.p102ui.setting.view.SettingPermissionView;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import qo3.C77407n;

/* renamed from: gn2.e */
public final class C116979e implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ SettingPermissionView f350544a;

    public C116979e(SettingPermissionView settingPermissionView) {
        this.f350544a = settingPermissionView;
    }

    public final void onDismiss() {
        String str;
        SettingPermissionView settingPermissionView = this.f350544a;
        TextView textView = settingPermissionView.f347186i;
        if (textView != null) {
            MultiProcessMMKV multiProcessMMKV = settingPermissionView.f347187j;
            if (multiProcessMMKV != null) {
                String str2 = settingPermissionView.f347184g;
                if (str2 != null) {
                    String str3 = settingPermissionView.f347183f;
                    if (str3 == null) {
                        C87412m.m108603p("permission");
                        throw null;
                    } else if (str2 != null) {
                        if (multiProcessMMKV.getBoolean(str2, settingPermissionView.mo176036a(str3, str2))) {
                            str = "";
                        } else {
                            Context context = this.f350544a.f347182e;
                            if (context != null) {
                                str = context.getString(C0966R.string.f361320lz3);
                            } else {
                                C87412m.m108603p("mContext");
                                throw null;
                            }
                        }
                        textView.setText(str);
                    } else {
                        C87412m.m108603p("business");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("business");
                    throw null;
                }
            } else {
                C87412m.m108603p("mmkv");
                throw null;
            }
        } else {
            C87412m.m108603p("mItemStatusTextView");
            throw null;
        }
    }
}
