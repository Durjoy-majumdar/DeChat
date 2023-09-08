package com.tencent.p014mm.sdk.coroutines;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB'\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/sdk/coroutines/CheckController;", "", "", "checkCondition", "", "startTime", "endTime", "interval", "Lrx3/b0;", "addCheckCondition", "", "configStr", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "now", "J", "getNow", "()J", "lastCheckTime", "getLastCheckTime", "defaultInterval", "getDefaultInterval", "", "Lcom/tencent/mm/sdk/coroutines/CheckController$CheckCondition;", "conditionList", "Ljava/util/List;", "<init>", "(Ljava/lang/String;JJJ)V", "Companion", "CheckCondition", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.coroutines.CheckController */
public final class CheckController {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final long DAY_INTERVAL = 86400000;
    public static final long HOUR_INTERVAL = 3600000;
    public static final long MINUTE_INTERVAL = 60000;
    /* access modifiers changed from: private */
    public static final Pattern TIME_REGEX = Pattern.compile("([0-9]+):([0-9]+)-([0-9]+):([0-9]+)");
    private final List<CheckCondition> conditionList = new ArrayList();
    private final long defaultInterval;
    private final long lastCheckTime;
    private final long now;
    private final String tag;

    @Metadata(mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/sdk/coroutines/CheckController$CheckCondition;", "", "startTime", "", "endTime", "interval", "(JJJ)V", "getEndTime", "()J", "getInterval", "getStartTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.coroutines.CheckController$CheckCondition */
    public static final class CheckCondition {
        private final long endTime;
        private final long interval;
        private final long startTime;

        public CheckCondition(long j, long j2, long j3) {
            this.startTime = j;
            this.endTime = j2;
            this.interval = j3;
        }

        public static /* synthetic */ CheckCondition copy$default(CheckCondition checkCondition, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = checkCondition.startTime;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = checkCondition.endTime;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = checkCondition.interval;
            }
            return checkCondition.copy(j4, j5, j3);
        }

        public final long component1() {
            return this.startTime;
        }

        public final long component2() {
            return this.endTime;
        }

        public final long component3() {
            return this.interval;
        }

        public final CheckCondition copy(long j, long j2, long j3) {
            return new CheckCondition(j, j2, j3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckCondition)) {
                return false;
            }
            CheckCondition checkCondition = (CheckCondition) obj;
            return this.startTime == checkCondition.startTime && this.endTime == checkCondition.endTime && this.interval == checkCondition.interval;
        }

        public final long getEndTime() {
            return this.endTime;
        }

        public final long getInterval() {
            return this.interval;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public int hashCode() {
            long j = this.startTime;
            long j2 = this.endTime;
            long j3 = this.interval;
            return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }

        public String toString() {
            return "CheckCondition(startTime=" + this.startTime + ", endTime=" + this.endTime + ", interval=" + this.interval + ')';
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/sdk/coroutines/CheckController$Companion;", "", "()V", "DAY_INTERVAL", "", "HOUR_INTERVAL", "MINUTE_INTERVAL", "TIME_REGEX", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "getTIME_REGEX", "()Ljava/util/regex/Pattern;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.coroutines.CheckController$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public final Pattern getTIME_REGEX() {
            return CheckController.TIME_REGEX;
        }
    }

    public CheckController(String str, long j, long j2, long j3) {
        C87412m.m108594g(str, "tag");
        this.tag = str;
        this.now = j;
        this.lastCheckTime = j2;
        this.defaultInterval = j3;
        Log.m105924i(str, "init check controller now:" + j + " lastCheckTime:" + j2 + " defaultInterval:" + j3);
    }

    public final void addCheckCondition(long j, long j2, long j3) {
        String str = this.tag;
        Log.m105924i(str, "addCheckCondition startTime:" + j + " endTime:" + j2 + " interval:" + j3);
        CheckCondition checkCondition = new CheckCondition(j, j2, j3);
        if (!this.conditionList.contains(checkCondition)) {
            this.conditionList.add(checkCondition);
        }
    }

    public final boolean checkCondition() {
        boolean z = true;
        if (!this.conditionList.isEmpty()) {
            for (CheckCondition checkCondition : this.conditionList) {
                if (checkCondition.getStartTime() <= this.now && checkCondition.getEndTime() >= this.now) {
                    if (this.lastCheckTime + checkCondition.getInterval() < this.now) {
                        String str = this.tag;
                        Log.m105924i(str, "condition true startTime:" + checkCondition.getStartTime() + " endTime:" + checkCondition.getEndTime() + " interval:" + checkCondition.getInterval());
                        return true;
                    }
                    String str2 = this.tag;
                    Log.m105918d(str2, "condition false startTime:" + checkCondition.getStartTime() + " endTime:" + checkCondition.getEndTime() + " interval:" + checkCondition.getInterval());
                }
            }
        }
        if (this.lastCheckTime + this.defaultInterval >= this.now) {
            z = false;
        }
        if (z) {
            Log.m105924i(this.tag, "condition true default condition");
        } else {
            Log.m105918d(this.tag, "condition false default condition");
        }
        return z;
    }

    public final long getDefaultInterval() {
        return this.defaultInterval;
    }

    public final long getLastCheckTime() {
        return this.lastCheckTime;
    }

    public final long getNow() {
        return this.now;
    }

    public final String getTag() {
        return this.tag;
    }

    public final void addCheckCondition(String str) {
        long j;
        String str2 = str;
        C87412m.m108594g(str2, "configStr");
        List U = C112550d0.m153785U(str, new String[]{"@"}, false, 0, 6, (Object) null);
        Matcher matcher = TIME_REGEX.matcher((CharSequence) U.get(0));
        if (matcher.find()) {
            String group = matcher.group(1);
            int parseInt = group != null ? Integer.parseInt(group) : 0;
            String group2 = matcher.group(2);
            int parseInt2 = group2 != null ? Integer.parseInt(group2) : 0;
            String group3 = matcher.group(3);
            int parseInt3 = group3 != null ? Integer.parseInt(group3) : 0;
            String group4 = matcher.group(4);
            int parseInt4 = group4 != null ? Integer.parseInt(group4) : 0;
            Calendar instance = Calendar.getInstance();
            instance.set(11, parseInt);
            instance.set(12, parseInt2);
            instance.set(13, 0);
            instance.set(14, 0);
            long timeInMillis = instance.getTimeInMillis();
            Calendar instance2 = Calendar.getInstance();
            instance2.set(11, parseInt3);
            instance2.set(12, parseInt4);
            instance2.set(13, 0);
            instance2.set(14, 0);
            if (instance2.getTimeInMillis() < timeInMillis) {
                j = instance2.getTimeInMillis() + 86400000;
            } else {
                j = instance2.getTimeInMillis();
            }
            addCheckCondition(timeInMillis, j, Long.parseLong((String) U.get(1)) * 1000);
            return;
        }
        String str3 = this.tag;
        Log.m105924i(str3, "not match regex " + str2);
    }
}
