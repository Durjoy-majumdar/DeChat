package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class zze implements DynamiteModule.VersionPolicy {
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int localVersion = iVersions.getLocalVersion(context, str);
        selectionResult.localVersion = localVersion;
        selectionResult.remoteVersion = localVersion != 0 ? iVersions.getRemoteVersion(context, str, false) : iVersions.getRemoteVersion(context, str, true);
        int i = selectionResult.localVersion;
        if (i == 0 && selectionResult.remoteVersion == 0) {
            selectionResult.selection = 0;
        } else if (i >= selectionResult.remoteVersion) {
            selectionResult.selection = -1;
        } else {
            selectionResult.selection = 1;
        }
        return selectionResult;
    }
}
