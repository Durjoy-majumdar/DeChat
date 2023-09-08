package com.tencent.thumbplayer.adapter.player.thumbplayer;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap;
import com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.core.common.TPNativeLibraryException;
import com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper;
import com.tencent.thumbplayer.utils.TPCommonUtils;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPThreadPool;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TPDrmCapability {
    private static final String DRM_CAPABILITY_LIST_KEY = "DRM_CAPABILITY_LIST";
    private static final String DRM_SP_NAME = "TP_DRM_CAPABILITY";
    private static final String TAG = "TPDrmCapability";
    /* access modifiers changed from: private */
    public static Set<String> mDrmBlacklist = new HashSet();
    /* access modifiers changed from: private */
    public static Set<String> mDrmCapabilities = new HashSet();

    public static synchronized void addDRMBlacklist(@TPCommonEnum.TP_DRM_TYPE int i) {
        synchronized (TPDrmCapability.class) {
            if (i != -1) {
                mDrmBlacklist.add(String.valueOf(i));
                mDrmCapabilities.removeAll(mDrmBlacklist);
            }
        }
    }

    public static synchronized int[] getDRMCapabilities() {
        int[] iArr;
        synchronized (TPDrmCapability.class) {
            iArr = new int[mDrmCapabilities.size()];
            int i = 0;
            for (String optInt : mDrmCapabilities) {
                int i2 = i + 1;
                iArr[i] = TPCommonUtils.optInt(optInt, -1);
                i = i2;
            }
        }
        return iArr;
    }

    private static void getDRMCapabilitiesAsync(final SharedPreferences sharedPreferences) {
        TPThreadPool.getInstance().obtainThreadExecutor().execute(new Runnable() {
            public void run() {
                int[] iArr = new int[0];
                try {
                    iArr = TPThumbplayerCapabilityHelper.getDRMCapabilities();
                } catch (TPNativeLibraryException e) {
                    TPLogUtil.m21895e(TPDrmCapability.TAG, (Throwable) e);
                }
                TPLogUtil.m21897i(TPDrmCapability.TAG, "TPThumbPlayerCapabilityHelper, DRM capability:" + Arrays.toString(iArr));
                if (iArr.length != 0) {
                    HashSet hashSet = new HashSet();
                    for (int tPIntValue : iArr) {
                        hashSet.add(String.valueOf(TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapDrmType.class, tPIntValue)));
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putStringSet(TPDrmCapability.DRM_CAPABILITY_LIST_KEY, hashSet);
                    edit.apply();
                    synchronized (TPDrmCapability.class) {
                        Set unused = TPDrmCapability.mDrmCapabilities = hashSet;
                        TPDrmCapability.mDrmCapabilities.removeAll(TPDrmCapability.mDrmBlacklist);
                    }
                }
            }
        });
    }

    public static synchronized void init(Context context) {
        synchronized (TPDrmCapability.class) {
            TPLogUtil.m21897i(TAG, "TPDrmCapability, init");
            TPLogUtil.m21897i(TAG, "TPDrmCapability, get shared preferences.");
            SharedPreferences sharedPreferences = context.getSharedPreferences(DRM_SP_NAME, 0);
            try {
                mDrmCapabilities = sharedPreferences.getStringSet(DRM_CAPABILITY_LIST_KEY, mDrmCapabilities);
            } catch (ClassCastException e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
            mDrmCapabilities.removeAll(mDrmBlacklist);
            getDRMCapabilitiesAsync(sharedPreferences);
        }
    }

    public static synchronized boolean isDRMSupport(@TPCommonEnum.TP_DRM_TYPE int i) {
        synchronized (TPDrmCapability.class) {
            if (i == -1) {
                return false;
            }
            for (String optInt : mDrmCapabilities) {
                if (TPCommonUtils.optInt(optInt, -1) == i) {
                    return true;
                }
            }
            return false;
        }
    }
}
