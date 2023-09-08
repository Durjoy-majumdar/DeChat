package zw3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import ax3.C79637a;
import bx3.C79853b;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.lib.service.AbstractResultService;
import com.tencent.tinker.lib.service.TinkerPatchService;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import cv3.C86144a;
import cx3.C86146a;
import ev3.C86701c;
import fv3.C87095a;
import gv3.C87402c;
import gv3.C87403d;
import gx3.C87405b;
import gx3.C87406c;
import iv3.C87821a;
import iv3.C87826d;
import java.io.File;
import java.util.HashMap;

/* renamed from: zw3.a */
public class C91941a {

    /* renamed from: c */
    public static C91941a f263210c;

    /* renamed from: a */
    public final C87821a f263211a;

    /* renamed from: b */
    public final C79637a f263212b;

    /* renamed from: zw3.a$a */
    public class C91942a implements MessageQueue.IdleHandler {

        /* renamed from: d */
        public final /* synthetic */ boolean f263213d;

        public C91942a(boolean z) {
            this.f263213d = z;
        }

        public boolean queueIdle() {
            C79637a aVar = C91941a.this.f263212b;
            boolean z = this.f263213d;
            aVar.getClass();
            SharedPreferences sharedPreferences = C87406c.m108581a().getSharedPreferences("patch_server_config", 0);
            long j = sharedPreferences.getLong("fetch_patch_last_check", 0);
            if (j == -1) {
                ShareTinkerLog.m106533v("Tinker.ServerClient", "tinker sync is disabled, with never check flag!", new Object[0]);
            } else {
                long currentTimeMillis = System.currentTimeMillis() - j;
                if (!z && !aVar.f233512d) {
                    long j2 = aVar.f233510b;
                    if (currentTimeMillis < j2) {
                        ShareTinkerLog.m106533v("Tinker.ServerClient", "tinker sync should wait interval %ss", Long.valueOf((j2 - currentTimeMillis) / 1000));
                    }
                }
                sharedPreferences.edit().putLong("fetch_patch_last_check", System.currentTimeMillis()).commit();
                C86146a aVar2 = aVar.f233511c;
                C79853b bVar = aVar.f233509a;
                aVar2.getClass();
                if (bVar == null) {
                    throw new RuntimeException("callback can't be null");
                } else if (bVar.mo109447a()) {
                    bVar.mo109449c();
                    bVar.mo109448b(aVar2.f250680a.f251199a);
                }
            }
            return false;
        }
    }

