package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail;
import com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.tencent.mapsdk.internal.re */
public final class C114138re implements TrafficEvent {

    /* renamed from: a */
    private static final String f341653a = "yyyy/MM/dd HH时";

    /* renamed from: c */
    private static final String[] f341654c = {"交通事故", "交通管制", "道路施工", "路上障碍物", "活动", "恶劣天气", "灾害", "拥堵", "检查", "一般事故", "积水", "其他事件"};

    /* renamed from: d */
    private static final String[] f341655d = {"发生", "出现", "有", "有", "有", "出现", "有", "出现", "有", "发生", "有", "有"};

    /* renamed from: b */
    private Detail f341656b;

    public C114138re(Detail detail) {
        this.f341656b = detail;
    }

    /* renamed from: a */
    private Detail m159289a() {
        return this.f341656b;
    }

    public final String getDescription() {
        int i = this.f341656b.basic.type;
        String[] strArr = f341654c;
        String str = i > strArr.length ? f341655d[strArr.length - 1] : f341655d[i - 1];
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f341653a, Locale.US);
        return simpleDateFormat.format(new Date(((long) this.f341656b.basic.start_time) * 1000)) + " - " + simpleDateFormat.format(new Date(((long) this.f341656b.basic.end_time) * 1000)) + 65292 + getRoadName() + str + getType();
    }

    public final int getEndTime() {
        return this.f341656b.basic.end_time;
    }

    public final String getMessage() {
        return this.f341656b.basic.message;
    }

    public final String getRoadName() {
        return this.f341656b.basic.roadname;
    }

    public final String getSource() {
        return this.f341656b.basic.source;
    }

    public final int getStartTime() {
        return this.f341656b.basic.start_time;
    }

    public final String getType() {
        int i = this.f341656b.basic.type;
        String[] strArr = f341654c;
        return i > strArr.length ? strArr[strArr.length - 1] : strArr[i - 1];
    }

    public final int getUpdateTime() {
        return this.f341656b.basic.update_time;
    }
}
