package com.tencent.maas.model.time;

public class MJTime implements Cloneable {
    private static final int FlicksPerMillisecond = 1411200;
    public static final int FlicksPerSecond = 1411200000;
    public static final MJTime InvalidTime = new MJTime();
    private static final int[][] LUTOfCompareResultsByType = {new int[]{2, -1, -1, 1}, new int[]{1, 0, 1, 1}, new int[]{1, -1, 0, 1}, new int[]{-1, -1, -1, 0}};
    public static final MJTime NegativeInfinityTime = new MJTime(MJTimeType.NEGATIVEINFINITY);
    public static final MJTime PositiveInfinityTime = new MJTime(MJTimeType.POSITIVEINFINITY);
    public static final MJTime ZeroTime = new MJTime(0);
    private final long flicks;
    private final MJTimeType type;

    /* renamed from: com.tencent.maas.model.time.MJTime$1 */
    public static /* synthetic */ class C1045461 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.maas.model.time.MJTime$MJTimeType[] r0 = com.tencent.maas.model.time.MJTime.MJTimeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType = r0
                com.tencent.maas.model.time.MJTime$MJTimeType r1 = com.tencent.maas.model.time.MJTime.MJTimeType.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.maas.model.time.MJTime$MJTimeType r1 = com.tencent.maas.model.time.MJTime.MJTimeType.INVALID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.maas.model.time.MJTime$MJTimeType r1 = com.tencent.maas.model.time.MJTime.MJTimeType.POSITIVEINFINITY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.maas.model.time.MJTime$MJTimeType r1 = com.tencent.maas.model.time.MJTime.MJTimeType.NEGATIVEINFINITY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.model.time.MJTime.C1045461.<clinit>():void");
        }
    }

    public enum MJTimeType {
        NUMERIC(0),
        INVALID(1),
        POSITIVEINFINITY(2),
        NEGATIVEINFINITY(3);
        
        private final int value;

        private MJTimeType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public MJTime() {
        this(0, MJTimeType.INVALID);
    }

    public static MJTime fromMicroseconds(long j) {
        return fromTimeValueAndScale(j, 1000000);
    }

    public static MJTime fromMilliseconds(long j) {
        return fromTimeValueAndScale(j, 1000);
    }

    public static MJTime fromNanoseconds(long j) {
        return fromTimeValueAndScale(j, 1000000000);
    }

    public static MJTime fromSeconds(double d) {
        return Double.valueOf(d).isNaN() ? InvalidTime : !Double.valueOf(d).isInfinite() ? new MJTime(Math.round(d * 1.4112E9d)) : d > 0.0d ? PositiveInfinityTime : NegativeInfinityTime;
    }

    public static MJTime fromTimeValueAndScale(long j, int i) {
        long j2 = (long) i;
        long j3 = j / j2;
        long j4 = (j % j2) * 1411200000;
        long j5 = j4 / j2;
        if ((j4 % j2) * 2 >= j2) {
            j5++;
        }
        return new MJTime((j3 * 1411200000) + j5);
    }

    public static MJTime max(MJTime mJTime, MJTime mJTime2) {
        return mJTime.bigThan(mJTime2) ? mJTime : mJTime2;
    }

    public static MJTime min(MJTime mJTime, MJTime mJTime2) {
        return mJTime.smallThan(mJTime2) ? mJTime : mJTime2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r7 != 4) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return InvalidTime;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (r1 != 4) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r1 != 4) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.maas.model.time.MJTime add(com.tencent.maas.model.time.MJTime r7) {
        /*
            r6 = this;
            int[] r0 = com.tencent.maas.model.time.MJTime.C1045461.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r6.type
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L_0x0046
            if (r1 == r4) goto L_0x0056
            if (r1 == r3) goto L_0x0017
            if (r1 == r2) goto L_0x0027
            goto L_0x0037
        L_0x0017:
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r7.type
            int r1 = r1.ordinal()
            r1 = r0[r1]
            if (r1 == r5) goto L_0x0043
            if (r1 == r4) goto L_0x0040
            if (r1 == r3) goto L_0x0043
            if (r1 == r2) goto L_0x0040
        L_0x0027:
            com.tencent.maas.model.time.MJTime$MJTimeType r7 = r7.type
            int r7 = r7.ordinal()
            r7 = r0[r7]
            if (r7 == r5) goto L_0x003d
            if (r7 == r4) goto L_0x003a
            if (r7 == r3) goto L_0x003a
            if (r7 == r2) goto L_0x003d
        L_0x0037:
            com.tencent.maas.model.time.MJTime r7 = InvalidTime
            return r7
        L_0x003a:
            com.tencent.maas.model.time.MJTime r7 = InvalidTime
            return r7
        L_0x003d:
            com.tencent.maas.model.time.MJTime r7 = NegativeInfinityTime
            return r7
        L_0x0040:
            com.tencent.maas.model.time.MJTime r7 = InvalidTime
            return r7
        L_0x0043:
            com.tencent.maas.model.time.MJTime r7 = PositiveInfinityTime
            return r7
        L_0x0046:
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r7.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r5) goto L_0x0062
            if (r0 == r4) goto L_0x005f
            if (r0 == r3) goto L_0x005c
            if (r0 == r2) goto L_0x0059
        L_0x0056:
            com.tencent.maas.model.time.MJTime r7 = InvalidTime
            return r7
        L_0x0059:
            com.tencent.maas.model.time.MJTime r7 = NegativeInfinityTime
            return r7
        L_0x005c:
            com.tencent.maas.model.time.MJTime r7 = PositiveInfinityTime
            return r7
        L_0x005f:
            com.tencent.maas.model.time.MJTime r7 = InvalidTime
            return r7
        L_0x0062:
            com.tencent.maas.model.time.MJTime r0 = new com.tencent.maas.model.time.MJTime
            long r1 = r6.flicks
            long r3 = r7.flicks
            long r1 = r1 + r3
            r0.<init>((long) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.model.time.MJTime.add(com.tencent.maas.model.time.MJTime):com.tencent.maas.model.time.MJTime");
    }

    public boolean bigThan(MJTime mJTime) {
        return compare(mJTime) > 0;
    }

    public int compare(MJTime mJTime) {
        int i = LUTOfCompareResultsByType[this.type.getValue()][mJTime.type.getValue()];
        return i == 2 ? Long.compare(this.flicks, mJTime.flicks) : i;
    }

    public MJTime divide(double d) {
        if (Double.isNaN(d)) {
            return InvalidTime;
        }
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            int i = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i == 0) {
                return InvalidTime;
            }
            int i2 = C1045461.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
            if (i2 == 1) {
                return new MJTime(Math.round(((double) this.flicks) / d));
            }
            if (i2 == 2) {
                return InvalidTime;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    if (i > 0) {
                        return NegativeInfinityTime;
                    }
                    return PositiveInfinityTime;
                }
            } else if (i > 0) {
                return PositiveInfinityTime;
            } else {
                return NegativeInfinityTime;
            }
        }
        int i3 = C1045461.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
        if (i3 == 1) {
            return ZeroTime;
        }
        if (i3 == 2) {
            return InvalidTime;
        }
        if (i3 == 3) {
            return InvalidTime;
        }
        if (i3 != 4) {
            return InvalidTime;
        }
        return InvalidTime;
    }

    public boolean equalsTo(MJTime mJTime) {
        return compare(mJTime) == 0;
    }

    public long getFlicks() {
        return this.flicks;
    }

    public MJTimeType getType() {
        return this.type;
    }

    public boolean isNegative() {
        return (isNumeric() && this.flicks < 0) || this.type == MJTimeType.NEGATIVEINFINITY;
    }

    public boolean isNegativeInfinity() {
        return this.type == MJTimeType.NEGATIVEINFINITY;
    }

    public boolean isNumeric() {
        return this.type == MJTimeType.NUMERIC;
    }

    public boolean isPositive() {
        return (isNumeric() && this.flicks > 0) || this.type == MJTimeType.POSITIVEINFINITY;
    }

    public boolean isPositiveInfinity() {
        return this.type == MJTimeType.POSITIVEINFINITY;
    }

    public boolean isValid() {
        return this.type != MJTimeType.INVALID;
    }

    public MJTime multi(double d) {
        if (Double.isNaN(d)) {
            return InvalidTime;
        }
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            int i = C1045461.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
            if (i == 1) {
                return new MJTime(Math.round(((double) this.flicks) * d));
            }
            if (i == 2) {
                return InvalidTime;
            }
            if (i == 3) {
                return PositiveInfinityTime;
            }
            if (i == 4) {
                return NegativeInfinityTime;
            }
        }
        if (d > 0.0d) {
            int i2 = C1045461.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
            if (i2 == 1) {
                return PositiveInfinityTime;
            }
            if (i2 == 2) {
                return InvalidTime;
            }
            if (i2 == 3) {
                return PositiveInfinityTime;
            }
            if (i2 == 4) {
                return NegativeInfinityTime;
            }
        } else {
            int i3 = C1045461.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
            if (i3 == 1) {
                return NegativeInfinityTime;
            }
            if (i3 == 2) {
                return InvalidTime;
            }
            if (i3 == 3) {
                return NegativeInfinityTime;
            }
            if (i3 == 4) {
                return PositiveInfinityTime;
            }
        }
        return InvalidTime;
    }

    public boolean smallThan(MJTime mJTime) {
        return compare(mJTime) < 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (r1 != 4) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.maas.model.time.MJTime sub(com.tencent.maas.model.time.MJTime r7) {
        /*
            r6 = this;
            int[] r0 = com.tencent.maas.model.time.MJTime.C1045461.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r6.type
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L_0x0046
            if (r1 == r4) goto L_0x0056
            if (r1 == r3) goto L_0x0017
            if (r1 == r2) goto L_0x0027
            goto L_0x0037
        L_0x0017:
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r7.type
            int r1 = r1.ordinal()
            r1 = r0[r1]
            if (r1 == r5) goto L_0x0043
            if (r1 == r4) goto L_0x0040
            if (r1 == r3) goto L_0x0040
            if (r1 == r2) goto L_0x0040
        L_0x0027:
            com.tencent.maas.model.time.MJTime$MJTimeType r7 = r7.type
            int r7 = r7.ordinal()
            r7 = r0[r7]
            if (r7 == r5) goto L_0x003d
            if (r7 == r4) goto L_0x003a
            if (r7 == r3) goto L_0x003a
            if (r7 == r2) goto L_0x003a
        L_0x0037:
            com.tencent.maas.model.time.MJTime r7 = InvalidTime
            return r7
        L_0x003a:
            com.tencent.maas.model.time.MJTime r7 = InvalidTime
            return r7
        L_0x003d:
            com.tencent.maas.model.time.MJTime r7 = NegativeInfinityTime
            return r7
        L_0x0040:
            com.tencent.maas.model.time.MJTime r7 = InvalidTime
            return r7
        L_0x0043:
            com.tencent.maas.model.time.MJTime r7 = PositiveInfinityTime
            return r7
        L_0x0046:
            com.tencent.maas.model.time.MJTime$MJTimeType r1 = r7.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r5) goto L_0x0062
            if (r0 == r4) goto L_0x005f
            if (r0 == r3) goto L_0x005c
            if (r0 == r2) goto L_0x0059
        L_0x0056:
            com.tencent.maas.model.time.MJTime r7 = InvalidTime
            return r7
        L_0x0059:
            com.tencent.maas.model.time.MJTime r7 = PositiveInfinityTime
            return r7
        L_0x005c:
            com.tencent.maas.model.time.MJTime r7 = NegativeInfinityTime
            return r7
        L_0x005f:
            com.tencent.maas.model.time.MJTime r7 = InvalidTime
            return r7
        L_0x0062:
            com.tencent.maas.model.time.MJTime r0 = new com.tencent.maas.model.time.MJTime
            long r1 = r6.flicks
            long r3 = r7.flicks
            long r1 = r1 - r3
            r0.<init>((long) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.model.time.MJTime.sub(com.tencent.maas.model.time.MJTime):com.tencent.maas.model.time.MJTime");
    }

    public double toMilliseconds() {
        int i = C1045461.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
        if (i == 1) {
            long j = this.flicks;
            return ((double) (j / 1411200)) + (((double) (j % 1411200)) / 1411200.0d);
        } else if (i != 3) {
            return i != 4 ? Double.NaN : Double.NEGATIVE_INFINITY;
        } else {
            return Double.POSITIVE_INFINITY;
        }
    }

    public double toSeconds() {
        int i = C1045461.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
        if (i == 1) {
            long j = this.flicks;
            return ((double) (j / 1411200000)) + (((double) (j % 1411200000)) / 1.4112E9d);
        } else if (i != 3) {
            return i != 4 ? Double.NaN : Double.NEGATIVE_INFINITY;
        } else {
            return Double.POSITIVE_INFINITY;
        }
    }

    public long toUs() {
        return (long) (toSeconds() * 1000000.0d);
    }

    public MJTime(long j) {
        this(j, MJTimeType.NUMERIC);
    }

    public MJTime(MJTimeType mJTimeType) {
        this(0, mJTimeType);
    }

    public MJTime(long j, MJTimeType mJTimeType) {
        this.flicks = j;
        this.type = mJTimeType;
    }

    public MJTime divide(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return InvalidTime;
        }
        int i2 = C1045461.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
        if (i2 == 1) {
            return new MJTime(this.flicks / j);
        }
        if (i2 == 2) {
            return InvalidTime;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                return InvalidTime;
            }
            if (i > 0) {
                return NegativeInfinityTime;
            }
            return PositiveInfinityTime;
        } else if (i > 0) {
            return PositiveInfinityTime;
        } else {
            return NegativeInfinityTime;
        }
    }

    public MJTime multi(long j) {
        int i = C1045461.$SwitchMap$com$tencent$maas$model$time$MJTime$MJTimeType[this.type.ordinal()];
        if (i == 1) {
            return new MJTime(this.flicks * j);
        }
        if (i == 2) {
            return InvalidTime;
        }
        if (i == 3) {
            int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i2 > 0) {
                return PositiveInfinityTime;
            }
            if (i2 == 0) {
                return InvalidTime;
            }
            return NegativeInfinityTime;
        } else if (i != 4) {
            return InvalidTime;
        } else {
            int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i3 > 0) {
                return NegativeInfinityTime;
            }
            if (i3 == 0) {
                return InvalidTime;
            }
            return PositiveInfinityTime;
        }
    }
}
