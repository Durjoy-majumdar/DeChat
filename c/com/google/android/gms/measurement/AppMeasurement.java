package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzie;
import com.google.android.gms.internal.measurement.zzjx;
import com.google.android.gms.internal.measurement.zzka;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import p1042u.C111055b;

@Deprecated
public class AppMeasurement {
    public static final String CRASH_ORIGIN = "crash";
    public static final String FCM_ORIGIN = "fcm";
    private final zzgl zzacw;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            Preconditions.checkNotNull(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object zzf = zzka.zzf(obj);
                this.mValue = zzf;
                if (zzf == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    public static final class Event extends FirebaseAnalytics.C113378a {
        public static final String AD_REWARD = "_ar";
        public static final String APP_EXCEPTION = "_ae";
        public static final String[] zzacx = {"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "ad_reward", "screen_view", "ga_extra_parameter"};
        public static final String[] zzacy = {"_cd", APP_EXCEPTION, "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", AD_REWARD, "_vs", "_ep"};

        private Event() {
        }

        public static String zzak(String str) {
            return zzka.zza(str, zzacx, zzacy);
        }
    }

    public interface EventInterceptor {
        void interceptEvent(String str, String str2, Bundle bundle, long j);
    }

    public interface OnEventListener {
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    public static final class Param extends FirebaseAnalytics.C113379b {
        public static final String FATAL = "fatal";
        public static final String TIMESTAMP = "timestamp";
        public static final String TYPE = "type";
        public static final String[] zzacz = {"firebase_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "deferred_analytics_collection"};
        public static final String[] zzada = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_dac"};

        private Param() {
        }

        public static String zzak(String str) {
            return zzka.zza(str, zzacz, zzada);
        }
    }

    public static final class UserProperty extends FirebaseAnalytics.C113380c {
        public static final String FIREBASE_LAST_NOTIFICATION = "_ln";
        public static final String[] zzadb = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install", "lifetime_user_engagement"};
        public static final String[] zzadc = {FIREBASE_LAST_NOTIFICATION, "_fot", "_fvt", "_ldl", "_id", "_fi", "_lte"};

        private UserProperty() {
        }

        public static String zzak(String str) {
            return zzka.zza(str, zzadb, zzadc);
        }
    }

    public AppMeasurement(zzgl zzgl) {
        Preconditions.checkNotNull(zzgl);
        this.zzacw = zzgl;
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return zzgl.zzg(context).zzjr();
    }

    public void beginAdUnitExposure(String str) {
        this.zzacw.zzft().beginAdUnitExposure(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.zzacw.zzfu().clearConditionalUserProperty(str, str2, bundle);
    }

    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        this.zzacw.zzfu().clearConditionalUserPropertyAs(str, str2, str3, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.zzacw.zzft().endAdUnitExposure(str);
    }

    public long generateEventId() {
        return this.zzacw.zzgb().zzlb();
    }

    public String getAppInstanceId() {
        return this.zzacw.zzfu().zzja();
    }

    public Boolean getBoolean() {
        return this.zzacw.zzfu().zzjx();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.zzacw.zzfu().getConditionalUserProperties(str, str2);
    }

    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        return this.zzacw.zzfu().getConditionalUserPropertiesAs(str, str2, str3);
    }

    public String getCurrentScreenClass() {
        zzie zzkd = this.zzacw.zzfy().zzkd();
        if (zzkd != null) {
            return zzkd.zzaoi;
        }
        return null;
    }

    public String getCurrentScreenName() {
        zzie zzkd = this.zzacw.zzfy().zzkd();
        if (zzkd != null) {
            return zzkd.zzul;
        }
        return null;
    }

    public Double getDouble() {
        return this.zzacw.zzfu().zzka();
    }

    public String getGmpAppId() {
        try {
            return GoogleServices.getGoogleAppId();
        } catch (IllegalStateException e) {
            this.zzacw.zzge().zzim().zzg("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public Integer getInteger() {
        return this.zzacw.zzfu().zzjz();
    }

    public Long getLong() {
        return this.zzacw.zzfu().zzjy();
    }

    public int getMaxUserProperties(String str) {
        this.zzacw.zzfu();
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    public String getString() {
        return this.zzacw.zzfu().zzhm();
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.zzacw.zzfu().getUserProperties(str, str2, z);
    }

    public Map<String, Object> getUserProperties(boolean z) {
        List<zzjx> zzj = this.zzacw.zzfu().zzj(z);
        C111055b bVar = new C111055b(zzj.size());
        for (zzjx next : zzj) {
            bVar.put(next.name, next.getValue());
        }
        return bVar;
    }

    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        return this.zzacw.zzfu().getUserPropertiesAs(str, str2, str3, z);
    }

    public final void logEvent(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzacw.zzfu().zza("app", str, bundle, true);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzacw.zzfu().logEvent(str, str2, bundle);
    }

    public void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzacw.zzfu().zza(str, str2, bundle, j);
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zzacw.zzfu().registerOnMeasurementEventListener(onEventListener);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        this.zzacw.zzfu().setConditionalUserProperty(conditionalUserProperty);
    }

    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        this.zzacw.zzfu().setConditionalUserPropertyAs(conditionalUserProperty);
    }

    public void setEventInterceptor(EventInterceptor eventInterceptor) {
        this.zzacw.zzfu().setEventInterceptor(eventInterceptor);
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z) {
        this.zzacw.zzfu().setMeasurementEnabled(z);
    }

    public final void setMinimumSessionDuration(long j) {
        this.zzacw.zzfu().setMinimumSessionDuration(j);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zzacw.zzfu().setSessionTimeoutDuration(j);
    }

    public final void setUserProperty(String str, String str2) {
        int zzce = this.zzacw.zzgb().zzce(str);
        if (zzce != 0) {
            this.zzacw.zzgb();
            this.zzacw.zzgb().zza(zzce, "_ev", zzka.zza(str, 24, true), str != null ? str.length() : 0);
            return;
        }
        setUserPropertyInternal("app", str, str2);
    }

    public void setUserPropertyInternal(String str, String str2, Object obj) {
        this.zzacw.zzfu().setUserProperty(str, str2, obj);
    }

    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zzacw.zzfu().unregisterOnMeasurementEventListener(onEventListener);
    }
}
