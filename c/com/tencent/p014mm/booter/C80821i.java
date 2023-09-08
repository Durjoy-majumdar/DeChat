package com.tencent.p014mm.booter;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import com.tencent.p014mm.app.ToolsProfile;
import com.tencent.p014mm.pluginsdk.model.C85607j1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import gy3.C87412m;
import j20.C117292a;
import java.util.Locale;
import k20.C60958c;
import k20.C9556a;
import lg3.C88494d;
import lg3.C88496e;
import lg3.C88500i;
import lg3.C88504k;
import o40.C61926c;
import u93.C52492d;
import u93.C52494f;

/* renamed from: com.tencent.mm.booter.i */
public class C80821i implements C80823j {

    /* renamed from: com.tencent.mm.booter.i$a */
    public class C80822a implements MMApplicationContext.IResourceProvider {

        /* renamed from: a */
        public final /* synthetic */ Context f237585a;

        /* renamed from: b */
        public final /* synthetic */ String f237586b;

        public C80822a(C80821i iVar, Context context, String str) {
            this.f237585a = context;
            this.f237586b = str;
        }

        public Resources getResources() {
            Resources resources = this.f237585a.getApplicationContext().getResources();
            return new C88496e(resources, C88504k.m110378f(this.f237585a.getApplicationContext(), this.f237586b), new C88500i(), new C88494d(resources.getDisplayMetrics()));
        }
    }

