package com.tencent.tinker.loader.hotplug;

import java.util.HashMap;
import java.util.Map;

public class ActivityStubManager {
    private static final int[] NEXT_SINGLEINSTANCE_STUB_IDX_SLOTS = {0, 0};
    private static final int[] NEXT_SINGLETASK_STUB_IDX_SLOTS = {0, 0};
    private static final int[] NEXT_SINGLETOP_STUB_IDX_SLOTS = {0, 0};
    private static final int[] NEXT_STANDARD_STUB_IDX_SLOTS = {0, 0};
    private static final int NOTRANSPARENT_SLOT_INDEX = 0;
    private static final int[] SINGLEINSTANCE_STUB_COUNT_SLOTS = {10, 3};
    private static final int[] SINGLETASK_STUB_COUNT_SLOTS = {10, 3};
    private static final int[] SINGLETOP_STUB_COUNT_SLOTS = {10, 3};
    private static final int[] STANDARD_STUB_COUNT_SLOTS = {10, 3};
    private static final String TAG = "Tinker.ActivityStubManager";
    private static final int TRANSPARENT_SLOT_INDEX = 1;
    private static Map<String, String> sTargetToStubClassNameMap = new HashMap();

    private ActivityStubManager() {
        throw new UnsupportedOperationException();
    }

    public static String assignStub(String str, int i, boolean z) {
        String str2;
        int[] iArr;
        int[] iArr2;
        char c;
        String str3 = sTargetToStubClassNameMap.get(str);
        if (str3 != null) {
            return str3;
        }
        if (i == 1) {
            str2 = ActivityStubs.SINGLETOP_STUB_CLASSNAME_FORMAT;
            iArr2 = NEXT_SINGLETOP_STUB_IDX_SLOTS;
            iArr = SINGLETOP_STUB_COUNT_SLOTS;
        } else if (i == 2) {
            str2 = ActivityStubs.SINGLETASK_STUB_CLASSNAME_FORMAT;
            iArr2 = NEXT_SINGLETASK_STUB_IDX_SLOTS;
            iArr = SINGLETASK_STUB_COUNT_SLOTS;
        } else if (i != 3) {
            str2 = ActivityStubs.STARDARD_STUB_CLASSNAME_FORMAT;
            iArr2 = NEXT_STANDARD_STUB_IDX_SLOTS;
            iArr = STANDARD_STUB_COUNT_SLOTS;
        } else {
            str2 = ActivityStubs.SINGLEINSTANCE_STUB_CLASSNAME_FORMAT;
            iArr2 = NEXT_SINGLEINSTANCE_STUB_IDX_SLOTS;
            iArr = SINGLEINSTANCE_STUB_COUNT_SLOTS;
        }
        if (z) {
            str2 = str2 + ActivityStubs.TRANSPARENT_STUB_FORMAT_SUFFIX;
            c = 1;
        } else {
            c = 0;
        }
        int i2 = iArr2[c];
        iArr2[c] = i2 + 1;
        if (i2 >= iArr[c]) {
            iArr2[c] = 0;
            i2 = 0;
        }
        String format = String.format(str2, new Object[]{Integer.valueOf(i2)});
        sTargetToStubClassNameMap.put(str, format);
        return format;
    }
}
