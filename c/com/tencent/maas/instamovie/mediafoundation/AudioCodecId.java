package com.tencent.maas.instamovie.mediafoundation;

import java.util.HashMap;
import java.util.Map;

public enum AudioCodecId {
    LinearPCM(0),
    AC3(1),
    AC360958(2),
    AppleIMA4(3),
    MPEG4AAC(4),
    MPEG4CELP(5),
    MPEG4HVXC(6),
    MPEG4TwinVQ(7),
    MACE3(8),
    MACE6(9),
    ULaw(10),
    ALaw(11),
    QDesign(12),
    QDesign2(13),
    QUALCOMM(14),
    MPEGLayer1(15),
    MPEGLayer2(16),
    MPEGLayer3(17),
    AppleLossless(18),
    AMR(19),
    Audible(20),
    iLBC(21),
    DVIIntelIMA(22),
    MicrosoftGSM(23),
    AES3(24);
    
    private static final Map<Integer, AudioCodecId> intToTypeMap = null;

    /* renamed from: id */
    private int f78590id;

    /* access modifiers changed from: public */
    static {
        intToTypeMap = new HashMap();
        for (AudioCodecId audioCodecId : values()) {
            intToTypeMap.put(Integer.valueOf(audioCodecId.f78590id), audioCodecId);
        }
    }

    private AudioCodecId(int i) {
        this.f78590id = i;
    }

    public static AudioCodecId fromInt(int i) {
        AudioCodecId audioCodecId = intToTypeMap.get(Integer.valueOf(i));
        if (audioCodecId == null) {
            return null;
        }
        return audioCodecId;
    }

    public int getId() {
        return this.f78590id;
    }
}
