package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class zzb implements DynamiteModule.VersionPolicy {
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int remoteVersion = iVersions.getRemoteVersion(context, str, true);
        selectionResult.remoteVersion = remoteVersion;
        if (remoteVersion != 0) {
            selectionResult.selection = 1;
        } else {
            int localVersion = iVersions.getLocalVersion(context, str);
            selectionResult.localVersion = localVersion;
            if (localVersion != 0) {
                selectionResult.selection = -1;
            }
        }
        return selectionResult;
    }
}
