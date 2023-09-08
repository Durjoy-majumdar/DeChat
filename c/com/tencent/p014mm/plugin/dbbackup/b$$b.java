package com.tencent.p014mm.plugin.dbbackup;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.vfs.AccessControlFileSystem;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.plugin.dbbackup.b$$b */
public final /* synthetic */ class b$$b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String[] f345834d;

    /* renamed from: e */
    public final /* synthetic */ String f345835e;

    /* renamed from: f */
    public final /* synthetic */ String f345836f;

    /* renamed from: g */
    public final /* synthetic */ String f345837g;

    /* renamed from: h */
    public final /* synthetic */ Context f345838h;

    public /* synthetic */ b$$b(String[] strArr, String str, String str2, String str3, Context context) {
        this.f345834d = strArr;
        this.f345835e = str;
        this.f345836f = str2;
        this.f345837g = str3;
        this.f345838h = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String[] strArr = this.f345834d;
        String str = this.f345835e;
        String str2 = this.f345836f;
        String str3 = this.f345837g;
        Context context = this.f345838h;
        C97625j3.m125812b().mo105909x().mo125615f().close();
        for (String str4 : strArr) {
            AccessControlFileSystem.m163532d(3, str + str4);
            C86013q1.m106447h(str + str4);
            AccessControlFileSystem.m163534f(3);
            AccessControlFileSystem.m163532d(8, str + str4);
            C86013q1.m106463x(str2 + str4, str + str4);
            AccessControlFileSystem.m163534f(8);
        }
        C86013q1.m106445f(str3);
        SQLiteCipherSpec sQLiteCipherSpec = C115392k.f345883j;
        MMAppMgr.m85985e(context, true);
    }
}
