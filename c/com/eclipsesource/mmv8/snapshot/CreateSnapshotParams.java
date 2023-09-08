package com.eclipsesource.mmv8.snapshot;

import com.eclipsesource.mmv8.snapshot.CreateSnapshotResult;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class CreateSnapshotParams {
    public final List<ContextBootstrapParams> contextBootstrapParamsList;
    public final SnapshotScriptInfo globalSnapshotGlueScriptInfo;
    public boolean injectConsole;
    public final boolean keepCompiledData;
    public final String snapshotDirPath;
    public final List<SnapshotScriptInfo> warmupScriptInfoList;

    public CreateSnapshotParams(boolean z, SnapshotScriptInfo snapshotScriptInfo, List<ContextBootstrapParams> list, List<SnapshotScriptInfo> list2, boolean z2, String str) {
        if (list != null) {
            int i = 0;
            while (i < list.size()) {
                ContextBootstrapParams contextBootstrapParams = list.get(i);
                if (contextBootstrapParams == null) {
                    throw new IllegalArgumentException("contextBootstrapParams is null");
                } else if (!contextBootstrapParams.setupNodeEnv || CreateSnapshotResult.Success.NODE_MAIN_CONTEXT_INDEX == i) {
                    i++;
                } else {
                    throw new IllegalArgumentException("only the first contextBootstrapParams support setupNodeEnv");
                }
            }
        }
        if (list2 != null) {
            for (SnapshotScriptInfo snapshotScriptInfo2 : list2) {
                if (snapshotScriptInfo2 == null) {
                    throw new IllegalArgumentException("warmupScriptInfo is null");
                }
            }
        }
        if (!C80141Utils.isNullOrEmpty(str)) {
            this.injectConsole = z;
            this.globalSnapshotGlueScriptInfo = snapshotScriptInfo;
            this.contextBootstrapParamsList = list == null ? Collections.emptyList() : list;
            this.warmupScriptInfoList = list2 == null ? Collections.emptyList() : list2;
            this.keepCompiledData = z2;
            this.snapshotDirPath = str;
            return;
        }
        throw new IllegalArgumentException("snapshotDirPath is illegal");
    }

    public String toString() {
        return "CreateSnapshotParams{injectConsole=" + this.injectConsole + ", globalSnapshotGlueScriptInfo=" + this.globalSnapshotGlueScriptInfo + ", contextBootstrapParamsList=" + Arrays.toString(this.contextBootstrapParamsList.toArray()) + ", warmupScriptInfoList=" + Arrays.toString(this.warmupScriptInfoList.toArray()) + ", keepCompiledData=" + this.keepCompiledData + ", snapshotDirPath='" + this.snapshotDirPath + '\'' + '}';
    }
}
