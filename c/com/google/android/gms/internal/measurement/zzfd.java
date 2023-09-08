package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

final class zzfd extends SQLiteOpenHelper {
    private final /* synthetic */ zzfc zzaii;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfd(zzfc zzfc, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.zzaii = zzfc;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.zzaii.zzge().zzim().log("Opening the local database failed, dropping and recreating it");
            if (!this.zzaii.getContext().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.zzaii.zzge().zzim().zzg("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.zzaii.zzge().zzim().zzg("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzei.zza(this.zzaii.zzge(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        zzei.zza(this.zzaii.zzge(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
