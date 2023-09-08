package com.tencent.xweb.util;

public class PatchFileConfig {
    public String originalFileName;
    public int originalFileType;
    public int patchAlgorithmType = 1;
    public String patchEndFileMd5;
    public String patchFileName;
    public int type;

    public boolean isExtractedFile() {
        return this.originalFileType == 2;
    }

    public boolean isOriginalFileTypeApk() {
        return this.originalFileType == 1;
    }

    public boolean isPatchTypeBsdiff() {
        return this.patchAlgorithmType == 1;
    }

    public boolean isPatchTypeHdiff() {
        return this.patchAlgorithmType == 2;
    }

    public boolean isTypeAdd() {
        return this.type == 1;
    }

    public boolean isTypeModify() {
        return this.type == 2;
    }

    public boolean isTypeRemove() {
        return this.type == 3;
    }

    public String toString() {
        return "PatchFileConfig type:" + this.type + ", originalFileType:" + this.originalFileType + ", originalFileName:" + this.originalFileName + ", patchFileName:" + this.patchFileName + ", patchEndFileMd5:" + this.patchEndFileMd5 + ", patchType:" + this.patchAlgorithmType;
    }
}
