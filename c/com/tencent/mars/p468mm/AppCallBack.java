package com.tencent.mars.p468mm;

import android.content.Context;
import com.tencent.mars.app.AppLogic;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import java.io.PrintWriter;
import java.io.StringWriter;
import p156gj.C87200o;
import qe3.C89625d;

/* renamed from: com.tencent.mars.mm.AppCallBack */
public class AppCallBack implements AppLogic.ICallBack {
    private static final String TAG = "AppCallBack";
    private Context context = null;
    public AppLogic.DeviceInfo info = new AppLogic.DeviceInfo(C89625d.f257838d, C87200o.f252868a);

    public AppCallBack(Context context2) {
        this.context = context2;
    }

    private static String exception2String(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public AppLogic.AccountInfo getAccountInfo() {
        AppLogic.AccountInfo accountInfo = new AppLogic.AccountInfo();
        if (!(C114781l0.m161554a() == null || C114781l0.m161554a().f344208n == null)) {
            try {
                accountInfo.uin = (long) C114781l0.m161554a().f344208n.f344122j;
                String str = C114781l0.m161554a().f344208n.f344126q;
                accountInfo.userName = str;
                if (Util.isNullOrNil(str)) {
                    accountInfo.userName = C114781l0.m161554a().f344208n.f344117e;
                }
            } catch (Exception unused) {
            }
        }
        return accountInfo;
    }

    public String getAppFilePath() {
        Context context2 = this.context;
        if (context2 == null) {
            Assert.assertTrue(false);
            return null;
        }
        try {
            C86009m1 c = C86009m1.m106378c(context2.getFilesDir());
            if (!c.mo119967g()) {
                c.mo119964e();
            }
            return c.toString();
        } catch (Exception e) {
            Log.m105920e(TAG, exception2String(e));
            Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
            return "";
        }
    }

    public int getClientVersion() {
        return C89625d.f257841g;
    }

    public String getCurLanguage() {
        return LocaleUtil.getApplicationLanguage();
    }

    public AppLogic.DeviceInfo getDeviceType() {
        return this.info;
    }
}
