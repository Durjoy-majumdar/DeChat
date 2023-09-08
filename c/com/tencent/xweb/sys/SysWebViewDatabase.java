package com.tencent.xweb.sys;

import android.content.Context;
import android.os.Build;
import android.webkit.WebViewDatabase;
import com.tencent.xweb.internal.IWebViewDatabase;
import org.xwalk.core.XWalkEnvironment;

public class SysWebViewDatabase implements IWebViewDatabase {
    private final WebViewDatabase mDatabase;

    public SysWebViewDatabase() {
        this.mDatabase = WebViewDatabase.getInstance(XWalkEnvironment.getApplicationContext());
    }

    @Deprecated
    public void clearFormData() {
        this.mDatabase.clearFormData();
    }

    public void clearHttpAuthUsernamePassword() {
        this.mDatabase.clearHttpAuthUsernamePassword();
    }

    @Deprecated
    public void clearUsernamePassword() {
        this.mDatabase.clearUsernamePassword();
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mDatabase.getHttpAuthUsernamePassword(str, str2);
        }
        return null;
    }

    @Deprecated
    public boolean hasFormData() {
        return this.mDatabase.hasFormData();
    }

    public boolean hasHttpAuthUsernamePassword() {
        return this.mDatabase.hasHttpAuthUsernamePassword();
    }

    @Deprecated
    public boolean hasUsernamePassword() {
        return this.mDatabase.hasUsernamePassword();
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mDatabase.setHttpAuthUsernamePassword(str, str2, str3, str4);
        }
    }

    public SysWebViewDatabase(Context context) {
        this.mDatabase = WebViewDatabase.getInstance(context);
    }
}
