package com.tencent.p014mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.p014mm.autogen.events.ExtRequestAccountSyncEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatAuthorities;

/* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderAccountSync */
public class ExtControlProviderAccountSync extends ExtContentProviderBase {

    /* renamed from: o */
    public static final UriMatcher f269499o;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f269499o = uriMatcher;
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_ACCOUNTSYNC(), "accountSync", 1);
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

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Log.m105918d("MicroMsg.ExtControlAccountSyncProvider", "query()");
        Context context = getContext();
        UriMatcher uriMatcher = f269499o;
        mo128171d(uri, context, uriMatcher);
        if (uri == null) {
            mo128176i(3);
            return null;
        } else if (Util.isNullOrNil(this.f269494g) || Util.isNullOrNil(mo128169b())) {
            mo128176i(3);
            return null;
        } else if (!mo128168a()) {
            mo128176i(1);
            return this.f269491d;
        } else if (!mo128174g(getContext())) {
            Log.m105928w("MicroMsg.ExtControlAccountSyncProvider", "invalid appid ! return null");
            mo128176i(2);
            return null;
        } else if (uriMatcher.match(uri) != 1) {
            mo128176i(3);
            return null;
        } else {
            Log.m105924i("MicroMsg.ExtControlAccountSyncProvider", "startContactSync()");
            if (new ExtRequestAccountSyncEvent().publish()) {
                mo128176i(0);
            } else {
                Log.m105920e("MicroMsg.ExtControlAccountSyncProvider", "AccountHelper == null");
                mo128176i(4);
            }
            return null;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
