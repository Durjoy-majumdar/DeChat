package com.eclipsesource.mmv8.snapshot;

import java.util.Map;

public abstract class CreateSnapshotResult {

    public static final class Failure extends CreateSnapshotResult {
        public static final int ERRNO_CREATE_SNAPSHOT_FAILURE = -9;
        public static final int ERRNO_CREATE_WARMUP_SNAPSHOT_FAILURE = -11;
        public static final int ERRNO_ILLEGAL_PARAMS = -101;
        public static final int ERRNO_INJECT_CONSOLE_FAILURE = -1;
        public static final int ERRNO_INVALID_BOOTSTRAP_SCRIPT = -4;
        public static final int ERRNO_JNI_SERIALIZE_DESERIALIZE_FAILURE = -103;
        public static final int ERRNO_LOAD_SO_FAILURE = -102;
        private static final int ERRNO_OFFSET = -100;
        public static final int ERRNO_READ_BOOTSTRAP_SCRIPT_FAILURE = -5;
        public static final int ERRNO_READ_GLUE_SCRIPT_FAILURE = 2;
        public static final int ERRNO_READ_WARMUP_SCRIPT_FAILURE = -7;
        public static final int ERRNO_RUN_BOOTSTRAP_SCRIPT_FAILURE = -6;
        public static final int ERRNO_RUN_GLUE_SCRIPT_FAILURE = -3;
        public static final int ERRNO_RUN_WARMUP_SCRIPT_FAILURE = -8;
        public static final int ERRNO_WRITE_SNAPSHOT_FAILURE = -10;
        public static final String ERR_MSG_ILLEGAL_PARAMS = "Illegal params";
        public static final String ERR_MSG_JNI_SERIALIZE_DESERIALIZE_FAILURE = "Jni serialize/deserialize failure";
        public static final String ERR_MSG_LOAD_SO_FAILURE = "Load so failure";
        public final String errMsg;
        public final int errno;

        public Failure(int i, String str) {
            if (!C80141Utils.isNullOrEmpty(str)) {
                this.errno = i;
                this.errMsg = str;
                return;
            }
            throw new IllegalArgumentException("errMsg is illegal");
        }

        public String toString() {
            return "CreateSnapshotResult$Failure{errno=" + this.errno + ", errMsg='" + this.errMsg + '\'' + '}';
        }
    }

    public static final class Success extends CreateSnapshotResult {
        public static int INVALID_CONTEXT_INDEX = -1;
        public static int NODE_MAIN_CONTEXT_INDEX;
        public Map<String, Integer> contextNameToSnapshotIndexMap;
        public String snapshotPath;

        public Success(String str, Map<String, Integer> map) {
            if (C80141Utils.isNullOrEmpty(str)) {
                throw new IllegalArgumentException("snapshotPath is illegal");
            } else if (map != null) {
                this.snapshotPath = str;
                this.contextNameToSnapshotIndexMap = map;
            } else {
                throw new IllegalArgumentException("contextNameToSnapshotIndexMap is illegal");
            }
        }

        public String toString() {
            return "CreateSnapshotResult$Success{snapshotPath='" + this.snapshotPath + '\'' + ", contextNameToSnapshotIndexMap=" + this.contextNameToSnapshotIndexMap + '}';
        }
    }
}
