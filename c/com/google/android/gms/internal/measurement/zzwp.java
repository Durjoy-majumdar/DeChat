package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class zzwp {
    private static final ConcurrentHashMap<Uri, zzwp> zzbmt = new ConcurrentHashMap<>();
    private static final String[] zzbna = {"key", "value"};
    private final Uri uri;
    private final ContentResolver zzbmu;
    private final ContentObserver zzbmv;
    private final Object zzbmw = new Object();
    private volatile Map<String, String> zzbmx;
    private final Object zzbmy = new Object();
    private final List<zzwr> zzbmz = new ArrayList();

    private zzwp(ContentResolver contentResolver, Uri uri2) {
        this.zzbmu = contentResolver;
        this.uri = uri2;
        this.zzbmv = new zzwq(this, (Handler) null);
    }

    public static zzwp zza(ContentResolver contentResolver, Uri uri2) {
        ConcurrentHashMap<Uri, zzwp> concurrentHashMap = zzbmt;
        zzwp zzwp = concurrentHashMap.get(uri2);
        if (zzwp != null) {
            return zzwp;
        }
        zzwp zzwp2 = new zzwp(contentResolver, uri2);
        zzwp putIfAbsent = concurrentHashMap.putIfAbsent(uri2, zzwp2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        zzwp2.zzbmu.registerContentObserver(zzwp2.uri, false, zzwp2.zzbmv);
        return zzwp2;
    }

    private final Map<String, String> zzrv() {
        Cursor query;
        try {
            HashMap hashMap = new HashMap();
            query = this.zzbmu.query(this.uri, zzbna, (String) null, (String[]) null, (String) null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public final void zzrw() {
        synchronized (this.zzbmy) {
            for (zzwr zzrx : this.zzbmz) {
                zzrx.zzrx();
            }
        }
    }

    public final Map<String, String> zzrt() {
        Map<String, String> zzrv = zzws.zzd("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? zzrv() : this.zzbmx;
        if (zzrv == null) {
            synchronized (this.zzbmw) {
                Map<String, String> map = this.zzbmx;
                if (map == null) {
                    map = zzrv();
                    this.zzbmx = map;
                }
            }
        }
        return zzrv != null ? zzrv : Collections.emptyMap();
    }

    public final void zzru() {
        synchronized (this.zzbmw) {
            this.zzbmx = null;
        }
    }
}
