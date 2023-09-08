package com.tencent.maas.utils;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import com.tencent.maas.model.MJLocation;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MaasSDKResolverUtils {
    private static final ConcurrentHashMap<MJLocation, String> locationHashMap = new ConcurrentHashMap<>();

    public static String formatTimestamp(long j, String str, String str2) {
        return MaasSDKTimestampUtils.INSTANCE.formatTimestamp(j, str, str2);
    }

    public static String[] getCities(Context context, Object[] objArr, long j) {
        if (context == null || objArr == null || objArr.length == 0) {
            return null;
        }
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            newSingleThreadExecutor.submit(new MaasSDKResolverUtils$$a(objArr, context)).get(j, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        newSingleThreadExecutor.shutdown();
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            ConcurrentHashMap<MJLocation, String> concurrentHashMap = locationHashMap;
            if (concurrentHashMap.containsKey(objArr[i])) {
                strArr[i] = concurrentHashMap.get(objArr[i]);
            } else {
                strArr[i] = null;
            }
        }
        return strArr;
    }

    private static String getCity(Context context, double d, double d2) {
        try {
            List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(d2, d, 1);
            if (fromLocation.size() > 0) {
                return fromLocation.get(0).getLocality();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$getCities$0(Object[] objArr, Context context) {
        for (MJLocation mJLocation : objArr) {
            ConcurrentHashMap<MJLocation, String> concurrentHashMap = locationHashMap;
            if (!concurrentHashMap.containsKey(mJLocation)) {
                concurrentHashMap.put(mJLocation, getCity(context, (double) mJLocation.getLongitude(), (double) mJLocation.getLatitude()));
            }
        }
        return Boolean.TRUE;
    }
}
