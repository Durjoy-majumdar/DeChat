package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.AccountPicker;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Locale;

public class GmsIntents {
    public static final String ACTION_FITNESS_APP_DISCONNECTED = "com.google.android.gms.fitness.app_disconnected";
    public static final String ACTION_ICING_CONTACT_CHANGED = "com.google.android.gms.icing.action.CONTACT_CHANGED";
    public static final String ACTION_SET_GMS_ACCOUNT = "com.google.android.gms.common.SET_GMS_ACCOUNT";
    public static final String ACTION_UDC_SETTING_CHANGED = "com.google.android.gms.udc.action.SETTING_CHANGED";
    public static final String BROADCAST_CIRCLES_CHANGED = "com.google.android.gms.people.BROADCAST_CIRCLES_CHANGED";
    public static final String COMMON_SIGN_IN_EXTRA_PACKAGE_NAME = "SIGN_IN_PACKAGE_NAME";
    public static final String COMMON_SIGN_IN_EXTRA_SAVE_DEFAULT_ACCOUNT = "SIGN_IN_SAVE_DEFAULT_ACCOUNT";
    public static final String COMMON_SIGN_IN_EXTRA_SCOPE_ARRAY = "SIGN_IN_SCOPE_ARRAY";
    public static final String EXTRA_ACCOUNT = "com.google.android.gms.fitness.disconnected_account";
    public static final String EXTRA_APP = "com.google.android.gms.fitness.disconnected_app";
    public static final String EXTRA_ICING_CONTACT_CHANGED_IS_SIGNIFICANT = "com.google.android.gms.icing.extra.isSignificant";
    public static final String EXTRA_SET_GMS_ACCOUNT_NAME = "ACCOUNT_NAME";
    public static final String EXTRA_SET_GMS_ACCOUNT_PACKAGE_NAME = "PACKAGE_NAME";
    public static final String EXTRA_UDC_ACCOUNT_NAME = "com.google.android.gms.udc.extra.accountName";
    public static final String EXTRA_UDC_SETTING_ID_LIST = "com.google.android.gms.udc.extra.settingIdList";
    public static final String GOOGLE_NOW_PACKAGE_NAME = "com.google.android.googlequicksearchbox";
    public static final String MIME_ACTIVITY_DISCONNECT_TYPE = "vnd.google.android.fitness/app_disconnect";
    public static final String PERMISSION_GMS_INTERNAL_BROADCAST = "com.google.android.gms.permission.INTERNAL_BROADCAST";
    private static final Uri zztz;
    private static final Uri zzua;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        zztz = parse;
        zzua = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    private GmsIntents() {
    }

    public static Intent createAndroidWearUpdateIntent() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    public static Intent createChooseGmsAccountIntent() {
        return AccountPicker.newChooseAccountIntent((Account) null, (ArrayList<Account>) null, new String[]{"com.google"}, true, (String) null, (String) null, (String[]) null, (Bundle) null, true);
    }

    public static Intent createChooseGmsAccountWithConsentIntent(String str, Scope[] scopeArr, boolean z) {
        Intent intent = new Intent("com.google.android.gms.signin.action.SIGN_IN");
        intent.putExtra(COMMON_SIGN_IN_EXTRA_PACKAGE_NAME, str);
        intent.putExtra(COMMON_SIGN_IN_EXTRA_SCOPE_ARRAY, scopeArr);
        intent.putExtra(COMMON_SIGN_IN_EXTRA_SAVE_DEFAULT_ACCOUNT, z);
        return intent;
    }

    public static Intent createDateSettingsIntent() {
        return new Intent("android.settings.DATE_SETTINGS");
    }

    public static Intent createFindPeopleIntent(Context context) {
        return zza(context, zzua);
    }

