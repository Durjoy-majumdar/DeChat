package com.tencent.maas.instamovie.base;

public class MJError {

    /* renamed from: ec */
    public MaasEC f154609ec;
    public String message;

    public enum MaasEC {
        None(-1),
        NoError(0),
        GeneralError(1),
        LoadAssetFailed(4),
        FileExists(36),
        InvalidArgument(45),
        NetworkDown(50),
        TimedOut(87),
        InvalidState(101),
        NetworkFailed(115),
        VideoEncodeFailed(144);
        
        private final int errorCode;

        private MaasEC(int i) {
            this.errorCode = i;
        }

        public static MaasEC fromInt(int i) {
            for (MaasEC maasEC : values()) {
                if (maasEC.getErrorCode() == i) {
                    return maasEC;
                }
            }
            return None;
        }

        public int getErrorCode() {
            return this.errorCode;
        }
    }

    public MJError(int i, String str) {
        this.f154609ec = MaasEC.fromInt(i);
        this.message = str;
    }
}
