package com.tencent.p014mm.opensdk.modelbiz;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.opensdk.modelbase.BaseReq;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage */
public class WXLaunchWxaRedirectingPage {
    public static final String URI_PATH = "launchWxaOpenApiRedirectingPage";

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$ConstantsWxaRedirectingPage */
    public interface ConstantsWxaRedirectingPage {
        public static final String KEY_CALLBACK_ACTIVITY = "_launch_wx_wxa_redirecting_page_callback_activity";
        public static final String KEY_CALLBACK_MSG = "_launch_wx_wxa_redirecting_page_callback_msg";
        public static final String KEY_INVOKE_TICKET = "_launch_wx_wxa_redirecting_page_invoke_ticket";
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Req */
    public static final class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXLaunchWxaRedirectingPage.Req";
        public String callbackActivity;
        public String invokeTicket;

        public boolean checkArgs() {
            return !TextUtils.isEmpty(this.invokeTicket);
        }

        public void fromArray(String[] strArr) {
            this.invokeTicket = strArr[0];
            this.callbackActivity = strArr[1];
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.invokeTicket = bundle.getString(ConstantsWxaRedirectingPage.KEY_INVOKE_TICKET);
            this.callbackActivity = bundle.getString(ConstantsWxaRedirectingPage.KEY_CALLBACK_ACTIVITY);
        }

        public int getType() {
            return 30;
        }

        public String[] toArray() {
            return new String[]{this.invokeTicket, this.callbackActivity};
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(ConstantsWxaRedirectingPage.KEY_INVOKE_TICKET, this.invokeTicket);
            bundle.putString(ConstantsWxaRedirectingPage.KEY_CALLBACK_ACTIVITY, this.callbackActivity);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Resp */
    public static final class Resp extends BaseResp {
        private static final String TAG = "MicroMsg.SDK.WXLaunchWxaFRedirectingPage.Resp";
        public String callbackActivity;
        public String invokeTicket;

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        public boolean checkArgs() {
            return true;
        }

        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.invokeTicket = bundle.getString(ConstantsWxaRedirectingPage.KEY_INVOKE_TICKET);
            this.callbackActivity = bundle.getString(ConstantsWxaRedirectingPage.KEY_CALLBACK_ACTIVITY);
        }

        public int getType() {
            return 30;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(ConstantsWxaRedirectingPage.KEY_INVOKE_TICKET, this.invokeTicket);
            bundle.putString(ConstantsWxaRedirectingPage.KEY_CALLBACK_ACTIVITY, this.callbackActivity);
        }
    }
}
