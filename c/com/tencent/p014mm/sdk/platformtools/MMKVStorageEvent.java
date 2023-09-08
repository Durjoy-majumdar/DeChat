package com.tencent.p014mm.sdk.platformtools;

import android.os.Parcelable;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u000104X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010&\"\u0004\b;\u0010<R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006?"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/MMKVStorageEvent;", "", "type", "Lcom/tencent/mm/sdk/platformtools/MMKVStorageEventType;", "key", "", "(Lcom/tencent/mm/sdk/platformtools/MMKVStorageEventType;Ljava/lang/String;)V", "booleanValue", "", "getBooleanValue", "()Z", "setBooleanValue", "(Z)V", "byteArrayValue", "", "getByteArrayValue", "()[B", "setByteArrayValue", "([B)V", "doubleValue", "", "getDoubleValue", "()D", "setDoubleValue", "(D)V", "floatValue", "", "getFloatValue", "()F", "setFloatValue", "(F)V", "intValue", "", "getIntValue", "()I", "setIntValue", "(I)V", "getKey", "()Ljava/lang/String;", "longValue", "", "getLongValue", "()J", "setLongValue", "(J)V", "parcelableValue", "Landroid/os/Parcelable;", "getParcelableValue", "()Landroid/os/Parcelable;", "setParcelableValue", "(Landroid/os/Parcelable;)V", "setValue", "", "getSetValue", "()Ljava/util/Set;", "setSetValue", "(Ljava/util/Set;)V", "stringValue", "getStringValue", "setStringValue", "(Ljava/lang/String;)V", "getType", "()Lcom/tencent/mm/sdk/platformtools/MMKVStorageEventType;", "wechat-internal-support_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.platformtools.MMKVStorageEvent */
public final class MMKVStorageEvent {
    private boolean booleanValue;
    private byte[] byteArrayValue;
    private double doubleValue;
    private float floatValue;
    private int intValue;
    private final String key;
    private long longValue;
    private Parcelable parcelableValue;
    private Set<String> setValue;
    private String stringValue;
    private final MMKVStorageEventType type;

    public MMKVStorageEvent(MMKVStorageEventType mMKVStorageEventType, String str) {
        C87412m.m108594g(mMKVStorageEventType, "type");
        C87412m.m108594g(str, "key");
        this.type = mMKVStorageEventType;
        this.key = str;
    }

    public final boolean getBooleanValue() {
        return this.booleanValue;
    }

    public final byte[] getByteArrayValue() {
        return this.byteArrayValue;
    }

    public final double getDoubleValue() {
        return this.doubleValue;
    }

    public final float getFloatValue() {
        return this.floatValue;
    }

    public final int getIntValue() {
        return this.intValue;
    }

    public final String getKey() {
        return this.key;
    }

    public final long getLongValue() {
        return this.longValue;
    }

    public final Parcelable getParcelableValue() {
        return this.parcelableValue;
    }

    public final Set<String> getSetValue() {
        return this.setValue;
    }

    public final String getStringValue() {
        return this.stringValue;
    }

    public final MMKVStorageEventType getType() {
        return this.type;
    }

    public final void setBooleanValue(boolean z) {
        this.booleanValue = z;
    }

    public final void setByteArrayValue(byte[] bArr) {
        this.byteArrayValue = bArr;
    }

    public final void setDoubleValue(double d) {
        this.doubleValue = d;
    }

    public final void setFloatValue(float f) {
        this.floatValue = f;
    }

    public final void setIntValue(int i) {
        this.intValue = i;
    }

    public final void setLongValue(long j) {
        this.longValue = j;
    }

    public final void setParcelableValue(Parcelable parcelable) {
        this.parcelableValue = parcelable;
    }

    public final void setSetValue(Set<String> set) {
        this.setValue = set;
    }

    public final void setStringValue(String str) {
        this.stringValue = str;
    }
}
