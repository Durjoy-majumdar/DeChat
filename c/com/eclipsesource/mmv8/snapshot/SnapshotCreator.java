package com.eclipsesource.mmv8.snapshot;

import com.eclipsesource.mmv8.C80135V8;
import com.eclipsesource.mmv8.snapshot.CreateSnapshotResult;

public class SnapshotCreator {
    private static final String SNAPSHOT_FLAGS = "--turbo-instruction-scheduling";
    private static final String SNAPSHOT_PROFILE_FLAGS = "--profile-deserialization";

    static {
        C80135V8.setFlags(C80135V8.getFlags() + " " + SNAPSHOT_FLAGS + " " + SNAPSHOT_PROFILE_FLAGS);
    }

    private SnapshotCreator() {
    }

    public static CreateSnapshotResult create(CreateSnapshotParams createSnapshotParams) {
        return create((String) null, createSnapshotParams);
    }

    public static CreateSnapshotResult create(String str, CreateSnapshotParams createSnapshotParams) {
        if (createSnapshotParams == null) {
            return new CreateSnapshotResult.Failure(-101, CreateSnapshotResult.Failure.ERR_MSG_ILLEGAL_PARAMS);
        }
        if (!C80135V8.requireSoLoaded(str)) {
            return new CreateSnapshotResult.Failure(-102, CreateSnapshotResult.Failure.ERR_MSG_LOAD_SO_FAILURE);
        }
        CreateSnapshotResult _createSnapshot = C80135V8._createSnapshot(createSnapshotParams);
        return _createSnapshot == null ? new CreateSnapshotResult.Failure(-103, CreateSnapshotResult.Failure.ERR_MSG_JNI_SERIALIZE_DESERIALIZE_FAILURE) : _createSnapshot;
    }
}
