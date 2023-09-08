package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class zzd implements DynamiteModule.VersionPolicy {
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int i;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.getLocalVersion(context, str);
        int remoteVersion = iVersions.getRemoteVersion(context, str, true);
        selectionResult.remoteVersion = remoteVersion;
        int i2 = selectionResult.localVersion;
        if (i2 == 0 && remoteVersion == 0) {
            i = 0;
        } else if (i2 >= remoteVersion) {
            i = -1;
        } else {
            selectionResult.selection = 1;
            return selectionResult;
        }
        selectionResult.selection = i;
        return selectionResult;
    }
}
