package com.tencent.p014mm.sdk.platformtools;

import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.sdk.platformtools.TimeLogger */
public class TimeLogger {
    private boolean mDisabled;
    private String mLabel;
    public ArrayList<String> mSplitLabels;
    public ArrayList<Long> mSplits;
    private String mTag;

    public TimeLogger(String str, String str2) {
        reset(str, str2);
    }

    public void addSplit(String str) {
        if (!this.mDisabled) {
            this.mSplits.add(Long.valueOf(SystemClock.elapsedRealtime()));
            this.mSplitLabels.add(str);
        }
    }

    public void dumpToLog() {
        if (!this.mDisabled) {
            String str = this.mTag;
            Log.m105918d(str, this.mLabel + ": begin");
            long longValue = this.mSplits.get(0).longValue();
            long j = longValue;
            for (int i = 1; i < this.mSplits.size(); i++) {
                j = this.mSplits.get(i).longValue();
                long longValue2 = this.mSplits.get(i - 1).longValue();
                String str2 = this.mTag;
                Log.m105918d(str2, this.mLabel + ":      " + (j - longValue2) + " ms, " + this.mSplitLabels.get(i));
            }
            String str3 = this.mTag;
            Log.m105918d(str3, this.mLabel + ": end, " + (j - longValue) + " ms");
        }
    }

    public void reset(String str, String str2) {
        this.mTag = str;
        this.mLabel = str2;
        reset();
    }

    public void reset() {
        this.mDisabled = false;
        ArrayList<Long> arrayList = this.mSplits;
        if (arrayList == null) {
            this.mSplits = new ArrayList<>();
            this.mSplitLabels = new ArrayList<>();
        } else {
            arrayList.clear();
            this.mSplitLabels.clear();
        }
        addSplit((String) null);
    }
}
