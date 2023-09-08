package com.tencent.worddetect;

import j20.C117292a;
import k20.C9556a;

public class WordDetectNative {
    private static final String TAG = "WordDetectNative";
    private byte _hellAccFlag_;
    private int handleId = -1;

    public static class ConfigParam {
        public String detect_model_bin;
        public String detect_model_param;
    }

    public static class WordDetectDetailResult {
        public int height;
        public float[] rate_lang;
        public byte[] rawData;
        public int width;
    }

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("wechatWordDetectMod");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/worddetect/WordDetectNative", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/worddetect/WordDetectNative", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private native int GetDetailResult(WordDetectDetailResult wordDetectDetailResult, int i);

    private native int GetResult(int i);

    private static native String GetVersion();

    private native int Init(ConfigParam configParam);

    private native int Release(int i);

    private native int ScanImage(byte[] bArr, int i, int i2, int i3, int i4);

    public static String getVersion() {
        return GetVersion();
    }

    public int getDetailResult(WordDetectDetailResult wordDetectDetailResult) {
        return GetDetailResult(wordDetectDetailResult, this.handleId);
    }

    public int getResult() {
        return GetResult(this.handleId);
    }

    public int init(ConfigParam configParam) {
        if (this.handleId >= 0) {
            return 0;
        }
        int Init = Init(configParam);
        if (Init < 0) {
            return Init;
        }
        this.handleId = Init;
        return 0;
    }

    public int release() {
        int i = this.handleId;
        if (i < 0) {
            return 0;
        }
        int Release = Release(i);
        this.handleId = -1;
        return Release;
    }

    public int scanImage(byte[] bArr, int i, int i2, int i3) {
        return ScanImage(bArr, i, i2, i3, this.handleId);
    }
}
