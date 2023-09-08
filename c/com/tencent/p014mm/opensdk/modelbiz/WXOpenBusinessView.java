package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;
import com.tencent.p014mm.opensdk.utils.C81058b;
import com.tencent.p014mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView */
public class WXOpenBusinessView {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Req */
    public static final class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXOpenBusinessView.Req";
        public String businessType;
        public String extInfo;
        public String query;

        public boolean checkArgs() {
            if (!C81058b.m99052b(this.businessType)) {
                return true;
            }
            Log.m99044e(TAG, "businessType is null");
            return false;
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.businessType = bundle.getString("_openbusinessview_businessType");
            this.query = bundle.getString("_openbusinessview__query_info");
            this.extInfo = bundle.getString("_openbusinessview_extInfo");
        }

        public int getType() {
            return 26;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_openbusinessview_businessType", this.businessType);
            bundle.putString("_openbusinessview__query_info", this.query);
            bundle.putString("_openbusinessview_extInfo", this.extInfo);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Resp */
    public static final class Resp extends BaseResp {
        public String businessType;
        public String extMsg;

        public Resp() {
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        public boolean checkArgs() {
            return true;
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.extMsg = bundle.getString("_openbusinessview_ext_msg");
            this.businessType = bundle.getString("_openbusinessview_business_type");
        }

        public int getType() {
            return 26;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_openbusinessview_ext_msg", this.extMsg);
            bundle.putString("_openbusinessview_business_type", this.businessType);
        }
    }
}
