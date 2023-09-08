package com.tencent.maas.analytics;

import java.nio.ByteBuffer;

public class MJAnalyticsEvent {
    private final MJAnalyticsEventType eventType;
    private final ByteBuffer pbData;

    public MJAnalyticsEvent(MJAnalyticsEventType mJAnalyticsEventType, ByteBuffer byteBuffer) {
        this.eventType = mJAnalyticsEventType;
        this.pbData = byteBuffer == null ? null : ByteBuffer.allocate(byteBuffer.limit()).put(byteBuffer);
    }

    public static MJAnalyticsEvent createFrom(int i, ByteBuffer byteBuffer) {
        return new MJAnalyticsEvent(MJAnalyticsEventType.fromInt(i), byteBuffer);
    }

    public MJAnalyticsEventType getEventType() {
        return this.eventType;
    }

    public ByteBuffer getPBData() {
        return this.pbData;
    }
}
