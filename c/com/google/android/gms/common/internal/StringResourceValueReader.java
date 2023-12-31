package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C104395R;

public class StringResourceValueReader {
    private final Resources zzvb;
    private final String zzvc;

    public StringResourceValueReader(Context context) {
        Preconditions.checkNotNull(context);
        Resources resources = context.getResources();
        this.zzvb = resources;
        this.zzvc = resources.getResourcePackageName(C104395R.string.common_google_play_services_unknown_issue);
    }

    public String getString(String str) {
        int identifier = this.zzvb.getIdentifier(str, "string", this.zzvc);
        if (identifier == 0) {
            return null;
        }
        return this.zzvb.getString(identifier);
    }
}
