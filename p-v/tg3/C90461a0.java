package tg3;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.permission.PermissionActivity;
import com.tencent.p014mm.sandbox.monitor.C85705h;
import com.tencent.p014mm.sandbox.updater.AppUpdaterUI;
import com.tencent.p014mm.sandbox.updater.UpdaterService;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import oa1.C117731d;
import p1054vg.C102189h;
import p1054vg.C90796c;
import p918s2.C90116e;
import qe3.C89625d;
import rg3.C89963b;
import te3.C49335eu3;

/* renamed from: tg3.a0 */
public class C90461a0 implements C90498x, C90481o {

    /* renamed from: A */
    public Context f259984A;

    /* renamed from: B */
    public long f259985B;

    /* renamed from: C */
    public C90494u f259986C;

    /* renamed from: D */
    public long f259987D;

    /* renamed from: E */
    public C89963b.C89964a f259988E;

    /* renamed from: a */
    public C85705h f259989a = null;

    /* renamed from: b */
    public ArrayList<C90498x> f259990b = new ArrayList<>(1);

    /* renamed from: c */
    public String[] f259991c;

    /* renamed from: d */
    public int f259992d;

    /* renamed from: e */
    public byte[] f259993e;

    /* renamed from: f */
    public byte[] f259994f;

    /* renamed from: g */
    public byte[] f259995g;

    /* renamed from: h */
    public int f259996h;

    /* renamed from: i */
    public String f259997i;

    /* renamed from: j */
    public String f259998j;

    /* renamed from: k */
    public String f259999k;

    /* renamed from: l */
    public int f260000l;

    /* renamed from: m */
    public String[] f260001m;

    /* renamed from: n */
    public C102189h f260002n;

    /* renamed from: o */
    public C102189h.C90802a f260003o;

    /* renamed from: p */
    public boolean f260004p;

    /* renamed from: q */
    public boolean f260005q;

    /* renamed from: r */
    public int f260006r;

    /* renamed from: s */
    public boolean f260007s;

    /* renamed from: t */
    public String f260008t;

    /* renamed from: u */
    public boolean f260009u;

    /* renamed from: v */
    public int f260010v;

    /* renamed from: w */
    public String f260011w;

    /* renamed from: x */
    public boolean f260012x;

    /* renamed from: y */
    public Intent f260013y;

    /* renamed from: z */
    public Notification f260014z;

    /* renamed from: tg3.a0$a */
    public class C90462a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f260015d;

        public C90462a(int i) {
            this.f260015d = i;
        }

