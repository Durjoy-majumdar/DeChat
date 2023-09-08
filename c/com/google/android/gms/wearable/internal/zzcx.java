package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public final class zzcx implements DataEvent {
    private int type;
    private DataItem zzdg;

    public zzcx(DataEvent dataEvent) {
        this.type = dataEvent.getType();
        this.zzdg = (DataItem) dataEvent.getDataItem().freeze();
    }

    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }

    public final DataItem getDataItem() {
        return this.zzdg;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        String str = getType() == 1 ? "changed" : getType() == 2 ? "deleted" : "unknown";
        String valueOf = String.valueOf(getDataItem());
        StringBuilder sb = new StringBuilder(str.length() + 35 + valueOf.length());
        sb.append("DataEventEntity{ type=");
        sb.append(str);
        sb.append(", dataitem=");
        sb.append(valueOf);
        sb.append(" }");
        return sb.toString();
    }
}
