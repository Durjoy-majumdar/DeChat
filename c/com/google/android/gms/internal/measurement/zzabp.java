package com.google.android.gms.internal.measurement;

public enum zzabp {
    DOUBLE(zzabu.DOUBLE, 1),
    FLOAT(zzabu.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzabu.BOOLEAN, 0),
    STRING(zzabu.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzabu.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzabu.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzabu zzbwb;
    private final int zzbwc;

    private zzabp(zzabu zzabu, int i) {
        this.zzbwb = zzabu;
        this.zzbwc = i;
    }

    public final zzabu zzuv() {
        return this.zzbwb;
    }
}
