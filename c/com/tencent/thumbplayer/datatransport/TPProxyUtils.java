package com.tencent.thumbplayer.datatransport;

import android.text.TextUtils;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.utils.TPCommonUtils;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TPProxyUtils {
    public static final String PROXY_SO_NAME = "DownloadProxy";
    public static final String TAG = "TPProxyUtils";

    public static TPDownloadParam convertProxyDownloadParams(String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map, Map<String, Object> map2) {
        ArrayList<Map<String, String>> arrayList;
        ArrayList<Map<String, String>> arrayList2 = null;
        if (tPDownloadParamData != null) {
            ArrayList<String> arrayList3 = new ArrayList<>();
            if (tPDownloadParamData.getUrlCdnidList() == null || tPDownloadParamData.getUrlCdnidList().isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList3.add(str);
                } else {
                    arrayList3.add(tPDownloadParamData.url);
                }
                String[] bakUrl = tPDownloadParamData.getBakUrl();
                if (bakUrl != null && bakUrl.length > 0) {
                    for (int i = 0; i < bakUrl.length; i++) {
                        if (!TextUtils.isEmpty(bakUrl[i])) {
                            arrayList3.add(bakUrl[i]);
                        }
                    }
                }
                if (map != null) {
                    arrayList2 = new ArrayList<>();
                    arrayList2.add(map);
                }
                arrayList = arrayList2;
            } else {
                arrayList3 = tPDownloadParamData.getUrlCdnidList();
                arrayList = tPDownloadParamData.getUrlCdnidHttpHeaderList();
            }
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(tPDownloadParamData.getFlowId())) {
                TPLogUtil.m21897i(TAG, tPDownloadParamData.getFlowId());
                hashMap.put(TPDownloadProxyEnum.DLPARAM_PLAY_FLOWID, tPDownloadParamData.getFlowId());
            }
            if (tPDownloadParamData.getUrlExpireTime() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_URL_EXPIRE_TIME, Integer.valueOf(tPDownloadParamData.getUrlExpireTime()));
            }
            if (tPDownloadParamData.getFileSize() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_FILE_SIZE, Long.valueOf(tPDownloadParamData.getFileSize()));
            }
            if (tPDownloadParamData.getFileDuration() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_FILE_DURATION, Long.valueOf(tPDownloadParamData.getFileDuration()));
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getDownloadFileID())) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_PLAY_KEYID, tPDownloadParamData.getDownloadFileID());
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getVid())) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_VID, tPDownloadParamData.getVid());
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getPlayDefinition())) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_PLAY_DEFINITION, tPDownloadParamData.getPlayDefinition());
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getCurrentFormat())) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_CURRENT_FORMAT, tPDownloadParamData.getCurrentFormat());
            }
            if (tPDownloadParamData.getCurrentFormatID() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_CURRENT_FORMATID, Integer.valueOf(tPDownloadParamData.getCurrentFormatID()));
            }
            if (!TPCommonUtils.isEmpty((Map<? extends Object, ? extends Object>) tPDownloadParamData.getFormatInfo())) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_FORMAT_INFO, tPDownloadParamData.getFormatInfo());
            }
            if (tPDownloadParamData.getBandwidthLevel() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_BAND_WIDTH_LEVEL, Integer.valueOf(tPDownloadParamData.getBandwidthLevel()));
            }
            hashMap.put(TPDownloadProxyEnum.DLPARAM_SOURCE_IS_CHARGE, Boolean.valueOf(tPDownloadParamData.isCharge()));
            hashMap.put(TPDownloadProxyEnum.DLPARAM_CACHE_NEED_ENCRYPT, Boolean.valueOf(tPDownloadParamData.isNeedEncryptCache()));
            hashMap.put(TPDownloadProxyEnum.DLPARAM_IS_OFFLINE, Boolean.valueOf(tPDownloadParamData.isOffline()));
            hashMap.put(TPDownloadProxyEnum.DLPARAM_ENABLE_EXPAND_DOWNLOAD_URL, Boolean.valueOf(tPDownloadParamData.isExtraParam()));
            if (arrayList != null && !arrayList.isEmpty()) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_URL_HEADER, arrayList);
            }
            if (tPDownloadParamData.getPreloadSize() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_PRELOAD_SIZE, Long.valueOf(tPDownloadParamData.getPreloadSize()));
            }
            if (tPDownloadParamData.getPreloadDuration() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_PRELOAD_DURATION, Long.valueOf(tPDownloadParamData.getPreloadDuration()));
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getSavePath())) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_SAVE_PATH, tPDownloadParamData.getSavePath());
            }
            if (tPDownloadParamData.getStarTimeMS() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_PLAY_START_TIME, Integer.valueOf(tPDownloadParamData.getStarTimeMS()));
            }
            if (tPDownloadParamData.getEndTimeMS() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_PLAY_END_TIME, Integer.valueOf(tPDownloadParamData.getEndTimeMS()));
            }
            if (tPDownloadParamData.getClipCount() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_COUNT, Integer.valueOf(tPDownloadParamData.getClipCount()));
            }
            if (tPDownloadParamData.getClipNo() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_NO, Integer.valueOf(tPDownloadParamData.getClipNo()));
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getBase())) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_VINFO_BASE, tPDownloadParamData.getBase());
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getLinkVid())) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_VINFO_LINK_VID, tPDownloadParamData.getLinkVid());
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getFileMD5())) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_FILE_MD5, tPDownloadParamData.getFileMD5());
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getM3u8())) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_VINFO_M3U8, tPDownloadParamData.getM3u8());
            }
            if (tPDownloadParamData.getTm() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_VINFO_TM, Long.valueOf(tPDownloadParamData.getTm()));
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getNonce())) {
                TPLogUtil.m21897i(TAG, "nonce:" + tPDownloadParamData.getNonce());
                hashMap.put(TPDownloadProxyEnum.DLPARAM_NONCE, tPDownloadParamData.getNonce());
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getDecKey())) {
                TPLogUtil.m21897i(TAG, "encrypt stream key:" + tPDownloadParamData.getDecKey());
                hashMap.put(TPDownloadProxyEnum.DLPARAM_ENCRYPT_STREAM_KEY, tPDownloadParamData.getDecKey());
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getRandoms())) {
                TPLogUtil.m21897i(TAG, "encrypt randoms:" + tPDownloadParamData.getRandoms());
                hashMap.put(TPDownloadProxyEnum.DLPARAM_ENCRYPT_STREAM_RANDOMS, tPDownloadParamData.getRandoms());
            }
            hashMap.put(TPDownloadProxyEnum.DLPARAM_VINFO_FP2P, Integer.valueOf(tPDownloadParamData.getFp2p()));
            if (tPDownloadParamData.getTestid() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_VINFO_TESTID, Integer.valueOf(tPDownloadParamData.getTestid()));
            }
            if (tPDownloadParamData.getExceptDelay() > 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_EXPECT_DELAY_TIME, Integer.valueOf(tPDownloadParamData.getExceptDelay()));
            }
            if (tPDownloadParamData.getSecondaryM3u8List() != null) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_VINFO_SECONDARY_M3U8_LIST, tPDownloadParamData.getSecondaryM3u8List());
            }
            if (tPDownloadParamData.getPreloadHttpStartTimeMs() >= 0) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_PREPARE_HTTP_START_TIME, Long.valueOf(tPDownloadParamData.getPreloadHttpStartTimeMs()));
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getSceneId())) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_SCENE_ID, tPDownloadParamData.getSceneId());
            }
            if (!TextUtils.isEmpty(tPDownloadParamData.getPcdnChargeId())) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_PCDN_CHARGE_ID, tPDownloadParamData.getPcdnChargeId());
            }
            hashMap.put(TPDownloadProxyEnum.DLPARAM_CACHE_COPY_FIRST, Boolean.valueOf(tPDownloadParamData.isCacheCopyFirst()));
            hashMap.put(TPDownloadProxyEnum.DLPARAM_NEED_FLOW_CONTROL, Boolean.valueOf(tPDownloadParamData.isNeedFlowControl()));
            if (!TPCommonUtils.isEmpty((Map<? extends Object, ? extends Object>) tPDownloadParamData.getExtInfoMap())) {
                hashMap.putAll(tPDownloadParamData.getExtInfoMap());
            }
            hashMap.put(TPDownloadProxyEnum.DLPARAM_FORMAT_NODES, tPDownloadParamData.getDefInfoList());
            if (map2 != null && !map2.isEmpty()) {
                hashMap.putAll(map2);
            }
            if (tPDownloadParamData.getPcdnUrlList() != null && !tPDownloadParamData.getPcdnUrlList().isEmpty()) {
                StringBuilder sb = new StringBuilder("");
                Iterator<String> it = tPDownloadParamData.getPcdnUrlList().iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(";");
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                TPLogUtil.m21897i(TAG, "pcdn url list: " + sb.toString());
                hashMap.put(TPDownloadProxyEnum.DLPARAM_PCDN_URLS, sb.toString());
            }
            if (tPDownloadParamData.getPcdnVtList() != null && !tPDownloadParamData.getPcdnVtList().isEmpty()) {
                StringBuilder sb4 = new StringBuilder("");
                Iterator<Integer> it4 = tPDownloadParamData.getPcdnVtList().iterator();
                while (it4.hasNext()) {
                    sb4.append(it4.next().intValue());
                    sb4.append(";");
                }
                if (sb4.length() > 0) {
                    sb4.deleteCharAt(sb4.length() - 1);
                }
                hashMap.put(TPDownloadProxyEnum.DLPARAM_PCDN_VTS, sb4.toString());
            }
            List<Map<String, String>> headersList = tPDownloadParamData.getHeadersList();
            if (headersList != null && !headersList.isEmpty()) {
                hashMap.put(TPDownloadProxyEnum.DLPARAM_URL_HEADER, headersList);
            }
            return new TPDownloadParam(arrayList3, TPProxyEnumUtils.dlType2Inner(tPDownloadParamData.getDlType()), hashMap);
        }
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(str);
        return new TPDownloadParam(arrayList4, 0, (Map<String, Object>) null);
    }
}
