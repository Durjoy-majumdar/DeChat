package com.tencent.tmassistantsdk.network;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKAuthorizedInfo;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.TipsInfo;
import com.tencent.tmassistantsdk.util.TMLog;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GetAuthorizedHttpRequest extends GetHttpRequest {
    public static final String TAG = "GetAuthorizedHttpRequest";
    public IGetAuthorizedHttpRequestListenner mGetAuthorizedListener = null;

    private String authorizedInfoToString(TMOpenSDKAuthorizedInfo tMOpenSDKAuthorizedInfo) {
        return ((((((((((("" + "?appId=" + URLEncoder.encode(tMOpenSDKAuthorizedInfo.appId)) + "&userId=" + URLEncoder.encode(tMOpenSDKAuthorizedInfo.userId)) + "&userIdType=" + URLEncoder.encode(tMOpenSDKAuthorizedInfo.userIdType)) + "&identityInfo=" + URLEncoder.encode(tMOpenSDKAuthorizedInfo.identityInfo)) + "&identityType=" + URLEncoder.encode(tMOpenSDKAuthorizedInfo.identityType)) + "&gamePackageName=" + URLEncoder.encode(tMOpenSDKAuthorizedInfo.gamePackageName)) + "&gameVersionCode=" + URLEncoder.encode(tMOpenSDKAuthorizedInfo.gameVersionCode)) + "&gameChannelId=" + URLEncoder.encode(tMOpenSDKAuthorizedInfo.gameChannelId)) + "&actionFlag=" + URLEncoder.encode(tMOpenSDKAuthorizedInfo.actionFlag)) + "&verifyType=" + URLEncoder.encode(tMOpenSDKAuthorizedInfo.verifyType)) + "&via=" + URLEncoder.encode(tMOpenSDKAuthorizedInfo.via)) + "&actionType=" + tMOpenSDKAuthorizedInfo.actionType;
    }

    private AuthorizedResult jsonObjectToRespData(JSONObject jSONObject) {
        TipsInfo tipsInfo;
        AuthorizedResult authorizedResult = new AuthorizedResult();
        authorizedResult.hasAuthoried = jSONObject.getInt("hasAuthoried");
        authorizedResult.errorCode = jSONObject.getInt(OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
        authorizedResult.downloadUrl = jSONObject.getString("downloadUrl");
        authorizedResult.versionCode = jSONObject.getInt(AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE);
        JSONObject jSONObject2 = jSONObject.getJSONObject("tipsInfo");
        if (jSONObject2 == null || jSONObject2.length() <= 0) {
            tipsInfo = null;
        } else {
            tipsInfo = new TipsInfo();
            tipsInfo.title = jSONObject2.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            tipsInfo.content = jSONObject2.getString("content");
            JSONArray jSONArray = jSONObject2.getJSONArray("actionButton");
            ArrayList<ActionButton> arrayList = new ArrayList<>();
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    ActionButton actionButton = new ActionButton();
                    actionButton.textInstalled = jSONArray.getJSONObject(i).getString("textInstalled");
                    actionButton.textUninstalled = jSONArray.getJSONObject(i).getString("textUninstalled");
                    actionButton.jumpType = jSONArray.getJSONObject(i).getInt("jumpType");
                    actionButton.jumpUrl = jSONArray.getJSONObject(i).getString("jumpUrl");
                    arrayList.add(actionButton);
                }
            }
            tipsInfo.actionButton = arrayList;
        }
        authorizedResult.tipsInfo = tipsInfo;
        TMLog.m164114i(TAG, "dataInfo :" + authorizedResult.toString());
        return authorizedResult;
    }

    public void onFinished(JSONObject jSONObject, int i) {
        IGetAuthorizedHttpRequestListenner iGetAuthorizedHttpRequestListenner = this.mGetAuthorizedListener;
        if (iGetAuthorizedHttpRequestListenner == null) {
            TMLog.m164114i(TAG, "mGetAuthorizedListener is null !");
        } else if (i != 0 || jSONObject == null) {
            iGetAuthorizedHttpRequestListenner.onGetAuthorizedRequestFinished((AuthorizedResult) null, i);
        } else {
            try {
                AuthorizedResult jsonObjectToRespData = jsonObjectToRespData(jSONObject);
                if (jsonObjectToRespData != null) {
                    this.mGetAuthorizedListener.onGetAuthorizedRequestFinished(jsonObjectToRespData, 0);
                }
            } catch (JSONException e) {
                this.mGetAuthorizedListener.onGetAuthorizedRequestFinished((AuthorizedResult) null, 704);
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
    }

    public void sendRequest(TMOpenSDKAuthorizedInfo tMOpenSDKAuthorizedInfo) {
        if (tMOpenSDKAuthorizedInfo != null) {
            super.sendData(authorizedInfoToString(tMOpenSDKAuthorizedInfo));
        }
    }

    public void setListenner(IGetAuthorizedHttpRequestListenner iGetAuthorizedHttpRequestListenner) {
        this.mGetAuthorizedListener = iGetAuthorizedHttpRequestListenner;
    }
}
