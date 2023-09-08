package com.tencent.p014mm.plugin.wallet_core.id_verify.util;

import a63.C39498b;
import a63.C39499d;
import a63.C39500e;
import a63.C67008a;
import a63.C67020c;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import nj3.C76879j;
import qo3.C77398g;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper */
public class RealnameGuideHelper implements Parcelable {
    public static final Parcelable.Creator<RealnameGuideHelper> CREATOR = new C72164a();

    /* renamed from: d */
    public SetPwdInfo f209330d;

    /* renamed from: e */
    public String f209331e;

    /* renamed from: f */
    public String f209332f;

    /* renamed from: g */
    public String f209333g;

    /* renamed from: h */
    public String f209334h;

    /* renamed from: i */
    public String f209335i;

    /* renamed from: j */
    public boolean f209336j;

    /* renamed from: n */
    public int f209337n;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper$a */
    public class C72164a implements Parcelable.Creator<RealnameGuideHelper> {
        public Object createFromParcel(Parcel parcel) {
            return new RealnameGuideHelper(parcel);
        }

        public Object[] newArray(int i) {
            return new RealnameGuideHelper[i];
        }
    }

    public RealnameGuideHelper() {
        this.f209333g = "";
        this.f209334h = "";
        this.f209335i = "";
        this.f209336j = false;
    }

    /* renamed from: a */
    public boolean mo99370a(MMActivity mMActivity, Bundle bundle, DialogInterface.OnClickListener onClickListener, C79148e.C79149a aVar) {
        return mo99371b(mMActivity, bundle, onClickListener, aVar, false);
    }

    /* renamed from: b */
    public boolean mo99371b(MMActivity mMActivity, Bundle bundle, DialogInterface.OnClickListener onClickListener, C79148e.C79149a aVar, boolean z) {
        if (this.f209336j) {
            return false;
        }
        if ("1".equals(this.f209331e)) {
            if (!this.f209336j) {
                this.f209336j = true;
            }
            return C67008a.m79172h(mMActivity, this.f209332f, 0, this.f209333g, this.f209334h, bundle, z, onClickListener, aVar, this.f209337n, 1);
        } else if (!"2".equals(this.f209331e) || Util.isNullOrNil(this.f209335i)) {
            return false;
        } else {
            if (!this.f209336j) {
                this.f209336j = true;
            }
            C67008a.m79173i(mMActivity, this.f209332f, this.f209335i, this.f209333g, this.f209334h, z, onClickListener);
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo99372c(MMActivity mMActivity, Bundle bundle, DialogInterface.OnClickListener onClickListener, C79148e.C79149a aVar, boolean z) {
        MMActivity mMActivity2 = mMActivity;
        boolean z2 = z;
        boolean z3 = false;
        Log.m105919d("MicroMsg.RealnameGuideHelper", "doIfNeedSetPwd sendPwdMsg %s mEntryScene %s guide_wording %s upload_credit_url %s left_button_wording %s right_button_wording %s hadShow %s guide_flag %s", this.f209330d, Integer.valueOf(this.f209337n), this.f209332f, this.f209335i, this.f209333g, this.f209334h, Boolean.valueOf(this.f209336j), this.f209331e);
        if (this.f209336j) {
            return false;
        }
        SetPwdInfo setPwdInfo = this.f209330d;
        if (setPwdInfo != null && setPwdInfo.f209338d == 1) {
            int i = this.f209337n;
            String str = setPwdInfo.f209339e;
            String str2 = setPwdInfo.f209340f;
            String str3 = setPwdInfo.f209341g;
            C86709a0.m107528h();
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_WALLET_SET_PWD_TIP_INT_SYNC;
            int intValue = ((Integer) i2.mo119685f(aVar2, 0)).intValue();
            Log.m105925i("MicroMsg.RealnameVerifyUtil", "showSetPwdDialog count %s", Integer.valueOf(intValue));
            if (intValue < 3) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Integer.valueOf(intValue + 1));
                if (Util.isNullOrNil(str2)) {
                    str2 = mMActivity2.getString(C0966R.string.f7926wf);
                }
                if (Util.isNullOrNil(str3)) {
                    str3 = mMActivity2.getString(C0966R.string.a18);
                }
                C77398g B = C76879j.m92708B(mMActivity, str, "", str3, str2, new C67020c(bundle, i, mMActivity2, z2), onClickListener == null ? new C39498b(z2, mMActivity2) : onClickListener, C0966R.color.akw);
                if (B != null) {
                    B.setOnCancelListener(new C39499d(z2, mMActivity2));
                    B.setOnDismissListener(new C39500e(z2, mMActivity2));
                }
                z3 = true;
            }
            if (z3 && !this.f209336j) {
                this.f209336j = true;
            }
        }
        return z3;
    }

    /* renamed from: d */
    public void mo99373d(String str, String str2, String str3, String str4, String str5, int i) {
        this.f209330d = null;
        this.f209331e = str;
        this.f209332f = str2;
        this.f209333g = str3;
        this.f209334h = str4;
        this.f209335i = str5;
        this.f209337n = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f209330d, i);
        parcel.writeString(this.f209331e);
        parcel.writeString(this.f209332f);
        parcel.writeString(this.f209333g);
        parcel.writeString(this.f209334h);
        parcel.writeString(this.f209335i);
        parcel.writeByte(this.f209336j ? (byte) 1 : 0);
        parcel.writeInt(this.f209337n);
    }

    public RealnameGuideHelper(Parcel parcel) {
        this.f209333g = "";
        this.f209334h = "";
        this.f209335i = "";
        boolean z = false;
        this.f209336j = false;
        this.f209330d = (SetPwdInfo) parcel.readParcelable(SetPwdInfo.class.getClassLoader());
        this.f209331e = parcel.readString();
        this.f209332f = parcel.readString();
        this.f209333g = parcel.readString();
        this.f209334h = parcel.readString();
        this.f209335i = parcel.readString();
        this.f209336j = parcel.readByte() != 0 ? true : z;
        this.f209337n = parcel.readInt();
    }
}
