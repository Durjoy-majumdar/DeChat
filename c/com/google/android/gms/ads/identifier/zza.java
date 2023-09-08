package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

final class zza extends Thread {
    private final /* synthetic */ Map zzl;

    public zza(AdvertisingIdClient advertisingIdClient, Map map) {
        this.zzl = map;
    }

    public final void run() {
        HttpURLConnection httpURLConnection;
        new zzc();
        Map map = this.zzl;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                new StringBuilder(String.valueOf(uri).length() + 65);
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(e.getMessage()).length());
        } catch (IOException | RuntimeException e2) {
            new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(e2.getMessage()).length());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