    /* renamed from: a */
    public void mo56281a(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        if (context2 != null && intent2 != null) {
            String stringExtra = intent2.getStringExtra("tools_process_action_code_key");
            Log.m105924i("MicroMsg.ToolsProcessReceiver", "onReceive, action = " + stringExtra);
            if (!Util.isNullOrNil(stringExtra)) {
                if (stringExtra.equals("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS")) {
                    Log.appenderFlushSync();
                    boolean b = ToolsProfile.C80582b.m98201b();
                    Log.m105925i("MicroMsg.ToolsProcessReceiver", "onReceive, ACTION_KILL_TOOLS_PROCESS, x5 kernel video isLocked = %b", Boolean.valueOf(b));
                    if (!b) {
                        int myPid = Process.myPid();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(myPid));
                        Object obj = new Object();
                        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/booter/MMProcessReceivers$ToolsProcessReceiverImpl", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                        Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(obj, "com/tencent/mm/booter/MMProcessReceivers$ToolsProcessReceiverImpl", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    }
                } else if (stringExtra.equals("com.tencent.mm.intent.ACTION_RELOAD_RESOURCES")) {
                    String stringExtra2 = intent2.getStringExtra("tools_language");
                    if (stringExtra2 != null) {
                        Log.m105925i("MicroMsg.ToolsProcessReceiver", "onReceive, language %s", stringExtra2);
                        Locale transLanguageToLocale = LocaleUtil.transLanguageToLocale(stringExtra2);
                        if ("language_default".equalsIgnoreCase(stringExtra2)) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                transLanguageToLocale = LocaleUtil.sysDefaultLocale;
                                Locale.setDefault(transLanguageToLocale);
                            } else {
                                transLanguageToLocale = Locale.getDefault();
                            }
                        }
                        LocaleUtil.updateApplicationResourceLocale(context.getApplicationContext(), transLanguageToLocale);
                        MMApplicationContext.setResourcesProvider(new C80822a(this, context2, stringExtra2));
                        XWebSdk.updateResourceLocale(transLanguageToLocale);
                    }
                } else {
                    if (stringExtra.equals("com.tencent.mm.intent.ACTION_TOOLS_REMOVE_COOKIE")) {
                        try {
                            MultiProcessMMKV.getMMKV("__webView_ad").removeValueForKey("AdWUID");
                            XWebSdk.clearAllWebViewCache(true);
                        } catch (Exception e) {
                            Log.m105924i("MicroMsg.ToolsProcessReceiver", "clear cookie faild : " + e.getMessage());
                        }
                    } else if (!stringExtra.equals("com.tencent.mm.intent.ACIONT_TOOLS_LOAD_DEX")) {
                        if (stringExtra.equals("com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE")) {
                            boolean booleanExtra = intent2.getBooleanExtra("tools_clean_webview_cache_ignore_cookie", true);
                            Log.m105925i("MicroMsg.ToolsProcessReceiver", "WebViewCacheClearTask, clearAllWebViewCache, includeCookie = %b", Boolean.valueOf(booleanExtra));
                            XWebSdk.clearAllWebViewCache(booleanExtra);
                        } else if (stringExtra.equals("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS")) {
                            Log.m105924i("MicroMsg.ToolsProcessReceiver", "start tools process task, try to pre load tbs");
                        } else if (stringExtra.equals("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS_DO_NOTHING")) {
                            Log.m105924i("MicroMsg.ToolsProcessReceiver", "start tools process and do nothing");
                        } else if (stringExtra.equals("com.tencent.mm.intent.ACTION_CHECK_MINIQB_CAN_OPEN_FILE")) {
                            long longExtra = intent2.getLongExtra("msg_id", 0);
                            boolean booleanExtra2 = intent2.getBooleanExtra("open_in_device", false);
                            String stringExtra3 = intent2.getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH);
                            String stringExtra4 = intent2.getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_EXT);
                            String stringExtra5 = intent2.getStringExtra("file_name");
                            byte[] byteArrayExtra = intent2.getByteArrayExtra("key_multi_task_common_info");
                            int intExtra = intent2.getIntExtra("sence", 0);
                            StringBuilder sb = new StringBuilder();
                            String str = "key_multi_task_common_info";
                            sb.append("openFileByMiniQB filePath:");
                            sb.append(stringExtra3);
                            sb.append(", fileExt:");
                            sb.append(stringExtra4);
                            sb.append(", sence:");
                            sb.append(intExtra);
                            Log.m105924i("MicroMsg.TBSFileBrowseHelper", sb.toString());
                            if (System.currentTimeMillis() - C85607j1.f249535a < 1000) {
                                Log.m105920e("MicroMsg.TBSFileBrowseHelper", "openFileByMiniQB ignore, too close");
                            } else if (Util.isNullOrNil(stringExtra3)) {
                                Log.m105920e("MicroMsg.TBSFileBrowseHelper", "openFileByMiniQB failed, filePath is empty");
                            } else {
                                C85607j1.f249535a = System.currentTimeMillis();
                                Intent intent3 = new Intent();
                                intent3.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI");
                                intent3.putExtra("msg_id", longExtra);
                                intent3.putExtra("open_in_device", booleanExtra2);
                                intent3.putExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH, stringExtra3);
                                intent3.putExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_EXT, stringExtra4);
                                intent3.putExtra("file_name", stringExtra5);
                                intent3.putExtra("sence", intExtra);
                                intent3.putExtra(str, byteArrayExtra);
                                intent3.addFlags(268435456);
                                Context context3 = MMApplicationContext.getContext();
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(intent3);
                                Context context4 = context3;
                                C117292a.m165358d(context4, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/model/TBSFileBrowseHelper", "loadByMiniQB", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I[B)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                context3.startActivity((Intent) aVar2.mo10231a(0));
                                C117292a.m165359e(context4, "com/tencent/mm/pluginsdk/model/TBSFileBrowseHelper", "loadByMiniQB", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I[B)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            }
                        } else if (stringExtra.equals("com.tencent.mm.intent.ACTION_PRELOAD_SEARCH")) {
                            String stringExtra6 = intent2.getStringExtra("tools_param_preload_url");
                            intent2.getIntExtra("tools_param_preload_search_biz", -1);
                            boolean booleanExtra3 = intent2.getBooleanExtra("tools_param_preload_search_biz_need_reset", false);
                            C87412m.m108594g(stringExtra6, "url");
                            Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadLogic", "preloadWebView url:" + stringExtra6 + " reset:" + booleanExtra3);
                            if (booleanExtra3) {
                                C61926c.m72668M(C52492d.f146644d);
                            }
                            C61926c.m72668M(new C52494f(stringExtra6));
                        }
                    }
                }
            }
        }
    }
}
