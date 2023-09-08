package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class zzf implements DynamiteModule.VersionPolicy {
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int i;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.getLocalVersion(context, str);
        int remoteVersion = iVersions.getRemoteVersion(context, str, true);
        selectionResult.remoteVersion = remoteVersion;
        int i2 = selectionResult.localVersion;
        if (i2 == 0 && remoteVersion == 0) {
            i = 0;
        } else if (remoteVersion >= i2) {
            selectionResult.selection = 1;
            return selectionResult;
        } else {
            i = -1;
        }
        selectionResult.selection = i;
        return selectionResult;
    }
}
