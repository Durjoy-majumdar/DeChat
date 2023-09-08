package com.tencent.xweb.util;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.xweb.C106947R;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.CommandCfgPlugin;
import com.tencent.xweb.FileReaderCrashDetector;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.IXWebPreferences;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.WebDebugCfg;
import com.tencent.xweb.WebStorage;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebBroadcastListenerManager;
import com.tencent.xweb.XWebPreferences;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IDebugView;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.updater.UpdateConfig;
import com.tencent.xweb.updater.XWalkRuntimeRevertHelper;
import com.tencent.xweb.updater.XWalkRuntimeUpdater;
import com.tencent.xweb.updater.XWebCorePredownScheduler;
import com.tencent.xweb.updater.XWebCoreScheduler;
import com.tencent.xweb.updater.XWebRuntimeInstaller;
import com.tencent.xweb.util.ConfigDef;
import com.tencent.xweb.xwalk.plugin.XFileSchedulerFactory;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import com.tencent.xweb.xwalk.plugin.XWalkPluginManager;
import com.tencent.xweb.xwalk.plugin.XWalkPluginUpdateListener;
import com.tencent.xweb.xwalk.plugin.XWalkPluginUpdater;
import j20.C117292a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import org.xwalk.core.XWalkEnvironment;

public class WebDebugPage implements IDebugView {
    private static final String TAG = "WebDebugPage";
    private static final String cStrCheckFiles = "check_files";
    private static final String cStrCheckPluginUpdate = "check_plugin_update";
    private static final String cStrCheckStorage = "check_storage";
    private static final String cStrCheckUpdate = "check_xwalk_update";
    private static final String cStrCheckUpdateSoft = "soft_check_xwalk_update";
    private static final String cStrCleanDownloadZip = "clean_download_zip";
    private static final String cStrClearAllPlugin = "clear_all_plugin";
    private static final String cStrClearAllVersion = "clear_all_version";
    private static final String cStrClearCache = "clear_cache";
    private static final String cStrClearCommands = "clear_commands";
    private static final String cStrClearConfigTimeStamp = "clear_config_time_stamp";
    private static final String cStrClearCurrentScheduler = "clear_schedule";
    private static final String cStrClearOldVersion = "clear_old_version";
    private static final String cStrClearTestSetting = "clear_test_setting";
    private static final String cStrDebugXWebUrl = "debugxweb.qq.com";
    private static final String cStrEncrptUrl = "encrpt_url";
    private static final String cStrEncrptUrlKey = "b01d4598de5875eb9b86abdef32b811e9c55edcfb1673b5617cc0a6ab7dceaff";
    private static final String cStrForceX5 = "forcex5";
    private static final String cStrIgnoreCrashWatch = "ignore_crashwatch";
    private static final String cStrKeyAppBrandWebViewMode = "appbrand_webview_mode";
    private static final String cStrKeyInspector = "inspector";
    private static final String cStrKeyLoadLocalPackage = "load_local_xwalk";
    private static final String cStrKeyMMWebViewMode = "mm_webview_mode";
    private static final String cStrKeySetAppbrandConfig = "set_appbrand_config";
    private static final String cStrKeySetMMConfig = "set_mm_config";
    private static final String cStrKeySetWebviewConfig = "set_web_config";
    private static final String cStrKeyShowVerTip = "show_webview_version";
    private static final String cStrKeyUseTestConfig = "use_testconfig";
    private static final String cStrKillAll = "kill_all";
    private static final String cStrPubECDSAKey = "MHYwEAYHKoZIzj0CAQYFK4EEACIDYgAE4s7oy+BvW5kzf5PwtVqDdZb2rVQS7GDf\naJWwtkD95ILDQAtHM9Nv5apLYQnUbXkjTldOUpjK7MimTkf/qXjQfk8hF2A0Mf7L\nHbDPr7kD9DOuQlG53SWOuKQVEwwsjN1l";
    private static final String cStrPublicDebugXWebUrl = "public.debugxweb.qq.com";
    private static final String cStrRecheckCmds = "recheck_cmds";
    private static final String cStrResetCrashCount = "reset_crash_count";
    private static final String cStrResetWebViewKindToAuto = "reset_webview_kind_to_auto";
    private static final String cStrRevertToApkVersion = "revert_to_apk";
    private static final String cStrSetApkVersion = "set_apkver";
    private static final String cStrSetConfigUrl = "set_config_url";
    private static final String cStrSetDeviceRd = "set_device_rd_value";
    private static final String cStrSetForceUseOfficeReader = "set_force_use_office_reader";
    private static final String cStrSetGrayValue = "set_grayvalue";
    private static final String cStrSetPluginConfigUrl = "set_plugin_config_url";
    private static final String cStrShowFps = "show_fps";
    private static final String cStrShowSavePage = "save_page";
    private static final String cStrShowX5Tip = "show_x5_ver";
    private static final String cStrTicket = "ticket";
    private byte _hellAccFlag_;
    private final String darkMode1 = "当前Dark Mode强制智能反色[%d,%d]（点击切换）";
    private final String darkMode2 = "当前Dark Mode不强制智能反色[%d,%d]（点击切换）";
    private final String darkMode3 = "当前Light Mode[%d,%d]（点击切换）";
    private final String darkMode4 = "当前未知Mode[%d,%d]（点击切换）";
    private TextView mAbstractView = null;
    /* access modifiers changed from: private */
    public Button mBtnSavePage = null;
    private final Context mContext;
    /* access modifiers changed from: private */
    public View mMenuRootView;
    private Button mRemoteDebugButton = null;
    /* access modifiers changed from: private */
    public TextView mVersionView = null;
    /* access modifiers changed from: private */
    public final WebView mWebViewWrapper;
    /* access modifiers changed from: private */
    public String targetPluginName = "";

    public static class DebugUpdateListener implements IXWebBroadcastListener {
        private boolean bHasNotifyUpdateProcess = false;
        /* access modifiers changed from: private */
        public boolean bNeedKill = false;
        private ProgressDialog mAlertDialog;
        /* access modifiers changed from: private */
        public final Context mContext;
        private final List<String> mUpdateMessages = new ArrayList();

        public DebugUpdateListener(Context context) {
            this.mContext = context;
            showUpdateDialog("· 开始检查更新 (点空白区域取消)");
        }