    public static Intent createPlayStoreGamesIntent(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(GooglePlayServicesUtilLight.GOOGLE_PLAY_STORE_GAMES_URI_STRING));
        intent.addFlags(524288);
        intent.setPackage("com.android.vending");
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            return intent;
        }
        Intent intent2 = new Intent(intent.getAction(), intent.getData());
        intent2.setFlags(intent.getFlags());
        return intent2;
    }

    public static Intent createPlayStoreIntent(String str) {
        return createPlayStoreIntent(str, (String) null);
    }

    public static Intent createPlayStoreIntent(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static Intent createPlayStoreLightPurchaseFlowIntent(Context context, String str, String str2) {
        Intent intent = new Intent("com.android.vending.billing.PURCHASE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.android.vending");
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("authAccount", str);
        }
        intent.putExtra("backend", 3);
        intent.putExtra("document_type", 1);
        intent.putExtra("full_docid", str2);
        intent.putExtra("backend_docid", str2);
        intent.putExtra("offer_type", 1);
        if (isIntentResolvable(context.getPackageManager(), intent)) {
            return intent;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse(String.format(Locale.US, "https://play.google.com/store/apps/details?id=%1$s&rdid=%1$s&rdot=%2$d", new Object[]{str2, 1})));
        intent2.setPackage("com.android.vending");
        intent2.putExtra("use_direct_purchase", true);
        return intent2;
    }

    public static Intent createSettingsIntent(String str) {
        Uri fromParts = Uri.fromParts("package", str, (String) null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static Intent createShareOnPlusIntent(Activity activity, String str, String str2) {
        Activity activity2;
        activity.getClass();
        Intent action = new Intent().setAction("android.intent.action.SEND");
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", activity.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", activity.getPackageName());
        action.addFlags(524288);
        Context context = activity;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity2 = null;
                break;
            } else if (context instanceof Activity) {
                activity2 = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity2 != null) {
            ComponentName componentName = activity2.getComponentName();
            action.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            action.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
        action.putExtra("android.intent.extra.SUBJECT", str);
        action.putExtra("android.intent.extra.TEXT", str2);
        action.setType("text/plain");
        action.setAction("android.intent.action.SEND");
        action.removeExtra("android.intent.extra.STREAM");
        action.setClipData((ClipData) null);
        action.setFlags(action.getFlags() & -2);
        action.setPackage("com.google.android.apps.plus");
        return isIntentResolvable(activity.getPackageManager(), action) ? action : createPlayStoreIntent("com.google.android.apps.plus");
    }

    public static Intent createShowProfileIntent(Context context, String str) {
        return zza(context, Uri.parse(String.format("https://plus.google.com/%s/about", new Object[]{str})));
    }

    public static Intent getFitnessAppDisconnectedIntent(String str, String str2) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(ACTION_FITNESS_APP_DISCONNECTED);
        intent.setType(MIME_ACTIVITY_DISCONNECT_TYPE);
        intent.putExtra(EXTRA_APP, str);
        intent.putExtra(EXTRA_ACCOUNT, str2);
        return intent;
    }

    public static Uri getPlayStoreUri(String str) {
        return Uri.parse("https://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", str).build();
    }

    public static boolean isIntentResolvable(PackageManager packageManager, Intent intent) {
        return packageManager.resolveActivity(intent, 65536) != null;
    }

    public static void sendIcingContactChangedBroadcast(Context context, boolean z) {
        Intent putExtra = new Intent(ACTION_ICING_CONTACT_CHANGED).setPackage("com.google.android.gms").putExtra(EXTRA_ICING_CONTACT_CHANGED_IS_SIGNIFICANT, z);
        if (Log.isLoggable("GmsIntents", 2)) {
            new StringBuilder(String.valueOf(putExtra.getAction()).length() + 98);
        }
        context.sendBroadcast(putExtra);
    }

    public static void sendSetGmsAccountIntent(Context context, String str, String str2) {
        Intent intent = new Intent(ACTION_SET_GMS_ACCOUNT);
        intent.putExtra(EXTRA_SET_GMS_ACCOUNT_NAME, str);
        intent.putExtra(EXTRA_SET_GMS_ACCOUNT_PACKAGE_NAME, str2);
        intent.setPackage("com.google.android.gms");
        context.sendBroadcast(intent, PERMISSION_GMS_INTERNAL_BROADCAST);
    }

    public static void sendUdcSettingsChangedBroadcast(Context context, String str, int[] iArr) {
        zza("com.google.android.gms", context, str, iArr);
        if (!GoogleSignatureVerifier.getInstance(context).isPackageGoogleSigned(GOOGLE_NOW_PACKAGE_NAME)) {
            Log.isLoggable("GmsIntents", 5);
        } else {
            zza(GOOGLE_NOW_PACKAGE_NAME, context, str, iArr);
        }
    }

    private static Intent zza(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setPackage("com.google.android.apps.plus");
        return isIntentResolvable(context.getPackageManager(), intent) ? intent : createPlayStoreIntent("com.google.android.apps.plus");
    }

    private static void zza(String str, Context context, String str2, int[] iArr) {
        Intent putExtra = new Intent(ACTION_UDC_SETTING_CHANGED).setPackage(str).putExtra(EXTRA_UDC_ACCOUNT_NAME, str2).putExtra(EXTRA_UDC_SETTING_ID_LIST, iArr);
        if (Log.isLoggable("GmsIntents", 3)) {
            new StringBuilder(String.valueOf(str).length() + 72 + String.valueOf(putExtra.getAction()).length());
        }
        context.sendBroadcast(putExtra);
    }
}
