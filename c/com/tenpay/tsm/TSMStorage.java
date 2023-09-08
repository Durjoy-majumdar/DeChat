package com.tenpay.tsm;

import com.tenpay.tsm.TSMTypes;
import com.tenpay.utils.SMUtilsV2;

public class TSMStorage {
    public static boolean checkSM2PriKey(String str) {
        int TSMStorageCheckSM2PriKey = SMUtilsV2.TSMStorageCheckSM2PriKey(str);
        if (TSMStorageCheckSM2PriKey == 0) {
            return TSMStorageCheckSM2PriKey == 0;
        }
        if (TSMStorageCheckSM2PriKey == -60012) {
            return false;
        }
        throw new TSMException(TSMStorageCheckSM2PriKey);
    }

    public static boolean checkSM2PubKey(String str) {
        int TSMStorageCheckSM2PubKey = SMUtilsV2.TSMStorageCheckSM2PubKey(str);
        if (TSMStorageCheckSM2PubKey == 0) {
            return TSMStorageCheckSM2PubKey == 0;
        }
        if (TSMStorageCheckSM2PubKey == -60012) {
            return false;
        }
        throw new TSMException(TSMStorageCheckSM2PubKey);
    }

    public static boolean checkSM4Key(String str) {
        int TSMStorageCheckSM4Key = SMUtilsV2.TSMStorageCheckSM4Key(str);
        if (TSMStorageCheckSM4Key == 0) {
            return TSMStorageCheckSM4Key == 0;
        }
        if (TSMStorageCheckSM4Key == -60012) {
            return false;
        }
        throw new TSMException(TSMStorageCheckSM4Key);
    }

    public static void deleteSM2PriKey(String str) {
        int TSMStorageDeleteSM2PriKey = SMUtilsV2.TSMStorageDeleteSM2PriKey(str);
        if (TSMStorageDeleteSM2PriKey != 0) {
            throw new TSMException(TSMStorageDeleteSM2PriKey);
        }
    }

    public static void deleteSM2PubKey(String str) {
        int TSMStorageDeleteSM2PubKey = SMUtilsV2.TSMStorageDeleteSM2PubKey(str);
        if (TSMStorageDeleteSM2PubKey != 0) {
            throw new TSMException(TSMStorageDeleteSM2PubKey);
        }
    }

    public static void deleteSM4Key(String str) {
        int TSMStorageDeleteSM4Key = SMUtilsV2.TSMStorageDeleteSM4Key(str);
        if (TSMStorageDeleteSM4Key != 0) {
            throw new TSMException(TSMStorageDeleteSM4Key);
        }
    }

    public static String[] exportSM2PriKey(String str, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        String[] strArr = new String[1];
        String[] strArr2 = new String[1];
        int TSMStorageExportSM2PriKey = SMUtilsV2.TSMStorageExportSM2PriKey(str, tSMStorageSM2KeyFormat.ordinal(), strArr, strArr2);
        if (TSMStorageExportSM2PriKey == 0) {
            return new String[]{strArr[0], strArr2[0]};
        } else if (TSMStorageExportSM2PriKey == -60012) {
            return null;
        } else {
            throw new TSMException(TSMStorageExportSM2PriKey);
        }
    }

    public static String exportSM2PubKey(String str, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        String[] strArr = new String[1];
        int TSMStorageExportSM2PubKey = SMUtilsV2.TSMStorageExportSM2PubKey(str, tSMStorageSM2KeyFormat.ordinal(), strArr);
        if (TSMStorageExportSM2PubKey == 0) {
            return strArr[0];
        }
        if (TSMStorageExportSM2PubKey == -60012) {
            return null;
        }
        throw new TSMException(TSMStorageExportSM2PubKey);
    }

    public static byte[] exportSM4Key(String str) {
        byte[][] bArr = new byte[1][];
        int TSMStorageExportSM4Key = SMUtilsV2.TSMStorageExportSM4Key(str, bArr);
        if (TSMStorageExportSM4Key == 0) {
            return bArr[0];
        }
        if (TSMStorageExportSM4Key == -60012) {
            return null;
        }
        throw new TSMException(TSMStorageExportSM4Key);
    }

    public static boolean generateSM2KeyPair(String str) {
        int TSMStorageGenerateSM2KeyPair = SMUtilsV2.TSMStorageGenerateSM2KeyPair(str);
        if (TSMStorageGenerateSM2KeyPair == 0) {
            return true;
        }
        throw new TSMException(TSMStorageGenerateSM2KeyPair);
    }

    public static boolean generateSM4Key(String str) {
        int TSMStorageGenerateSM4Key = SMUtilsV2.TSMStorageGenerateSM4Key(str);
        if (TSMStorageGenerateSM4Key == 0) {
            return true;
        }
        throw new TSMException(TSMStorageGenerateSM4Key);
    }

    public static void importSM2PriKey(String str, String str2, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        int TSMStorageImportSM2PriKey = SMUtilsV2.TSMStorageImportSM2PriKey(str, str2, tSMStorageSM2KeyFormat.ordinal());
        if (TSMStorageImportSM2PriKey != 0) {
            throw new TSMException(TSMStorageImportSM2PriKey);
        }
    }

    public static void importSM2PubKey(String str, String str2, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        int TSMStorageImportSM2PubKey = SMUtilsV2.TSMStorageImportSM2PubKey(str, str2, tSMStorageSM2KeyFormat.ordinal());
        if (TSMStorageImportSM2PubKey != 0) {
            throw new TSMException(TSMStorageImportSM2PubKey);
        }
    }

    public static void importSM4Key(String str, byte[] bArr) {
        int TSMStorageImportSM4Key = SMUtilsV2.TSMStorageImportSM4Key(str, bArr);
        if (TSMStorageImportSM4Key != 0) {
            throw new TSMException(TSMStorageImportSM4Key);
        }
    }

    public static void init(String str, String str2, String str3) {
        int TSMStorageInit = SMUtilsV2.TSMStorageInit(str, str2, str3);
        if (TSMStorageInit != 0) {
            throw new TSMException(TSMStorageInit);
        }
    }

    public static void updateSM2PriKey(String str, String str2, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        int TSMStorageUpdateSM2PriKey = SMUtilsV2.TSMStorageUpdateSM2PriKey(str, str2, tSMStorageSM2KeyFormat.ordinal());
        if (TSMStorageUpdateSM2PriKey != 0) {
            throw new TSMException(TSMStorageUpdateSM2PriKey);
        }
    }

    public static void updateSM2PubKey(String str, String str2, TSMTypes.TSMStorageSM2KeyFormat tSMStorageSM2KeyFormat) {
        int TSMStorageUpdateSM2PubKey = SMUtilsV2.TSMStorageUpdateSM2PubKey(str, str2, tSMStorageSM2KeyFormat.ordinal());
        if (TSMStorageUpdateSM2PubKey != 0) {
            throw new TSMException(TSMStorageUpdateSM2PubKey);
        }
    }

    public static void updateSM4Key(String str, byte[] bArr) {
        int TSMStorageUpdateSM4Key = SMUtilsV2.TSMStorageUpdateSM4Key(str, bArr);
        if (TSMStorageUpdateSM4Key != 0) {
            throw new TSMException(TSMStorageUpdateSM4Key);
        }
    }
}
