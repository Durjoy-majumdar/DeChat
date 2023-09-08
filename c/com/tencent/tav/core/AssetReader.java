package com.tencent.tav.core;

import com.tencent.tav.asset.Asset;
import com.tencent.tav.core.AssetReaderOutput;
import com.tencent.tav.coremedia.CMTimeRange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AssetReader implements AssetReaderOutput.StatusListener {
    private Asset asset;
    private IContextCreate contextCreate;
    private String errMsg = "";
    private HashMap<AssetReaderOutput, AVAssetReaderStatus> outputStatusHashMap = new HashMap<>();
    private List<AssetReaderOutput> outputs = new ArrayList();
    private AVAssetReaderStatus status = AVAssetReaderStatus.AssetReaderStatusUnknown;
    private CMTimeRange timeRange;

    public AssetReader(Asset asset2) {
        this.asset = asset2;
    }

    private void updateAssetStatus() {
        Iterator<AssetReaderOutput> it = this.outputs.iterator();
        boolean z = true;
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            if (this.outputStatusHashMap.get(it.next()) == AVAssetReaderStatus.AssetReaderStatusCompleted) {
                z2 = true;
            }
            z &= z2;
        }
        if (z) {
            this.status = AVAssetReaderStatus.AssetReaderStatusCompleted;
            return;
        }
        boolean z3 = true;
        for (AssetReaderOutput next : this.outputs) {
            z3 &= this.outputStatusHashMap.get(next) == AVAssetReaderStatus.AssetReaderStatusReading || this.outputStatusHashMap.get(next) == AVAssetReaderStatus.AssetReaderStatusCompleted;
        }
        if (z3) {
            this.status = AVAssetReaderStatus.AssetReaderStatusReading;
            return;
        }
        for (AssetReaderOutput assetReaderOutput : this.outputs) {
            AVAssetReaderStatus aVAssetReaderStatus = this.outputStatusHashMap.get(assetReaderOutput);
            AVAssetReaderStatus aVAssetReaderStatus2 = AVAssetReaderStatus.AssetReaderStatusFailed;
            if (aVAssetReaderStatus == aVAssetReaderStatus2) {
                this.status = aVAssetReaderStatus2;
                return;
            }
        }
        for (AssetReaderOutput assetReaderOutput2 : this.outputs) {
            AVAssetReaderStatus aVAssetReaderStatus3 = this.outputStatusHashMap.get(assetReaderOutput2);
            AVAssetReaderStatus aVAssetReaderStatus4 = AVAssetReaderStatus.AssetReaderStatusCancelled;
            if (aVAssetReaderStatus3 == aVAssetReaderStatus4) {
                this.status = aVAssetReaderStatus4;
                return;
            }
        }
    }

    public void addOutput(AssetReaderOutput assetReaderOutput) {
        if (canAddOutput(assetReaderOutput)) {
            this.outputs.add(assetReaderOutput);
        }
    }

    public boolean canAddOutput(AssetReaderOutput assetReaderOutput) {
        return assetReaderOutput != null && !this.outputs.contains(assetReaderOutput);
    }

    public void cancelReading() {
        for (AssetReaderOutput next : this.outputs) {
            this.outputStatusHashMap.put(next, AVAssetReaderStatus.AssetReaderStatusCancelled);
            next.release();
        }
        updateAssetStatus();
    }

    public Asset getAsset() {
        return this.asset;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public List<AssetReaderOutput> getOutputs() {
        return this.outputs;
    }

    public AVAssetReaderStatus getStatus() {
        return this.status;
    }

    public CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    public void setTimeRange(CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }

    public boolean startReading(IContextCreate iContextCreate) {
        this.contextCreate = iContextCreate;
        for (AssetReaderOutput next : this.outputs) {
            this.outputStatusHashMap.put(next, AVAssetReaderStatus.AssetReaderStatusReading);
            if (next.mediaType == 1) {
                next.start(iContextCreate, getTimeRange());
            } else {
                next.start((IContextCreate) null, getTimeRange());
            }
            next.addStatusListener(this);
        }
        updateAssetStatus();
        return this.outputs.size() > 0;
    }

    public void statusChanged(AssetReaderOutput assetReaderOutput, AVAssetReaderStatus aVAssetReaderStatus) {
        this.outputStatusHashMap.put(assetReaderOutput, aVAssetReaderStatus);
        updateAssetStatus();
    }
}
