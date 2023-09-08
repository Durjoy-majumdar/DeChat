package com.tencent.tav.core;

public enum AssetParallelSegmentStatus {
    AssetParallelStatusUnknown,
    AssetParallelStatusPrepared,
    AssetParallelStatusStarted,
    AssetParallelStatusWaiting,
    AssetReaderStatusReadFinish,
    AssetReaderStatusWriteFinish,
    AssetExportStatusCompleted,
    AssetParallelStatusFailed,
    AssetParallelStatusCancelled,
    AssetParallelStatusTimeout
}
