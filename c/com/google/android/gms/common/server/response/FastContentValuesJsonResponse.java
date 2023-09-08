package com.google.android.gms.common.server.response;

import android.content.ContentValues;

public abstract class FastContentValuesJsonResponse extends FastJsonResponse {
    private final ContentValues zzwj;

    public FastContentValuesJsonResponse() {
        this.zzwj = new ContentValues();
    }

    public FastContentValuesJsonResponse(ContentValues contentValues) {
        this.zzwj = contentValues;
    }

    public Object getValueObject(String str) {
        return this.zzwj.get(str);
    }

    public ContentValues getValues() {
        return this.zzwj;
    }

    public boolean isPrimitiveFieldSet(String str) {
        return this.zzwj.containsKey(str);
    }

    public void setBoolean(String str, boolean z) {
        this.zzwj.put(str, Boolean.valueOf(z));
    }

    public void setDecodedBytes(String str, byte[] bArr) {
        this.zzwj.put(str, bArr);
    }

    public void setDouble(String str, double d) {
        this.zzwj.put(str, Double.valueOf(d));
    }

    public void setFloat(String str, float f) {
        this.zzwj.put(str, Float.valueOf(f));
    }

    public void setInteger(String str, int i) {
        this.zzwj.put(str, Integer.valueOf(i));
    }

    public void setLong(String str, long j) {
        this.zzwj.put(str, Long.valueOf(j));
    }

    public void setString(String str, String str2) {
        this.zzwj.put(str, str2);
    }
}
