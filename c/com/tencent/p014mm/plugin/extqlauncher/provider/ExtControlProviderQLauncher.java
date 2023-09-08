package com.tencent.p014mm.plugin.extqlauncher.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.plugin.ext.provider.ExtContentProviderBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import cw0.C116541b;
import eb0.C97625j3;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.extqlauncher.provider.ExtControlProviderQLauncher */
public class ExtControlProviderQLauncher extends ExtContentProviderBase {

    /* renamed from: r */
    public static final String[] f269579r = {"retCode"};

    /* renamed from: s */
    public static final String[] f269580s = {"id", "count"};

    /* renamed from: o */
    public String[] f269581o;

    /* renamed from: p */
    public int f269582p;

    /* renamed from: q */
    public Context f269583q;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.tencent.mm.plugin.extqlauncher", "openQRCodeScan", 18);
        uriMatcher.addURI("com.tencent.mm.plugin.extqlauncher", "batchAddShortcut", 19);
        uriMatcher.addURI("com.tencent.mm.plugin.extqlauncher", "getUnreadCount", 20);
    }

    public ExtControlProviderQLauncher(String[] strArr, int i, Context context) {
        this.f269581o = strArr;
        this.f269582p = i;
        this.f269583q = context;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Log.m105918d("MicroMsg.ExtControlProviderQLauncher", "query()");
        mo128170c(uri, this.f269583q, this.f269582p, this.f269581o);
        if (uri == null) {
            mo128176i(3);
            return null;
        } else if (Util.isNullOrNil(this.f269494g) || Util.isNullOrNil(mo128169b())) {
            mo128176i(3);
            return null;
        } else if (!mo128168a()) {
            mo128176i(1);
            return this.f269491d;
        } else if (!mo128174g(this.f269583q)) {
            Log.m105928w("MicroMsg.ExtControlProviderQLauncher", "invalid appid ! return null");
            mo128176i(2);
            return null;
        } else {
            switch (this.f269582p) {
                case 18:
                    Log.m105918d("MicroMsg.ExtControlProviderQLauncher", "toScanQRCode");
                    if (this.f269583q == null) {
                        mo128176i(4);
                        return null;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("BaseScanUI_select_scan_mode", 1);
                    intent.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
                    C88144b.m109791i(this.f269583q, "scanner", ".ui.BaseScanUI", intent, (Bundle) null);
                    MatrixCursor matrixCursor = new MatrixCursor(f269579r);
                    matrixCursor.addRow(new Object[]{1});
                    mo128176i(0);
                    return matrixCursor;
                case 19:
                    Log.m105918d("MicroMsg.ExtControlProviderQLauncher", "toCreateShortcut");
                    if (this.f269583q == null) {
                        mo128176i(4);
                        return null;
                    }
                    C88144b.m109791i(this.f269583q, "extqlauncher", ".ui.QLauncherCreateShortcutUI", new Intent(), (Bundle) null);
                    MatrixCursor matrixCursor2 = new MatrixCursor(f269579r);
                    matrixCursor2.addRow(new Object[]{1});
                    mo128176i(0);
                    return matrixCursor2;
                case 20:
                    Log.m105918d("MicroMsg.ExtControlProviderQLauncher", "getUnreadCount");
                    if (this.f269583q == null) {
                        mo128176i(4);
                        return null;
                    } else if (strArr2 == null || strArr2.length <= 0) {
                        Log.m105920e("MicroMsg.ExtControlProviderQLauncher", "wrong args");
                        mo128176i(3);
                        return null;
                    } else {
                        MatrixCursor matrixCursor3 = new MatrixCursor(f269580s);
                        int i = 0;
                        while (i < strArr2.length && i < 10) {
                            try {
                                if (!Util.isNullOrNil(strArr2[i])) {
                                    if (strArr2[i].equals("0")) {
                                        matrixCursor3.addRow(new Object[]{strArr2[i], 0});
                                    } else {
                                        String f = C116541b.m164356f(strArr2[i]);
                                        if (!Util.isNullOrNil(f)) {
                                            C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(f);
                                            if (j != null) {
                                                matrixCursor3.addRow(new Object[]{strArr2[i], Integer.valueOf(j.mo108786G2())});
                                            } else {
                                                matrixCursor3.addRow(new Object[]{strArr2[i], 0});
                                            }
                                        }
                                    }
                                }
                                i++;
                            } catch (Exception e) {
                                Log.m105921e("MicroMsg.ExtControlProviderQLauncher", "exception in updateShortcut, %s", e.getMessage());
                                mo128176i(4);
                                matrixCursor3.close();
                                return null;
                            }
                        }
                        mo128176i(0);
                        return matrixCursor3;
                    }
                default:
                    mo128176i(3);
                    return null;
            }
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public ExtControlProviderQLauncher() {
        this.f269582p = -1;
    }
}
