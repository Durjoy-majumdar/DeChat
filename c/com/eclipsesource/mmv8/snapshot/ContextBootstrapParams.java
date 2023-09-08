package com.eclipsesource.mmv8.snapshot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class ContextBootstrapParams {
    public final SnapshotScriptInfo[] bootstrapScriptInfos;
    public final String name;
    public final boolean setupNodeEnv;
    public final SnapshotScriptInfo snapshotGlueScriptInfo;

    public static class Builder {
        private final List<SnapshotScriptInfo> mBootstrapScriptInfos = new ArrayList();
        private String mName = null;
        private boolean mSetupNodeEnv = false;
        private SnapshotScriptInfo mSnapshotGlueScriptInfo;

        public Builder appendBootstrapScriptInfo(SnapshotScriptInfo snapshotScriptInfo) {
            this.mBootstrapScriptInfos.add(snapshotScriptInfo);
            return this;
        }

        public ContextBootstrapParams build() {
            if (!C80141Utils.isNullOrEmpty(this.mName)) {
                int size = this.mBootstrapScriptInfos.size();
                SnapshotScriptInfo[] snapshotScriptInfoArr = new SnapshotScriptInfo[size];
                for (int i = 0; i < size; i++) {
                    snapshotScriptInfoArr[i] = this.mBootstrapScriptInfos.get(i);
                }
                return new ContextBootstrapParams(this.mName, this.mSnapshotGlueScriptInfo, snapshotScriptInfoArr, this.mSetupNodeEnv);
            }
            throw new IllegalStateException("name is empty");
        }

        public Builder name(String str) {
            if (!C80141Utils.isNullOrEmpty(str)) {
                this.mName = str;
                return this;
            }
            throw new IllegalArgumentException("name is empty");
        }

        public Builder setupNodeEnv(boolean z) {
            this.mSetupNodeEnv = z;
            return this;
        }

        public Builder snapshotGlueScriptInfo(SnapshotScriptInfo snapshotScriptInfo) {
            this.mSnapshotGlueScriptInfo = snapshotScriptInfo;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContextBootstrapParams.class != obj.getClass()) {
            return false;
        }
        return this.name.equals(((ContextBootstrapParams) obj).name);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name});
    }

    public String toString() {
        return "ContextBootstrapParams{name='" + this.name + '\'' + ", snapshotGlueScriptInfo=" + this.snapshotGlueScriptInfo + ", bootstrapScriptInfos=" + Arrays.toString(this.bootstrapScriptInfos) + ", setupNodeEnv=" + this.setupNodeEnv + '}';
    }

    private ContextBootstrapParams(String str, SnapshotScriptInfo snapshotScriptInfo, SnapshotScriptInfo[] snapshotScriptInfoArr, boolean z) {
        this.name = str;
        this.snapshotGlueScriptInfo = snapshotScriptInfo;
        this.bootstrapScriptInfos = snapshotScriptInfoArr;
        this.setupNodeEnv = z;
    }
}
