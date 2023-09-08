package com.tencent.wcdb;

import java.util.Iterator;

public final class CursorJoiner implements Iterator<Result>, Iterable<Result> {
    private int[] mColumnsLeft;
    private int[] mColumnsRight;
    private Result mCompareResult;
    private boolean mCompareResultIsValid;
    private Cursor mCursorLeft;
    private Cursor mCursorRight;
    private String[] mValues;

    /* renamed from: com.tencent.wcdb.CursorJoiner$1 */
    public static /* synthetic */ class C1164891 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$wcdb$CursorJoiner$Result;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.wcdb.CursorJoiner$Result[] r0 = com.tencent.wcdb.CursorJoiner.Result.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$wcdb$CursorJoiner$Result = r0
                com.tencent.wcdb.CursorJoiner$Result r1 = com.tencent.wcdb.CursorJoiner.Result.BOTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tencent$wcdb$CursorJoiner$Result     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.wcdb.CursorJoiner$Result r1 = com.tencent.wcdb.CursorJoiner.Result.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$tencent$wcdb$CursorJoiner$Result     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.wcdb.CursorJoiner$Result r1 = com.tencent.wcdb.CursorJoiner.Result.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.CursorJoiner.C1164891.<clinit>():void");
        }
    }

    public enum Result {
        RIGHT,
        LEFT,
        BOTH
    }

    public CursorJoiner(Cursor cursor, String[] strArr, Cursor cursor2, String[] strArr2) {
        if (strArr.length == strArr2.length) {
            this.mCursorLeft = cursor;
            this.mCursorRight = cursor2;
            cursor.moveToFirst();
            this.mCursorRight.moveToFirst();
            this.mCompareResultIsValid = false;
            this.mColumnsLeft = buildColumnIndiciesArray(cursor, strArr);
            this.mColumnsRight = buildColumnIndiciesArray(cursor2, strArr2);
            this.mValues = new String[(this.mColumnsLeft.length * 2)];
            return;
        }
        throw new IllegalArgumentException("you must have the same number of columns on the left and right, " + strArr.length + " != " + strArr2.length);
    }

    private int[] buildColumnIndiciesArray(Cursor cursor, String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iArr[i] = cursor.getColumnIndexOrThrow(strArr[i]);
        }
        return iArr;
    }

    private static int compareStrings(String... strArr) {
        if (strArr.length % 2 == 0) {
            for (int i = 0; i < strArr.length; i += 2) {
                String str = strArr[i];
                if (str != null) {
                    String str2 = strArr[i + 1];
                    if (str2 == null) {
                        return 1;
                    }
                    int compareTo = str.compareTo(str2);
                    if (compareTo != 0) {
                        return compareTo < 0 ? -1 : 1;
                    }
                } else if (strArr[i + 1] != null) {
                    return -1;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("you must specify an even number of values");
    }

    private void incrementCursors() {
        if (this.mCompareResultIsValid) {
            int i = C1164891.$SwitchMap$com$tencent$wcdb$CursorJoiner$Result[this.mCompareResult.ordinal()];
            if (i == 1) {
                this.mCursorLeft.moveToNext();
                this.mCursorRight.moveToNext();
            } else if (i == 2) {
                this.mCursorLeft.moveToNext();
            } else if (i == 3) {
                this.mCursorRight.moveToNext();
            }
            this.mCompareResultIsValid = false;
        }
    }

    private static void populateValues(String[] strArr, Cursor cursor, int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            strArr[(i2 * 2) + i] = cursor.getString(iArr[i2]);
        }
    }

    public boolean hasNext() {
        if (!this.mCompareResultIsValid) {
            return !this.mCursorLeft.isAfterLast() || !this.mCursorRight.isAfterLast();
        }
        int i = C1164891.$SwitchMap$com$tencent$wcdb$CursorJoiner$Result[this.mCompareResult.ordinal()];
        if (i == 1) {
            return !this.mCursorLeft.isLast() || !this.mCursorRight.isLast();
        }
        if (i == 2) {
            return !this.mCursorLeft.isLast() || !this.mCursorRight.isAfterLast();
        }
        if (i == 3) {
            return !this.mCursorLeft.isAfterLast() || !this.mCursorRight.isLast();
        }
        throw new IllegalStateException("bad value for mCompareResult, " + this.mCompareResult);
    }

    public Iterator<Result> iterator() {
        return this;
    }

    public void remove() {
        throw new UnsupportedOperationException("not implemented");
    }

    public Result next() {
        if (hasNext()) {
            incrementCursors();
            boolean z = !this.mCursorLeft.isAfterLast();
            boolean z2 = !this.mCursorRight.isAfterLast();
            if (z && z2) {
                populateValues(this.mValues, this.mCursorLeft, this.mColumnsLeft, 0);
                populateValues(this.mValues, this.mCursorRight, this.mColumnsRight, 1);
                int compareStrings = compareStrings(this.mValues);
                if (compareStrings == -1) {
                    this.mCompareResult = Result.LEFT;
                } else if (compareStrings == 0) {
                    this.mCompareResult = Result.BOTH;
                } else if (compareStrings == 1) {
                    this.mCompareResult = Result.RIGHT;
                }
            } else if (z) {
                this.mCompareResult = Result.LEFT;
            } else {
                this.mCompareResult = Result.RIGHT;
            }
            this.mCompareResultIsValid = true;
            return this.mCompareResult;
        }
        throw new IllegalStateException("you must only call next() when hasNext() is true");
    }
}
