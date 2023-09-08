package com.tencent.p014mm.sdk.platformtools;

/* renamed from: com.tencent.mm.sdk.platformtools.Version */
public class Version implements Comparable<Version> {
    private String[] version = null;

    public Version(String str) {
        if (str != null) {
            this.version = str.split("\\.");
        }
        String[] strArr = this.version;
        if (strArr == null || strArr.length == 0) {
            this.version = new String[]{str};
        }
    }

    public int compareTo(Version version2) {
        String[] strArr;
        int i = 0;
        while (true) {
            strArr = version2.version;
            if (i >= strArr.length) {
                break;
            }
            String[] strArr2 = this.version;
            if (i >= strArr2.length) {
                break;
            }
            int compareTo = strArr2[i].compareTo(strArr[i]);
            if (compareTo != 0) {
                return compareTo;
            }
            i++;
        }
        String[] strArr3 = this.version;
        if (strArr3.length > strArr.length) {
            return strArr3[strArr3.length - 1].compareTo("0");
        }
        return "0".compareTo(strArr[strArr.length - 1]);
    }
}
