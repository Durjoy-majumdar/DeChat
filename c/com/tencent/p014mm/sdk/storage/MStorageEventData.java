package com.tencent.p014mm.sdk.storage;

/* renamed from: com.tencent.mm.sdk.storage.MStorageEventData */
public class MStorageEventData {
    public static final int EVENT_CREATE = 1;
    public static final int EVENT_DELETE = 5;
    public static final int EVENT_DROP = 6;
    public static final int EVENT_INSERT = 2;
    public static final int EVENT_QUERY = 7;
    public static final int EVENT_REPLACE = 4;
    public static final int EVENT_UPDATE = 3;
    public String event;
    public int eventId;
    public Object obj;
    public MStorage stg;

    /* renamed from: com.tencent.mm.sdk.storage.MStorageEventData$EventType */
    public interface EventType {
        public static final String BATCH = "batch";
        public static final String SINGLE = "single";
    }

    public MStorageEventData() {
        this.event = null;
        this.stg = null;
        this.eventId = -1;
        this.obj = null;
    }

    public String toString() {
        return "MStorageEventData [event=" + this.event + ", eventId=" + this.eventId + ", stg=" + this.stg + ", obj=" + this.obj + "]";
    }

    public MStorageEventData(String str) {
        this.event = str;
        this.stg = null;
        this.eventId = -1;
        this.obj = null;
    }

    public MStorageEventData(MStorage mStorage) {
        this.event = null;
        this.stg = mStorage;
        this.eventId = -1;
        this.obj = null;
    }

    public MStorageEventData(MStorage mStorage, int i, Object obj2) {
        this.event = null;
        this.stg = mStorage;
        this.eventId = i;
        this.obj = obj2;
    }
}
