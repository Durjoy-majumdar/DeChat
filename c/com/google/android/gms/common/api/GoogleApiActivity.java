package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.common.StateEvent;

public class GoogleApiActivity extends HellActivity implements DialogInterface.OnCancelListener {
    private int zzct = 0;

    public static PendingIntent zza(Context context, PendingIntent pendingIntent, int i) {
        return PendingIntent.getActivity(context, 0, zza(context, pendingIntent, i, true), 134217728);
    }

    public static Intent zza(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.zzct = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                GoogleApiManager zzb = GoogleApiManager.zzb((Context) this);
                if (i2 == -1) {
                    zzb.zzr();
                } else if (i2 == 0) {
                    zzb.zza(new ConnectionResult(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.zzct = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.zzct = 0;
        setResult(0);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zzct = bundle.getInt(TPReportKeys.Common.COMMON_DEVICE_RESOLUTION);
        }
        if (this.zzct != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get(StateEvent.Name.ERROR_CODE);
            if (pendingIntent == null && num == null) {
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                    this.zzct = 1;
                } catch (IntentSender.SendIntentException unused) {
                    finish();
                }
            } else {
                GoogleApiAvailability.getInstance().showErrorDialogFragment(this, num.intValue(), 2, this);
                this.zzct = 1;
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(TPReportKeys.Common.COMMON_DEVICE_RESOLUTION, this.zzct);
        super.onSaveInstanceState(bundle);
    }
}