        public void run() {
            ((NotificationManager) C90461a0.this.f259984A.getSystemService("notification")).cancel(99);
            Log.m105918d("MicroMsg.UpdaterManager", "finishType == " + this.f260015d);
            if (this.f260015d == 2 && C90461a0.this.f259992d == 1) {
                Intent intent = new Intent();
                intent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP");
                C90461a0.this.f259984A.sendBroadcast(intent, WeChatPermissions.PERMISSION_MM_MESSAGE());
            }
        }
    }

    /* renamed from: tg3.a0$b */
    public class C90463b implements C89963b.C89964a {
        public C90463b() {
        }

        /* renamed from: a */
        public void mo124302a(int i, int i2) {
            Log.m105925i("MicroMsg.UpdaterManager", "total=%d, offset=%d", Integer.valueOf(i), Integer.valueOf(i2));
            C90461a0 a0Var = C90461a0.this;
            if (a0Var.f260006r != 2) {
                C90461a0.m113265i(a0Var, i2, i);
            }
            C90461a0.this.mo119312a(i, i2);
        }

        /* renamed from: b */
        public void mo124298b(long j) {
            C90494u uVar = C90461a0.this.f259986C;
            uVar.f260097a.post(new C90496v(uVar, j));
        }

        /* renamed from: c */
        public void mo124299c(long j) {
            C90494u uVar = C90461a0.this.f259986C;
            uVar.f260097a.post(new C90497w(uVar, j));
        }

        /* renamed from: d */
        public void mo124303d(int i, int i2, C49335eu3 eu32) {
            int i3 = i;
            int i4 = i2;
            C90461a0 a0Var = C90461a0.this;
            a0Var.f260012x = false;
            a0Var.f259986C.mo124666b();
            C90461a0 a0Var2 = C90461a0.this;
            a0Var2.getClass();
            a0Var2.f259985B = System.currentTimeMillis();
            C90461a0 a0Var3 = C90461a0.this;
            C85705h hVar = a0Var3.f259989a;
            if (hVar == null) {
                a0Var3.mo124631k(2, true);
            } else if (i3 == 200 && i4 == 0) {
                Log.m105924i("MicroMsg.UpdaterManager", "packCallback onSceneEnd ok");
                C90461a0 a0Var4 = C90461a0.this;
                if (a0Var4.f260006r != 2) {
                    C90461a0.m113265i(a0Var4, 100, 100);
                }
                C90461a0 a0Var5 = C90461a0.this;
                if (a0Var5.f260004p) {
                    C90499y.m113323i(a0Var5.f259984A, 0);
                } else {
                    C90499y.m113323i(a0Var5.f259984A, 9);
                }
                C90461a0.this.f259999k = MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "yyb_pkg_sig_prefs", 4).getString(MMApplicationContext.getPackageName(), "");
                C90461a0 a0Var6 = C90461a0.this;
                Log.m105925i("MicroMsg.UpdaterManager", "summertoken downloadsuccess onSceneEnd sig[%s], path[%s]", a0Var6.f259999k, a0Var6.f259989a.mo119308c());
                if (Util.isNullOrNil(C90461a0.this.f259999k) || BuildInfo.IS_FLAVOR_RED) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(322, 8, 1, false);
                    nVar.mo160131h(11098, Integer.valueOf(WearableStatusCodes.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED));
                } else {
                    try {
                        String i5 = C86013q1.m106448i(C90461a0.this.f259989a.mo119308c(), true);
                        if (!MMApplicationContext.getContext().getPackageName().equalsIgnoreCase(MMApplicationContext.getPackageName()) || C117731d.m166007c().mo182444f("clicfg_appcompat_pkg_sig", "0", false, true).equals("1")) {
                            C90796c.m113868d(new File(i5), C90461a0.this.f259999k);
                        } else {
                            Log.m105924i("MicroMsg.UpdaterManager", "Skip writing apkSig for v2 signing, pkg = " + MMApplicationContext.getPackageName());
                        }
                        Log.m105924i("MicroMsg.UpdaterManager", "summertoken downloadsuccess writeSecurityCode done");
                        C115669n nVar2 = C115669n.INSTANCE;
                        nVar2.idkeyStat(322, 6, 1, false);
                        nVar2.mo160131h(11098, Integer.valueOf(WearableStatusCodes.DUPLICATE_CAPABILITY), C90461a0.this.f259999k);
                    } catch (Exception e) {
                        Log.m105928w("MicroMsg.UpdaterManager", "summertoken downloadsuccess writeSecurityCode e: " + e.getMessage());
                        C115669n nVar3 = C115669n.INSTANCE;
                        nVar3.idkeyStat(322, 7, 1, false);
                        nVar3.mo160131h(11098, Integer.valueOf(WearableStatusCodes.UNKNOWN_CAPABILITY), e.getMessage());
                    }
                }
                C90461a0 a0Var7 = C90461a0.this;
                int i6 = a0Var7.f260006r;
                if (i6 == 1) {
                    C90499y.m113322h(a0Var7.f259984A, 8, 0);
                    C90461a0 a0Var8 = C90461a0.this;
                    C90499y.m113319e(a0Var8.f259998j, a0Var8.f259999k, a0Var8.f259997i, a0Var8.f260000l, a0Var8.f260006r, a0Var8.f259992d, a0Var8.f260008t);
                    C90461a0 a0Var9 = C90461a0.this;
                    a0Var9.mo119314c(a0Var9.f259989a.mo119308c());
                    if (C90461a0.this.f260009u) {
                        C115669n.INSTANCE.idkeyStat(614, 58, 1, false);
                        Log.m105918d("MicroMsg.UpdaterManager", "boots download success.");
                    }
                } else if (i6 == 0) {
                    a0Var7.mo119314c(a0Var7.f259989a.mo119308c());
                } else if (i6 == 2) {
                    C90499y.m113322h(a0Var7.f259984A, 1, 0);
                    C90461a0 a0Var10 = C90461a0.this;
                    C90499y.m113319e(a0Var10.f259998j, a0Var10.f259999k, a0Var10.f259997i, a0Var10.f260000l, a0Var10.f260006r, a0Var10.f259992d, a0Var10.f260008t);
                }
                C90499y.m113321g();
            } else if (i4 == -13) {
                Log.m105920e("MicroMsg.UpdaterManager", "session timeout, killself and restart");
                Log.m105924i("MicroMsg.XWeb.MM.UpdaterService", "UpdaterService stopInstance()");
                UpdaterService updaterService = UpdaterService.f249763p;
                if (updaterService != null) {
                    updaterService.mo119329j();
                }
                AppUpdaterUI appUpdaterUI = AppUpdaterUI.f249736j;
                if (appUpdaterUI != null) {
                    appUpdaterUI.mo119311H7();
                }
                MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "update_config_prefs", 4).edit().putBoolean("update_download_start_one_immediate", true).commit();
                Log.m105924i("MicroMsg.UpdateUtil", "putOneDownloadTask");
            } else {
                if (!(hVar instanceof C90485q) || a0Var3.f259992d == 4) {
                    Log.m105920e("MicroMsg.UpdaterManager", "update failed");
                    C90499y.m113323i(C90461a0.this.f259984A, 10);
                    C90461a0 a0Var11 = C90461a0.this;
                    int i7 = a0Var11.f260006r;
                    if (i7 == 1) {
                        String string = a0Var11.f259984A.getString(C0966R.string.f7953xb);
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/"));
                        intent.addFlags(268435456);
                        PendingIntent activity = PendingIntent.getActivity(a0Var11.f259984A, 0, intent, 134217728);
                        C90116e.C90121c cVar = new C90116e.C90121c(a0Var11.f259984A, "reminder_channel_id");
                        cVar.mo124390o((CharSequence) null);
                        cVar.f258814z.when = System.currentTimeMillis();
                        cVar.mo124383h(string);
                        cVar.mo124382g((CharSequence) null);
                        cVar.f258795g = activity;
                        Notification b = cVar.mo124378b();
                        a0Var11.f260014z = b;
                        b.icon = C0966R.C0969drawable.bmu;
                        b.flags |= 16;
                        ((NotificationManager) a0Var11.f259984A.getSystemService("notification")).notify(99, a0Var11.f260014z);
                    } else if (i7 == 0) {
                        a0Var11.mo124631k(1, true);
                    }
                } else {
                    Log.m105920e("MicroMsg.UpdaterManager", "download package from cdn error.");
                    C90461a0 a0Var12 = C90461a0.this;
                    if (a0Var12.f260004p) {
                        if (i3 == 3 || i3 == 4 || i3 == 2 || i3 == 1 || i3 == 13) {
                            C90499y.m113323i(a0Var12.f259984A, i3);
                        }
                        C90461a0 a0Var13 = C90461a0.this;
                        a0Var13.f260004p = false;
                        int i8 = a0Var13.f260006r;
                        if (i8 == 1) {
                            if (a0Var13.f260009u) {
                                Log.m105919d("MicroMsg.UpdaterManager", "isTinkerPatch boots download failed. %d", Integer.valueOf(i));
                                if (i3 == 1) {
                                    C115669n.INSTANCE.idkeyStat(614, 51, 1, false);
                                } else if (i3 == 2) {
                                    C115669n.INSTANCE.idkeyStat(614, 54, 1, false);
                                } else if (i3 == 3) {
                                    C115669n.INSTANCE.idkeyStat(614, 52, 1, false);
                                } else if (i3 == 4) {
                                    C115669n.INSTANCE.idkeyStat(614, 53, 1, false);
                                } else if (i3 == 13) {
                                    C115669n.INSTANCE.idkeyStat(614, 55, 1, false);
                                }
                            } else {
                                Log.m105924i("MicroMsg.UpdaterManager", "showDownloadFullPackNotification()");
                                String string2 = a0Var13.f259984A.getString(C0966R.string.f7954xc, new Object[]{Util.getSizeKB((long) a0Var13.f260000l)});
                                Intent intent2 = a0Var13.f260013y;
                                intent2.putExtra("intent_extra_force_download_full", true);
                                PendingIntent service = PendingIntent.getService(a0Var13.f259984A, 0, intent2, 134217728);
                                C90116e.C90121c cVar2 = new C90116e.C90121c(a0Var13.f259984A, "reminder_channel_id");
                                cVar2.mo124390o((CharSequence) null);
                                cVar2.f258814z.when = System.currentTimeMillis();
                                cVar2.mo124383h(string2);
                                cVar2.mo124382g((CharSequence) null);
                                cVar2.f258795g = service;
                                Notification b2 = cVar2.mo124378b();
                                a0Var13.f260014z = b2;
                                b2.icon = C0966R.C0969drawable.bmu;
                                b2.flags |= 16;
                                ((NotificationManager) a0Var13.f259984A.getSystemService("notification")).notify(99, a0Var13.f260014z);
                            }
                        } else if (i8 == 0) {
                            a0Var13.mo124631k(1, true);
                        } else if (i8 == 2) {
                            a0Var13.mo124633m();
                        }
                    } else {
                        C90461a0 a0Var14 = C90461a0.this;
                        a0Var12.f259989a = new C90482p(a0Var14.f260000l, a0Var14.f259998j, a0Var14.f259992d, a0Var14.f259996h, a0Var14.f259993e, a0Var14.f259994f, a0Var14.f259995g, a0Var14.f259991c, a0Var14.f260006r == 2);
                        C90461a0.this.mo124638q();
                    }
                }
                C90461a0 a0Var15 = C90461a0.this;
                a0Var15.mo119316f(a0Var15.f259989a);
            }
        }
    }

    /* renamed from: tg3.a0$c */
    public static final class C90464c {

        /* renamed from: a */
        public static final C90461a0 f260018a = new C90461a0((C90462a) null);
    }

    public C90461a0(C90462a aVar) {
        int i = C89625d.f257835a;
        this.f260004p = false;
        this.f260005q = false;
        this.f260007s = false;
        this.f260009u = false;
        this.f260012x = false;
        this.f260013y = null;
        this.f260014z = null;
        this.f259984A = null;
        this.f259986C = new C90494u(this);
        this.f259987D = -1;
        this.f259988E = new C90463b();
        this.f259984A = MMApplicationContext.getContext();
    }

    /* renamed from: i */
    public static void m113265i(C90461a0 a0Var, int i, int i2) {
        PendingIntent pendingIntent;
        String string = a0Var.f259984A.getString(C0966R.string.f7952xa);
        if (i < i2) {
            long j = (((long) i) * 100) / ((long) i2);
            if (j - a0Var.f259987D >= 1) {
                a0Var.f259987D = j;
                Intent intent = new Intent(a0Var.f260013y);
                intent.setClass(a0Var.f259984A, AppUpdaterUI.class);
                intent.addFlags(536870912);
                PendingIntent activity = PendingIntent.getActivity(a0Var.f259984A, 0, intent, 134217728);
                C90116e.C90121c cVar = new C90116e.C90121c(a0Var.f259984A, "reminder_channel_id");
                cVar.mo124390o((CharSequence) null);
                cVar.f258814z.when = System.currentTimeMillis();
                cVar.mo124383h(string);
                cVar.mo124382g(a0Var.f259984A.getString(C0966R.string.f7955xd) + String.valueOf(a0Var.f259987D) + "%");
                cVar.f258795g = activity;
                cVar.mo124385j(BitmapFactory.decodeResource(a0Var.f259984A.getResources(), C0966R.C0969drawable.bmu));
                cVar.f258814z.icon = C0966R.C0969drawable.c9k;
                Notification b = cVar.mo124378b();
                a0Var.f260014z = b;
                b.icon = C0966R.C0969drawable.bmu;
            } else {
                return;
            }
        } else {
            if (a0Var.f260009u) {
                String c = a0Var.f259989a.mo119308c();
                if (!(c != null && new File(c).exists())) {
                    Log.m105924i("MicroMsg.UpdaterManager", "do noting. wait for merge apk.");
                }
            }
            String string2 = a0Var.f259984A.getString(C0966R.string.f7951x9);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            FileProviderHelper.setIntentDataAndType(a0Var.f259984A, intent2, new C86009m1(a0Var.f259989a.mo119308c()), "application/vnd.android.package-archive", false);
            intent2.addFlags(536870912);
            if (Build.VERSION.SDK_INT >= 26) {
                Intent intent3 = new Intent(MMApplicationContext.getContext(), PermissionActivity.class);
                intent3.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
                intent3.setSelector(intent2);
                pendingIntent = PendingIntent.getActivity(a0Var.f259984A, 0, intent3, 134217728);
            } else {
                pendingIntent = PendingIntent.getActivity(a0Var.f259984A, 0, intent2, 134217728);
            }
            C90116e.C90121c cVar2 = new C90116e.C90121c(a0Var.f259984A, "reminder_channel_id");
            cVar2.mo124390o((CharSequence) null);
            cVar2.f258814z.when = System.currentTimeMillis();
            cVar2.mo124383h(string);
            cVar2.mo124382g(string2);
            cVar2.f258795g = pendingIntent;
            cVar2.mo124385j(BitmapFactory.decodeResource(a0Var.f259984A.getResources(), C0966R.C0969drawable.bmu));
            cVar2.f258814z.icon = C0966R.C0969drawable.c9k;
            Notification b2 = cVar2.mo124378b();
            a0Var.f260014z = b2;
            b2.icon = C0966R.C0969drawable.bmu;
            b2.flags |= 16;
        }
        if (!a0Var.f260005q) {
            ((NotificationManager) a0Var.f259984A.getSystemService("notification")).notify(99, a0Var.f260014z);
        }
    }

    /* renamed from: a */
    public void mo119312a(int i, int i2) {
        Iterator<C90498x> it = this.f259990b.iterator();
        while (it.hasNext()) {
            it.next().mo119312a(i, i2);
        }
    }

    /* renamed from: b */
    public void mo119313b() {
        Iterator<C90498x> it = this.f259990b.iterator();
        while (it.hasNext()) {
            it.next().mo119313b();
        }
    }

    /* renamed from: c */
    public void mo119314c(String str) {
        Iterator<C90498x> it = this.f259990b.iterator();
        while (it.hasNext()) {
            it.next().mo119314c(str);
        }
    }

    /* renamed from: d */
    public boolean mo124627d(Intent intent) {
        boolean n = mo124634n(intent);
        Log.m105925i("MicroMsg.UpdaterManager", "summerupdate handleCommand(Intent intent) ret need download[%b]", Boolean.valueOf(n));
        if (n) {
            mo124632l(false);
        }
        return n;
    }

    /* renamed from: e */
    public void mo119315e() {
        Iterator<C90498x> it = this.f259990b.iterator();
        while (it.hasNext()) {
            it.next().mo119315e();
        }
    }

    /* renamed from: f */
    public void mo119316f(C85705h hVar) {
        Iterator<C90498x> it = this.f259990b.iterator();
        while (it.hasNext()) {
            it.next().mo119316f(hVar);
        }
    }

    /* renamed from: g */
    public void mo119317g() {
        Iterator<C90498x> it = this.f259990b.iterator();
        while (it.hasNext()) {
            it.next().mo119317g();
        }
    }

    /* renamed from: h */
    public void mo124628h(boolean z) {
        boolean z2;
        Log.m105925i("MicroMsg.UpdaterManager", "summerupdate setNetStatChanged isWifi %s", Boolean.valueOf(z));
        C90494u uVar = this.f259986C;
        if (uVar.f260103g != z) {
            uVar.mo124665a(true);
            uVar.f260103g = z;
        }
        int i = this.f260006r;
        if (i != 2 || (z2 = this.f260012x)) {
            Log.m105925i("MicroMsg.UpdaterManager", "downloadMode %s downloading %s", Integer.valueOf(i), Boolean.valueOf(this.f260012x));
        } else if (z) {
            if (mo124634n(this.f260013y)) {
                mo124632l(true);
            }
        } else if (z2) {
            mo124630j();
        }
    }

    public boolean isBusy() {
        if (this.f260012x || System.currentTimeMillis() - this.f259985B <= UpdaterService.f249764q) {
            Log.m105925i("MicroMsg.UpdaterManager", "dont stop, because of updateManager.isDownloading() %s / updateManager.getIdleTimestamp() %s / System.currentTimeMillis() - updateManager.getIdleTimestamp() %s", Boolean.valueOf(this.f260012x), Long.valueOf(this.f259985B), Long.valueOf(System.currentTimeMillis() - this.f259985B));
            return true;
        }
        Log.m105924i("MicroMsg.UpdaterManager", "not busy");
        return false;
    }

    /* renamed from: j */
    public void mo124630j() {
        C85705h hVar = this.f259989a;
        if (hVar != null) {
            this.f260012x = false;
            hVar.cancel();
            this.f259989a = null;
            this.f259985B = System.currentTimeMillis();
            this.f259986C.mo124666b();
        }
    }

    /* renamed from: k */
    public void mo124631k(int i, boolean z) {
        this.f260005q = z;
        new MMHandler().postDelayed(new C90462a(i), 300);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo124632l(boolean r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.UpdaterManager"
            java.lang.String r4 = "download() isWifiRetry %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            r1 = 2
            java.lang.Object[] r4 = new java.lang.Object[r1]
            int r5 = r12.f260006r
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r3] = r5
            boolean r5 = r12.f260012x
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r0] = r5
            java.lang.String r5 = "summerupdate download() downloadMode %s downloading %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
            android.content.Intent r4 = r12.f260013y
            if (r4 != 0) goto L_0x0034
            java.lang.String r13 = "download() haven't handleCommand"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
            return
        L_0x0034:
            boolean r4 = r12.f260012x
            if (r4 == 0) goto L_0x003e
            java.lang.String r13 = "download() downloading, duplicate download request"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)
            return
        L_0x003e:
            java.lang.String r4 = p206nj.C88956h.m111062c()
            java.lang.String r5 = "mounted"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0077
            java.lang.String r13 = "no sdcard."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "system_config_prefs"
            android.content.SharedPreferences r13 = com.tencent.p014mm.sdk.platformtools.MultiProcessSharedPreferences.getSharedPreferences(r13, r2, r3)
            android.content.SharedPreferences$Editor r13 = r13.edit()
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r4 = 86400(0x15180, double:4.26873E-319)
            long r2 = r2 - r4
            java.lang.String r4 = "recomended_update_ignore"
            android.content.SharedPreferences$Editor r13 = r13.putLong(r4, r2)
            r13.commit()
            r12.mo124631k(r1, r0)
            r12.mo119317g()
            return
        L_0x0077:
            int r4 = r12.f260006r
            if (r4 != r1) goto L_0x0082
            if (r13 != 0) goto L_0x0082
            android.content.Context r13 = r12.f259984A
            tg3.C90499y.m113322h(r13, r3, r3)
        L_0x0082:
            java.lang.String r13 = r12.f259998j
            java.lang.String r13 = com.tencent.p014mm.sandbox.monitor.C85705h.m105861e(r13, r3)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)
            if (r13 == 0) goto L_0x00ca
            java.lang.String r4 = "update package already exist."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            r12.mo124631k(r0, r0)
            r12.mo119314c(r13)
            int r13 = r12.f260006r
            if (r13 != r1) goto L_0x00c9
            java.lang.String r13 = r12.f259998j
            java.lang.String[] r1 = tg3.C90499y.m113317c()
            if (r1 == 0) goto L_0x00b5
            int r2 = r1.length
            r4 = 0
        L_0x00a7:
            if (r4 >= r2) goto L_0x00b5
            r5 = r1[r4]
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x00b2
            goto L_0x00b6
        L_0x00b2:
            int r4 = r4 + 1
            goto L_0x00a7
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            if (r0 != 0) goto L_0x00c9
            java.lang.String r1 = r12.f259998j
            java.lang.String r2 = r12.f259999k
            java.lang.String r3 = r12.f259997i
            int r4 = r12.f260000l
            int r5 = r12.f260006r
            int r6 = r12.f259992d
            java.lang.String r7 = r12.f260008t
            tg3.C90499y.m113319e(r1, r2, r3, r4, r5, r6, r7)
        L_0x00c9:
            return
        L_0x00ca:
            boolean r13 = r12.f260007s
            if (r13 == 0) goto L_0x00dc
            com.tencent.mm.sandbox.monitor.h r13 = r12.f259989a
            if (r13 == 0) goto L_0x00d5
            r13.mo119307b()
        L_0x00d5:
            android.content.Context r13 = r12.f259984A
            r4 = 11
            tg3.C90499y.m113323i(r13, r4)
        L_0x00dc:
            boolean r13 = r12.f260007s
            if (r13 != 0) goto L_0x0144
            boolean r13 = r12.f260004p
            if (r13 == 0) goto L_0x0144
            vg.h r13 = r12.f260002n
            if (r13 == 0) goto L_0x0144
            vg.h$a r13 = r12.f260003o
            if (r13 == 0) goto L_0x0144
            java.lang.String r13 = "Incresment Update"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)
            android.content.Context r13 = r12.f259984A
            r2 = 5
            tg3.C90499y.m113323i(r13, r2)
            int r13 = r12.f260000l
            vg.h$a r2 = r12.f260003o
            int r2 = r2.f260746e
            int r13 = r13 + r2
            long r4 = (long) r13
            boolean r13 = p206nj.C88955f.m111059c(r4)
            if (r13 != 0) goto L_0x0109
            r12.mo124635o()
            return
        L_0x0109:
            r12.mo124630j()
            tg3.q r13 = new tg3.q
            vg.h$a r2 = r12.f260003o
            int r5 = r2.f260746e
            java.lang.String r6 = r12.f259998j
            int r7 = r12.f259992d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            vg.h r4 = r12.f260002n
            java.lang.String r4 = r4.f300886a
            r2.append(r4)
            vg.h$a r4 = r12.f260003o
            java.lang.String r4 = r4.f260745d
            r2.append(r4)
            java.lang.String r8 = r2.toString()
            vg.h$a r2 = r12.f260003o
            java.lang.String r9 = r2.f260744c
            java.lang.String r10 = r2.f260743b
            int r2 = r12.f260006r
            if (r2 != r1) goto L_0x0139
            r11 = 1
            goto L_0x013a
        L_0x0139:
            r11 = 0
        L_0x013a:
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r12.f259989a = r13
            r12.mo124638q()
            goto L_0x0159
        L_0x0144:
            int r13 = r12.f260000l
            long r0 = (long) r13
            boolean r13 = p206nj.C88955f.m111059c(r0)
            if (r13 != 0) goto L_0x0156
            java.lang.String r13 = "SDCard is full"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
            r12.mo124635o()
            return
        L_0x0156:
            r12.mo124633m()
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tg3.C90461a0.mo124632l(boolean):void");
    }

    /* renamed from: m */
    public final void mo124633m() {
        mo124630j();
        Log.m105924i("MicroMsg.UpdaterManager", "downloadFullPack");
        C90499y.m113323i(this.f259984A, 7);
        String[] strArr = this.f260001m;
        if (strArr == null || strArr.length <= 0) {
            this.f259989a = new C90482p(this.f260000l, this.f259998j, this.f259992d, this.f259996h, this.f259993e, this.f259994f, this.f259995g, this.f259991c, this.f260006r == 2);
            C115669n.INSTANCE.idkeyStat(405, 77, 1, true);
        } else {
            this.f259989a = new C90485q(this.f260000l, this.f259998j, this.f259992d, this.f260001m, this.f260006r == 2);
            C115669n.INSTANCE.idkeyStat(405, 76, 1, true);
        }
        mo124638q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01f9, code lost:
        if (com.tencent.p014mm.sandbox.monitor.C85706i.m105867c(com.tencent.p014mm.sandbox.monitor.C85705h.f249722f + r7 + ".temp") != false) goto L_0x01fb;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo124634n(android.content.Intent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "MicroMsg.UpdaterManager"
            java.lang.String r3 = "handleCommand(Intent intent)"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r3 = 0
            if (r1 != 0) goto L_0x0014
            java.lang.String r1 = "intent == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return r3
        L_0x0014:
            r4 = 3
            java.lang.String r5 = "intent_update_type"
            int r4 = r1.getIntExtra(r5, r4)
            java.lang.String r5 = "intent_extra_download_mode"
            r6 = 1
            int r5 = r1.getIntExtra(r5, r6)
            java.lang.String r7 = "intent_extra_md5"
            java.lang.String r7 = r1.getStringExtra(r7)
            boolean r8 = r0.f260012x
            r9 = 2
            if (r8 == 0) goto L_0x003d
            java.lang.String r8 = r0.f259998j
            boolean r8 = r7.equalsIgnoreCase(r8)
            if (r8 != 0) goto L_0x003d
            int r8 = r0.f260006r
            if (r8 != r9) goto L_0x003d
            r17.mo124630j()
            goto L_0x0047
        L_0x003d:
            boolean r8 = r0.f260012x
            if (r8 == 0) goto L_0x0047
            java.lang.String r1 = "downloading, duplicate download request"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return r6
        L_0x0047:
            tg3.C90499y.m113321g()
            r17.mo124637p()
            r0.f260013y = r1
            java.lang.String r8 = "intent_extra_updateMode"
            int r8 = r1.getIntExtra(r8, r3)
            r0.f260010v = r8
            java.lang.String r8 = "intent_extra_marketUrl"
            java.lang.String r8 = r1.getStringExtra(r8)
            r0.f260011w = r8
            java.lang.String r8 = "intent_short_ips"
            java.lang.String[] r8 = r1.getStringArrayExtra(r8)
            r0.f259991c = r8
            int r8 = qe3.C89625d.f257841g
            java.lang.String r10 = "intent_client_version"
            int r8 = r1.getIntExtra(r10, r8)
            qe3.C89625d.f257841g = r8
            r0.f259992d = r4
            java.lang.String r8 = "intent_extra_session"
            byte[] r8 = r1.getByteArrayExtra(r8)
            r0.f259993e = r8
            java.lang.String r8 = "intent_extra_cookie"
            byte[] r8 = r1.getByteArrayExtra(r8)
            r0.f259994f = r8
            java.lang.String r8 = "intent_extra_ecdhkey"
            byte[] r8 = r1.getByteArrayExtra(r8)
            r0.f259995g = r8
            java.lang.String r8 = "intent_extra_uin"
            int r8 = r1.getIntExtra(r8, r3)
            r0.f259996h = r8
            r0.f259998j = r7
            java.lang.String r8 = "intent_extra_desc"
            java.lang.String r8 = r1.getStringExtra(r8)
            r0.f259997i = r8
            java.lang.String r8 = "intent_extra_size"
            int r8 = r1.getIntExtra(r8, r3)
            r0.f260000l = r8
            java.lang.String r8 = "intent_extra_download_url"
            java.lang.String[] r8 = r1.getStringArrayExtra(r8)
            r0.f260001m = r8
            r0.f260006r = r5
            java.lang.String r8 = "intent_extra_force_download_full"
            boolean r8 = r1.getBooleanExtra(r8, r3)
            r0.f260007s = r8
            java.lang.String r8 = "intent_extra_patchInfo"
            java.lang.String r8 = r1.getStringExtra(r8)
            if (r8 == 0) goto L_0x00cb
            java.lang.String r10 = "patchXml != null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            vg.h r8 = p1054vg.C102189h.m134650b(r8)
            r0.f260002n = r8
        L_0x00cb:
            java.lang.String r8 = "intent_extra_extinfo"
            java.lang.String r8 = r1.getStringExtra(r8)
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r3] = r8
            java.lang.String r11 = "summerupdate extInfo[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r11, r10)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r10 != 0) goto L_0x00fc
            r10 = 0
            java.lang.String r11 = "extinfo"
            java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r8, r11, r10)
            java.lang.String r10 = ".extinfo.notautodownloadrange"
            java.lang.Object r8 = r8.get(r10)
            java.lang.String r8 = (java.lang.String) r8
            r0.f260008t = r8
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r3] = r8
            java.lang.String r8 = "summerupdate notAutoDownloadRange[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r10)
        L_0x00fc:
            java.lang.Object[] r8 = new java.lang.Object[r9]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r8[r3] = r10
            boolean r10 = r0.f260012x
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r8[r6] = r10
            java.lang.String r10 = "summerupdate handleCommand() downloadMode %s downloading %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r8)
            r8 = 999(0x3e7, float:1.4E-42)
            if (r4 != r8) goto L_0x0125
            java.lang.String[] r8 = r0.f260001m
            if (r8 == 0) goto L_0x0125
            int r8 = r8.length
            if (r8 <= 0) goto L_0x0125
            if (r5 != r9) goto L_0x0124
            java.lang.String r1 = "error! DOWNLOAD_MODE_SLIENCE download don't go here! we must process it before start download"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
        L_0x0124:
            return r6
        L_0x0125:
            java.lang.String[] r5 = r0.f260001m
            if (r5 == 0) goto L_0x0146
            int r8 = r5.length
            r10 = 0
        L_0x012b:
            if (r10 >= r8) goto L_0x0146
            r11 = r5[r10]
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "download url : "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)
            int r10 = r10 + 1
            goto L_0x012b
        L_0x0146:
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r5[r3] = r7
            int r8 = r0.f260000l
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r6] = r8
            java.lang.String r8 = "md5 = %s , size = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r5)
            if (r7 == 0) goto L_0x0220
            int r5 = r0.f260000l
            if (r5 != 0) goto L_0x015f
            goto L_0x0220
        L_0x015f:
            if (r4 != r9) goto L_0x0185
            java.lang.String r4 = r0.f260008t
            boolean r4 = xb0.C38471b.m41885a(r4)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            r5[r3] = r8
            java.lang.String r8 = "summerupdate handleCommandWithoutDownload recommended control[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r5)
            if (r4 == 0) goto L_0x0185
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 405(0x195, double:2.0E-321)
            r12 = 78
            r14 = 1
            r16 = 1
            r9.idkeyStat(r10, r12, r14, r16)
            return r3
        L_0x0185:
            vg.h r4 = r0.f260002n
            if (r4 == 0) goto L_0x01c2
            java.lang.String r4 = "patchInfo != null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            android.content.Context r4 = r0.f259984A
            java.lang.String r4 = com.tencent.p014mm.pluginsdk.platformtools.C6666h.m6946a(r4)
            vg.h r5 = r0.f260002n
            vg.h$a r5 = r5.mo141732a(r4)
            r0.f260003o = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "increase apkMD5 = "
            r5.append(r8)
            r5.append(r4)
            java.lang.String r4 = " : "
            r5.append(r4)
            vg.h$a r4 = r0.f260003o
            if (r4 != 0) goto L_0x01b6
            java.lang.String r4 = "not match"
            goto L_0x01b8
        L_0x01b6:
            java.lang.String r4 = "match"
        L_0x01b8:
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
        L_0x01c2:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            boolean r5 = r0.f260007s
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r3] = r5
            java.lang.String r5 = "forceDownloadFull : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
            java.lang.String r4 = "intent_extra_tinker_patch"
            boolean r1 = r1.getBooleanExtra(r4, r3)
            r0.f260009u = r1
            vg.h$a r1 = r0.f260003o
            if (r1 == 0) goto L_0x01fb
            java.lang.String r1 = com.tencent.p014mm.sandbox.monitor.C85705h.f249722f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = com.tencent.p014mm.sandbox.monitor.C85705h.f249722f
            r1.append(r3)
            r1.append(r7)
            java.lang.String r3 = ".temp"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            boolean r1 = com.tencent.p014mm.sandbox.monitor.C85706i.m105867c(r1)
            if (r1 == 0) goto L_0x01ff
        L_0x01fb:
            boolean r1 = r0.f260009u
            if (r1 == 0) goto L_0x0207
        L_0x01ff:
            java.lang.String r1 = "isIncresmentUpdate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r0.f260004p = r6
            goto L_0x020c
        L_0x0207:
            java.lang.String r1 = "had try to download full pack."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x020c:
            java.lang.String r1 = tg3.C90499y.m113316b()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x021f
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x021f
            tg3.C90499y.m113315a()
        L_0x021f:
            return r6
        L_0x0220:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tg3.C90461a0.mo124634n(android.content.Intent):boolean");
    }

    /* renamed from: o */
    public final void mo124635o() {
        MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "system_config_prefs", 0).edit().putLong("recomended_update_ignore", Util.nowSecond() - 86400).commit();
        mo124631k(2, true);
        mo119315e();
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.UpdaterManager", "onDestroy");
        if (!this.f260012x) {
            mo124637p();
            mo124631k(1, true);
        }
    }

    /* renamed from: p */
    public void mo124637p() {
        mo124630j();
        this.f260010v = 0;
        this.f260011w = null;
        this.f259991c = null;
        int i = C89625d.f257835a;
        this.f259992d = 0;
        this.f259993e = null;
        this.f259994f = null;
        this.f259995g = null;
        this.f259996h = 0;
        this.f259998j = null;
        this.f260000l = 0;
        this.f259997i = null;
        this.f260001m = null;
        this.f260002n = null;
        this.f260003o = null;
        this.f260004p = false;
        this.f260005q = false;
        this.f260006r = 0;
        this.f260007s = false;
        this.f260013y = null;
        this.f260012x = false;
        this.f260014z = null;
        this.f259987D = 0;
    }

    /* renamed from: q */
    public final void mo124638q() {
        boolean z;
        if (this.f260006r != 2 || NetStatusUtil.isWifi(this.f259984A)) {
            if (this.f260006r == 2) {
                String str = this.f259998j;
                long j = MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "update_flowstat_prefs", 4).getLong(str, 0);
                Log.m105925i("MicroMsg.UpdateUtil", "getPackFlowStat pack %s, flow %s", str, Long.valueOf(j));
                if (j > C90494u.f260096h) {
                    Log.m105920e("MicroMsg.TrafficStatistic", "overTrafficAlertLine reach traffic alert line!");
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Log.m105920e("MicroMsg.UpdaterManager", "the traffice is overload, not download anymore in silence mode!");
                    this.f259986C.mo124666b();
                    return;
                }
            }
            C90494u uVar = this.f259986C;
            String str2 = this.f259998j;
            int i = this.f260000l;
            uVar.getClass();
            if (!Util.isNullOrNil(str2)) {
                if (!str2.equals(uVar.f260100d)) {
                    uVar.mo124666b();
                }
                Log.m105924i("MicroMsg.TrafficStatistic", "pack size: " + i);
                Log.m105925i("MicroMsg.TrafficStatistic", "TRAFFIC_ALERT_LINE before : %s", Long.valueOf(C90494u.f260096h));
                long max = Math.max((long) (i * 4), C90494u.f260096h);
                C90494u.f260096h = max;
                long min = Math.min(314572800, max);
                C90494u.f260096h = min;
                Log.m105925i("MicroMsg.TrafficStatistic", "TRAFFIC_ALERT_LINE after : %s", Long.valueOf(min));
                if (!uVar.f260101e) {
                    Context context = uVar.f260102f.f259984A;
                    if (context != null) {
                        uVar.f260103g = NetStatusUtil.isWifi(context);
                    }
                    uVar.f260097a.startTimer(30000);
                    uVar.f260101e = true;
                    uVar.f260100d = str2;
                }
            }
            if (this.f259989a != null) {
                mo124631k(1, false);
                this.f260012x = true;
                this.f259989a.mo124300a(this.f259988E);
                mo119313b();
                if (this.f260006r == 2) {
                    C90499y.m113318d();
                    return;
                }
                return;
            }
            return;
        }
        C90499y.m113318d();
        Log.m105924i("MicroMsg.UpdaterManager", "we stop download, when silence and not wifi!");
    }
}
