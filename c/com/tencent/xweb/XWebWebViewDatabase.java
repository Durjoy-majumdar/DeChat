package com.tencent.xweb;

import android.content.Context;
import com.tencent.xweb.internal.IWebViewDatabase;
import org.xwalk.core.XWalkEnvironment;

public class XWebWebViewDatabase implements IWebViewDatabase {
    private static final String HTTP_AUTH_DATABASE_FILE = "xweb_http_auth.db";
    private final HttpAuthDatabase mHttpAuthDatabase;

    public XWebWebViewDatabase() {
        this.mHttpAuthDatabase = HttpAuthDatabase.newInstance(XWalkEnvironment.getApplicationContext(), HTTP_AUTH_DATABASE_FILE);
    }

    @Deprecated
    public void clearFormData() {
    }

    public void clearHttpAuthUsernamePassword() {
        this.mHttpAuthDatabase.clearHttpAuthUsernamePassword();
    }

    @Deprecated
    public void clearUsernamePassword() {
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        return this.mHttpAuthDatabase.getHttpAuthUsernamePassword(str, str2);
    }

    @Deprecated
    public boolean hasFormData() {
        return false;
    }

    public boolean hasHttpAuthUsernamePassword() {
        return this.mHttpAuthDatabase.hasHttpAuthUsernamePassword();
    }

    @Deprecated
    public boolean hasUsernamePassword() {
        return false;
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        this.mHttpAuthDatabase.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    public XWebWebViewDatabase(Context context) {
        this.mHttpAuthDatabase = HttpAuthDatabase.newInstance(context, HTTP_AUTH_DATABASE_FILE);
    }
}
