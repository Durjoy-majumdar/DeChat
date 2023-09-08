package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class zze implements Runnable {
    private static final Logger zzer = new Logger("RevokeAccessOperation", new String[0]);
    private final StatusPendingResult zzes = new StatusPendingResult((GoogleApiClient) null);
    private final String zzz;

    private zze(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzz = str;
    }

    public static PendingResult<Status> zzg(String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), (GoogleApiClient) null);
        }
        zze zze = new zze(str);
        new Thread(zze).start();
        return zze.zzes;
    }

    public final void run() {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            String valueOf = String.valueOf(this.zzz);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                zzer.mo167270e("Unable to revoke access!", new Object[0]);
            }
            Logger logger = zzer;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            logger.mo167268d(sb.toString(), new Object[0]);
        } catch (IOException e) {
            Logger logger2 = zzer;
            String valueOf2 = String.valueOf(e.toString());
            logger2.mo167270e(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            Logger logger3 = zzer;
            String valueOf3 = String.valueOf(e2.toString());
            logger3.mo167270e(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.zzes.setResult(status);
    }
}