    public C91941a(Context context, ApplicationLike applicationLike, C87402c cVar, C87403d dVar, C86701c cVar2, C87095a aVar, C86144a aVar2, Class<? extends AbstractResultService> cls, C79853b bVar) {
        C91941a aVar3;
        C87402c cVar3 = cVar;
        C87403d dVar2 = dVar;
        C86701c cVar4 = cVar2;
        C87406c.f253293a = context;
        if (C79637a.f233508e == null) {
            if (C79637a.f233508e == null) {
                synchronized (C86146a.class) {
                    if (C79637a.f233508e == null) {
                        C79637a.f233508e = new C79637a(bVar);
                    }
                }
            }
            this.f263212b = C79637a.f233508e;
            C87821a.C87823b bVar2 = new C87821a.C87823b(applicationLike.getApplication());
            int tinkerFlags = applicationLike.getTinkerFlags();
            if (bVar2.f254243d == -1) {
                bVar2.f254243d = tinkerFlags;
                if (cVar3 == null) {
                    throw new TinkerRuntimeException("loadReporter must not be null.");
                } else if (bVar2.f254244e == null) {
                    bVar2.f254244e = cVar3;
                    if (cVar4 == null) {
                        throw new TinkerRuntimeException("listener must not be null.");
                    } else if (bVar2.f254246g == null) {
                        bVar2.f254246g = cVar4;
                        if (dVar2 == null) {
                            throw new TinkerRuntimeException("patchReporter must not be null.");
                        } else if (bVar2.f254245f == null) {
                            bVar2.f254245f = dVar2;
                            bVar2.f254247h = aVar2;
                            Boolean valueOf = Boolean.valueOf(applicationLike.getTinkerLoadVerifyFlag());
                            if (valueOf == null) {
                                throw new TinkerRuntimeException("tinkerLoadVerifyFlag must not be null.");
                            } else if (bVar2.f254251l == null) {
                                bVar2.f254251l = valueOf;
                                C87821a a = bVar2.mo122279a();
                                if (C87821a.f254226m == null) {
                                    C87821a.f254226m = a;
                                    Intent tinkerResultIntent = applicationLike.getTinkerResultIntent();
                                    int i = 1;
                                    C87821a.f254227n = true;
                                    TinkerPatchService.f250525d = aVar;
                                    TinkerPatchService.f250526e = cls;
                                    try {
                                        Class.forName(cls.getName());
                                    } catch (ClassNotFoundException e) {
                                        ShareTinkerLog.printErrStackTrace("Tinker.TinkerPatchService", e, "patch processor class not found.", new Object[0]);
                                    }
                                    ShareTinkerLog.m106532i("Tinker.Tinker", "try to install tinker, isEnable: %b, version: %s", Boolean.valueOf(ShareTinkerInternals.isTinkerEnabled(a.f254237j)), "1.9.14.25.2");
                                    if (!ShareTinkerInternals.isTinkerEnabled(a.f254237j)) {
                                        ShareTinkerLog.m106531e("Tinker.Tinker", "tinker is disabled", new Object[0]);
                                        aVar3 = this;
                                    } else if (tinkerResultIntent != null) {
                                        C87826d dVar3 = new C87826d();
                                        a.f254238k = dVar3;
                                        Context context2 = a.f254228a;
                                        C87821a c = C87821a.m109275c(context2);
                                        dVar3.f254264m = ShareIntentUtil.getIntentReturnCode(tinkerResultIntent);
                                        dVar3.f254265n = ShareIntentUtil.getIntentPatchCostTime(tinkerResultIntent);
                                        dVar3.f254256e = ShareIntentUtil.getBooleanExtra(tinkerResultIntent, ShareIntentUtil.INTENT_PATCH_SYSTEM_OTA, false);
                                        String stringExtra = ShareIntentUtil.getStringExtra(tinkerResultIntent, ShareIntentUtil.INTENT_PATCH_OAT_DIR);
                                        dVar3.f254253b = stringExtra;
                                        dVar3.f254255d = ShareConstants.INTERPRET_DEX_OPTIMIZE_PATH.equals(stringExtra);
                                        boolean z = c.f254235h;
                                        String str = Build.FINGERPRINT;
                                        ShareTinkerLog.m106532i("Tinker.TinkerLoadResult", "parseTinkerResult loadCode:%d, process name:%s, main process:%b, systemOTA:%b, fingerPrint:%s, oatDir:%s, useInterpretMode:%b", Integer.valueOf(dVar3.f254264m), ShareTinkerInternals.getProcessName(context2), Boolean.valueOf(z), Boolean.valueOf(dVar3.f254256e), str, dVar3.f254253b, Boolean.valueOf(dVar3.f254255d));
                                        String stringExtra2 = ShareIntentUtil.getStringExtra(tinkerResultIntent, ShareIntentUtil.INTENT_PATCH_OLD_VERSION);
                                        String stringExtra3 = ShareIntentUtil.getStringExtra(tinkerResultIntent, ShareIntentUtil.INTENT_PATCH_NEW_VERSION);
                                        File file = c.f254229b;
                                        File file2 = c.f254233f;
                                        if (!(stringExtra2 == null || stringExtra3 == null)) {
                                            if (z) {
                                                dVar3.f254252a = stringExtra3;
                                            } else {
                                                dVar3.f254252a = stringExtra2;
                                            }
                                            ShareTinkerLog.m106532i("Tinker.TinkerLoadResult", "parseTinkerResult oldVersion:%s, newVersion:%s, current:%s", stringExtra2, stringExtra3, dVar3.f254252a);
                                            String patchVersionDirectory = SharePatchFileUtil.getPatchVersionDirectory(dVar3.f254252a);
                                            if (!ShareTinkerInternals.isNullOrNil(patchVersionDirectory)) {
                                                dVar3.f254257f = new File(file.getAbsolutePath() + "/" + patchVersionDirectory);
                                                dVar3.f254258g = new File(dVar3.f254257f.getAbsolutePath(), SharePatchFileUtil.getPatchVersionFile(dVar3.f254252a));
                                                dVar3.f254259h = new File(dVar3.f254257f, "dex");
                                                dVar3.f254260i = new File(dVar3.f254257f, "lib");
                                                dVar3.f254261j = new File(dVar3.f254257f, "res");
                                                dVar3.f254262k = new File(dVar3.f254261j, "resources.apk");
                                            }
                                            new SharePatchInfo(stringExtra2, stringExtra3, ShareIntentUtil.getBooleanExtra(tinkerResultIntent, ShareIntentUtil.INTENT_IS_PROTECTED_APP, false), ShareIntentUtil.getBooleanExtra(tinkerResultIntent, ShareIntentUtil.INTENT_USE_CUSTOM_PATCH, false), "", str, dVar3.f254253b, false);
                                            i = 1;
                                            dVar3.f254254c = !stringExtra2.equals(stringExtra3);
                                        }
                                        Throwable intentPatchException = ShareIntentUtil.getIntentPatchException(tinkerResultIntent);
                                        if (intentPatchException != null) {
                                            Object[] objArr = new Object[i];
                                            objArr[0] = Integer.valueOf(dVar3.f254264m);
                                            ShareTinkerLog.m106532i("Tinker.TinkerLoadResult", "Tinker load have exception loadCode:%d", objArr);
                                            int i2 = dVar3.f254264m;
                                            c.f254231d.mo109437h(intentPatchException, i2 != -25 ? i2 != -23 ? (i2 == -20 || i2 != -14) ? -1 : -2 : -3 : -4);
                                        } else {
                                            int i3 = dVar3.f254264m;
                                            if (i3 == -10000) {
                                                ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "can't get the right intent return code", new Object[0]);
                                                throw new TinkerRuntimeException("can't get the right intent return code");
                                            } else if (i3 == -24) {
                                                File file3 = dVar3.f254262k;
                                                if (file3 != null) {
                                                    ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch resource file md5 is mismatch: %s", file3.getAbsolutePath());
                                                    c.f254231d.mo109436g(dVar3.f254262k, 6);
                                                } else {
                                                    ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "resource file md5 mismatch, but patch resource file not found!", new Object[0]);
                                                    throw new TinkerRuntimeException("resource file md5 mismatch, but patch resource file not found!");
                                                }
                                            } else if (i3 != -22) {
                                                if (i3 != -21) {
                                                    switch (i3) {
                                                        case -19:
                                                            ShareTinkerLog.m106532i("Tinker.TinkerLoadResult", "rewrite patch info file corrupted", new Object[0]);
                                                            c.f254231d.mo109433d(stringExtra2, stringExtra3, file2);
                                                            break;
                                                        case -18:
                                                            String stringExtra4 = ShareIntentUtil.getStringExtra(tinkerResultIntent, ShareIntentUtil.INTENT_PATCH_MISSING_LIB_PATH);
                                                            if (stringExtra4 != null) {
                                                                ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch lib file not found:%s", stringExtra4);
                                                                c.f254231d.mo109432c(new File(stringExtra4), 5, false);
                                                                break;
                                                            } else {
                                                                ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch lib file not found, but path is null!!!!", new Object[0]);
                                                                throw new TinkerRuntimeException("patch lib file not found, but path is null!!!!");
                                                            }
                                                        case -17:
                                                            if (dVar3.f254257f != null) {
                                                                ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch lib file directory not found:%s", dVar3.f254260i.getAbsolutePath());
                                                                c.f254231d.mo109432c(dVar3.f254260i, 5, true);
                                                                break;
                                                            } else {
                                                                ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch lib file directory not found, warning why the path is null!!!!", new Object[0]);
                                                                throw new TinkerRuntimeException("patch lib file directory not found, warning why the path is null!!!!");
                                                            }
                                                        case -16:
                                                            c.f254231d.mo109435f(2, ShareIntentUtil.getIntentInterpretException(tinkerResultIntent));
                                                            break;
                                                        case -15:
                                                            c.f254231d.mo109435f(1, ShareIntentUtil.getIntentInterpretException(tinkerResultIntent));
                                                            break;
                                                        default:
                                                            switch (i3) {
                                                                case -13:
                                                                    String stringExtra5 = ShareIntentUtil.getStringExtra(tinkerResultIntent, ShareIntentUtil.INTENT_PATCH_MISMATCH_DEX_PATH);
                                                                    if (stringExtra5 != null) {
                                                                        ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch dex file md5 is mismatch: %s", stringExtra5);
                                                                        c.f254231d.mo109436g(new File(stringExtra5), 3);
                                                                        break;
                                                                    } else {
                                                                        ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch dex file md5 is mismatch, but path is null!!!!", new Object[0]);
                                                                        throw new TinkerRuntimeException("patch dex file md5 is mismatch, but path is null!!!!");
                                                                    }
                                                                case -12:
                                                                    ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch dex load fail, classloader is null", new Object[0]);
                                                                    break;
                                                                case -11:
                                                                    String stringExtra6 = ShareIntentUtil.getStringExtra(tinkerResultIntent, ShareIntentUtil.INTENT_PATCH_MISSING_DEX_PATH);
                                                                    if (stringExtra6 != null) {
                                                                        ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch dex opt file not found:%s", stringExtra6);
                                                                        c.f254231d.mo109432c(new File(stringExtra6), 4, false);
                                                                        break;
                                                                    } else {
                                                                        ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch dex opt file not found, but path is null!!!!", new Object[0]);
                                                                        throw new TinkerRuntimeException("patch dex opt file not found, but path is null!!!!");
                                                                    }
                                                                case -10:
                                                                    String stringExtra7 = ShareIntentUtil.getStringExtra(tinkerResultIntent, ShareIntentUtil.INTENT_PATCH_MISSING_DEX_PATH);
                                                                    if (stringExtra7 != null) {
                                                                        ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch dex file not found:%s", stringExtra7);
                                                                        c.f254231d.mo109432c(new File(stringExtra7), 3, false);
                                                                        break;
                                                                    } else {
                                                                        ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch dex file not found, but path is null!!!!", new Object[0]);
                                                                        throw new TinkerRuntimeException("patch dex file not found, but path is null!!!!");
                                                                    }
                                                                case -9:
                                                                    File file4 = dVar3.f254259h;
                                                                    if (file4 != null) {
                                                                        ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch dex file directory not found:%s", file4.getAbsolutePath());
                                                                        c.f254231d.mo109432c(dVar3.f254259h, 3, true);
                                                                        break;
                                                                    } else {
                                                                        ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch dex file directory not found, warning why the path is null!!!!", new Object[0]);
                                                                        throw new TinkerRuntimeException("patch dex file directory not found, warning why the path is null!!!!");
                                                                    }
                                                                case -8:
                                                                    ShareTinkerLog.m106532i("Tinker.TinkerLoadResult", "patch package check fail", new Object[0]);
                                                                    if (dVar3.f254258g != null) {
                                                                        c.f254231d.mo109430a(dVar3.f254258g, tinkerResultIntent.getIntExtra(ShareIntentUtil.INTENT_PATCH_PACKAGE_PATCH_CHECK, -10000));
                                                                        break;
                                                                    } else {
                                                                        throw new TinkerRuntimeException("error patch package check fail , but file is null");
                                                                    }
                                                                case -7:
                                                                    ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch version file not found, current version:%s", dVar3.f254252a);
                                                                    File file5 = dVar3.f254258g;
                                                                    if (file5 != null) {
                                                                        c.f254231d.mo109432c(file5, 1, false);
                                                                        break;
                                                                    } else {
                                                                        throw new TinkerRuntimeException("error load patch version file not exist, but file is null");
                                                                    }
                                                                case -6:
                                                                    ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch version directory not found, current version:%s", dVar3.f254252a);
                                                                    c.f254231d.mo109432c(dVar3.f254257f, 1, true);
                                                                    break;
                                                                case -5:
                                                                    ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "path info blank, wait main process to restart", new Object[0]);
                                                                    break;
                                                                case -4:
                                                                    ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "path info corrupted", new Object[0]);
                                                                    c.f254231d.mo109433d(stringExtra2, stringExtra3, file2);
                                                                    break;
                                                                case -3:
                                                                case -2:
                                                                    ShareTinkerLog.m106534w("Tinker.TinkerLoadResult", "can't find patch file, is ok, just return", new Object[0]);
                                                                    break;
                                                                case -1:
                                                                    ShareTinkerLog.m106534w("Tinker.TinkerLoadResult", "tinker is disable, just return", new Object[0]);
                                                                    break;
                                                                case 0:
                                                                    ShareTinkerLog.m106532i("Tinker.TinkerLoadResult", "oh yeah, tinker load all success", new Object[0]);
                                                                    c.f254239l = true;
                                                                    ShareIntentUtil.getIntentPatchDexPaths(tinkerResultIntent);
                                                                    ShareIntentUtil.getIntentPatchLibsPaths(tinkerResultIntent);
                                                                    dVar3.f254263l = ShareIntentUtil.getIntentPackageConfig(tinkerResultIntent);
                                                                    if (dVar3.f254255d) {
                                                                        c.f254231d.mo109435f(0, (Throwable) null);
                                                                    }
                                                                    if (z && dVar3.f254254c) {
                                                                        c.f254231d.mo109434e(stringExtra2, stringExtra3, file, dVar3.f254257f.getName());
                                                                        break;
                                                                    }
                                                            }
                                                            break;
                                                    }
                                                } else if (dVar3.f254257f != null) {
                                                    ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch resource file directory not found:%s", dVar3.f254261j.getAbsolutePath());
                                                    c.f254231d.mo109432c(dVar3.f254261j, 6, true);
                                                } else {
                                                    ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch resource file directory not found, warning why the path is null!!!!", new Object[0]);
                                                    throw new TinkerRuntimeException("patch resource file directory not found, warning why the path is null!!!!");
                                                }
                                            } else if (dVar3.f254257f != null) {
                                                ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch resource file not found:%s", dVar3.f254262k.getAbsolutePath());
                                                c.f254231d.mo109432c(dVar3.f254262k, 6, false);
                                            } else {
                                                ShareTinkerLog.m106531e("Tinker.TinkerLoadResult", "patch resource file not found, warning why the path is null!!!!", new Object[0]);
                                                throw new TinkerRuntimeException("patch resource file not found, warning why the path is null!!!!");
                                            }
                                        }
                                        C87402c cVar5 = a.f254231d;
                                        File file6 = a.f254229b;
                                        C87826d dVar4 = a.f254238k;
                                        cVar5.mo109431b(file6, dVar4.f254264m, dVar4.f254265n);
                                        if (!a.f254239l) {
                                            ShareTinkerLog.m106534w("Tinker.Tinker", "tinker load fail!", new Object[0]);
                                        }
                                        aVar3 = this;
                                    } else {
                                        throw new TinkerRuntimeException("intentResult must not be null.");
                                    }
                                    aVar3.f263211a = a;
                                    return;
                                }
                                throw new TinkerRuntimeException("Tinker instance is already set.");
                            } else {
                                throw new TinkerRuntimeException("tinkerLoadVerifyFlag is already set.");
                            }
                        } else {
                            throw new TinkerRuntimeException("patchReporter is already set.");
                        }
                    } else {
                        throw new TinkerRuntimeException("listener is already set.");
                    }
                } else {
                    throw new TinkerRuntimeException("loadReporter is already set.");
                }
            } else {
                throw new TinkerRuntimeException("tinkerFlag is already set.");
            }
        } else {
            throw new RuntimeException("tinker server client is already init");
        }
    }

    /* renamed from: d */
    public static C91941a m115469d() {
        C91941a aVar = f263210c;
        if (aVar != null) {
            return aVar;
        }
        throw new TinkerRuntimeException("you must init TinkerClient sdk first");
    }

    /* renamed from: a */
    public C91941a mo125791a(boolean z) {
        if (this.f263212b == null || this.f263211a == null) {
            ShareTinkerLog.m106533v("Tinker.TinkerClient", "fetchPatchUpdate, tinkerServerClient or tinkerClient is null, just return", new Object[0]);
            return f263210c;
        }
        Context a = C87406c.m108581a();
        if (!C87405b.m108580a(a)) {
            ShareTinkerLog.m106533v("Tinker.TinkerClient", "fetchPatchUpdate, permission refuse, you must access INTERNET and ACCESS_NETWORK_STATE permission first", new Object[0]);
            return f263210c;
        } else if (!ShareTinkerInternals.isTinkerEnabled(this.f263211a.f254237j) || !ShareTinkerInternals.isTinkerEnableWithSharedPreferences(a)) {
            ShareTinkerLog.m106533v("Tinker.TinkerClient", "fetchPatchUpdate, tinker is disable, just return", new Object[0]);
            return f263210c;
        } else {
            if (this.f263211a.f254235h) {
                Looper.getMainLooper();
                Looper.myQueue().addIdleHandler(new C91942a(z));
            }
            return f263210c;
        }
    }

    /* renamed from: b */
    public C91941a mo125792b(int i) {
        if (this.f263212b == null) {
            ShareTinkerLog.m106533v("Tinker.TinkerClient", "setFetchPatchIntervalByHours, tinkerServerClient == null, just return", new Object[0]);
            return f263210c;
        }
        ShareTinkerLog.m106533v("Tinker.TinkerClient", "setFetchPatchIntervalByHours to %d hours", Integer.valueOf(i));
        C79637a aVar = this.f263212b;
        aVar.getClass();
        long j = (long) i;
        if (j == -1) {
            ShareTinkerLog.m106533v("Tinker.ServerClient", "Warning, disableFetchPatchUpdate", new Object[0]);
            C87406c.m108581a().getSharedPreferences("patch_server_config", 0).edit().putLong("fetch_patch_last_check", -1).commit();
        } else if (i < 0 || i > 24) {
            throw new TinkerRuntimeException("hours must be between 0 and 24");
        } else {
            aVar.f233510b = j * 3600 * 1000;
        }
        return f263210c;
    }

    /* renamed from: c */
    public C91941a mo125793c(String str, String str2) {
        if (this.f263212b == null) {
            ShareTinkerLog.m106533v("Tinker.TinkerClient", "setPatchCondition, tinkerServerClient == null, just return", new Object[0]);
            return f263210c;
        }
        ShareTinkerLog.m106533v("Tinker.TinkerClient", "setPatchCondition %s with value %s", str, str2);
        ((HashMap) this.f263212b.f233511c.f250680a.f251199a).put(str, str2);
        return f263210c;
    }
}
