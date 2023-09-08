package com.tencent.mapsdk.engine.jni.models;

import com.tencent.mapsdk.internal.C80353mf;

public class TappedElement {
    private static final int BUILDING_ID_LENGTH = 128;
    private static final int BUILDING_NAME_LENGTH = 68;
    private static final int FLOOR_NAME_LENGTH = 32;
    private static final int POI_ID_LENGTH = 64;
    public static final int TYPE_ANNO = 1;
    public static final int TYPE_ANNO_INDOOR_MAP = 1;
    public static final int TYPE_BLOCKROUTE_ANNO = 7;
    public static final int TYPE_COMPASS = 3;
    public static final int TYPE_INDOORMAP_AREA = 8;
    public static final int TYPE_LINE = 5;
    public static final int TYPE_LOCATION_MARKER = 6;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_OVERLAY_ITEM = 4;
    public String buildingId;
    public String buildingName;
    public String floorName;
    public long itemId;
    public int itemType;
    public String name;
    public int nameLen;
    public int pixelX;
    public int pixelY;
    public String poiId;
    public int type;

    private TappedElement() {
    }

    public static TappedElement fromBytes(byte[] bArr) {
        TappedElement tappedElement = new TappedElement();
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        tappedElement.type = C80353mf.m97895a(bArr2);
        System.arraycopy(bArr, 4, bArr2, 0, 4);
        tappedElement.pixelX = C80353mf.m97895a(bArr2);
        System.arraycopy(bArr, 8, bArr2, 0, 4);
        tappedElement.pixelY = C80353mf.m97895a(bArr2);
        System.arraycopy(bArr, 12, bArr2, 0, 4);
        tappedElement.itemType = C80353mf.m97895a(bArr2);
        System.arraycopy(bArr, 16, bArr2, 0, 4);
        tappedElement.nameLen = C80353mf.m97895a(bArr2);
        int i = 20;
        if (tappedElement.type != 7) {
            byte[] bArr3 = new byte[64];
            System.arraycopy(bArr, 20, bArr3, 0, 64);
            i = 84;
            if (tappedElement.type != 8) {
                tappedElement.name = C80353mf.m97908b(bArr3);
            } else {
                tappedElement.name = C80353mf.m97896a(bArr3, "UTF-8");
            }
        }
        System.arraycopy(bArr, i, bArr2, 0, 4);
        int a = C80353mf.m97895a(bArr2);
        int i2 = i + 4;
        System.arraycopy(bArr, i2, bArr2, 0, 4);
        tappedElement.itemId = (((long) a) << 32) + ((long) C80353mf.m97895a(bArr2));
        int i3 = i2 + 4;
        byte[] bArr4 = new byte[64];
        System.arraycopy(bArr, i3, bArr4, 0, 64);
        tappedElement.poiId = String.valueOf(C80353mf.m97896a(bArr4, "UTF-8"));
        int i4 = i3 + 64;
        if (tappedElement.itemType == 1) {
            byte[] bArr5 = new byte[128];
            System.arraycopy(bArr, i4, bArr5, 0, 128);
            int i5 = i4 + 128;
            tappedElement.buildingId = C80353mf.m97896a(bArr5, "UTF-8");
            byte[] bArr6 = new byte[68];
            System.arraycopy(bArr, i5, bArr6, 0, 68);
            tappedElement.buildingName = C80353mf.m97908b(bArr6);
            byte[] bArr7 = new byte[32];
            System.arraycopy(bArr, i5 + 68, bArr7, 0, 32);
            tappedElement.floorName = C80353mf.m97896a(bArr7, "UTF-8");
        }
        return tappedElement;
    }
}