        private void showUpdateDialog(String str) {
            if (this.mAlertDialog == null) {
                ProgressDialog progressDialog = new ProgressDialog(this.mContext);
                this.mAlertDialog = progressDialog;
                progressDialog.setProgressStyle(1);
                this.mAlertDialog.setMessage(str);
                this.mAlertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    public void onCancel(DialogInterface dialogInterface) {
                        XWebBroadcastListenerManager.unregisterListener(DebugUpdateListener.this);
                        if (DebugUpdateListener.this.bNeedKill) {
                            XWebCommandHandler.killAllProcess(DebugUpdateListener.this.mContext);
                        }
                    }
                });
                this.mAlertDialog.setCancelable(true);
                this.mAlertDialog.show();
            }
            this.mUpdateMessages.add(str);
            this.mAlertDialog.setMessage(TextUtils.join("\n", this.mUpdateMessages));
        }

        public void onMainCfgUpdated() {
            showUpdateDialog("· 主配置更新完成");
        }

        public void onPluginCfgUpdated() {
            showUpdateDialog("· 插件配置更新完成");
        }

        public void onUpdateFinished(int i) {
            if (i == 0) {
                try {
                    showUpdateDialog("· 更新完成，点击重启生效");
                    this.bNeedKill = true;
                    this.mAlertDialog.setCancelable(true);
                    this.mAlertDialog.setCanceledOnTouchOutside(true);
                    this.mAlertDialog.setProgress(100);
                } catch (Exception e) {
                    XWebLog.m21911i(WebDebugPage.TAG, "onUpdateFinished error:" + e);
                }
            } else if (i == -5) {
                showUpdateDialog("· 检查完毕，暂无内核更新");
                this.mAlertDialog.setCancelable(true);
                this.mAlertDialog.setCanceledOnTouchOutside(true);
            } else {
                this.mAlertDialog.setCancelable(true);
                this.mAlertDialog.setCanceledOnTouchOutside(true);
                showUpdateDialog("· 更新失败，错误码:" + i);
            }
        }

        public void onUpdateProgressed(int i) {
            try {
                if (!this.bHasNotifyUpdateProcess) {
                    showUpdateDialog("· 内核下载中");
                    this.bHasNotifyUpdateProcess = true;
                }
                ProgressDialog progressDialog = this.mAlertDialog;
                if (progressDialog != null) {
                    progressDialog.setCancelable(false);
                    this.mAlertDialog.setProgress(i);
                }
            } catch (Exception e) {
                XWebLog.m21911i(WebDebugPage.TAG, "onUpdateProgressed error:" + e);
            }
        }

        public void onUpdateStart(int i) {
            this.bHasNotifyUpdateProcess = false;
            if (i == 0) {
                showUpdateDialog("· 开始下载内核");
            } else {
                showUpdateDialog("· 开始预下载内核");
            }
        }
    }

    public WebDebugPage(WebView webView) {
        this.mContext = webView.getContext();
        this.mWebViewWrapper = webView;
        initVersionTopView();
        initSavePageButton();
    }

    /* access modifiers changed from: private */
    public void changeDarkModeBtn(Button button) {
        changeDarkModeIndex();
        updateDarkModeBtn(button);
    }

    private void changeDarkModeIndex() {
        int forceDarkMode = this.mWebViewWrapper.getSettings().getForceDarkMode();
        int forceDarkBehavior = this.mWebViewWrapper.getSettings().getForceDarkBehavior();
        if (forceDarkMode == 0) {
            this.mWebViewWrapper.getSettings().setForceDarkMode(2);
            this.mWebViewWrapper.getSettings().setForceDarkBehavior(2);
            return;
        }
        if (forceDarkMode == 2) {
            if (forceDarkBehavior == 2) {
                this.mWebViewWrapper.getSettings().setForceDarkBehavior(1);
                return;
            } else if (forceDarkBehavior == 1) {
                this.mWebViewWrapper.getSettings().setForceDarkMode(0);
                return;
            } else if (forceDarkBehavior == 0) {
                this.mWebViewWrapper.getSettings().setForceDarkMode(0);
                return;
            }
        }
        this.mWebViewWrapper.getSettings().setForceDarkMode(2);
        this.mWebViewWrapper.getSettings().setForceDarkBehavior(2);
    }

    public static void checkPluginUpdate(Context context, String str) {
        Scheduler.sForceCheckUpdate = true;
        XWalkPluginUpdater xWalkPluginUpdater = new XWalkPluginUpdater();
        HashMap hashMap = new HashMap();
        hashMap.put(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE, str);
        xWalkPluginUpdater.startCheck(context, hashMap);
    }

    public static void checkTargetPluginUpdate(Context context, String str, boolean z, ValueCallback<Integer> valueCallback) {
        XWalkPluginUpdater xWalkPluginUpdater = new XWalkPluginUpdater();
        final Context context2 = context;
        final String str2 = str;
        final XWalkPluginUpdater xWalkPluginUpdater2 = xWalkPluginUpdater;
        final boolean z2 = z;
        final ValueCallback<Integer> valueCallback2 = valueCallback;
        xWalkPluginUpdater.setPluginOnlyOneToUpdate(str, new XWalkPluginUpdateListener() {
            /* access modifiers changed from: private */
            public ProgressDialog mDlgAlert = null;
            public boolean mFinished = false;

            public void onXWalkPluginUpdateCompleted(int i) {
                this.mFinished = true;
                if (this.mDlgAlert != null) {
                    XWalkPlugin plugin = XWalkPluginManager.getPlugin(str2);
                    int availableVersion = plugin != null ? plugin.getAvailableVersion(true) : -1;
                    switch (i) {
                        case -11:
                            ProgressDialog progressDialog = this.mDlgAlert;
                            progressDialog.setMessage(str2 + " 更新失败，插件安装失败，ErrCode = " + i);
                            break;
                        case -10:
                            ProgressDialog progressDialog2 = this.mDlgAlert;
                            progressDialog2.setMessage(str2 + " 更新失败，插件下载失败，ErrCode = " + i);
                            break;
                        case -9:
                            ProgressDialog progressDialog3 = this.mDlgAlert;
                            progressDialog3.setMessage(str2 + " 更新失败，插件下载或安装失败，ErrCode = " + i);
                            break;
                        case -8:
                            ProgressDialog progressDialog4 = this.mDlgAlert;
                            progressDialog4.setMessage(str2 + " 更新失败，未找到可用更新，当前已安装版本" + availableVersion + "，ErrCode = " + i);
                            if (z2) {
                                this.mDlgAlert.dismiss();
                                break;
                            }
                            break;
                        case -7:
                            ProgressDialog progressDialog5 = this.mDlgAlert;
                            progressDialog5.setMessage(str2 + " 更新失败，配置中未包含插件信息，ErrCode = " + i);
                            break;
                        case -6:
                            ProgressDialog progressDialog6 = this.mDlgAlert;
                            progressDialog6.setMessage(str2 + " 更新失败，配置解析失败，ErrCode = " + i);
                            break;
                        case -5:
                            ProgressDialog progressDialog7 = this.mDlgAlert;
                            progressDialog7.setMessage(str2 + " 更新失败，配置下载失败，ErrCode = " + i);
                            break;
                        case -4:
                            ProgressDialog progressDialog8 = this.mDlgAlert;
                            progressDialog8.setMessage(str2 + " 更新失败，其它任务正在更新插件，ErrCode = " + i);
                            break;
                        case -3:
                            ProgressDialog progressDialog9 = this.mDlgAlert;
                            progressDialog9.setMessage(str2 + " 更新失败，未到检查时间，ErrCode = " + i);
                            break;
                        case -2:
                            ProgressDialog progressDialog10 = this.mDlgAlert;
                            progressDialog10.setMessage(str2 + " 更新失败，无网络，ErrCode = " + i);
                            break;
                        case -1:
                            ProgressDialog progressDialog11 = this.mDlgAlert;
                            progressDialog11.setMessage(str2 + " 更新被取消，ErrCode = " + i);
                            break;
                        case 0:
                            ProgressDialog progressDialog12 = this.mDlgAlert;
                            progressDialog12.setMessage(str2 + " 更新完成，已安装版本" + availableVersion);
                            this.mDlgAlert.setProgress(100);
                            this.mDlgAlert.getButton(-2).setVisibility(8);
                            this.mDlgAlert.getButton(-1).setVisibility(0);
                            if (z2) {
                                this.mDlgAlert.dismiss();
                                break;
                            }
                            break;
                        default:
                            ProgressDialog progressDialog13 = this.mDlgAlert;
                            progressDialog13.setMessage(str2 + " 更新失败，未知错误，ErrCode = " + i);
                            break;
                    }
                    ValueCallback valueCallback = valueCallback2;
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(Integer.valueOf(i));
                    }
                }
            }

            public void onXWalkPluginUpdateProgress(int i) {
                ProgressDialog progressDialog;
                if (!this.mFinished && (progressDialog = this.mDlgAlert) != null) {
                    progressDialog.setProgress(i);
                }
            }

            public void onXWalkPluginUpdateStarted() {
                ProgressDialog progressDialog = new ProgressDialog(context2);
                this.mDlgAlert = progressDialog;
                progressDialog.setProgressStyle(1);
                ProgressDialog progressDialog2 = this.mDlgAlert;
                progressDialog2.setMessage(str2 + " 下载更新中");
                this.mDlgAlert.setCancelable(false);
                this.mDlgAlert.setCanceledOnTouchOutside(false);
                this.mDlgAlert.setButton(-2, "取消", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C2021848 r1 = C2021848.this;
                        if (!r1.mFinished) {
                            xWalkPluginUpdater2.cancelPluginUpdate();
                        }
                    }
                });
                this.mDlgAlert.setButton(-1, "完成", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C2021848.this.mDlgAlert.dismiss();
                    }
                });
                this.mDlgAlert.show();
                this.mDlgAlert.getButton(-1).setVisibility(8);
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE, "1");
        xWalkPluginUpdater.startCheck(context, hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r3 = r3.trim();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean checkTempPermission(java.lang.String r3, java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0052
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x000e
            goto L_0x0052
        L_0x000e:
            java.lang.String r3 = r3.trim()
            java.lang.String r0 = "ticket"
            int r0 = r3.lastIndexOf(r0)
            if (r0 < 0) goto L_0x0052
            int r2 = r3.length()
            if (r0 < r2) goto L_0x0022
            goto L_0x0052
        L_0x0022:
            java.lang.String r3 = r3.substring(r1, r0)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyyMMdd"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "@check_permission@"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r0 = "MHYwEAYHKoZIzj0CAQYFK4EEACIDYgAE4s7oy+BvW5kzf5PwtVqDdZb2rVQS7GDf\naJWwtkD95ILDQAtHM9Nv5apLYQnUbXkjTldOUpjK7MimTkf/qXjQfk8hF2A0Mf7L\nHbDPr7kD9DOuQlG53SWOuKQVEwwsjN1l"
            boolean r3 = com.tencent.xweb.util.ECCUtil.verifySHA1withECDSA(r3, r4, r0)
            return r3
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.WebDebugPage.checkTempPermission(java.lang.String, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    public void checkUpdate() {
        XWebSdk.setForceCheckUpdate();
        XWebBroadcastListenerManager.registerListener(getContext(), new DebugUpdateListener(getContext()));
        new XWalkRuntimeUpdater().startCheck(getContext(), (HashMap<String, String>) null);
    }

    /* access modifiers changed from: private */
    public void clearAllPlugin() {
        List<XWalkPlugin> allPlugins = XWalkPluginManager.getAllPlugins();
        if (allPlugins != null) {
            for (XWalkPlugin availableVersion : allPlugins) {
                availableVersion.setAvailableVersion(-1, true);
            }
            String pluginBaseDir = XWebFileUtil.getPluginBaseDir();
            if (!pluginBaseDir.isEmpty()) {
                FileUtils.deleteAll(pluginBaseDir);
                showAlert("所有插件清理完成", true);
            }
        }
    }

    public static boolean containsDebugPiece(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        if (str.contains(cStrDebugXWebUrl) || str.contains(cStrPublicDebugXWebUrl)) {
            z = true;
        }
        if (z) {
            WXWebReporter.idkeyReport(223, 1);
            XWebLog.m21909e(TAG, "this url contains debug piece, url =  " + str);
        }
        return z;
    }

    private static String dumpPreferedWebviewType(String str) {
        WebView.WebViewKind webViewKind;
        WebView.WebViewKind webViewKind2 = WebView.sDefaultWebViewKind;
        StringBuilder sb = new StringBuilder();
        sb.append("\n   default core type:" + webViewKind2);
        if (AbiUtil.isIaDevice()) {
            sb.append("\n   prefer WV_KIND_SYS because this is x86 device");
            return sb.toString();
        }
        WebView.WebViewKind webKind = CommandCfg.getInstance().getWebKind(str);
        WebView.WebViewKind webViewKind3 = WebView.WebViewKind.WV_KIND_NONE;
        if (webKind != webViewKind3) {
            webViewKind = CommandCfg.getInstance().getWebKind(str);
            sb.append("\n   has command type:" + webViewKind);
        } else {
            webViewKind = webViewKind2;
        }
        if (XWalkEnvironment.getBuildConfigForceXWebCore()) {
            sb.append("\n   has compile type:" + webViewKind2);
        } else {
            webViewKind2 = webViewKind;
        }
        if (WebDebugCfg.getInst().getWebViewKindTest(str, true) != webViewKind3) {
            webViewKind2 = WebDebugCfg.getInst().getWebViewKindTest(str, true);
            sb.append("\n   has abtest type:" + webViewKind2);
        }
        if (WebDebugCfg.getInst().getWebViewKindTest(str, false) != webViewKind3) {
            webViewKind2 = WebDebugCfg.getInst().getWebViewKindTest(str, false);
            sb.append("\n   has hardcode type:" + webViewKind2);
        }
        if (webViewKind2 == WebView.WebViewKind.WV_KIND_PINUS && !XWalkEnvironment.hasAvailableVersion()) {
            webViewKind2 = WebView.WebViewKind.WV_KIND_SYS;
            sb.append("\n   prefer sys because xweb is not available");
        }
        if (CrashWatchDog.hasRecentCrash(webViewKind2, str)) {
            sb.append("\n   will not use " + webViewKind2 + " because of CrashWatchDog hit");
        }
        sb.insert(0, " module(" + str + ") webview core type:" + webViewKind2);
        return sb.toString();
    }

    private int getDarkModeIndex(int i, int i2) {
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return 4;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        return i2 == 0 ? 1 : 4;
    }

    private String getFileReaderTypeInfo() {
        StringBuilder sb = new StringBuilder();
        for (String str : FileReaderHelper.ALL_FILE_FORMATS) {
            sb.append("\n ");
            sb.append(str);
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append("  cmd-tools-");
            sb.append(CommandCfgPlugin.getInstance().getFileReaderType(str, XWalkEnvironment.MODULE_TOOLS));
            sb.append("  cmd-appbrand-");
            sb.append(CommandCfgPlugin.getInstance().getFileReaderType(str, XWalkEnvironment.MODULE_APPBRAND));
        }
        sb.append("\n\n use office reader:");
        for (String str2 : FileReaderHelper.OFFICE_READER_FORMATS) {
            sb.append("\n ");
            sb.append(str2);
            sb.append(": force-");
            sb.append(WebDebugCfg.getInst().getForceUseOfficeReader(str2));
            sb.append("  cmd-tools-");
            sb.append(CommandCfgPlugin.getInstance().getCmdUseOfficeReader(str2, XWalkEnvironment.MODULE_TOOLS));
            sb.append("  cmd-appbrand-");
            sb.append(CommandCfgPlugin.getInstance().getCmdUseOfficeReader(str2, XWalkEnvironment.MODULE_APPBRAND));
            sb.append("  cmd-mm-");
            sb.append(CommandCfgPlugin.getInstance().getCmdUseOfficeReader(str2, XWalkEnvironment.MODULE_MM));
        }
        return sb.toString();
    }

    public static String getPluginLocalFileName(String str, boolean z) {
        return XWalkPluginManager.XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO.equals(str) ? "xweb_fullscreen_video.js" : XWalkPluginManager.XWALK_PLUGIN_NAME_PPT.equals(str) ? "xfiles_ppt_reader.zip" : XWalkPluginManager.XWALK_PLUGIN_NAME_PDF.equals(str) ? z ? "xfiles_pdf_reader_arm64.zip" : "xfiles_pdf_reader_arm.zip" : XWalkPluginManager.XWALK_PLUGIN_NAME_WORD.equals(str) ? z ? "xfiles_word_reader_arm64.zip" : "xfiles_word_reader_arm.zip" : XWalkPluginManager.XWALK_PLUGIN_NAME_EXCEL.equals(str) ? "xfiles_excel_reader.zip" : XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE.equals(str) ? z ? "xfiles_office_reader_arm64.zip" : "xfiles_office_reader_arm.zip" : XWalkPluginManager.XWALK_PLUGIN_NAME_TXT.equals(str) ? "xfiles_txt_reader.zip" : "";
    }

    /* access modifiers changed from: private */
    public String getVersionInfo(boolean z) {
        String str;
        String versionInfo = this.mWebViewWrapper.getVersionInfo();
        if (!z) {
            int indexOf = versionInfo.indexOf(", detail");
            if (indexOf > 0) {
                versionInfo = versionInfo.substring(0, indexOf);
            }
            str = versionInfo + ", process:" + XWalkEnvironment.getProcessName();
        } else {
            str = versionInfo + ", " + XWalkPluginManager.getAllPluginVersionInfo() + " process = " + XWalkEnvironment.getProcessName() + ", module = " + XWalkEnvironment.getModuleName();
        }
        if (this.mWebViewWrapper.getCurrentInstanceWebCoreType() != WebView.WebViewKind.WV_KIND_PINUS) {
            return str;
        }
        int multiProcessType = XWalkEnvironment.getMultiProcessType();
        String str2 = multiProcessType != 0 ? multiProcessType != 1 ? multiProcessType != 2 ? "" : "Render&GPU" : "Render" : "Single";
        if (XWalkEnvironment.getMultiProcessType() == 0) {
            return str;
        }
        return (str + ", type: " + str2) + ", sandbox: " + XWalkEnvironment.getEnableSandbox();
    }

    private void initAbstractView() {
        if (this.mAbstractView == null) {
            ScrollView scrollView = new ScrollView(getContext());
            TextView textView = new TextView(getContext());
            this.mAbstractView = textView;
            textView.setTextColor(-16777216);
            this.mAbstractView.setBackgroundColor(-1);
            scrollView.addView(this.mAbstractView);
            this.mAbstractView.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    WebDebugPage.this.refreshAbstractView();
                    C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            refreshAbstractView();
            this.mWebViewWrapper.getTopView().addView(scrollView);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void initFpsPage(com.tencent.xweb.internal.IWebView r2) {
        /*
            java.lang.Class<com.tencent.xweb.util.WebDebugPage> r0 = com.tencent.xweb.util.WebDebugPage.class
            monitor-enter(r0)
            if (r2 == 0) goto L_0x0018
            com.tencent.xweb.WebDebugCfg r1 = com.tencent.xweb.WebDebugCfg.getInst()     // Catch:{ all -> 0x0015 }
            boolean r1 = r1.getShowFps()     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            initFpsPageInternal(r2)     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)
            return
        L_0x0015:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L_0x0018:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.WebDebugPage.initFpsPage(com.tencent.xweb.internal.IWebView):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void initFpsPageInternal(com.tencent.xweb.internal.IWebView r3) {
        /*
            java.lang.Class<com.tencent.xweb.util.WebDebugPage> r0 = com.tencent.xweb.util.WebDebugPage.class
            monitor-enter(r0)
            if (r3 == 0) goto L_0x001f
            com.tencent.xweb.WebDebugCfg r1 = com.tencent.xweb.WebDebugCfg.getInst()     // Catch:{ all -> 0x001c }
            boolean r1 = r1.getShowFps()     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0010
            goto L_0x001f
        L_0x0010:
            java.lang.String r1 = "if (!window.showFPS) {\n    window.showFPS = (function () {\n        var requestAnimationFrame =\n            window.requestAnimationFrame || //Chromium  \n            window.webkitRequestAnimationFrame || //Webkit \n            window.mozRequestAnimationFrame || //Mozilla Geko \n            window.oRequestAnimationFrame || //Opera Presto \n            window.msRequestAnimationFrame || //IE Trident? \n            function (callback) { //Fallback function \n                window.setTimeout(callback, 1000 / 60);\n            };\n        var e, pe, pid, fps, last, offset, step, appendFps, curSeconds;\n        fps = 0;\n        curSeconds = 0;\n        last = Date.now();\n        step = function () {\n            offset = Date.now() - last;\n            fps += 1;\n            if (offset >= 1000) {\n                last += offset;\n                if (curSeconds % 3 == 0) {\n                    addFpsElement();\n                }\n                ++curSeconds;\n                appendFps(fps);\n                fps = 0;\n            }\n            requestAnimationFrame(step);\n        };\n\n        addFpsElement = function () {\n                var fpsview = document.getElementById(\"fpsview\");\n                if (!fpsview) {\n                    var div = document.createElement('div');\n                    div.innerHTML = \"<div style=\\\"z-index: 9999; position: fixed ! important; right: 50px; top: 10px; font-size:36px\\\" id=\\\"fpsview\\\"> </div>\";\n                    document.body.appendChild(div);\n                }\n            }\n            //显示fps;\n        appendFps = function (fps) {\n            if (!e) e = document.createElement('span');\n            e.innerHTML = \"fps: \" + fps;\n            if (!pe) {\n                pe = document.getElementById(\"fpsview\");\n                if (pe) pe.appendChild(e);\n            }\n        };\n        return {\n            go: function () {\n                step();\n            }\n        }\n    })();\n\n    console.log(\"show fps start\");\n    window.showFPS.go();\n\n}"
            com.tencent.xweb.util.WebDebugPage$54 r2 = new com.tencent.xweb.util.WebDebugPage$54     // Catch:{ all -> 0x001c }
            r2.<init>()     // Catch:{ all -> 0x001c }
            r3.evaluateJavascript(r1, r2)     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return
        L_0x001c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x001f:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.WebDebugPage.initFpsPageInternal(com.tencent.xweb.internal.IWebView):void");
    }

    /* access modifiers changed from: private */
    public void initSavePageButton() {
        if (WebDebugCfg.getInst().getShowSavePage() && this.mBtnSavePage == null) {
            Button button = new Button(getContext());
            this.mBtnSavePage = button;
            button.setText("保存页面");
            this.mBtnSavePage.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    new AlertDialog.Builder(WebDebugPage.this.getContext()).setTitle("保存页面").setMessage("确定保存页面？").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            WebDebugPage.this.savePage();
                        }
                    }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).show();
                    C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.mWebViewWrapper.getTopView().addView(this.mBtnSavePage);
        }
    }

    /* access modifiers changed from: private */
    public void initVersionTopView() {
        if (WebDebugCfg.getInst().getShowVersion() && this.mVersionView == null) {
            TextView textView = new TextView(getContext());
            this.mVersionView = textView;
            textView.setOnLongClickListener(new View.OnLongClickListener() {
                private byte _hellAccFlag_;

                public boolean onLongClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                    boolean unused = WebDebugPage.this.initView();
                    C117292a.m165362h(true, this, "com/tencent/xweb/util/WebDebugPage$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return true;
                }
            });
            refreshVersionInfo(false);
            this.mWebViewWrapper.getTopView().addView(this.mVersionView);
        }
    }

    /* access modifiers changed from: private */
    public boolean initView() {
        String str;
        initFpsPageInternal(this.mWebViewWrapper);
        View view = this.mMenuRootView;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/xweb/util/WebDebugPage", "initView", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/xweb/util/WebDebugPage", "initView", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        View findViewById = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C106947R.C106949layout.cjg, this.mWebViewWrapper.getTopView(), true).findViewById(C106947R.C20125id.l8m);
        this.mMenuRootView = findViewById;
        findViewById.findViewById(C106947R.C20125id.aob).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                View access$300 = WebDebugPage.this.mMenuRootView;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(access$300, aVar.mo10232b(), "com/tencent/xweb/util/WebDebugPage$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                access$300.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(access$300, "com/tencent/xweb/util/WebDebugPage$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        final CheckBox checkBox = (CheckBox) this.mMenuRootView.findViewById(C106947R.C20125id.bao);
        checkBox.setChecked(WebDebugCfg.getInst().getShowVersion());
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                WebDebugCfg.getInst().setShowVersion(z);
                if (z) {
                    WebDebugPage.this.initVersionTopView();
                    WebDebugPage.this.mVersionView.setVisibility(0);
                } else if (WebDebugPage.this.mVersionView != null) {
                    WebDebugPage.this.mVersionView.setVisibility(8);
                }
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.f361704check_text).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                CheckBox checkBox = checkBox;
                checkBox.setChecked(!checkBox.isChecked());
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        final EditText editText = (EditText) this.mMenuRootView.findViewById(C106947R.C20125id.kz8);
        if (editText != null) {
            editText.setInputType(2);
            editText.setText(String.valueOf(XWebGrayValueUtil.getGrayValue()));
            editText.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(Editable editable) {
                    try {
                        XWebGrayValueUtil.setGrayValueForTest(Integer.parseInt(editText.getText().toString()));
                    } catch (Throwable unused) {
                    }
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
        }
        this.mMenuRootView.findViewById(C106947R.C20125id.aol).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                View access$300 = WebDebugPage.this.mMenuRootView;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(access$300, aVar.mo10232b(), "com/tencent/xweb/util/WebDebugPage$8", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                access$300.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(access$300, "com/tencent/xweb/util/WebDebugPage$8", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                XWebCommandHandler.killAllProcess(WebDebugPage.this.getContext());
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.jjg).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                View access$300 = WebDebugPage.this.mMenuRootView;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(access$300, aVar.mo10232b(), "com/tencent/xweb/util/WebDebugPage$9", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                access$300.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(access$300, "com/tencent/xweb/util/WebDebugPage$9", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                XWebCommandHandler.killGpuProcess(WebDebugPage.this.getContext());
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.l2w).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                View access$300 = WebDebugPage.this.mMenuRootView;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(access$300, aVar.mo10232b(), "com/tencent/xweb/util/WebDebugPage$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                access$300.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(access$300, "com/tencent/xweb/util/WebDebugPage$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                XWebCommandHandler.killRenderProcess(WebDebugPage.this.getContext());
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.jjm).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                View access$300 = WebDebugPage.this.mMenuRootView;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(access$300, aVar.mo10232b(), "com/tencent/xweb/util/WebDebugPage$11", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                access$300.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(access$300, "com/tencent/xweb/util/WebDebugPage$11", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                WebDebugPage.this.triggerGpuNativeCrash();
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.jjk).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                View access$300 = WebDebugPage.this.mMenuRootView;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(access$300, aVar.mo10232b(), "com/tencent/xweb/util/WebDebugPage$12", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                access$300.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(access$300, "com/tencent/xweb/util/WebDebugPage$12", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                WebDebugPage.this.triggerGpuJavaCrash();
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.lm5).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                View access$300 = WebDebugPage.this.mMenuRootView;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(access$300, aVar.mo10232b(), "com/tencent/xweb/util/WebDebugPage$13", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                access$300.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(access$300, "com/tencent/xweb/util/WebDebugPage$13", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                WebDebugPage.this.triggerRenderNativeCrash();
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.jjh).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                View access$300 = WebDebugPage.this.mMenuRootView;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(access$300, aVar.mo10232b(), "com/tencent/xweb/util/WebDebugPage$14", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                access$300.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(access$300, "com/tencent/xweb/util/WebDebugPage$14", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                WebDebugPage.this.triggerBrowserNativeCrash();
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mRemoteDebugButton = (Button) this.mMenuRootView.findViewById(C106947R.C20125id.alh);
        setEnableRemoteDebug(WebDebugCfg.getInst().getEnableRemoteDebug());
        this.mRemoteDebugButton.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                boolean z = !WebDebugCfg.getInst().getEnableRemoteDebug();
                WebDebugCfg.getInst().setEnableRemoteDebug(z);
                WebDebugPage.this.setEnableRemoteDebug(z);
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.ao9).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                XWebCleaner.clearAllVersion(WebDebugPage.this.getContext());
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.aoe).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                TextView textView = (TextView) WebDebugPage.this.mMenuRootView.findViewById(C106947R.C20125id.kih);
                if (textView != null) {
                    String charSequence = textView.getText().toString();
                    if (!TextUtils.isEmpty(charSequence)) {
                        XWebLog.m21911i(WebDebugPage.TAG, "delete origin:" + charSequence);
                        WebStorage.getInstance().deleteOrigin(charSequence);
                    }
                }
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.aow).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ((TextView) WebDebugPage.this.mMenuRootView.findViewById(C106947R.C20125id.f361707txtVersion)).setText(WebDebugPage.this.getVersionInfo(true) + "\n\n" + XWebLog.getInitializeLog());
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.aoo).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.this.loadApkFromLocal(true);
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.o5c).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.this.loadApkFromLocalSdcard(true);
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        final Button button = (Button) this.mMenuRootView.findViewById(C106947R.C20125id.aod);
        updateDarkModeBtn(button);
        button.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.this.changeDarkModeBtn(button);
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        final Button button2 = (Button) this.mMenuRootView.findViewById(C106947R.C20125id.aoc);
        String baseConfigUrl = XWebUpdateConfigUtil.getBaseConfigUrl();
        String str2 = "(当前为" + baseConfigUrl.substring(baseConfigUrl.lastIndexOf(47) + 1) + ")";
        if (WebDebugCfg.getInst().getHasConfig()) {
            str = "使用正式版config" + str2;
        } else {
            str = "使用测试config" + str2;
        }
        button2.setText(str);
        button2.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                String str;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugCfg.getInst().setHasConfig(!WebDebugCfg.getInst().getHasConfig());
                String baseConfigUrl = XWebUpdateConfigUtil.getBaseConfigUrl();
                String str2 = "(当前为" + baseConfigUrl.substring(baseConfigUrl.lastIndexOf(47) + 1) + ")";
                Button button = button2;
                if (WebDebugCfg.getInst().getHasConfig()) {
                    str = "使用正式版config" + str2;
                } else {
                    str = "使用测试config" + str2;
                }
                button.setText(str);
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.f361701button_update).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.this.checkUpdate();
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        final LinearLayout linearLayout = (LinearLayout) this.mMenuRootView.findViewById(C106947R.C20125id.hxu);
        linearLayout.setVisibility(8);
        Button button3 = (Button) this.mMenuRootView.findViewById(C106947R.C20125id.aou);
        button3.setText("插件设置");
        button3.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    ((Button) view).setText("隐藏插件设置");
                } else {
                    linearLayout.setVisibility(8);
                    ((Button) view).setText("插件设置");
                }
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        final Button button4 = (Button) this.mMenuRootView.findViewById(C106947R.C20125id.aot);
        String testPluginConfigUrl = XWebUpdateConfigUtil.getTestPluginConfigUrl();
        if (testPluginConfigUrl == null || testPluginConfigUrl.isEmpty()) {
            button4.setText("切换插件配置，当前使用正式版");
        } else if (testPluginConfigUrl.equalsIgnoreCase(XWebUpdateConfigUtil.DOWNLOAD_PLUGIN_UPDATE_TEST_CONFIG_URL)) {
            button4.setText("切换插件配置，当前使用默认测试版");
        } else {
            button4.setText("切换插件配置, 当前使用自定义测试版");
        }
        button4.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                String testPluginConfigUrl = XWebUpdateConfigUtil.getTestPluginConfigUrl();
                if (testPluginConfigUrl == null || testPluginConfigUrl.isEmpty()) {
                    if (XWebUpdateConfigUtil.setTestPluginConfigUrl(XWebUpdateConfigUtil.DOWNLOAD_PLUGIN_UPDATE_TEST_CONFIG_URL)) {
                        button4.setText("切换插件配置，当前使用默认测试版");
                    } else {
                        WebDebugPage.this.showAlert("切换失败", true);
                    }
                } else if (XWebUpdateConfigUtil.setTestPluginConfigUrl("")) {
                    button4.setText("切换插件配置，当前使用正式版");
                } else {
                    WebDebugPage.this.showAlert("切换失败", true);
                }
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.f361702button_update_all_plugin).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$26", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.checkPluginUpdate(WebDebugPage.this.getContext(), "1");
                Toast.makeText(WebDebugPage.this.getContext(), "开始检测插件更新", 0).show();
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$26", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.kce).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.checkPluginUpdate(WebDebugPage.this.getContext(), WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
                Toast.makeText(WebDebugPage.this.getContext(), "开始安装内置插件", 0).show();
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.ao_).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.this.clearAllPlugin();
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        ((Spinner) this.mMenuRootView.findViewById(C106947R.C20125id.jzj)).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private byte _hellAccFlag_;

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(adapterView);
                arrayList.add(view);
                arrayList.add(Integer.valueOf(i));
                arrayList.add(Long.valueOf(j));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$29", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
                String unused = WebDebugPage.this.targetPluginName = WebDebugPage.this.getContext().getResources().getStringArray(C106947R.array.a9)[i];
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$29", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.aoq).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$30", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.installPluginFromLocalFile(WebDebugPage.this.getContext(), WebDebugPage.this.targetPluginName, false, false, new ValueCallback<Boolean>() {
                    public void onReceiveValue(Boolean bool) {
                        bool.booleanValue();
                    }
                });
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$30", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.aor).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.installPluginFromLocalFile(WebDebugPage.this.getContext(), WebDebugPage.this.targetPluginName, false, true, new ValueCallback<Boolean>() {
                    public void onReceiveValue(Boolean bool) {
                        bool.booleanValue();
                    }
                });
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.f361703button_update_plugin).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.checkTargetPluginUpdate(WebDebugPage.this.getContext(), WebDebugPage.this.targetPluginName, false, (ValueCallback<Integer>) null);
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.aoa).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                XWalkPlugin plugin = XWalkPluginManager.getPlugin(WebDebugPage.this.targetPluginName);
                if (plugin == null) {
                    C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                int availableVersion = plugin.getAvailableVersion(true);
                if (availableVersion < 0) {
                    C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                String versionDir = plugin.getVersionDir(availableVersion);
                plugin.setAvailableVersion(-1, true);
                if (versionDir != null && !versionDir.isEmpty()) {
                    FileUtils.deleteAll(versionDir);
                }
                Toast.makeText(WebDebugPage.this.getContext(), "清理完成", 0).show();
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        CheckBox checkBox2 = (CheckBox) this.mMenuRootView.findViewById(C106947R.C20125id.bam);
        checkBox2.setChecked(WebDebugCfg.getInst().getDisableFileReaderCache());
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                WebDebugCfg.getInst().setDisableFileReaderCache(z);
            }
        });
        CheckBox checkBox3 = (CheckBox) this.mMenuRootView.findViewById(C106947R.C20125id.ban);
        checkBox3.setChecked(WebDebugCfg.getInst().getDisableFileReaderCrashDetect());
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                WebDebugCfg.getInst().setDisableFileReaderCrashDetect(z);
            }
        });
        ((TextView) this.mMenuRootView.findViewById(C106947R.C20125id.ki_)).setText(getFileReaderTypeInfo());
        final EditText editText2 = (EditText) this.mMenuRootView.findViewById(C106947R.C20125id.cbd);
        this.mMenuRootView.findViewById(C106947R.C20125id.ap6).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$36", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.this.setForceOfficeReaderAndRefresh(editText2.getText().toString(), FileReaderHelper.UseOfficeReader.yes);
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$36", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.ap4).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$37", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.this.setForceOfficeReaderAndRefresh(editText2.getText().toString(), FileReaderHelper.UseOfficeReader.no);
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$37", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.ap5).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$38", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.this.setForceOfficeReaderAndRefresh(editText2.getText().toString(), FileReaderHelper.UseOfficeReader.none);
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$38", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        ((TextView) this.mMenuRootView.findViewById(C106947R.C20125id.f361707txtVersion)).setText(getVersionInfo(true) + "\n\n" + XWebLog.getInitializeLog());
        View findViewById2 = this.mMenuRootView.findViewById(C106947R.C20125id.bkz);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/xweb/util/WebDebugPage", "initView", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/xweb/util/WebDebugPage", "initView", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.mMenuRootView.findViewById(C106947R.C20125id.hmp).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$39", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugCfg inst = WebDebugCfg.getInst();
                WebView.WebViewKind webViewKind = WebView.WebViewKind.WV_KIND_PINUS;
                inst.setWebViewKind(XWalkEnvironment.MODULE_TOOLS, webViewKind);
                WebDebugCfg.getInst().setWebViewKind(XWalkEnvironment.MODULE_APPBRAND, webViewKind);
                WebDebugCfg.getInst().setWebViewKind(XWalkEnvironment.MODULE_MM, webViewKind);
                if (!XWalkEnvironment.hasInstalledAvailableVersion()) {
                    WebDebugPage.this.onInterceptTestUrl("http://debugxweb.qq.com/?check_xwalk_update");
                } else {
                    WebDebugPage.this.showAlert("已使用Pinus，点任意位置重启进程生效\n", true, true);
                }
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$39", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.ao6).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$40", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugCfg inst = WebDebugCfg.getInst();
                WebView.WebViewKind webViewKind = WebView.WebViewKind.WV_KIND_SYS;
                inst.setWebViewKind(XWalkEnvironment.MODULE_TOOLS, webViewKind);
                WebDebugCfg.getInst().setWebViewKind(XWalkEnvironment.MODULE_APPBRAND, webViewKind);
                WebDebugCfg.getInst().setWebViewKind(XWalkEnvironment.MODULE_MM, webViewKind);
                WebDebugPage.this.showAlert("已使用system，点任意位置重启进程生效\n", true, true);
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$40", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.ao5).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$41", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.this.resetWebViewKindToAuto();
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$41", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.mMenuRootView.findViewById(C106947R.C20125id.f361700button_advanced).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                LinearLayout linearLayout = (LinearLayout) WebDebugPage.this.mMenuRootView.findViewById(C106947R.C20125id.bkz);
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    ((Button) view).setText("隐藏高级设置");
                } else {
                    linearLayout.setVisibility(8);
                    ((Button) view).setText("高级设置");
                }
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        ((Button) this.mMenuRootView.findViewById(C106947R.C20125id.aox)).setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$43", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                boolean z = !WebDebugCfg.getInst().getShowSavePage();
                WebDebugCfg.getInst().setShowSavePage(z);
                if (z) {
                    WebDebugPage.this.initSavePageButton();
                    WebDebugPage.this.mBtnSavePage.setVisibility(0);
                } else if (WebDebugPage.this.mBtnSavePage != null) {
                    WebDebugPage.this.mBtnSavePage.setVisibility(8);
                }
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$43", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        Button button5 = (Button) this.mMenuRootView.findViewById(C106947R.C20125id.aop);
        button5.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$44", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                WebDebugPage.this.loadSavedPage();
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$44", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        button5.setOnLongClickListener(new View.OnLongClickListener() {
            private byte _hellAccFlag_;

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$45", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                new AlertDialog.Builder(WebDebugPage.this.getContext()).setTitle("提示").setMessage("清空保存页面文件").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        FileUtils.deleteAll(Environment.getExternalStorageDirectory() + "/xweb_dump");
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).show();
                C117292a.m165362h(false, this, "com/tencent/xweb/util/WebDebugPage$45", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        });
        final Button button6 = (Button) this.mMenuRootView.findViewById(C106947R.C20125id.aoy);
        boolean showFps = WebDebugCfg.getInst().getShowFps();
        StringBuilder sb = new StringBuilder();
        sb.append("显示/隐藏fps(");
        sb.append(showFps ? "当前为显示fps" : "当前为隐藏fps");
        sb.append(")");
        button6.setText(sb.toString());
        button6.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/util/WebDebugPage$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                boolean z = !WebDebugCfg.getInst().getShowFps();
                WebDebugCfg.getInst().setShowFps(z);
                WebDebugPage.initFpsPageInternal(WebDebugPage.this.mWebViewWrapper);
                Button button = button6;
                StringBuilder sb = new StringBuilder();
                sb.append("显示/隐藏fps(");
                sb.append(z ? "当前为显示fps" : "当前为隐藏fps");
                sb.append(")");
                button.setText(sb.toString());
                C117292a.m165361g(this, "com/tencent/xweb/util/WebDebugPage$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        return true;
    }

    public static void installPluginFromLocalFile(Context context, String str, boolean z, boolean z2, ValueCallback<Boolean> valueCallback) {
        installPluginFromLocalFile(context, str, -1, z, z2, false, valueCallback);
    }

    /* access modifiers changed from: private */
    public void loadApkFromLocal(boolean z) {
        loadApkFromLocal(getContext().getExternalCacheDir(), z);
    }

    /* access modifiers changed from: private */
    public void loadApkFromLocalSdcard(boolean z) {
        loadApkFromLocal(Environment.getExternalStorageDirectory(), z);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079 A[SYNTHETIC, Splitter:B:27:0x0079] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadLocalApk(java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            r9 = this;
            java.lang.String r0 = "WebDebugPage"
            com.tencent.xweb.util.WebDebugPage$LocalUpdateConfig r1 = new com.tencent.xweb.util.WebDebugPage$LocalUpdateConfig
            r1.<init>(r10, r11)
            r2 = 0
            r3 = 0
            r4 = 1
            com.tencent.xweb.file.XVFSFile r5 = new com.tencent.xweb.file.XVFSFile     // Catch:{ IOException -> 0x0054, all -> 0x0050 }
            int r6 = r1.apkVer     // Catch:{ IOException -> 0x0054, all -> 0x0050 }
            java.lang.String r6 = com.tencent.xweb.util.XWebFileUtil.getDownloadZipPath(r6)     // Catch:{ IOException -> 0x0054, all -> 0x0050 }
            r5.<init>((java.lang.String) r6)     // Catch:{ IOException -> 0x0054, all -> 0x0050 }
            boolean r6 = r5.exists()     // Catch:{ IOException -> 0x0054, all -> 0x0050 }
            if (r6 == 0) goto L_0x001e
            r5.delete()     // Catch:{ IOException -> 0x0054, all -> 0x0050 }
        L_0x001e:
            java.io.InputStream r10 = com.tencent.xweb.file.XVFSFileOp.openRead(r10)     // Catch:{ IOException -> 0x0054, all -> 0x0050 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ IOException -> 0x004a, all -> 0x0044 }
            java.io.OutputStream r3 = com.tencent.xweb.file.XVFSFileOp.openWrite(r5)     // Catch:{ IOException -> 0x004a, all -> 0x0044 }
            r5 = 1048576(0x100000, float:1.469368E-39)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x004a, all -> 0x0044 }
        L_0x002e:
            int r6 = r10.read(r5)     // Catch:{ IOException -> 0x004a, all -> 0x0044 }
            r7 = -1
            if (r6 == r7) goto L_0x0039
            r3.write(r5, r2, r6)     // Catch:{ IOException -> 0x004a, all -> 0x0044 }
            goto L_0x002e
        L_0x0039:
            r3.flush()     // Catch:{ IOException -> 0x004a, all -> 0x0044 }
            com.tencent.xweb.util.FileUtils.tryClose(r10)
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            r2 = 1
            goto L_0x0070
        L_0x0044:
            r11 = move-exception
            r5 = r3
            r3 = r10
            r10 = r11
            goto L_0x00ce
        L_0x004a:
            r5 = move-exception
            r8 = r3
            r3 = r10
            r10 = r5
            r5 = r8
            goto L_0x0056
        L_0x0050:
            r10 = move-exception
            r5 = r3
            goto L_0x00ce
        L_0x0054:
            r10 = move-exception
            r5 = r3
        L_0x0056:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cd }
            r6.<init>()     // Catch:{ all -> 0x00cd }
            java.lang.String r7 = "loadLocalApk, copy package fail, error"
            r6.append(r7)     // Catch:{ all -> 0x00cd }
            r6.append(r10)     // Catch:{ all -> 0x00cd }
            java.lang.String r10 = r6.toString()     // Catch:{ all -> 0x00cd }
            com.tencent.xweb.util.XWebLog.m21909e(r0, r10)     // Catch:{ all -> 0x00cd }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            com.tencent.xweb.util.FileUtils.tryClose(r5)
        L_0x0070:
            if (r2 != 0) goto L_0x0079
            java.lang.String r10 = "安装失败，内核拷贝失败"
            r9.showAlert(r10, r4)
            return
        L_0x0079:
            com.tencent.xweb.updater.XWebRuntimeInstaller r10 = new com.tencent.xweb.updater.XWebRuntimeInstaller     // Catch:{ Exception -> 0x00c0 }
            r10.<init>()     // Catch:{ Exception -> 0x00c0 }
            java.lang.Integer r10 = r10.tryInstallRuntime(r1)     // Catch:{ Exception -> 0x00c0 }
            int r1 = r10.intValue()     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r2 = "安装"
            if (r1 != 0) goto L_0x00a4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            r10.<init>()     // Catch:{ Exception -> 0x00c0 }
            r10.append(r2)     // Catch:{ Exception -> 0x00c0 }
            r10.append(r11)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r11 = "成功"
            r10.append(r11)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x00c0 }
            r9.showAlert(r10, r12)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00cc
        L_0x00a4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            r12.<init>()     // Catch:{ Exception -> 0x00c0 }
            r12.append(r2)     // Catch:{ Exception -> 0x00c0 }
            r12.append(r11)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r11 = "失败，错误码="
            r12.append(r11)     // Catch:{ Exception -> 0x00c0 }
            r12.append(r10)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r10 = r12.toString()     // Catch:{ Exception -> 0x00c0 }
            r9.showAlert(r10, r4)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00cc
        L_0x00c0:
            r10 = move-exception
            java.lang.String r11 = "安装失败"
            r9.showAlert(r11, r4)
            java.lang.String r11 = "loadLocalApk, handle files fail, error"
            com.tencent.xweb.util.XWebLog.m21910e(r0, r11, r10)
        L_0x00cc:
            return
        L_0x00cd:
            r10 = move-exception
        L_0x00ce:
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            com.tencent.xweb.util.FileUtils.tryClose(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.WebDebugPage.loadLocalApk(java.lang.String, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: private */
    public void loadSavedPage(String str, String str2) {
        ZipUtil.unZipFile(str, str2);
        String[] split = str2.split("\\.");
        if (split.length == 2) {
            WebView webView = this.mWebViewWrapper;
            webView.loadUrl("file://" + split[0] + "/main.html");
        }
        View view = this.mMenuRootView;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/xweb/util/WebDebugPage", "loadSavedPage", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/xweb/util/WebDebugPage", "loadSavedPage", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    private boolean onInnerInterceptTestUrl(String str, boolean z) {
        String str2;
        FileReaderHelper.UseOfficeReader useOfficeReader;
        String[] strArr;
        XWebLog.m21911i(TAG, "onInnerInterceptTestUrl, url:" + str + ", permission:" + z);
        if (!str.contains(cStrDebugXWebUrl) && !z) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames == null || queryParameterNames.size() == 0) {
            initView();
            return true;
        }
        for (String next : queryParameterNames) {
            if (next != null) {
                next.getClass();
                char c = 65535;
                switch (next.hashCode()) {
                    case -1688684924:
                        if (next.equals(cStrSetApkVersion)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1534940989:
                        if (next.equals(cStrClearAllPlugin)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -939528941:
                        if (next.equals(cStrRevertToApkVersion)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 208243139:
                        if (next.equals(cStrRecheckCmds)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 368659514:
                        if (next.equals(cStrClearCommands)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 603805332:
                        if (next.equals(cStrKeyLoadLocalPackage)) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1098980480:
                        if (next.equals(cStrCheckFiles)) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1112413629:
                        if (next.equals(cStrSetForceUseOfficeReader)) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        String queryParameter = parse.getQueryParameter(cStrSetApkVersion);
                        try {
                            int parseInt = Integer.parseInt(queryParameter);
                            XWalkEnvironment.setCoreVersionInfo(parseInt, "1.0." + queryParameter, AbiUtil.getRuntimeAbi());
                            showAlert("版本号设置到:" + queryParameter + " 点击空白处退出重启进程", true, true);
                            break;
                        } catch (Throwable th) {
                            showAlert("设置版本号失败:" + th.getMessage(), true);
                            break;
                        }
                    case 1:
                        clearAllPlugin();
                        break;
                    case 2:
                        try {
                            int revertToApkVer = XWalkRuntimeRevertHelper.revertToApkVer(XWalkEnvironment.getApplicationContext(), Integer.parseInt(parse.getQueryParameter(cStrRevertToApkVersion)));
                            showAlert("版本号回滚到:" + revertToApkVer + " 点击空白处退出重启进程", true, true);
                            break;
                        } catch (Throwable th4) {
                            showAlert("版本号回滚到失败:" + th4.getMessage(), true);
                            break;
                        }
                    case 3:
                        IWebViewProvider xWebViewProvider = WebViewWrapperFactory.getXWebViewProvider();
                        if (xWebViewProvider == null) {
                            XWebLog.m21909e(TAG, "cStrRecheckCmds error, webview provider for current webview type(" + WebView.getCurrentModuleWebCoreType() + ") is null");
                            break;
                        } else {
                            xWebViewProvider.execute(ConstValue.STR_CMD_SET_RECHECK_COMMAND, (Object[]) null);
                            showAlert("重新跑了一遍命令配置 点击空白处退出重启进程", true, true);
                            break;
                        }
                    case 4:
                        CommandCfg.getInstance().applyCommand((ConfigDef.Command[]) null, "0");
                        break;
                    case 5:
                        loadApkFromLocal(false);
                        break;
                    case 6:
                        XWebCleaner.checkFiles(true);
                        break;
                    case 7:
                        try {
                            str2 = parse.getQueryParameter(cStrSetForceUseOfficeReader);
                        } catch (Throwable th5) {
                            XWebLog.m21910e(TAG, "cStrSetForceUseOfficeReader error", th5);
                            str2 = "";
                        }
                        String[] split = str2.split("_");
                        if (str2.length() >= 2) {
                            String str3 = split[split.length - 1];
                            if (!"yes".equalsIgnoreCase(str3)) {
                                if (!"no".equalsIgnoreCase(str3)) {
                                    if (!"none".equalsIgnoreCase(str3)) {
                                        showAlert("强制设置OfficeReader失败，类型错误", true);
                                        break;
                                    } else {
                                        useOfficeReader = FileReaderHelper.UseOfficeReader.none;
                                    }
                                } else {
                                    useOfficeReader = FileReaderHelper.UseOfficeReader.no;
                                }
                            } else {
                                useOfficeReader = FileReaderHelper.UseOfficeReader.yes;
                            }
                            if (split.length != 2 || !"all".equalsIgnoreCase(split[0])) {
                                String[] strArr2 = new String[(split.length - 1)];
                                for (int i = 0; i < split.length - 1; i++) {
                                    strArr2[i] = split[i];
                                }
                                strArr = strArr2;
                            } else {
                                strArr = FileReaderHelper.OFFICE_READER_FORMATS;
                            }
                            String forceUseOfficeReader = WebDebugCfg.getInst().setForceUseOfficeReader(strArr, useOfficeReader);
                            if (forceUseOfficeReader.isEmpty()) {
                                showAlert("强制设置OfficeReader失败", true);
                                break;
                            } else {
                                showAlert("格式:" + forceUseOfficeReader + "强制OfficeReader状态：" + useOfficeReader, true);
                                break;
                            }
                        } else {
                            showAlert("强制设置OfficeReader失败，参数错误", true);
                            break;
                        }
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void refreshAbstractView() {
        String str;
        String str2;
        if (this.mAbstractView != null) {
            String baseConfigUrl = XWebUpdateConfigUtil.getBaseConfigUrl();
            String str3 = "\n\n " + this.mWebViewWrapper.getAbstractInfo();
            if (WebView.getCurrentModuleWebCoreType() != WebView.WebViewKind.WV_KIND_PINUS) {
                str3 = str3 + "\n xweb sdk ver = " + XWebSdk.getXWebSdkVersion() + ",\n xweb apk ver = " + XWalkEnvironment.getAvailableVersion() + ",\n xweb ver detail = " + XWalkEnvironment.getAvailableVersionDetail();
            }
            String str4 = (str3 + "\n\n local gray value = " + XWebGrayValueUtil.getGrayValue() + "\n local device gray value = " + XWebGrayValueUtil.getDeviceRd() + "\n today gray value = " + XWebGrayValueUtil.getTodayGrayValue() + "\n config period(minutes) = " + (Scheduler.getFetchConfigPeriod() / 60000) + "\n config url = " + baseConfigUrl + "\n\n system apilevel = " + Build.VERSION.SDK_INT + "\n target apilevel = " + (XWalkEnvironment.getApplicationContext().getApplicationInfo() != null ? XWalkEnvironment.getApplicationContext().getApplicationInfo().targetSdkVersion : 0) + "\n system webview version = " + XWebSdk.safeGetChromiumVersion() + "\n device = " + Build.BRAND + " " + Build.MODEL + "\n usertype = " + XWebSdk.getIpType() + "\n runtime abi = " + AbiUtil.getRuntimeAbi() + "\n device abi = " + AbiUtil.getDeviceAbi() + "\n installed ver for arm32 = " + XWalkEnvironment.getInstalledNewstVersion(XWalkEnvironment.RUNTIME_ABI_ARM32_STR) + "\n installed ver for arm64 = " + XWalkEnvironment.getInstalledNewstVersion(XWalkEnvironment.RUNTIME_ABI_ARM64_STR) + "\n should embed =  " + false + "\n embed lib md5 match =  " + true + "\n embed config ver =  " + 0 + "/" + 0 + "\n embed try installed ver =  " + XWebRuntimeInstaller.getLastTryEmbedInstallVersion(AbiUtil.getRuntimeAbi()) + "\n useragent = " + this.mWebViewWrapper.getSettings().getUserAgentString() + "\n client version = 0x" + Integer.toHexString(XWalkEnvironment.getInitConfig(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, 0)) + "\n app info = " + XWalkEnvironment.dumpAppInfo()) + "\n\n ------dump module prefer webview core start------\n";
            try {
                str = ((str4 + dumpPreferedWebviewType(XWalkEnvironment.MODULE_MM) + "\n") + dumpPreferedWebviewType(XWalkEnvironment.MODULE_TOOLS) + "\n") + dumpPreferedWebviewType(XWalkEnvironment.MODULE_APPBRAND) + "\n";
            } catch (Throwable th) {
                str = str4 + th.getMessage() + "\n";
            }
            String str5 = (((str + "------dump module prefer webview core end------") + "\n\n ------dump scheduler start------") + "\n " + XWebCoreScheduler.getXWebCoreScheduler().dumpSchedule()) + "\n " + XWebCorePredownScheduler.getXWebCorePredownScheduler().dumpSchedule();
            for (XWalkPlugin next : XWalkPluginManager.getAllPlugins()) {
                if (next != null) {
                    XFileSchedulerFactory.XFileScheduler scheduler = XFileSchedulerFactory.getScheduler(next.getPluginName());
                    str5 = str5 + "\n " + scheduler.dumpSchedule();
                }
            }
            XWebCoreScheduler xWebCoreScheduler = XWebCoreScheduler.getXWebCoreScheduler();
            String str6 = (str5 + "\n current update match gap backward(update speed) is " + xWebCoreScheduler.getCurHourSpeed(xWebCoreScheduler.getCurHourSpeedConfig(false))) + "\n current update match gap forward(提前更新) is " + xWebCoreScheduler.getCurHourSpeed(xWebCoreScheduler.getCurHourSpeedConfig(true));
            String str7 = "";
            XFileSchedulerFactory.XFileScheduler xFileScheduler = new XFileSchedulerFactory.XFileScheduler(str7);
            String str8 = ((str6 + "\n plugin current update match gap backward(update speed) is " + xFileScheduler.getCurHourSpeed(xFileScheduler.getCurHourSpeedConfig(false))) + "\n plugin current update match gap forward(提前更新) is " + xFileScheduler.getCurHourSpeed(xFileScheduler.getCurHourSpeedConfig(true))) + "\n ------dump scheduler end------";
            String abstractInfo = CommandCfg.getInstance().getAbstractInfo();
            if (abstractInfo != null && !abstractInfo.isEmpty()) {
                str8 = ((str8 + "\n\n ------dump commands start------\n") + abstractInfo) + "\n ------dump commands end------";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\n\n ------plugin info start------");
            sb.append("\n plugin config url = ");
            sb.append(XWebUpdateConfigUtil.getPluginConfigUrl());
            sb.append("\n plugin config period(minutes) = ");
            sb.append(XWebUpdateConfigUtil.getPluginUpdatePeriod() / CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            sb.append("\n\n plugin version:");
            for (XWalkPlugin next2 : XWalkPluginManager.getAllPlugins()) {
                if (next2 != null) {
                    sb.append("\n ");
                    sb.append(next2.getPluginName());
                    sb.append(" = ");
                    sb.append(next2.getAvailableVersion(true));
                }
            }
            sb.append("\n\n plugin commands:");
            String abstractInfo2 = CommandCfgPlugin.getInstance().getAbstractInfo();
            if (abstractInfo2 == null || abstractInfo2.isEmpty()) {
                sb.append("\n null\n");
            } else {
                sb.append("\n");
                sb.append(abstractInfo2);
            }
            sb.append("\n xfiles setting:");
            if (WebDebugCfg.getInst() != null) {
                sb.append("\n disable cache = ");
                sb.append(WebDebugCfg.getInst().getDisableFileReaderCache());
                sb.append("\n disable crash detect = ");
                sb.append(WebDebugCfg.getInst().getDisableFileReaderCrashDetect());
            }
            sb.append(getFileReaderTypeInfo());
            sb.append("\n\n ------plugin info end------");
            String str9 = str8 + sb.toString();
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS);
                if (XWebCoreScheduler.getXWebCoreScheduler().hasScheduler()) {
                    String str10 = str7 + " going to update to apk ver = " + XWebCoreScheduler.getXWebCoreScheduler().getCurSchedulerConfig().version;
                    str7 = ((((((((str10 + "\n update time = " + simpleDateFormat.format(new Date(XWebCoreScheduler.getXWebCoreScheduler().getCurSchedulerConfig().nTimeToUpdate))) + "\n is patch update = " + XWebCoreScheduler.getXWebCoreScheduler().getCurSchedulerConfig().bIsPatchUpdate) + "\n can use cellular = " + XWebCoreScheduler.getXWebCoreScheduler().getCurSchedulerConfig().bCanUseCellular) + "\n updateHourStart = " + XWebCoreScheduler.getXWebCoreScheduler().getCurSchedulerConfig().timeHourStart) + "\n updateHourEnd = " + XWebCoreScheduler.getXWebCoreScheduler().getCurSchedulerConfig().timeHourEnd) + "\n versionId = " + XWebCoreScheduler.getXWebCoreScheduler().getCurSchedulerConfig().versionId) + "\n try count = " + XWebCoreScheduler.getXWebCoreScheduler().getCurSchedulerConfig().nTryCnt) + "\n try use shared core count = " + XWebCoreScheduler.getXWebCoreScheduler().getCurSchedulerConfig().nTryUseSharedCoreCount) + "\n";
                }
                Date date = new Date(XWebCoreScheduler.getXWebCoreScheduler().getCurSchedulerConfig().nLastFetchConfigTime);
                str2 = (str7 + " last fetch config time = " + simpleDateFormat.format(date)) + "\n last fetch config abi = " + XWebCoreScheduler.getXWebCoreScheduler().getCurSchedulerConfig().strLastFetchAbi;
            } catch (Throwable unused) {
                str2 = str7;
            }
            if (str2 != null && !str2.isEmpty()) {
                str9 = ((str9 + "\n\n ------dump schedule updateInfo start------\n") + str2) + "\n ------dump schedule updateInfo end------";
            }
            String initializeLog = XWebLog.getInitializeLog();
            if (initializeLog != null && !initializeLog.isEmpty()) {
                str9 = str9 + "\n\n ------dump xweb log------\n" + initializeLog;
            }
            this.mAbstractView.setText(str9);
        }
    }

    private void refreshVersionInfo(boolean z) {
        if (this.mVersionView != null) {
            this.mVersionView.setText(getVersionInfo(z));
        }
    }

    /* access modifiers changed from: private */
    public void resetWebViewKindToAuto() {
        XWebGrayValueUtil.resetGrayValue();
        XWebUpdateConfigUtil.setTestBaseConfigUrl("");
        WebDebugCfg inst = WebDebugCfg.getInst();
        WebView.WebViewKind webViewKind = WebView.WebViewKind.WV_KIND_NONE;
        inst.setWebViewKind(XWalkEnvironment.MODULE_TOOLS, webViewKind);
        WebDebugCfg.getInst().setWebViewKind(XWalkEnvironment.MODULE_APPBRAND, webViewKind);
        WebDebugCfg.getInst().setWebViewKind(XWalkEnvironment.MODULE_MM, webViewKind);
        showAlert("已使用AUTO，点击重启生效\n", true, true);
    }

    /* access modifiers changed from: private */
    public void savePage() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH_mm_ss");
        String str = getContext().getExternalCacheDir().getPath() + "/xweb_dump/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        final String str2 = str + simpleDateFormat.format(date);
        File file2 = new File(str2);
        if (!file2.exists()) {
            file2.mkdir();
        }
        this.mWebViewWrapper.savePage(str2 + "/main.html", str2 + "/resource", 1);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                } catch (InterruptedException unused) {
                }
                File[] fileArr = {new File(str2)};
                ZipUtil.zipFiles(fileArr, str2 + ".zip");
            }
        }).start();
    }

    /* access modifiers changed from: private */
    public void setForceOfficeReaderAndRefresh(String str, FileReaderHelper.UseOfficeReader useOfficeReader) {
        if (WebDebugCfg.getInst() != null) {
            String[] strArr = (str == null || str.isEmpty()) ? FileReaderHelper.OFFICE_READER_FORMATS : new String[]{str};
            String forceUseOfficeReader = WebDebugCfg.getInst().setForceUseOfficeReader(strArr, useOfficeReader);
            FileReaderCrashDetector.resetCrashInfo(strArr);
            if (this.mMenuRootView != null && getContext() != null && !forceUseOfficeReader.isEmpty()) {
                Context context = getContext();
                Toast.makeText(context, "格式:" + forceUseOfficeReader + "强制OfficeReader状态：" + useOfficeReader.toString(), 0).show();
                TextView textView = (TextView) this.mMenuRootView.findViewById(C106947R.C20125id.ki_);
                if (textView != null) {
                    textView.setText(getFileReaderTypeInfo());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void showAlert(String str, boolean z) {
        if (z) {
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setMessage(str);
                builder.create().show();
            } catch (Exception e) {
                XWebLog.m21911i(TAG, "show alert failed may be in abtest, error:" + e);
            }
        } else {
            XWebLog.m21909e(TAG, str);
        }
    }

    /* access modifiers changed from: private */
    public void triggerBrowserNativeCrash() {
        XWebLog.m21911i(TAG, "triggerBrowserNativeCrash");
        this.mWebViewWrapper.loadUrl("chrome://inducebrowsercrashforrealz/");
    }

    /* access modifiers changed from: private */
    public void triggerGpuJavaCrash() {
        XWebLog.m21911i(TAG, "triggerGpuJavaCrash");
        this.mWebViewWrapper.loadUrl("chrome://gpu-java-crash/");
    }

    /* access modifiers changed from: private */
    public void triggerGpuNativeCrash() {
        XWebLog.m21911i(TAG, "triggerGpuNativeCrash");
        this.mWebViewWrapper.loadUrl("chrome://gpucrash/");
    }

    /* access modifiers changed from: private */
    public void triggerRenderNativeCrash() {
        XWebLog.m21911i(TAG, "triggerRenderNativeCrash");
        this.mWebViewWrapper.loadUrl("chrome://crash");
    }

    private void updateDarkModeBtn(Button button) {
        int forceDarkMode = this.mWebViewWrapper.getSettings().getForceDarkMode();
        int forceDarkBehavior = this.mWebViewWrapper.getSettings().getForceDarkBehavior();
        int darkModeIndex = getDarkModeIndex(forceDarkMode, forceDarkBehavior);
        if (darkModeIndex == 1) {
            button.setText(String.format("当前Dark Mode强制智能反色[%d,%d]（点击切换）", new Object[]{Integer.valueOf(forceDarkMode), Integer.valueOf(forceDarkBehavior)}));
        } else if (darkModeIndex == 2) {
            button.setText(String.format("当前Dark Mode不强制智能反色[%d,%d]（点击切换）", new Object[]{Integer.valueOf(forceDarkMode), Integer.valueOf(forceDarkBehavior)}));
        } else if (darkModeIndex == 3) {
            button.setText(String.format("当前Light Mode[%d,%d]（点击切换）", new Object[]{Integer.valueOf(forceDarkMode), Integer.valueOf(forceDarkBehavior)}));
        } else if (darkModeIndex == 4) {
            button.setText(String.format("当前未知Mode[%d,%d]（点击切换）", new Object[]{Integer.valueOf(forceDarkMode), Integer.valueOf(forceDarkBehavior)}));
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x040d, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x074f, code lost:
        r17 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x05f0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x05f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTestUrl(java.lang.String r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = 0
            if (r2 != 0) goto L_0x0008
            return r3
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "onInterceptTestUrl, url:"
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "WebDebugPage"
            com.tencent.xweb.util.XWebLog.m21911i(r4, r0)
            java.lang.String r5 = "debugxweb.qq.com"
            boolean r0 = r2.contains(r5)
            java.lang.String r14 = "inspector"
            r15 = 1
            if (r0 == 0) goto L_0x05e3
            r6 = 224(0xe0, double:1.107E-321)
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r6, r15)
            android.net.Uri r6 = android.net.Uri.parse(r21)
            java.util.Set r0 = r6.getQueryParameterNames()
            if (r0 == 0) goto L_0x05e3
            int r7 = r0.size()
            if (r7 <= 0) goto L_0x05e3
            java.util.Iterator r7 = r0.iterator()
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0048:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x05e0
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x05d8
            r0.getClass()
            int r19 = r0.hashCode()
            java.lang.String r8 = "set_mm_config"
            java.lang.String r9 = "show_fps"
            java.lang.String r10 = "set_appbrand_config"
            java.lang.String r11 = "ticket"
            java.lang.String r12 = "check_storage"
            java.lang.String r13 = "check_plugin_update"
            java.lang.String r3 = "encrpt_url"
            java.lang.String r15 = "appbrand_webview_mode"
            switch(r19) {
                case -1933561918: goto L_0x01dc;
                case -1767214708: goto L_0x01d1;
                case -1556996002: goto L_0x01c6;
                case -1471003068: goto L_0x01bb;
                case -1045985412: goto L_0x01ae;
                case -974615216: goto L_0x01a0;
                case -873960692: goto L_0x0195;
                case -748036674: goto L_0x018a;
                case -677737752: goto L_0x017a;
                case -389006048: goto L_0x016a;
                case -338505561: goto L_0x015c;
                case -108592348: goto L_0x014e;
                case -82035977: goto L_0x0140;
                case 273273929: goto L_0x0130;
                case 293074704: goto L_0x011f;
                case 386281809: goto L_0x010e;
                case 624401059: goto L_0x00fd;
                case 684429537: goto L_0x00ec;
                case 801125523: goto L_0x00db;
                case 989541982: goto L_0x00cb;
                case 1077365438: goto L_0x00bb;
                case 1473208405: goto L_0x00ab;
                case 1755368040: goto L_0x009b;
                case 1874228874: goto L_0x008a;
                case 2135256815: goto L_0x0079;
                default: goto L_0x0074;
            }
        L_0x0074:
            r19 = r7
        L_0x0076:
            r0 = -1
            goto L_0x01e7
        L_0x0079:
            r19 = r7
            java.lang.String r7 = "set_config_url"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0086
            goto L_0x01e4
        L_0x0086:
            r0 = 24
            goto L_0x01e7
        L_0x008a:
            r19 = r7
            java.lang.String r7 = "set_web_config"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0097
            goto L_0x01e4
        L_0x0097:
            r0 = 23
            goto L_0x01e7
        L_0x009b:
            r19 = r7
            java.lang.String r7 = "mm_webview_mode"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x00a7
            goto L_0x01e4
        L_0x00a7:
            r0 = 22
            goto L_0x01e7
        L_0x00ab:
            r19 = r7
            java.lang.String r7 = "clear_test_setting"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x00b7
            goto L_0x01e4
        L_0x00b7:
            r0 = 21
            goto L_0x01e7
        L_0x00bb:
            r19 = r7
            java.lang.String r7 = "reset_webview_kind_to_auto"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x00c7
            goto L_0x01e4
        L_0x00c7:
            r0 = 20
            goto L_0x01e7
        L_0x00cb:
            r19 = r7
            java.lang.String r7 = "check_xwalk_update"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x00d7
            goto L_0x01e4
        L_0x00d7:
            r0 = 19
            goto L_0x01e7
        L_0x00db:
            r19 = r7
            java.lang.String r7 = "soft_check_xwalk_update"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x00e8
            goto L_0x01e4
        L_0x00e8:
            r0 = 18
            goto L_0x01e7
        L_0x00ec:
            r19 = r7
            java.lang.String r7 = "set_plugin_config_url"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x00f9
            goto L_0x01e4
        L_0x00f9:
            r0 = 17
            goto L_0x01e7
        L_0x00fd:
            r19 = r7
            java.lang.String r7 = "show_x5_ver"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x010a
            goto L_0x01e4
        L_0x010a:
            r0 = 16
            goto L_0x01e7
        L_0x010e:
            r19 = r7
            java.lang.String r7 = "set_grayvalue"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x011b
            goto L_0x01e4
        L_0x011b:
            r0 = 15
            goto L_0x01e7
        L_0x011f:
            r19 = r7
            java.lang.String r7 = "set_device_rd_value"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x012c
            goto L_0x01e4
        L_0x012c:
            r0 = 14
            goto L_0x01e7
        L_0x0130:
            r19 = r7
            java.lang.String r7 = "clear_schedule"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x013c
            goto L_0x01e4
        L_0x013c:
            r0 = 13
            goto L_0x01e7
        L_0x0140:
            r19 = r7
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x014a
            goto L_0x01e4
        L_0x014a:
            r0 = 12
            goto L_0x01e7
        L_0x014e:
            r19 = r7
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0158
            goto L_0x01e4
        L_0x0158:
            r0 = 11
            goto L_0x01e7
        L_0x015c:
            r19 = r7
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0166
            goto L_0x01e4
        L_0x0166:
            r0 = 10
            goto L_0x01e7
        L_0x016a:
            r19 = r7
            java.lang.String r7 = "clean_download_zip"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0176
            goto L_0x01e4
        L_0x0176:
            r0 = 9
            goto L_0x01e7
        L_0x017a:
            r19 = r7
            java.lang.String r7 = "forcex5"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0186
            goto L_0x01e4
        L_0x0186:
            r0 = 8
            goto L_0x01e7
        L_0x018a:
            r19 = r7
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0193
            goto L_0x01e4
        L_0x0193:
            r0 = 7
            goto L_0x01e7
        L_0x0195:
            r19 = r7
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x019e
            goto L_0x01e4
        L_0x019e:
            r0 = 6
            goto L_0x01e7
        L_0x01a0:
            r19 = r7
            java.lang.String r7 = "show_webview_version"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x01ac
            goto L_0x01e4
        L_0x01ac:
            r0 = 5
            goto L_0x01e7
        L_0x01ae:
            r19 = r7
            java.lang.String r7 = "clear_config_time_stamp"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x01b9
            goto L_0x01e4
        L_0x01b9:
            r0 = 4
            goto L_0x01e7
        L_0x01bb:
            r19 = r7
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x01c4
            goto L_0x01e4
        L_0x01c4:
            r0 = 3
            goto L_0x01e7
        L_0x01c6:
            r19 = r7
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x01cf
            goto L_0x01e4
        L_0x01cf:
            r0 = 2
            goto L_0x01e7
        L_0x01d1:
            r19 = r7
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01da
            goto L_0x01e4
        L_0x01da:
            r0 = 1
            goto L_0x01e7
        L_0x01dc:
            r19 = r7
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x01e6
        L_0x01e4:
            goto L_0x0076
        L_0x01e6:
            r0 = 0
        L_0x01e7:
            r7 = 0
            switch(r0) {
                case 0: goto L_0x05a3;
                case 1: goto L_0x057a;
                case 2: goto L_0x04c4;
                case 3: goto L_0x04a7;
                case 4: goto L_0x0492;
                case 5: goto L_0x048c;
                case 6: goto L_0x0468;
                case 7: goto L_0x0438;
                case 8: goto L_0x0430;
                case 9: goto L_0x0427;
                case 10: goto L_0x0419;
                case 11: goto L_0x03e7;
                case 12: goto L_0x03d6;
                case 13: goto L_0x03bf;
                case 14: goto L_0x037d;
                case 15: goto L_0x034b;
                case 16: goto L_0x0343;
                case 17: goto L_0x02f0;
                case 18: goto L_0x02d1;
                case 19: goto L_0x02bc;
                case 20: goto L_0x02b7;
                case 21: goto L_0x02ae;
                case 22: goto L_0x0275;
                case 23: goto L_0x0240;
                case 24: goto L_0x01ed;
                default: goto L_0x01eb;
            }
        L_0x01eb:
            goto L_0x05da
        L_0x01ed:
            java.lang.String r0 = "set_config_url"
            java.lang.String r0 = r6.getQueryParameter(r0)     // Catch:{ all -> 0x0237 }
            boolean r3 = com.tencent.xweb.util.XWebUpdateConfigUtil.isValidConfigHost(r0)
            if (r3 != 0) goto L_0x021c
            com.tencent.xweb.WebDebugCfg r3 = com.tencent.xweb.WebDebugCfg.getInst()
            boolean r3 = r3.getEnableLocalDebug()
            if (r3 != 0) goto L_0x021c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "你没有权限设置测试链接:"
            r3.append(r7)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 1
            r1.showAlert(r0, r3)
            goto L_0x05da
        L_0x021c:
            r3 = 1
            com.tencent.xweb.util.XWebUpdateConfigUtil.setTestBaseConfigUrl(r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "测试链接设置为:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r1.showAlert(r0, r3)
            goto L_0x05da
        L_0x0237:
            r3 = 1
            java.lang.String r0 = "测试链接设置失败，格式错误"
            r1.showAlert(r0, r3)
            goto L_0x05da
        L_0x0240:
            java.lang.String r0 = "set_web_config"
            java.lang.String r0 = r6.getQueryParameter(r0)     // Catch:{ all -> 0x026d }
            com.tencent.xweb.WebView$WebViewKind r0 = com.tencent.xweb.WebView.WebViewKind.valueOf(r0)     // Catch:{ all -> 0x026d }
            com.tencent.xweb.WebDebugCfg r3 = com.tencent.xweb.WebDebugCfg.getInst()     // Catch:{ all -> 0x026d }
            java.lang.String r7 = "tools"
            r3.setWebViewKind(r7, r0)     // Catch:{ all -> 0x026d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x026d }
            r3.<init>()     // Catch:{ all -> 0x026d }
            java.lang.String r7 = "打开网页将使用:"
            r3.append(r7)     // Catch:{ all -> 0x026d }
            r3.append(r0)     // Catch:{ all -> 0x026d }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x026d }
            r3 = 1
            r1.showAlert(r0, r3)     // Catch:{ all -> 0x026d }
            goto L_0x040d
        L_0x026d:
            r0 = move-exception
            java.lang.String r3 = "cStrKeySetWebviewConfig error"
            com.tencent.xweb.util.XWebLog.m21910e(r4, r3, r0)
            goto L_0x05da
        L_0x0275:
            java.lang.String r0 = "mm_webview_mode"
            java.lang.String r0 = r6.getQueryParameter(r0)     // Catch:{ all -> 0x02a6 }
            com.tencent.xweb.util.NumberUtil$ParseResult r0 = com.tencent.xweb.util.NumberUtil.safeParseInt(r0)     // Catch:{ all -> 0x02a6 }
            boolean r3 = r0.parseSuc     // Catch:{ all -> 0x02a6 }
            if (r3 == 0) goto L_0x05da
            int r0 = r0.intValue()     // Catch:{ all -> 0x02a6 }
            com.tencent.xweb.WebDebugCfg r3 = com.tencent.xweb.WebDebugCfg.getInst()     // Catch:{ all -> 0x02a6 }
            r3.setWebViewModeForMM(r0)     // Catch:{ all -> 0x02a6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a6 }
            r3.<init>()     // Catch:{ all -> 0x02a6 }
            java.lang.String r7 = "设置mm进程多进程模式:"
            r3.append(r7)     // Catch:{ all -> 0x02a6 }
            r3.append(r0)     // Catch:{ all -> 0x02a6 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x02a6 }
            r3 = 1
            r1.showAlert(r0, r3, r3)     // Catch:{ all -> 0x02a6 }
            goto L_0x05da
        L_0x02a6:
            r0 = move-exception
            java.lang.String r3 = "cStrKeyMMWebViewMode error"
            com.tencent.xweb.util.XWebLog.m21910e(r4, r3, r0)
            goto L_0x05da
        L_0x02ae:
            android.content.Context r0 = org.xwalk.core.XWalkEnvironment.getApplicationContext()
            r3 = 1
            com.tencent.xweb.util.XWebCleaner.tryClearTestSetting(r0, r3)
            return r3
        L_0x02b7:
            r3 = 1
            r20.resetWebViewKindToAuto()
            return r3
        L_0x02bc:
            r3 = 1
            java.lang.String r0 = "开始检测浏览器和所有插件更新"
            r1.showAlert(r0, r3)
            r20.checkUpdate()
            android.content.Context r0 = org.xwalk.core.XWalkEnvironment.getApplicationContext()
            java.lang.String r7 = "1"
            checkPluginUpdate(r0, r7)
            goto L_0x05da
        L_0x02d1:
            r3 = 1
            java.lang.String r0 = "模拟触发沙箱进程检测浏览器内核更新"
            r1.showAlert(r0, r3)
            r8 = 1800001(0x1b7741, double:8.893187E-318)
            com.tencent.xweb.util.XWebUpdateConfigUtil.setBaseConfigUpdatePeriod(r8)
            android.content.Context r0 = org.xwalk.core.XWalkEnvironment.getApplicationContext()
            com.tencent.xweb.XWebSdk.startCheck(r0, r7)
            com.tencent.xweb.util.WebDebugPage$DebugUpdateListener r0 = new com.tencent.xweb.util.WebDebugPage$DebugUpdateListener
            android.content.Context r3 = r20.getContext()
            r0.<init>(r3)
            goto L_0x05da
        L_0x02f0:
            java.lang.String r0 = "set_plugin_config_url"
            java.lang.String r0 = r6.getQueryParameter(r0)     // Catch:{ all -> 0x033a }
            boolean r3 = com.tencent.xweb.util.XWebUpdateConfigUtil.isValidConfigHost(r0)
            if (r3 != 0) goto L_0x031f
            com.tencent.xweb.WebDebugCfg r3 = com.tencent.xweb.WebDebugCfg.getInst()
            boolean r3 = r3.getEnableLocalDebug()
            if (r3 != 0) goto L_0x031f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "你没有权限设置测试链接:"
            r3.append(r7)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 1
            r1.showAlert(r0, r3)
            goto L_0x05da
        L_0x031f:
            r3 = 1
            com.tencent.xweb.util.XWebUpdateConfigUtil.setTestPluginConfigUrl(r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "插件测试链接设置为:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r1.showAlert(r0, r3)
            goto L_0x05da
        L_0x033a:
            r3 = 1
            java.lang.String r0 = "插件测试链接设置失败，格式错误"
            r1.showAlert(r0, r3)
            goto L_0x05da
        L_0x0343:
            r3 = 1
            java.lang.String r0 = "不支持显示x5内核信息"
            r1.showAlert(r0, r3)
            return r3
        L_0x034b:
            java.lang.String r0 = "set_grayvalue"
            java.lang.String r0 = r6.getQueryParameter(r0)     // Catch:{ all -> 0x0372 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0372 }
            com.tencent.xweb.util.XWebGrayValueUtil.setGrayValueForTest(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "灰度值设为"
            r3.append(r7)
            int r0 = r0 % 10000
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 1
            r1.showAlert(r0, r3)
            goto L_0x0379
        L_0x0372:
            r3 = 1
            java.lang.String r0 = "灰度值设置失败，参数解析错误"
            r1.showAlert(r0, r3)
        L_0x0379:
            r17 = 1
            goto L_0x05da
        L_0x037d:
            java.lang.String r0 = "set_device_rd_value"
            java.lang.String r0 = r6.getQueryParameter(r0)     // Catch:{ all -> 0x03b7 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x03b7 }
            com.tencent.xweb.util.XWebGrayValueUtil.sNDeviceRd = r0     // Catch:{ all -> 0x03b7 }
            android.content.SharedPreferences r3 = com.tencent.xweb.util.XWebSharedPreferenceUtil.getSharedPreferencesForXWalkCore()     // Catch:{ all -> 0x03b7 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x03b7 }
            java.lang.String r7 = "sNDeviceRd"
            android.content.SharedPreferences$Editor r3 = r3.putInt(r7, r0)     // Catch:{ all -> 0x03b7 }
            r3.commit()     // Catch:{ all -> 0x03b7 }
            com.tencent.xweb.util.XWebGrayValueUtil.setGrayValueForTest(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "设备随机灰度值设为"
            r3.append(r7)
            int r0 = r0 % 10000
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 1
            r1.showAlert(r0, r3)
            goto L_0x0379
        L_0x03b7:
            java.lang.String r0 = "设备随机灰度值设置失败，参数解析错误"
            r3 = 1
            r1.showAlert(r0, r3)
            goto L_0x0379
        L_0x03bf:
            r3 = 1
            java.lang.String r0 = "清理本地的更新计划"
            r1.showAlert(r0, r3)
            com.tencent.xweb.updater.XWebCoreScheduler r0 = com.tencent.xweb.updater.XWebCorePredownScheduler.getXWebCorePredownScheduler()
            r0.abandonCurrentScheduler()
            com.tencent.xweb.updater.XWebCoreScheduler r0 = com.tencent.xweb.updater.XWebCoreScheduler.getXWebCoreScheduler()
            r0.abandonCurrentScheduler()
            goto L_0x05da
        L_0x03d6:
            r3 = 1
            r7 = 0
            boolean r0 = r6.getBooleanQueryParameter(r14, r7)
            com.tencent.xweb.WebDebugCfg r2 = com.tencent.xweb.WebDebugCfg.getInst()
            r2.setEnableRemoteDebug(r0)
            r1.setEnableRemoteDebug(r0)
            return r3
        L_0x03e7:
            java.lang.String r0 = r6.getQueryParameter(r8)     // Catch:{ all -> 0x0411 }
            com.tencent.xweb.WebView$WebViewKind r0 = com.tencent.xweb.WebView.WebViewKind.valueOf(r0)     // Catch:{ all -> 0x0411 }
            com.tencent.xweb.WebDebugCfg r3 = com.tencent.xweb.WebDebugCfg.getInst()     // Catch:{ all -> 0x0411 }
            java.lang.String r7 = "mm"
            r3.setWebViewKind(r7, r0)     // Catch:{ all -> 0x0411 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0411 }
            r3.<init>()     // Catch:{ all -> 0x0411 }
            java.lang.String r7 = "mm进程将使用:"
            r3.append(r7)     // Catch:{ all -> 0x0411 }
            r3.append(r0)     // Catch:{ all -> 0x0411 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0411 }
            r3 = 1
            r1.showAlert(r0, r3)     // Catch:{ all -> 0x0411 }
        L_0x040d:
            r18 = 1
            goto L_0x05da
        L_0x0411:
            r0 = move-exception
            java.lang.String r3 = "cStrKeySetMMConfig error"
            com.tencent.xweb.util.XWebLog.m21910e(r4, r3, r0)
            goto L_0x05da
        L_0x0419:
            r3 = 0
            boolean r0 = r6.getBooleanQueryParameter(r9, r3)
            com.tencent.xweb.WebDebugCfg r2 = com.tencent.xweb.WebDebugCfg.getInst()
            r2.setShowFps(r0)
            r2 = 1
            return r2
        L_0x0427:
            r2 = 1
            android.content.Context r0 = r20.getContext()
            com.tencent.xweb.util.XWebCleaner.tryCleanAllDownloadedZip(r0, r2)
            return r2
        L_0x0430:
            r2 = 1
            java.lang.String r0 = "不支持切换x5内核"
            r1.showAlert(r0, r2)
            return r2
        L_0x0438:
            java.lang.String r0 = r6.getQueryParameter(r10)     // Catch:{ all -> 0x0460 }
            com.tencent.xweb.WebView$WebViewKind r0 = com.tencent.xweb.WebView.WebViewKind.valueOf(r0)     // Catch:{ all -> 0x0460 }
            com.tencent.xweb.WebDebugCfg r3 = com.tencent.xweb.WebDebugCfg.getInst()     // Catch:{ all -> 0x0460 }
            java.lang.String r7 = "appbrand"
            r3.setWebViewKind(r7, r0)     // Catch:{ all -> 0x0460 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0460 }
            r3.<init>()     // Catch:{ all -> 0x0460 }
            java.lang.String r7 = "打开小程序将使用:"
            r3.append(r7)     // Catch:{ all -> 0x0460 }
            r3.append(r0)     // Catch:{ all -> 0x0460 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0460 }
            r3 = 1
            r1.showAlert(r0, r3)     // Catch:{ all -> 0x0460 }
            goto L_0x040d
        L_0x0460:
            r0 = move-exception
            java.lang.String r3 = "cStrKeySetAppbrandConfig error"
            com.tencent.xweb.util.XWebLog.m21910e(r4, r3, r0)
            goto L_0x05da
        L_0x0468:
            java.lang.String r0 = r6.getQueryParameter(r11)
            java.lang.String r3 = r6.toString()
            boolean r16 = checkTempPermission(r3, r0)
            if (r16 != 0) goto L_0x0484
            java.lang.String r0 = "权限校验失败"
            r3 = 1
            r1.showAlert(r0, r3)
            java.lang.String r0 = "checkTempPermission failed"
            com.tencent.xweb.util.XWebLog.m21909e(r4, r0)
            goto L_0x05da
        L_0x0484:
            r3 = 1
            java.lang.String r0 = "checkTempPermission success"
            com.tencent.xweb.util.XWebLog.m21911i(r4, r0)
            goto L_0x05da
        L_0x048c:
            r3 = 1
            r20.initAbstractView()
            goto L_0x05da
        L_0x0492:
            r3 = 1
            java.lang.String r0 = "重置上次拉取配置时间"
            r1.showAlert(r0, r3)
            com.tencent.xweb.updater.XWebCoreScheduler r0 = com.tencent.xweb.updater.XWebCoreScheduler.getXWebCoreScheduler()
            r0.resetLastFetchConfigTime()
            r7 = 0
            com.tencent.xweb.xwalk.plugin.XWalkPluginUpdater.setLastCheckPluginUpdateTime(r7)
            goto L_0x05da
        L_0x04a7:
            r3 = 1
            r7 = 0
            boolean r0 = r6.getBooleanQueryParameter(r12, r7)
            com.tencent.xweb.WebDebugCfg r2 = com.tencent.xweb.WebDebugCfg.getInst()
            r2.setEnableCheckStorage(r0)
            if (r0 == 0) goto L_0x04bd
            java.lang.String r0 = "开启检查存储空间"
            r1.showAlert(r0, r3)
            goto L_0x04c3
        L_0x04bd:
            java.lang.String r0 = "关闭检查存储空间"
            r1.showAlert(r0, r3)
        L_0x04c3:
            return r3
        L_0x04c4:
            java.lang.String r0 = r6.getQueryParameter(r13)     // Catch:{ all -> 0x04c9 }
            goto L_0x04d2
        L_0x04c9:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "cStrCheckPluginUpdate error"
            com.tencent.xweb.util.XWebLog.m21910e(r4, r0, r3)
            java.lang.String r0 = ""
        L_0x04d2:
            java.lang.String r3 = "all"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04ec
            java.lang.String r0 = "开始检测所有插件更新"
            r3 = 1
            r1.showAlert(r0, r3)
            android.content.Context r0 = r20.getContext()
            java.lang.String r3 = "1"
            checkPluginUpdate(r0, r3)
            goto L_0x05da
        L_0x04ec:
            java.lang.String r3 = "FullScreenVideo"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0500
            android.content.Context r0 = r20.getContext()
            java.lang.String r3 = "FullScreenVideo"
            r8 = 0
            checkTargetPluginUpdate(r0, r3, r8, r7)
            goto L_0x05da
        L_0x0500:
            r8 = 0
            java.lang.String r3 = "XFilesPDFReader"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0514
            android.content.Context r0 = r20.getContext()
            java.lang.String r3 = "XFilesPDFReader"
            checkTargetPluginUpdate(r0, r3, r8, r7)
            goto L_0x05da
        L_0x0514:
            java.lang.String r3 = "XFilesPPTReader"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0527
            android.content.Context r0 = r20.getContext()
            java.lang.String r3 = "XFilesPPTReader"
            checkTargetPluginUpdate(r0, r3, r8, r7)
            goto L_0x05da
        L_0x0527:
            java.lang.String r3 = "XFilesWordReader"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x053a
            android.content.Context r0 = r20.getContext()
            java.lang.String r3 = "XFilesWordReader"
            checkTargetPluginUpdate(r0, r3, r8, r7)
            goto L_0x05da
        L_0x053a:
            java.lang.String r3 = "XFilesExcelReader"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x054d
            android.content.Context r0 = r20.getContext()
            java.lang.String r3 = "XFilesExcelReader"
            checkTargetPluginUpdate(r0, r3, r8, r7)
            goto L_0x05da
        L_0x054d:
            java.lang.String r3 = "XFilesOfficeReader"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0560
            android.content.Context r0 = r20.getContext()
            java.lang.String r3 = "XFilesOfficeReader"
            checkTargetPluginUpdate(r0, r3, r8, r7)
            goto L_0x05da
        L_0x0560:
            java.lang.String r3 = "XFilesTXTReader"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0572
            android.content.Context r0 = r20.getContext()
            java.lang.String r3 = "XFilesTXTReader"
            checkTargetPluginUpdate(r0, r3, r8, r7)
            goto L_0x05da
        L_0x0572:
            java.lang.String r0 = "检测插件更新失败，参数错误"
            r3 = 1
            r1.showAlert(r0, r3)
            goto L_0x05da
        L_0x057a:
            java.lang.String r0 = r6.getQueryParameter(r3)
            java.lang.String r2 = "b01d4598de5875eb9b86abdef32b811e9c55edcfb1673b5617cc0a6ab7dceaff"
            javax.crypto.SecretKey r2 = com.tencent.xweb.util.AESUtil.makekey(r2)     // Catch:{ all -> 0x059b }
            java.lang.String r0 = com.tencent.xweb.util.AESUtil.decryptHexStrToStr(r0, r2)     // Catch:{ all -> 0x059b }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x059b }
            if (r2 == 0) goto L_0x0596
            java.lang.String r0 = "解密失败"
            r2 = 1
            r1.showAlert(r0, r2)     // Catch:{ all -> 0x059b }
            return r2
        L_0x0596:
            r1.onInterceptTestUrl(r0)     // Catch:{ all -> 0x059b }
            r2 = 1
            goto L_0x05a2
        L_0x059b:
            java.lang.String r0 = "解密失败"
            r2 = 1
            r1.showAlert(r0, r2)
        L_0x05a2:
            return r2
        L_0x05a3:
            java.lang.String r0 = r6.getQueryParameter(r15)     // Catch:{ all -> 0x05d1 }
            com.tencent.xweb.util.NumberUtil$ParseResult r0 = com.tencent.xweb.util.NumberUtil.safeParseInt(r0)     // Catch:{ all -> 0x05d1 }
            boolean r3 = r0.parseSuc     // Catch:{ all -> 0x05d1 }
            if (r3 == 0) goto L_0x05da
            int r0 = r0.intValue()     // Catch:{ all -> 0x05d1 }
            com.tencent.xweb.WebDebugCfg r3 = com.tencent.xweb.WebDebugCfg.getInst()     // Catch:{ all -> 0x05d1 }
            r3.setWebViewModeForAppBrand(r0)     // Catch:{ all -> 0x05d1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x05d1 }
            r3.<init>()     // Catch:{ all -> 0x05d1 }
            java.lang.String r7 = "设置appbrand进程多进程模式:"
            r3.append(r7)     // Catch:{ all -> 0x05d1 }
            r3.append(r0)     // Catch:{ all -> 0x05d1 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x05d1 }
            r3 = 1
            r1.showAlert(r0, r3, r3)     // Catch:{ all -> 0x05d1 }
            goto L_0x05da
        L_0x05d1:
            r0 = move-exception
            java.lang.String r3 = "cStrKeyAppBrandWebViewMode error"
            com.tencent.xweb.util.XWebLog.m21910e(r4, r3, r0)
            goto L_0x05da
        L_0x05d8:
            r19 = r7
        L_0x05da:
            r7 = r19
            r3 = 0
            r15 = 1
            goto L_0x0048
        L_0x05e0:
            r0 = r16
            goto L_0x05e8
        L_0x05e3:
            r0 = 0
            r17 = 0
            r18 = 0
        L_0x05e8:
            java.lang.String r3 = "public.debugxweb.qq.com"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x05f2
            r3 = 1
            return r3
        L_0x05f2:
            com.tencent.xweb.WebDebugCfg r3 = com.tencent.xweb.WebDebugCfg.getInst()
            boolean r3 = r3.getEnableLocalDebug()
            if (r3 != 0) goto L_0x0601
            if (r0 == 0) goto L_0x05ff
            goto L_0x0601
        L_0x05ff:
            r3 = 0
            goto L_0x0602
        L_0x0601:
            r3 = 1
        L_0x0602:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "enableLocalDebug, enable:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = ", permission:"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.xweb.util.XWebLog.m21911i(r4, r6)
            boolean r4 = r2.contains(r5)
            if (r4 != 0) goto L_0x062a
            if (r0 == 0) goto L_0x0627
            goto L_0x062a
        L_0x0627:
            r7 = 0
            goto L_0x0791
        L_0x062a:
            android.net.Uri r4 = android.net.Uri.parse(r21)
            java.util.Set r5 = r4.getQueryParameterNames()
            if (r5 == 0) goto L_0x07ab
            int r6 = r5.size()
            if (r6 != 0) goto L_0x063c
            goto L_0x07ab
        L_0x063c:
            java.util.Iterator r5 = r5.iterator()
        L_0x0640:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0627
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x078c
            r6.getClass()
            int r7 = r6.hashCode()
            switch(r7) {
                case -1619041330: goto L_0x06b4;
                case -1391166585: goto L_0x06a9;
                case -1258153200: goto L_0x069e;
                case -604633792: goto L_0x0693;
                case -82035977: goto L_0x068a;
                case 184008721: goto L_0x067e;
                case 488707400: goto L_0x0673;
                case 724449292: goto L_0x0667;
                case 971862549: goto L_0x065b;
                default: goto L_0x0658;
            }
        L_0x0658:
            r6 = -1
            goto L_0x06be
        L_0x065b:
            java.lang.String r7 = "ignore_crashwatch"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0664
            goto L_0x0658
        L_0x0664:
            r6 = 8
            goto L_0x06be
        L_0x0667:
            java.lang.String r7 = "use_testconfig"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0671
            goto L_0x0658
        L_0x0671:
            r6 = 7
            goto L_0x06be
        L_0x0673:
            java.lang.String r7 = "clear_all_version"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x067c
            goto L_0x0658
        L_0x067c:
            r6 = 6
            goto L_0x06be
        L_0x067e:
            java.lang.String r7 = "save_page"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0688
            goto L_0x0658
        L_0x0688:
            r6 = 5
            goto L_0x06be
        L_0x068a:
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x0691
            goto L_0x0658
        L_0x0691:
            r6 = 4
            goto L_0x06be
        L_0x0693:
            java.lang.String r7 = "kill_all"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x069c
            goto L_0x0658
        L_0x069c:
            r6 = 3
            goto L_0x06be
        L_0x069e:
            java.lang.String r7 = "clear_cache"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x06a7
            goto L_0x0658
        L_0x06a7:
            r6 = 2
            goto L_0x06be
        L_0x06a9:
            java.lang.String r7 = "reset_crash_count"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x06b2
            goto L_0x0658
        L_0x06b2:
            r6 = 1
            goto L_0x06be
        L_0x06b4:
            java.lang.String r7 = "clear_old_version"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x06bd
            goto L_0x0658
        L_0x06bd:
            r6 = 0
        L_0x06be:
            switch(r6) {
                case 0: goto L_0x0779;
                case 1: goto L_0x076b;
                case 2: goto L_0x075c;
                case 3: goto L_0x0753;
                case 4: goto L_0x073e;
                case 5: goto L_0x0715;
                case 6: goto L_0x0709;
                case 7: goto L_0x06e9;
                case 8: goto L_0x06c3;
                default: goto L_0x06c1;
            }
        L_0x06c1:
            goto L_0x078c
        L_0x06c3:
            java.lang.String r6 = "ignore_crashwatch"
            r7 = 0
            boolean r6 = r4.getBooleanQueryParameter(r6, r7)
            com.tencent.xweb.WebDebugCfg r7 = com.tencent.xweb.WebDebugCfg.getInst()
            r7.setIgnoreCrash(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "忽略crash检测设为 = "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r7 = 1
            r1.showAlert(r6, r7)
            goto L_0x078c
        L_0x06e9:
            r7 = 1
            java.lang.String r6 = "use_testconfig"
            r8 = 0
            boolean r6 = r4.getBooleanQueryParameter(r6, r8)
            com.tencent.xweb.WebDebugCfg r8 = com.tencent.xweb.WebDebugCfg.getInst()
            r8.setHasConfig(r6)
            if (r6 == 0) goto L_0x0702
            java.lang.String r6 = "使用测试config"
            r1.showAlert(r6, r7)
            goto L_0x0711
        L_0x0702:
            java.lang.String r6 = "使用正式config"
            r1.showAlert(r6, r7)
            goto L_0x0711
        L_0x0709:
            r7 = 1
            android.content.Context r6 = r20.getContext()
            com.tencent.xweb.util.XWebCleaner.clearAllVersion(r6)
        L_0x0711:
            r7 = 0
            r8 = 8
            goto L_0x074f
        L_0x0715:
            r7 = 1
            com.tencent.xweb.WebDebugCfg r6 = com.tencent.xweb.WebDebugCfg.getInst()
            boolean r6 = r6.getShowSavePage()
            r6 = r6 ^ r7
            com.tencent.xweb.WebDebugCfg r7 = com.tencent.xweb.WebDebugCfg.getInst()
            r7.setShowSavePage(r6)
            if (r6 == 0) goto L_0x0732
            r20.initSavePageButton()
            android.widget.Button r6 = r1.mBtnSavePage
            r7 = 0
            r6.setVisibility(r7)
            goto L_0x078d
        L_0x0732:
            r7 = 0
            android.widget.Button r6 = r1.mBtnSavePage
            r8 = 8
            if (r6 == 0) goto L_0x0640
            r6.setVisibility(r8)
            goto L_0x0640
        L_0x073e:
            r7 = 0
            r8 = 8
            boolean r6 = r4.getBooleanQueryParameter(r14, r7)
            com.tencent.xweb.WebDebugCfg r9 = com.tencent.xweb.WebDebugCfg.getInst()
            r9.setEnableRemoteDebug(r6)
            r1.setEnableRemoteDebug(r6)
        L_0x074f:
            r17 = 1
            goto L_0x0640
        L_0x0753:
            r7 = 0
            r8 = 8
            r17 = 1
            r18 = 1
            goto L_0x0640
        L_0x075c:
            r6 = 1
            r7 = 0
            r8 = 8
            com.tencent.xweb.XWebSdk.clearAllWebViewCache(r6)
            java.lang.String r9 = "网页cache已经清理:"
            r1.showAlert(r9, r6)
            goto L_0x0640
        L_0x076b:
            r6 = 1
            r7 = 0
            r8 = 8
            com.tencent.xweb.XWebChildProcessMonitor.resetCrashCount()
            java.lang.String r9 = "crash次数重置为0"
            r1.showAlert(r9, r6)
            goto L_0x0640
        L_0x0779:
            r6 = 1
            r7 = 0
            r8 = 8
            android.content.Context r9 = org.xwalk.core.XWalkEnvironment.getApplicationContext()
            com.tencent.xweb.util.XWebCleaner.tryClearOldXWebCore(r9, r6)
            java.lang.String r9 = "旧版本已经清理"
            r1.showAlert(r9, r6)
            goto L_0x0640
        L_0x078c:
            r7 = 0
        L_0x078d:
            r8 = 8
            goto L_0x0640
        L_0x0791:
            if (r3 == 0) goto L_0x07a1
            boolean r0 = r1.onInnerInterceptTestUrl(r2, r0)
            if (r0 != 0) goto L_0x079e
            if (r17 == 0) goto L_0x079c
            goto L_0x079e
        L_0x079c:
            r3 = 0
            goto L_0x079f
        L_0x079e:
            r3 = 1
        L_0x079f:
            r17 = r3
        L_0x07a1:
            if (r18 == 0) goto L_0x07aa
            android.content.Context r0 = r20.getContext()
            com.tencent.xweb.util.XWebCommandHandler.killAllProcess(r0)
        L_0x07aa:
            return r17
        L_0x07ab:
            if (r3 == 0) goto L_0x07b0
            r20.initView()
        L_0x07b0:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.WebDebugPage.onInterceptTestUrl(java.lang.String):boolean");
    }

    public void setEnableRemoteDebug(boolean z) {
        XWebLog.m21911i(TAG, "setEnableRemoteDebug, enable:" + z);
        if (WebView.isXWeb()) {
            try {
                XWebPreferences.setValue(IXWebPreferences.REMOTE_DEBUGGING, z);
            } catch (Exception e) {
                XWebLog.m21910e(TAG, "setEnableRemoteDebug, xweb error:", e);
            }
        } else if (WebView.isSys()) {
            try {
                android.webkit.WebView.setWebContentsDebuggingEnabled(z);
            } catch (Exception e2) {
                XWebLog.m21910e(TAG, "setEnableRemoteDebug, sys error:", e2);
            }
        }
        Button button = this.mRemoteDebugButton;
        if (button == null) {
            return;
        }
        if (z) {
            button.setText("关闭远程调试模式(当前已打开)");
        } else {
            button.setText("打开远程调试模式(当前已关闭)");
        }
    }

    public void syncConfig() {
        if (WebDebugCfg.getInst().getEnableRemoteDebug() || XWalkEnvironment.getBuildConfigXWebTestMode()) {
            setEnableRemoteDebug(true);
        }
    }

    public static void installPluginFromLocalFile(Context context, String str, int i, boolean z, boolean z2, boolean z3, ValueCallback<Boolean> valueCallback) {
        Context context2 = context;
        ValueCallback<Boolean> valueCallback2 = valueCallback;
        XVFSFile xVFSFile = new XVFSFile(Environment.getExternalStorageDirectory().getPath());
        if (xVFSFile.listFiles() == null) {
            Toast.makeText(context, "请确认应用权限，在权限管理打开应用的读写存储权限", 0).show();
            valueCallback2.onReceiveValue(Boolean.FALSE);
            return;
        }
        final XWalkPlugin plugin = XWalkPluginManager.getPlugin(str);
        if (plugin == null) {
            Toast.makeText(context, "找不到对应插件", 0).show();
            valueCallback2.onReceiveValue(Boolean.FALSE);
            return;
        }
        String str2 = str;
        boolean z4 = z2;
        final String pluginLocalFileName = getPluginLocalFileName(str, z2);
        final String str3 = xVFSFile.getPath() + "/apkxwebtest/" + pluginLocalFileName;
        final Context context3 = context;
        final int i2 = i;
        final boolean z5 = z;
        final boolean z6 = z3;
        final ValueCallback<Boolean> valueCallback3 = valueCallback;
        new AsyncTask<Void, Void, Boolean>() {
            /* access modifiers changed from: private */
            public ProgressDialog loadingDialog = null;

            public void onPreExecute() {
                ProgressDialog progressDialog = new ProgressDialog(context3);
                this.loadingDialog = progressDialog;
                progressDialog.setProgressStyle(0);
                this.loadingDialog.setMessage("安装中");
                this.loadingDialog.setCancelable(false);
                this.loadingDialog.setCanceledOnTouchOutside(false);
                this.loadingDialog.setButton(-1, "完成", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C2021647.this.loadingDialog.hide();
                    }
                });
                this.loadingDialog.show();
                this.loadingDialog.getButton(-1).setVisibility(8);
            }

            /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Boolean doInBackground(java.lang.Void... r6) {
                /*
                    r5 = this;
                    r6 = 0
                    com.tencent.xweb.xwalk.plugin.XWalkPlugin r0 = r2     // Catch:{ Exception -> 0x0081 }
                    r1 = 1
                    int r0 = r0.getAvailableVersion(r1)     // Catch:{ Exception -> 0x0081 }
                    int r2 = r3     // Catch:{ Exception -> 0x0081 }
                    if (r2 <= 0) goto L_0x0026
                    if (r0 <= 0) goto L_0x002d
                    com.tencent.xweb.xwalk.plugin.XWalkPlugin r3 = r2     // Catch:{ Exception -> 0x0081 }
                    java.lang.String r0 = r3.getVersionDir(r0)     // Catch:{ Exception -> 0x0081 }
                    com.tencent.xweb.xwalk.plugin.XWalkPlugin r3 = r2     // Catch:{ Exception -> 0x0081 }
                    r4 = -1
                    r3.setAvailableVersion(r4, r1)     // Catch:{ Exception -> 0x0081 }
                    if (r0 == 0) goto L_0x002d
                    boolean r3 = r0.isEmpty()     // Catch:{ Exception -> 0x0081 }
                    if (r3 != 0) goto L_0x002d
                    com.tencent.xweb.util.FileUtils.deleteAll((java.lang.String) r0)     // Catch:{ Exception -> 0x0081 }
                    goto L_0x002d
                L_0x0026:
                    r2 = 99999(0x1869f, float:1.40128E-40)
                    if (r0 < r2) goto L_0x002d
                    int r2 = r0 + 1
                L_0x002d:
                    com.tencent.xweb.util.SchedulerConfig r0 = new com.tencent.xweb.util.SchedulerConfig     // Catch:{ Exception -> 0x0081 }
                    r0.<init>()     // Catch:{ Exception -> 0x0081 }
                    r0.version = r2     // Catch:{ Exception -> 0x0081 }
                    r3 = 0
                    r0.bIsPatchUpdate = r3     // Catch:{ Exception -> 0x0081 }
                    com.tencent.xweb.xwalk.plugin.XWalkPlugin r4 = r2     // Catch:{ Exception -> 0x0081 }
                    java.lang.String r2 = r4.getDownloadFullPath(r2, r3)     // Catch:{ Exception -> 0x0081 }
                    r0.path = r2     // Catch:{ Exception -> 0x0081 }
                    java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0081 }
                    java.lang.String r4 = r0.path     // Catch:{ Exception -> 0x0081 }
                    r2.<init>(r4)     // Catch:{ Exception -> 0x0081 }
                    boolean r6 = r4     // Catch:{ Exception -> 0x007e }
                    if (r6 == 0) goto L_0x005a
                    android.content.Context r6 = r1     // Catch:{ Exception -> 0x007e }
                    android.content.res.AssetManager r6 = r6.getAssets()     // Catch:{ Exception -> 0x007e }
                    java.lang.String r4 = r5     // Catch:{ Exception -> 0x007e }
                    java.io.InputStream r6 = r6.open(r4)     // Catch:{ Exception -> 0x007e }
                    com.tencent.xweb.util.FileUtils.copyStreamToFile(r6, r2)     // Catch:{ Exception -> 0x007e }
                    goto L_0x0063
                L_0x005a:
                    java.lang.String r6 = r6     // Catch:{ Exception -> 0x007e }
                    java.lang.String r4 = r2.getPath()     // Catch:{ Exception -> 0x007e }
                    com.tencent.xweb.file.XVFSFileOp.copyFile(r6, r4)     // Catch:{ Exception -> 0x007e }
                L_0x0063:
                    java.lang.String r6 = r2.getPath()     // Catch:{ Exception -> 0x007e }
                    java.lang.String r6 = com.tencent.xweb.file.XVFSFileOp.getFileMD5String(r6)     // Catch:{ Exception -> 0x007e }
                    r0.strMd5 = r6     // Catch:{ Exception -> 0x007e }
                    r0.skipSubFileMD5Check = r1     // Catch:{ Exception -> 0x007e }
                    com.tencent.xweb.xwalk.plugin.XWalkPlugin r6 = r2     // Catch:{ Exception -> 0x007e }
                    int r6 = r6.performInstall(r0)     // Catch:{ Exception -> 0x007e }
                    if (r6 != 0) goto L_0x0078
                    goto L_0x0079
                L_0x0078:
                    r1 = 0
                L_0x0079:
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x007e }
                    return r6
                L_0x007e:
                    r0 = move-exception
                    r6 = r2
                    goto L_0x0082
                L_0x0081:
                    r0 = move-exception
                L_0x0082:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "loadZipFormatPluginFromLocal error: "
                    r1.append(r2)
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    java.lang.String r1 = "WebDebugPage"
                    com.tencent.xweb.util.XWebLog.m21909e(r1, r0)
                    if (r6 == 0) goto L_0x00a1
                    java.lang.String r6 = r6.getAbsolutePath()
                    com.tencent.xweb.util.FileUtils.deleteAll((java.lang.String) r6)
                L_0x00a1:
                    java.lang.Boolean r6 = java.lang.Boolean.FALSE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.WebDebugPage.C2021647.doInBackground(java.lang.Void[]):java.lang.Boolean");
            }

            public void onPostExecute(Boolean bool) {
                if (bool.booleanValue()) {
                    this.loadingDialog.setMessage("安装完成");
                } else {
                    String str = z5 ? "asset/" : "sdcard/apkxwebtest/";
                    ProgressDialog progressDialog = this.loadingDialog;
                    progressDialog.setMessage("安装失败，请确保文件存在: " + str + pluginLocalFileName);
                }
                this.loadingDialog.getButton(-1).setVisibility(0);
                if (z6) {
                    this.loadingDialog.hide();
                }
                ValueCallback valueCallback = valueCallback3;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(bool);
                }
            }
        }.execute(new Void[0]);
    }

    private void loadApkFromLocal(File file, final boolean z) {
        XVFSFile xVFSFile = new XVFSFile(file);
        XVFSFile[] listFiles = xVFSFile.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            showAlert("请确认应用权限，在权限管理打开应用的读写存储权限", true);
            return;
        }
        String str = xVFSFile.getPath() + "/apkxwebtest";
        try {
            XVFSFile[] listFiles2 = new XVFSFile(str).listFiles();
            if (listFiles2 == null || listFiles2.length == 0) {
                showAlert("目录(" + str + ")下没有文件，请确认应用权限，在权限管理打开应用的读写存储权限", true);
                return;
            }
            for (int i = 0; i < listFiles2.length; i++) {
                if (listFiles2[i].getName().endsWith(".zip")) {
                    final String absolutePath = listFiles2[i].getAbsolutePath();
                    final String name = listFiles2[i].getName();
                    if (z) {
                        new AlertDialog.Builder(getContext()).setTitle("提示").setMessage("确定加载:" + name + "?").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                WebDebugPage.this.loadLocalApk(absolutePath, name, z);
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).show();
                        return;
                    }
                    loadLocalApk(absolutePath, name, z);
                    return;
                }
            }
            showAlert("apkxwebtest目录下没有.zip文件，请先按步骤将内核包传入到手机内部存储中", true);
        } catch (Exception unused) {
            showAlert("没有找到目录(" + str + ")，请确认应用权限，在权限管理打开应用的读写存储权限", true);
        }
    }

    public static class LocalUpdateConfig extends UpdateConfig {
        public String mStrApkPath;

        public LocalUpdateConfig(String str, String str2) {
            this((String) null, false, getVersion());
            this.mStrApkPath = str;
            this.isMatchMd5 = false;
            this.isPatchUpdate = false;
            this.versionDetail = "local:" + str2;
        }

        private static int getVersion() {
            int availableVersion = XWalkEnvironment.getAvailableVersion();
            return availableVersion >= 100000000 ? availableVersion + 1 : XWalkEnvironment.TEST_APK_START_VERSION;
        }

        public boolean checkValid() {
            return true;
        }

        private LocalUpdateConfig(String str, boolean z, int i) {
            super(str, z, i, AbiUtil.getRuntimeAbi(), 0);
        }
    }

    /* access modifiers changed from: private */
    public void showAlert(String str, boolean z, boolean z2) {
        if (z) {
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setMessage(str);
                builder.create();
                builder.setCancelable(true);
                if (z2) {
                    builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        public void onCancel(DialogInterface dialogInterface) {
                            XWebCommandHandler.killAllProcess(WebDebugPage.this.getContext());
                        }
                    });
                }
                builder.show();
            } catch (Exception e) {
                XWebLog.m21911i(TAG, "show alert failed may be in abtest, error:" + e);
            }
        } else {
            XWebLog.m21909e(TAG, str);
        }
    }

    /* access modifiers changed from: private */
    public void loadSavedPage() {
        XVFSFile xVFSFile = new XVFSFile(Environment.getExternalStorageDirectory());
        if (xVFSFile.listFiles() == null) {
            showAlert("请确认应用权限，在权限管理打开应用的读写存储权限", true);
            return;
        }
        final String str = xVFSFile.getPath() + "/xweb_dump";
        try {
            XVFSFile[] listFiles = new XVFSFile(str).listFiles();
            if (listFiles == null || listFiles.length == 0) {
                showAlert("web_dump目录下没有.zip文件，请确认应用权限，在权限管理打开应用的读写存储权限", true);
                return;
            }
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].getName().endsWith(".zip")) {
                    final String absolutePath = listFiles[i].getAbsolutePath();
                    String name = listFiles[i].getName();
                    new AlertDialog.Builder(getContext()).setTitle("提示").setMessage("确定加载:" + name + "?").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            WebDebugPage.this.loadSavedPage(str, absolutePath);
                        }
                    }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).show();
                    return;
                }
            }
            showAlert("web_dump目录下没有.zip文件", true);
        } catch (Exception unused) {
            showAlert("没有找到web_dump目录，请确认应用权限，在权限管理打开应用的读写存储权限", true);
        }
    }
}
