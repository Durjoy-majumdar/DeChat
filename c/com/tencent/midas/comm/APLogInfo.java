package com.tencent.midas.comm;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.midas.comm.log.APLogFileInfo;
import com.tencent.midas.comm.log.processor.APLogEncryptor;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import java.io.File;

public class APLogInfo {
    public static final String LOG_TAG = "MidasComm<Log>";
    public static final int LOG_VERSION_CODE = 43;
    public static final String LOG_VERSION_NAME = "1.2.23";
    private boolean autoFlush = true;
    private boolean compressLog = true;
    private Context context = null;
    private boolean encryptLog = true;
    private boolean hasWritePermission = false;
    private String logCallbackClassName;
    private boolean logEnable = true;
    private String logPath = "";
    private String logTag = "Midas";
    private String pkgName = "";
    private boolean printLog = false;
    private String processName = "";
    private boolean writeLog = true;

    private void initLogPath() {
        try {
            if (!this.hasWritePermission) {
                Context context2 = this.context;
                StringBuilder sb = new StringBuilder();
                sb.append("midas");
                String str = File.separator;
                sb.append(str);
                sb.append("log");
                sb.append(str);
                File externalFilesDir = context2.getExternalFilesDir(sb.toString());
                this.logPath = externalFilesDir == null ? "" : externalFilesDir.getPath();
            }
            if (TextUtils.isEmpty(this.logPath) || !new File(this.logPath).canWrite()) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(Environment.getExternalStorageDirectory());
                String str2 = File.separator;
                sb4.append(str2);
                sb4.append("tencent");
                sb4.append(str2);
                sb4.append("Midas");
                sb4.append(str2);
                sb4.append("Log");
                sb4.append(str2);
                this.logPath = sb4.toString();
            }
        } catch (Throwable th) {
            th.getMessage();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(Environment.getExternalStorageDirectory());
            String str3 = File.separator;
            sb5.append(str3);
            sb5.append("tencent");
            sb5.append(str3);
            sb5.append("Midas");
            sb5.append(str3);
            sb5.append("Log");
            sb5.append(str3);
            this.logPath = sb5.toString();
        }
    }

    private void initPermission() {
        this.hasWritePermission = this.context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", this.pkgName) == 0;
    }

    private void initPkgName() {
        Context context2 = this.context;
        if (context2 != null) {
            try {
                this.pkgName = context2.getPackageManager().getPackageInfo(this.context.getApplicationContext().getPackageName(), 0).packageName;
            } catch (Throwable th) {
                th.toString();
            }
        }
    }

    private void initProcessName() {
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) this.context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                    if (next.pid == myPid) {
                        String[] split = next.processName.split(XVFSFile.PATH_SEPARATOR);
                        if (split.length > 1) {
                            this.processName = split[1];
                            return;
                        } else {
                            this.processName = "";
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    private void setPrintLog(boolean z) {
        this.printLog = z;
    }

    private void setWriteLog(boolean z) {
        this.writeLog = z;
    }

    public Context getContext() {
        return this.context;
    }

    public String getLogCallbackClassName() {
        return this.logCallbackClassName;
    }

    public String getLogPath() {
        return this.logPath;
    }

    public String getLogTag() {
        return this.logTag;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getProcessName() {
        return this.processName;
    }

    public void init() {
        if (this.context != null) {
            initPkgName();
            initPermission();
            initProcessName();
            initLogPath();
        }
    }

    public boolean isAutoFlush() {
        return this.autoFlush;
    }

    public boolean isCompressLog() {
        return this.compressLog;
    }

    public boolean isEncryptLog() {
        return this.encryptLog;
    }

    public boolean isHasWritePermission() {
        return this.hasWritePermission;
    }

    public boolean isLogEnable() {
        return this.logEnable;
    }

    public boolean isPrintLog() {
        return this.printLog;
    }

    public boolean isWriteLog() {
        return this.writeLog;
    }

    public void setAutoFlush(boolean z) {
        this.autoFlush = z;
    }

    public void setCompressLog(boolean z) {
        this.compressLog = z;
    }

    public void setContext(Context context2) {
        this.context = context2.getApplicationContext();
    }

    public void setEncryptKey(String str) {
        APLogEncryptor.setEncryptKey(str);
    }

    public void setEncryptLog(boolean z) {
        this.encryptLog = z;
    }

    public void setEncryptProtocolVersion(byte b) {
        APLogEncryptor.setProtocolVersion(b);
    }

    public void setLogCallbackClassName(String str) {
        this.logCallbackClassName = str;
    }

    public void setLogEnable(boolean z) {
        this.logEnable = z;
    }

    public void setLogFileKeepDays(int i) {
        APLogFileUtil.maxLogKeepDays = i;
    }

    public void setLogFileNum(int i) {
        APLogFileUtil.maxLogFileNum = i;
    }

    public void setLogFileSizeMB(int i) {
        APLogFileUtil.maxLogFileSizeMB = i;
    }

    public void setLogParamFromServer(String str) {
        setLogWrite(str);
    }

    public void setLogPath(String str) {
        this.logPath = str;
    }

    public void setLogTag(String str) {
        this.logTag = str;
    }

    public void setLogWrite(String str) {
        int i;
        try {
            i = Integer.valueOf(str).intValue();
        } catch (Throwable unused) {
            i = 3;
        }
        boolean z = false;
        setPrintLog((i & 1) == 1);
        if ((i & 2) == 2) {
            z = true;
        }
        setWriteLog(z);
    }

    public boolean shouldPrintLog() {
        return this.logEnable || this.printLog || APLogFileUtil.isDebugMode(APLogFileInfo.dirName);
    }
}
