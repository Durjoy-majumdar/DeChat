package com.tencent.p014mm.game.liblockstep;

import java.util.HashMap;

/* renamed from: com.tencent.mm.game.liblockstep.LockStepNative */
public class LockStepNative {
    public static int INIT_ERROR = -1002;
    public static int NEW_LOCKSTEP_ERROR = -1000;
    public static int REPEAT_INIT_ERROR = -1001;
    public static String TAG = "LockStepNative";
    private boolean initCallBackFlag = false;
    public volatile long mNativeInst = 0;

    /* renamed from: com.tencent.mm.game.liblockstep.LockStepNative$ILockStepListener */
    public interface ILockStepListener {
        void onCallBack(long j, String str);
    }

    /* renamed from: com.tencent.mm.game.liblockstep.LockStepNative$ILockStepReportListener */
    public interface ILockStepReportListener {
        int getNetworkType();

        void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3);

        void onKvStat(int i, String str);
    }

    /* renamed from: com.tencent.mm.game.liblockstep.LockStepNative$a */
    public class C80868a implements ILockStepListener {

        /* renamed from: a */
        public final /* synthetic */ ILockStepListener f237697a;

        public C80868a(LockStepNative lockStepNative, ILockStepListener iLockStepListener) {
            this.f237697a = iLockStepListener;
        }

        public void onCallBack(long j, String str) {
            this.f237697a.onCallBack(j, str);
        }
    }

    /* renamed from: com.tencent.mm.game.liblockstep.LockStepNative$b */
    public class C80869b implements ILockStepReportListener {

        /* renamed from: a */
        public final /* synthetic */ ILockStepReportListener f237698a;

        public C80869b(LockStepNative lockStepNative, ILockStepReportListener iLockStepReportListener) {
            this.f237698a = iLockStepReportListener;
        }

        public int getNetworkType() {
            return this.f237698a.getNetworkType();
        }

        public void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3) {
            this.f237698a.onIdKeyStat(iArr, iArr2, iArr3);
        }

        public void onKvStat(int i, String str) {
            this.f237698a.onKvStat(i, str);
        }
    }

    public LockStepNative(long j, long j2, long j3) {
        this.mNativeInst = initBindingLockStep(j, j2, j3);
    }

    private native void destoryBindingLockStep(long j);

    private native long initBindingLockStep(long j, long j2, long j3);

    private native int initCallBack(long j, ILockStepListener iLockStepListener, ILockStepReportListener iLockStepReportListener);

    private static native void initConfigLockStep(long j, HashMap<String, String> hashMap);

    public static native void test();

    private native void testLockStepBinding(long j);

    private native void updateNativeUdpInterface(long j, long j2);

    public void destoryLockStep() {
        if (this.mNativeInst != -1 && this.initCallBackFlag) {
            this.initCallBackFlag = false;
            destoryBindingLockStep(this.mNativeInst);
            this.mNativeInst = -1;
        }
    }

    public void initConfig(HashMap<String, String> hashMap) {
        if (this.mNativeInst != -1) {
            initConfigLockStep(this.mNativeInst, hashMap);
        }
    }

    public int setCallback(ILockStepListener iLockStepListener, ILockStepReportListener iLockStepReportListener) {
        if (this.mNativeInst == -1) {
            return NEW_LOCKSTEP_ERROR;
        }
        if (this.initCallBackFlag) {
            return REPEAT_INIT_ERROR;
        }
        int initCallBack = initCallBack(this.mNativeInst, new C80868a(this, iLockStepListener), new C80869b(this, iLockStepReportListener));
        if (initCallBack != 0) {
            return INIT_ERROR;
        }
        this.initCallBackFlag = true;
        return initCallBack;
    }

    public void testLockStepBinding() {
        if (this.mNativeInst != -1) {
            testLockStepBinding(this.mNativeInst);
        }
    }

    public void updateNativeInterface(long j) {
        if (this.mNativeInst != -1) {
            updateNativeUdpInterface(this.mNativeInst, j);
        }
    }
}
