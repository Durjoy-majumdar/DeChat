package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class zza implements DynamiteModule.VersionPolicy.IVersions {
    public final int getLocalVersion(Context context, String str) {
        return DynamiteModule.getLocalVersion(context, str);
    }

    public final int getRemoteVersion(Context context, String str, boolean z) {
        return DynamiteModule.getRemoteVersion(context, str, z);
    }
}
