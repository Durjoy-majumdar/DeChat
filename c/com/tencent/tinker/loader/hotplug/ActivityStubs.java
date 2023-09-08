package com.tencent.tinker.loader.hotplug;

import android.app.Activity;

final class ActivityStubs {
    public static final String SINGLEINSTANCE_STUB_CLASSNAME_FORMAT;
    public static final int SINGLEINSTANCE_STUB_COUNT = 10;
    public static final int SINGLEINSTANCE_TRSNAPARENT_STUB_COUNT = 3;
    public static final String SINGLETASK_STUB_CLASSNAME_FORMAT;
    public static final int SINGLETASK_STUB_COUNT = 10;
    public static final int SINGLETASK_TRSNAPARENT_STUB_COUNT = 3;
    public static final String SINGLETOP_STUB_CLASSNAME_FORMAT;
    public static final int SINGLETOP_STUB_COUNT = 10;
    public static final int SINGLETOP_TRSNAPARENT_STUB_COUNT = 3;
    public static final int STANDARD_STUB_COUNT = 10;
    public static final int STANDARD_TRSNAPARENT_STUB_COUNT = 3;
    public static final String STARDARD_STUB_CLASSNAME_FORMAT;
    public static final String STUB_PACKAGE_NAME;
    public static final String TRANSPARENT_STUB_FORMAT_SUFFIX = "_T";

    public static final class SGTKStub_00 extends Activity {
    }

    public static final class SGTKStub_00_T extends Activity {
    }

    public static final class SGTKStub_01 extends Activity {
    }

    public static final class SGTKStub_01_T extends Activity {
    }

    public static final class SGTKStub_02 extends Activity {
    }

    public static final class SGTKStub_02_T extends Activity {
    }

    public static final class SGTKStub_03 extends Activity {
    }

    public static final class SGTKStub_04 extends Activity {
    }

    public static final class SGTKStub_05 extends Activity {
    }

    public static final class SGTKStub_06 extends Activity {
    }

    public static final class SGTKStub_07 extends Activity {
    }

    public static final class SGTKStub_08 extends Activity {
    }

    public static final class SGTKStub_09 extends Activity {
    }

    public static final class SGTStub_00 extends Activity {
    }

    public static final class SGTStub_00_T extends Activity {
    }

    public static final class SGTStub_01 extends Activity {
    }

    public static final class SGTStub_01_T extends Activity {
    }

    public static final class SGTStub_02 extends Activity {
    }

    public static final class SGTStub_02_T extends Activity {
    }

    public static final class SGTStub_03 extends Activity {
    }

    public static final class SGTStub_04 extends Activity {
    }

    public static final class SGTStub_05 extends Activity {
    }

    public static final class SGTStub_06 extends Activity {
    }

    public static final class SGTStub_07 extends Activity {
    }

    public static final class SGTStub_08 extends Activity {
    }

    public static final class SGTStub_09 extends Activity {
    }

    public static final class SIStub_00 extends Activity {
    }

    public static final class SIStub_00_T extends Activity {
    }

    public static final class SIStub_01 extends Activity {
    }

    public static final class SIStub_01_T extends Activity {
    }

    public static final class SIStub_02 extends Activity {
    }

    public static final class SIStub_02_T extends Activity {
    }

    public static final class SIStub_03 extends Activity {
    }

    public static final class SIStub_04 extends Activity {
    }

    public static final class SIStub_05 extends Activity {
    }

    public static final class SIStub_06 extends Activity {
    }

    public static final class SIStub_07 extends Activity {
    }

    public static final class SIStub_08 extends Activity {
    }

    public static final class SIStub_09 extends Activity {
    }

    public static final class STDStub_00 extends Activity {
    }

    public static final class STDStub_00_T extends Activity {
    }

    public static final class STDStub_01 extends Activity {
    }

    public static final class STDStub_01_T extends Activity {
    }

    public static final class STDStub_02 extends Activity {
    }

    public static final class STDStub_02_T extends Activity {
    }

    public static final class STDStub_03 extends Activity {
    }

    public static final class STDStub_04 extends Activity {
    }

    public static final class STDStub_05 extends Activity {
    }

    public static final class STDStub_06 extends Activity {
    }

    public static final class STDStub_07 extends Activity {
    }

    public static final class STDStub_08 extends Activity {
    }

    public static final class STDStub_09 extends Activity {
    }

    static {
        String name = ActivityStubs.class.getPackage().getName();
        STUB_PACKAGE_NAME = name;
        STARDARD_STUB_CLASSNAME_FORMAT = name + "." + "ActivityStubs" + "$STDStub_%02X";
        SINGLETOP_STUB_CLASSNAME_FORMAT = name + "." + "ActivityStubs" + "$SGTStub_%02X";
        SINGLETASK_STUB_CLASSNAME_FORMAT = name + "." + "ActivityStubs" + "$SGTKStub_%02X";
        SINGLEINSTANCE_STUB_CLASSNAME_FORMAT = name + "." + "ActivityStubs" + "$SIStub_%02X";
    }

    private ActivityStubs() {
        throw new UnsupportedOperationException();
    }
}
