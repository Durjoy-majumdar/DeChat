package sp3;

import com.tencent.tav.core.AssetExportSession;

/* renamed from: sp3.l */
public final /* synthetic */ class C110810l {

    /* renamed from: a */
    public static final /* synthetic */ int[] f331529a;

    static {
        int[] iArr = new int[AssetExportSession.AssetExportSessionStatus.values().length];
        f331529a = iArr;
        iArr[AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusExporting.ordinal()] = 1;
        iArr[AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCompleted.ordinal()] = 2;
        iArr[AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCancelled.ordinal()] = 3;
        iArr[AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusFailed.ordinal()] = 4;
        iArr[AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusUnknown.ordinal()] = 5;
    }
}
