package com.tencent.p014mm.plugin.base.stub;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatAuthorities;
import com.tencent.p014mm.sdk.plugin.MMPluginProviderConstants;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.base.stub.MMPluginProvider */
public class MMPluginProvider extends ContentProvider {

    /* renamed from: e */
    public static final UriMatcher f247836e;

    /* renamed from: d */
    public C85081b f247837d = new C85081b();

    /* renamed from: com.tencent.mm.plugin.base.stub.MMPluginProvider$a */
    public static abstract class C85053a {

        /* renamed from: a */
        public Context f247838a;
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f247836e = uriMatcher;
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_SDK_PLUGIN_PROVIDER(), "sharedpref", 2);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        Log.m105926v("MicroMsg.MMPluginProvider", "plugin delete" + uri);
        if (f247836e.match(uri) != 2) {
            Log.m105920e("MicroMsg.MMPluginProvider", "Unknown URI " + uri);
            return 0;
        }
        this.f247837d.getClass();
        return 0;
    }

    public String getType(Uri uri) {
        f247836e.match(uri);
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Log.m105926v("MicroMsg.MMPluginProvider", "plugin insert" + uri);
        if (f247836e.match(uri) != 2) {
            Log.m105920e("MicroMsg.MMPluginProvider", "Unknown URI " + uri);
            return null;
        }
        this.f247837d.getClass();
        return null;
    }

    public boolean onCreate() {
        Log.m105924i("MicroMsg.MMPluginProvider", "onCreate");
        this.f247837d.f247838a = getContext();
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Log.m105924i("MicroMsg.MMPluginProvider", "plugin query" + uri);
        if (f247836e.match(uri) != 2) {
            Log.m105920e("MicroMsg.MMPluginProvider", "Unknown URI " + uri);
            return null;
        }
        this.f247837d.getClass();
        String str3 = strArr2[0];
        Object obj = ((HashMap) C85081b.f247916b).get(str3);
        if (obj == null) {
            Log.m105928w("MicroMsg.MMPluginProviderSharedPrefImpl", "not found value for key: " + str3);
            return null;
        }
        int type = MMPluginProviderConstants.Resolver.getType(obj);
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        matrixCursor.addRow(new Object[]{0, str3, Integer.valueOf(type), obj.toString()});
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Log.m105918d("MicroMsg.MMPluginProvider", "plugin update" + uri);
        if (f247836e.match(uri) != 2) {
            Log.m105920e("MicroMsg.MMPluginProvider", "Unknown URI " + uri);
            return 0;
        }
        this.f247837d.getClass();
        return 0;
    }
}
