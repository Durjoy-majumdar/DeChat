package com.alibaba.android.patronus;

import android.content.Context;
import com.alibaba.android.patronus.util.Log;

public final class Patrons {
    private static volatile boolean hasInit;

    public static class PatronsConfig {
        public boolean auto = true;
        public boolean debuggable = false;
        public boolean fixHuaweiBinderAbort = false;
        public int lowerLimit = 384;
        public int periodOfCheck = 30;
        public float periodOfShrink = 0.76f;
        public boolean recordInitResult = true;
        public int shrinkStep = 125;

        public String toString() {
            return "{ debuggable=" + this.debuggable + ", auto=" + this.auto + ", periodOfShrink=" + this.periodOfShrink + ", shrinkStep=" + this.shrinkStep + ", periodOfCheck=" + this.periodOfCheck + ", lowerLimit=" + this.lowerLimit + ", recordInitResult=" + this.recordInitResult + " }";
        }
    }

    private Patrons() {
    }

    public static String dumpNativeLogs() {
        return _Patrons.dumpNativeLogs();
    }

    public static long getCurrentMaxAvailableVMAddr() {
        if (_Patrons.isNativeLibLoaded()) {
            return _Patrons.getCurrentMaxAvailableVmAddr();
        }
        return 4294967296L;
    }

    public static long getRegionSpaceSize() {
        if (!hasInit) {
            return -1;
        }
        return _Patrons.getCurrentRegionSpaceSize();
    }

    public static void inBackground() {
        if (hasInit) {
            _Patrons.inBackground();
        }
    }

    public static int init(Context context, PatronsConfig patronsConfig) {
        boolean z = false;
        if (hasInit) {
            return 0;
        }
        int init = _Patrons.init(context, patronsConfig);
        if (init == 0) {
            z = true;
        }
        hasInit = z;
        return init;
    }

    public static long readVssSize() {
        return _Patrons.readVssSize();
    }

    public static Log.ILogger setLogger(Log.ILogger iLogger) {
        return Log.setLogger(iLogger);
    }

    public static boolean shrinkRegionSpace(int i) {
        if (hasInit) {
            return _Patrons.shrinkRegionSpace(i);
        }
        return false;
    }

    public static void toForeground() {
        if (hasInit) {
            _Patrons.toForeground();
        }
    }
}
