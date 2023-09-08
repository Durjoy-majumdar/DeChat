package com.tencent.p014mm.vfs;

import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.util.Pair;
import com.tencent.p014mm.vfs.FileSystem;

/* renamed from: com.tencent.mm.vfs.SchemeResolver */
public interface SchemeResolver extends Parcelable, C116296g<C116250a> {

    /* renamed from: com.tencent.mm.vfs.SchemeResolver$a */
    public interface C116250a {
        /* renamed from: a */
        void mo177749a(CancellationSignal cancellationSignal);

        /* renamed from: b */
        Pair<FileSystem.C85995c, String> mo177604b(C116328u0 u0Var, Uri uri);

        /* renamed from: c */
        Uri mo177659c(C116328u0 u0Var, Uri uri);
    }
}
