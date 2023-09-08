package com.tencent.p014mm.plugin.backup.backuppcui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelsimple.C40359h0;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72986n2;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.wcdb.support.CancellationSignal;
import di3.C86312j;
import eb0.C75604z3;
import ev0.C20612a;
import ev0.C20615b;
import ev0.C20625e;
import ev0.C20633g;
import f40.C86709a0;
import f62.C75700k0;
import fv0.C107581d;
import fv0.C107582f;
import fv0.C107583h;
import fv0.C107584i;
import fv0.C107586j;
import fv0.C107587k;
import fv0.C107589l;
import fv0.C107590m;
import fv0.C107591o;
import fv0.C20720a;
import fv0.C20721b;
import fv0.C20722g;
import fv0.C20724s;
import fv0.C20726v;
import fv0.C8208c;
import fv0.C8209e;
import fv0.C8210n;
import fv0.C8211p;
import fv0.C8212r;
import fv0.C98044q;
import fy3.C32224a;
import gv0.C20842c;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import my3.C61593h;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import p154fy.C87121j;
import p214om.C11502f;
import p278yh.C23309e;
import qo3.C77407n;
import qv0.C101304e;
import qv0.C22133b;
import rx3.C13598b0;
import sf0.C77702q0;
import sx3.C110818d0;
import yu0.C102911g;
import yu0.C102912i;
import yu0.C102913k;
import yu0.C23366d;
import yu0.C39174j;
import zt3.C119157j;
import zt3.C119179t;
import zu0.d$$d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI;", "Lcom/tencent/mm/ui/MMWizardActivity;", "Lzu0/d$$d;", "Lyu0/d;", "<init>", "()V", "a", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupMigratePCUI */
public final class BackupMigratePCUI extends MMWizardActivity implements d$$d, C23366d {

    /* renamed from: o */
    public static final C18119a f50079o = new C18119a((C8480h) null);

    /* renamed from: e */
    public C23309e f50080e;

    /* renamed from: f */
    public boolean f50081f;

    /* renamed from: g */
    public boolean f50082g;

    /* renamed from: h */
    public boolean f50083h;

    /* renamed from: i */
    public int f50084i;

    /* renamed from: j */
    public long f50085j;

    /* renamed from: n */
    public final Handler f50086n = new Handler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupMigratePCUI$h */
    public static final class C2063h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BackupMigratePCUI f12011d;

        public C2063h(BackupMigratePCUI backupMigratePCUI) {
            this.f12011d = backupMigratePCUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$updateUIState$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BackupMigratePCUI backupMigratePCUI = this.f12011d;
            C18119a aVar = BackupMigratePCUI.f50079o;
            backupMigratePCUI.getClass();
            Log.m105924i("MicroMsg.BackupPcUI", "jumpToNetworkDisconnectDoc.");
            Intent intent = new Intent();
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, backupMigratePCUI.getString(C0966R.string.ad9));
            intent.putExtra("rawUrl", backupMigratePCUI.getString(C0966R.string.ad8, new Object[]{LocaleUtil.getApplicationLanguage()}));
            intent.putExtra("showShare", false);
            intent.putExtra("neverGetA8Key", true);
            C88144b.m109791i(backupMigratePCUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$updateUIState$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupMigratePCUI$e */
    public static final class C18116e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BackupMigratePCUI f50087d;

        public C18116e(BackupMigratePCUI backupMigratePCUI) {
            this.f50087d = backupMigratePCUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$showCancelBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BackupMigratePCUI backupMigratePCUI = this.f50087d;
            backupMigratePCUI.mo22695O7().f58032i = false;
            backupMigratePCUI.mo22697Q7().mo142628f(100);
            C20612a.m22480i().mo32273h().mo37036e();
            C20612a.m22480i().mo32276l().mo32307e(true);
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71215V9("weixin", 19);
            this.f50087d.mo7681K7(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$showCancelBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupMigratePCUI$f */
    public static final class C18117f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BackupMigratePCUI f50088d;

        public C18117f(BackupMigratePCUI backupMigratePCUI) {
            this.f50088d = backupMigratePCUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$updateProgress$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BackupMigratePCUI backupMigratePCUI = this.f50088d;
            C18119a aVar = BackupMigratePCUI.f50079o;
            backupMigratePCUI.mo22695O7();
            C40359h0.m43530l1("weixin", 20);
            this.f50088d.mo22695O7().mo32287k();
            C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI$updateProgress$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupMigratePCUI$g */
    public static final class C18118g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BackupMigratePCUI f50089d;

        public C18118g(BackupMigratePCUI backupMigratePCUI) {
            this.f50089d = backupMigratePCUI;
        }

        public final void run() {
            BackupMigratePCUI backupMigratePCUI = this.f50089d;
            C18119a aVar = BackupMigratePCUI.f50079o;
            if (1 == backupMigratePCUI.mo22697Q7().mo142623a() || 12 == this.f50089d.mo22697Q7().mo142623a()) {
                this.f50089d.mo22715i8(-1);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupMigratePCUI$a */
    public static final class C18119a {
        public C18119a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo22722a(int i, int i2, int i3, int i4) {
            C115669n.INSTANCE.mo160131h(11789, 0, 0, Integer.valueOf(i4), 0, 0, Integer.valueOf(i), 0, Integer.valueOf(i3), Integer.valueOf(i2), 0, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupMigratePCUI$b */
    public static final class C18120b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C18120b f50090d = new C18120b();

        public C18120b() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupMigratePCUI$c */
    public static final class C18121c implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ BackupMigratePCUI f50091d;

        /* renamed from: e */
        public final /* synthetic */ int f50092e;

        public C18121c(BackupMigratePCUI backupMigratePCUI, int i) {
            this.f50091d = backupMigratePCUI;
            this.f50092e = i;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107140d(1, this.f50091d.getResources().getColor(C0966R.color.a_3), this.f50091d.getString(this.f50092e));
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupMigratePCUI$d */
    public static final class C18122d implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f50093d;

        public C18122d(C32224a<C13598b0> aVar) {
            this.f50093d = aVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                this.f50093d.invoke();
            }
        }
    }

    /* renamed from: K */
    public void mo17667K(int i) {
        mo22715i8(i);
    }

    /* renamed from: N1 */
    public void mo22649N1(LinkedList<C102912i> linkedList) {
    }

    /* renamed from: N7 */
    public final C101304e mo22694N7() {
        C101304e m = C20612a.m22480i().mo32277m();
        C87412m.m108593f(m, "getBackupPcModel().moveChooseServer");
        return m;
    }

    /* renamed from: O7 */
    public final C20615b mo22695O7() {
        C20615b j = C20612a.m22480i().mo32274j();
        C87412m.m108593f(j, "getBackupPcModel().backupPcProcessMgr");
        return j;
    }

    /* renamed from: P */
    public void mo17668P() {
    }

    /* renamed from: P7 */
    public final void mo22696P7() {
        mo22697Q7().mo142628f(12);
        mo22715i8(12);
        int i = C20612a.m22482o().f58030g;
        if (i == 100) {
            C40359h0.m43530l1("weixin", 17);
        } else if (i == 101) {
            C40359h0.m43530l1("weixin", 18);
        } else {
            C40359h0.m43530l1("weixin", 17);
        }
    }

    /* renamed from: Q7 */
    public final C102911g mo22697Q7() {
        C102911g e = C20612a.m22480i().mo142622e();
        C87412m.m108593f(e, "getBackupPcModel().parameters");
        return e;
    }

    /* renamed from: R7 */
    public final C20625e mo22698R7() {
        C20625e k = C20612a.m22480i().mo32275k();
        C87412m.m108593f(k, "getBackupPcModel().backupPcRecoverServer");
        return k;
    }

    /* renamed from: S7 */
    public final void mo22699S7() {
        C20612a.m22480i().mo32273h().mo37036e();
        mo22698R7().mo32292b(true, true, -100);
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71215V9("weixin", 19);
        mo7681K7(1);
    }

    /* renamed from: T4 */
    public void mo22650T4(LinkedList<C102912i> linkedList) {
        String w = C102913k.m136058w((float) mo22694N7().mo140768e());
        C87412m.m108593f(w, "getLengthStr(totalSize)");
        mo22717k8(C0966R.string.aek, getString(C0966R.string.mjp, new Object[]{w}));
        C23309e eVar = this.f50080e;
        if (eVar != null) {
            eVar.mo36788o().setVisibility(0);
            C23309e eVar2 = this.f50080e;
            if (eVar2 != null) {
                eVar2.mo36787n().setEnabled(true);
                C23309e eVar3 = this.f50080e;
                if (eVar3 != null) {
                    eVar3.mo36776c().setEnabled(true);
                } else {
                    C87412m.m108603p("vb");
                    throw null;
                }
            } else {
                C87412m.m108603p("vb");
                throw null;
            }
        } else {
            C87412m.m108603p("vb");
            throw null;
        }
    }

    /* renamed from: T7 */
    public final void mo22700T7() {
        C23309e eVar = this.f50080e;
        if (eVar != null) {
            if (eVar.f67004m == null) {
                eVar.f67004m = (TextView) eVar.f66992a.findViewById(C0966R.C0970id.kpm);
            }
            eVar.f67004m.setText(C0966R.string.f360141ac1);
            C23309e eVar2 = this.f50080e;
            if (eVar2 != null) {
                eVar2.mo36781h().setVisibility(8);
                C23309e eVar3 = this.f50080e;
                if (eVar3 != null) {
                    eVar3.mo36777d().setVisibility(8);
                    C23309e eVar4 = this.f50080e;
                    if (eVar4 != null) {
                        eVar4.mo36780g().setVisibility(8);
                        C23309e eVar5 = this.f50080e;
                        if (eVar5 != null) {
                            eVar5.mo36774a().setVisibility(8);
                            C23309e eVar6 = this.f50080e;
                            if (eVar6 != null) {
                                eVar6.mo36775b().setVisibility(8);
                                C23309e eVar7 = this.f50080e;
                                if (eVar7 != null) {
                                    eVar7.mo36782i().setVisibility(8);
                                    C23309e eVar8 = this.f50080e;
                                    if (eVar8 != null) {
                                        eVar8.mo36786m().setVisibility(8);
                                        C23309e eVar9 = this.f50080e;
                                        if (eVar9 != null) {
                                            eVar9.mo36788o().setVisibility(8);
                                            C23309e eVar10 = this.f50080e;
                                            if (eVar10 != null) {
                                                eVar10.mo36784k().setVisibility(8);
                                                C23309e eVar11 = this.f50080e;
                                                if (eVar11 != null) {
                                                    eVar11.mo36779f().setVisibility(8);
                                                    C23309e eVar12 = this.f50080e;
                                                    if (eVar12 != null) {
                                                        eVar12.mo36778e().setVisibility(8);
                                                        C23309e eVar13 = this.f50080e;
                                                        if (eVar13 != null) {
                                                            eVar13.mo36780g().setVisibility(8);
                                                        } else {
                                                            C87412m.m108603p("vb");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C87412m.m108603p("vb");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("vb");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("vb");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("vb");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("vb");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("vb");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("vb");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("vb");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("vb");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("vb");
                    throw null;
                }
            } else {
                C87412m.m108603p("vb");
                throw null;
            }
        } else {
            C87412m.m108603p("vb");
            throw null;
        }
    }

    /* renamed from: U7 */
    public final void mo22701U7(TextView textView) {
        C87412m.m108594g(textView, "btn");
        textView.setBackground(getDrawable(C0966R.C0969drawable.f4653j6));
        textView.setTextColor(getResources().getColor(C0966R.color.al_));
    }

    /* renamed from: V7 */
    public final void mo22702V7(int i, int i2, int i3, int i4) {
        C23309e eVar = this.f50080e;
        if (eVar != null) {
            eVar.mo36778e().getLayoutParams().width = C76577a.m92151b(getContext(), i2);
            C23309e eVar2 = this.f50080e;
            if (eVar2 != null) {
                eVar2.mo36778e().getLayoutParams().height = C76577a.m92151b(getContext(), i3);
                if (i4 > 0) {
                    C23309e eVar3 = this.f50080e;
                    if (eVar3 != null) {
                        eVar3.mo36778e().setIconColor(getResources().getColor(i4));
                    } else {
                        C87412m.m108603p("vb");
                        throw null;
                    }
                } else {
                    C23309e eVar4 = this.f50080e;
                    if (eVar4 != null) {
                        eVar4.mo36778e().setIconColor(getResources().getColor(C0966R.color.f3133gi));
                    } else {
                        C87412m.m108603p("vb");
                        throw null;
                    }
                }
                C23309e eVar5 = this.f50080e;
                if (eVar5 != null) {
                    eVar5.mo36778e().setImageResource(i);
                    C23309e eVar6 = this.f50080e;
                    if (eVar6 != null) {
                        eVar6.mo36778e().setVisibility(0);
                    } else {
                        C87412m.m108603p("vb");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("vb");
                    throw null;
                }
            } else {
                C87412m.m108603p("vb");
                throw null;
            }
        } else {
            C87412m.m108603p("vb");
            throw null;
        }
    }

    /* renamed from: W7 */
    public final void mo22703W7(TextView textView) {
        C87412m.m108594g(textView, "btn");
        textView.setBackground(getDrawable(C0966R.C0969drawable.ax5));
        textView.setTextColor(getResources().getColor(C0966R.color.a1d));
    }

    /* renamed from: X7 */
    public final void mo22704X7(TextView textView) {
        C87412m.m108594g(textView, "btn");
        textView.setBackground(getDrawable(C0966R.C0969drawable.f4665jf));
        textView.setTextColor(getResources().getColor(C0966R.color.f3131gg));
    }

    /* renamed from: Y7 */
    public final void mo22705Y7(int i, int i2, C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        C77407n nVar = new C77407n((Context) getContext(), 1, true);
        nVar.f225771i = new C18121c(this, i2);
        nVar.f225782p = new C18122d(aVar);
        nVar.mo107568m(getString(i), 17, 0);
        nVar.mo107573q();
    }

    /* renamed from: Z7 */
    public final void mo22706Z7() {
        C23309e eVar = this.f50080e;
        if (eVar != null) {
            eVar.mo36784k().setVisibility(0);
            C23309e eVar2 = this.f50080e;
            if (eVar2 != null) {
                eVar2.mo36783j().setText(C0966R.string.a_u);
                C23309e eVar3 = this.f50080e;
                if (eVar3 != null) {
                    eVar3.mo36783j().setOnClickListener(new C18116e(this));
                } else {
                    C87412m.m108603p("vb");
                    throw null;
                }
            } else {
                C87412m.m108603p("vb");
                throw null;
            }
        } else {
            C87412m.m108603p("vb");
            throw null;
        }
    }

    /* renamed from: a8 */
    public final void mo22707a8(boolean z) {
        C23309e eVar = this.f50080e;
        if (eVar != null) {
            eVar.mo36781h().setVisibility(0);
            if (z) {
                C23309e eVar2 = this.f50080e;
                if (eVar2 != null) {
                    Button h = eVar2.mo36781h();
                    C87412m.m108593f(h, "vb.mini");
                    mo22701U7(h);
                    return;
                }
                C87412m.m108603p("vb");
                throw null;
            }
            C23309e eVar3 = this.f50080e;
            if (eVar3 != null) {
                Button h2 = eVar3.mo36781h();
                C87412m.m108593f(h2, "vb.mini");
                mo22703W7(h2);
                return;
            }
            C87412m.m108603p("vb");
            throw null;
        }
        C87412m.m108603p("vb");
        throw null;
    }

    /* renamed from: b8 */
    public final void mo22708b8() {
        if (mo22695O7().f58030g == 101) {
            mo22702V7(C0966R.raw.icons_outlined_move_pc_to_cellphone, 192, 80, 0);
        } else {
            mo22702V7(C0966R.raw.icons_outlined_move_to_computer, 192, 80, 0);
        }
    }

    /* renamed from: c8 */
    public final void mo22709c8() {
        Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI");
        C87412m.m108593f(className, "Intent().setClassName(MM…encent.mm.ui.LauncherUI\")");
        className.addFlags(67108864);
        className.putExtra("nofification_type", "back_to_pc_collapse_notification");
        C9556a aVar = new C9556a();
        aVar.mo10233c(className);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI", "startLauncherUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/backup/backuppcui/BackupMigratePCUI", "startLauncherUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    /* renamed from: d8 */
    public final void mo22710d8() {
        if (mo22698R7().mo32295e() || mo22698R7().mo32295e()) {
            this.f50085j = System.currentTimeMillis();
            mo22698R7().mo32298h();
            long j = C20842c.f58882p.f58942d / ((long) 1024);
            int milliSecondsToNow = (int) Util.milliSecondsToNow(this.f50085j);
            f50079o.mo22722a(105, milliSecondsToNow, (int) j, (int) (j / ((long) milliSecondsToNow)));
            return;
        }
        mo22697Q7().mo142628f(27);
        mo22715i8(27);
    }

    /* renamed from: e8 */
    public final void mo22711e8() {
        C20612a.m22480i().mo32273h().mo37036e();
        C20612a.m22480i().mo32276l().mo32307e(true);
        mo22697Q7().mo142628f(-100);
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71215V9("weixin", 19);
        mo7681K7(1);
    }

    /* renamed from: f8 */
    public final void mo22712f8() {
        this.f50081f = true;
        C20612a.m22480i().mo32273h().mo37036e();
        C20612a.m22480i().mo32276l().mo32307e(true);
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71215V9("weixin", 19);
        C20612a.m22483p(24);
    }

    /* renamed from: g1 */
    public void mo22651g1(LinkedList<C102912i> linkedList, C102912i iVar, int i) {
    }

    /* renamed from: g6 */
    public void mo22713g6() {
        int i = mo22695O7().f58024a;
        if (i == 1) {
            mo22697Q7().mo142628f(11);
            mo22715i8(11);
        } else if (i == 2) {
            mo22697Q7().mo142628f(21);
            mo22715i8(21);
        } else if (i == 3) {
            mo22697Q7().mo142628f(12);
            mo22715i8(12);
        } else if (i == 4) {
            mo22697Q7().mo142628f(22);
            mo22715i8(22);
        }
    }

    /* renamed from: g8 */
    public final void mo22714g8(int i, String str) {
        C87412m.m108594g(str, TPReportKeys.Common.COMMON_NETWORK_SPEED);
        C23309e eVar = this.f50080e;
        if (eVar != null) {
            eVar.mo36774a().setVisibility(0);
            C23309e eVar2 = this.f50080e;
            if (eVar2 != null) {
                eVar2.mo36774a().setProgress(i);
                C23309e eVar3 = this.f50080e;
                if (eVar3 != null) {
                    eVar3.mo36774a().setProgressDrawable(getResources().getDrawable(C0966R.C0969drawable.cj_));
                    C23309e eVar4 = this.f50080e;
                    if (eVar4 != null) {
                        eVar4.mo36775b().setVisibility(0);
                        C23309e eVar5 = this.f50080e;
                        if (eVar5 != null) {
                            eVar5.mo36775b().setText(str);
                            C23309e eVar6 = this.f50080e;
                            if (eVar6 != null) {
                                eVar6.mo36784k().setVisibility(0);
                                C23309e eVar7 = this.f50080e;
                                if (eVar7 != null) {
                                    eVar7.mo36783j().setText(C0966R.string.mkh);
                                    C23309e eVar8 = this.f50080e;
                                    if (eVar8 != null) {
                                        eVar8.mo36783j().setOnClickListener(new C18117f(this));
                                    } else {
                                        C87412m.m108603p("vb");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("vb");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("vb");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("vb");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("vb");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("vb");
                    throw null;
                }
            } else {
                C87412m.m108603p("vb");
                throw null;
            }
        } else {
            C87412m.m108603p("vb");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cxg;
    }

    /* renamed from: i8 */
    public final void mo22715i8(int i) {
        int i2 = i;
        Log.m105925i("MicroMsg.BackupMigratePCUI", "backupState:%d, isInitData:%b", Integer.valueOf(i), Boolean.valueOf(this.f50082g));
        if (i2 == -100) {
            mo7681K7(1);
            mo22697Q7().mo142628f(100);
        } else if (i2 != -25) {
            if (i2 != -13) {
                if (i2 != 1) {
                    if (i2 != 100) {
                        if (i2 != -5) {
                            if (i2 != -4) {
                                if (i2 != -3) {
                                    if (!(i2 == -2 || i2 == -1)) {
                                        int i3 = 4;
                                        if (i2 != 4) {
                                            if (i2 != 5) {
                                                if (i2 == 11) {
                                                    this.f50085j = System.currentTimeMillis();
                                                    mo22695O7().mo32281e(mo22695O7().mo32283g());
                                                    mo22697Q7().mo142628f(12);
                                                    mo22715i8(12);
                                                    C20612a.m22480i().mo32276l().mo17698b(C102913k.m136056u(mo22694N7().mo140769f()));
                                                    C20633g l = C20612a.m22480i().mo32276l();
                                                    LinkedList<C102912i> f = mo22694N7().mo140769f();
                                                    C87412m.m108591d(f);
                                                    l.mo32305c((long) f.size());
                                                    if (mo22695O7().f58030g == 100) {
                                                        C22133b.m25607b(C22133b.f62617a, 2, 1, (String) null, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, 252, (Object) null);
                                                    } else {
                                                        C22133b.m25607b(C22133b.f62617a, 3, 1, (String) null, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, 252, (Object) null);
                                                    }
                                                } else if (i2 != 12) {
                                                    if (i2 != 14) {
                                                        if (i2 == 15) {
                                                            C22133b.m25607b(C22133b.f62617a, 2, 3, (String) null, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, 252, (Object) null);
                                                            mo22700T7();
                                                            mo22716j8(C0966R.string.mki, C0966R.string.mkj);
                                                            mo22718q();
                                                            long milliSecondsToNow = Util.milliSecondsToNow(this.f50085j);
                                                            long j = C20842c.f58882p.f58943e / ((long) 1024);
                                                            f50079o.mo22722a(104, (int) milliSecondsToNow, (int) j, (int) (j / milliSecondsToNow));
                                                        } else if (i2 != 30) {
                                                            if (i2 != 31) {
                                                                switch (i2) {
                                                                    case -23:
                                                                        mo22700T7();
                                                                        mo22702V7(C0966R.raw.icons_outlined_error, 80, 80, C0966R.color.f2966ao);
                                                                        mo22717k8(C0966R.string.acr, (String) null);
                                                                        C23309e eVar = this.f50080e;
                                                                        if (eVar != null) {
                                                                            eVar.mo36779f().setVisibility(0);
                                                                            C23309e eVar2 = this.f50080e;
                                                                            if (eVar2 != null) {
                                                                                Button f2 = eVar2.mo36779f();
                                                                                C87412m.m108593f(f2, "vb.knowBtn");
                                                                                mo22704X7(f2);
                                                                                C23309e eVar3 = this.f50080e;
                                                                                if (eVar3 != null) {
                                                                                    eVar3.mo36779f().setOnClickListener(new C8209e(this));
                                                                                    break;
                                                                                } else {
                                                                                    C87412m.m108603p("vb");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                C87412m.m108603p("vb");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            C87412m.m108603p("vb");
                                                                            throw null;
                                                                        }
                                                                    case -22:
                                                                        mo22700T7();
                                                                        mo22702V7(C0966R.raw.icons_outlined_error, 80, 80, C0966R.color.f2966ao);
                                                                        mo22717k8(C0966R.string.acu, (String) null);
                                                                        C20612a.m22480i().mo32273h().mo37036e();
                                                                        mo22706Z7();
                                                                        break;
                                                                    case -21:
                                                                        if (!mo22695O7().f58032i) {
                                                                            mo22700T7();
                                                                            mo22702V7(C0966R.raw.icons_outlined_error, 80, 80, C0966R.color.f2966ao);
                                                                            mo22717k8(C0966R.string.f360146ad2, (String) null);
                                                                            break;
                                                                        } else {
                                                                            return;
                                                                        }
                                                                    default:
                                                                        switch (i2) {
                                                                            case 21:
                                                                                if (mo22695O7().f58030g == 100) {
                                                                                    C22133b.m25607b(C22133b.f62617a, 2, 1, (String) null, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, 252, (Object) null);
                                                                                } else {
                                                                                    C22133b.m25607b(C22133b.f62617a, 3, 1, (String) null, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, 252, (Object) null);
                                                                                }
                                                                                mo22700T7();
                                                                                this.f50085j = System.currentTimeMillis();
                                                                                C115669n nVar = C115669n.INSTANCE;
                                                                                nVar.mo160131h(13735, 23, Integer.valueOf(mo22695O7().f58038o));
                                                                                C20615b O7 = mo22695O7();
                                                                                C20615b O72 = mo22695O7();
                                                                                if (!O72.mo32285i()) {
                                                                                    C87412m.m108594g(6, "value");
                                                                                    StringBuilder sb = new StringBuilder();
                                                                                    sb.append("reportAndCommit() called with: key = ");
                                                                                    sb.append("Type");
                                                                                    sb.append(", value = ");
                                                                                    sb.append(6);
                                                                                    sb.append(" stack:");
                                                                                    int i4 = C77702q0.f226484a;
                                                                                    sb.append(new C77702q0.C77703a());
                                                                                    Log.m105918d("BackupReport", sb.toString());
                                                                                    C22133b.f62617a.mo35248a(6, 1, O72.f58033j);
                                                                                }
                                                                                if (O72.mo32285i()) {
                                                                                    i3 = 16;
                                                                                }
                                                                                O7.mo32281e(i3);
                                                                                mo22697Q7().mo142628f(22);
                                                                                mo22715i8(22);
                                                                                nVar.idkeyStat(400, 16, 1, false);
                                                                                break;
                                                                            case 22:
                                                                                if (i2 != this.f50084i) {
                                                                                    mo22700T7();
                                                                                    mo22716j8(C0966R.string.mk8, C0966R.string.f360144ad0);
                                                                                    C23309e eVar4 = this.f50080e;
                                                                                    if (eVar4 != null) {
                                                                                        eVar4.mo36780g().setVisibility(0);
                                                                                        C23309e eVar5 = this.f50080e;
                                                                                        if (eVar5 != null) {
                                                                                            eVar5.mo36779f().setVisibility(0);
                                                                                            C23309e eVar6 = this.f50080e;
                                                                                            if (eVar6 != null) {
                                                                                                Button f3 = eVar6.mo36779f();
                                                                                                C87412m.m108593f(f3, "vb.knowBtn");
                                                                                                mo22703W7(f3);
                                                                                                C23309e eVar7 = this.f50080e;
                                                                                                if (eVar7 != null) {
                                                                                                    eVar7.mo36779f().setText(C0966R.string.a_u);
                                                                                                    C23309e eVar8 = this.f50080e;
                                                                                                    if (eVar8 != null) {
                                                                                                        eVar8.mo36779f().setOnClickListener(new C107589l(this));
                                                                                                        break;
                                                                                                    } else {
                                                                                                        C87412m.m108603p("vb");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    C87412m.m108603p("vb");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                C87412m.m108603p("vb");
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            C87412m.m108603p("vb");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        C87412m.m108603p("vb");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    return;
                                                                                }
                                                                            case 23:
                                                                                mo22700T7();
                                                                                mo22708b8();
                                                                                mo22716j8(C0966R.string.mkr, C0966R.string.mks);
                                                                                int a = C20842c.f58882p.mo32560a();
                                                                                String string = getString(C0966R.string.mkq, new Object[]{C20842c.m22883s1(), C20842c.m22882p1()});
                                                                                C87412m.m108593f(string, "getString(\n             …                        )");
                                                                                mo22714g8(a, string);
                                                                                mo22707a8(true);
                                                                                break;
                                                                            case 24:
                                                                                C22133b.m25607b(C22133b.f62617a, 3, 3, (String) null, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, 252, (Object) null);
                                                                                long milliSecondsToNow2 = Util.milliSecondsToNow(this.f50085j);
                                                                                long j2 = C20842c.f58882p.f58942d / ((long) 1024);
                                                                                f50079o.mo22722a(105, (int) milliSecondsToNow2, (int) j2, (int) (j2 / milliSecondsToNow2));
                                                                                mo22700T7();
                                                                                mo22702V7(C0966R.raw.icons_outlined_move_to_phone, 80, 80, 0);
                                                                                mo22717k8(C0966R.string.mku, getString(C0966R.string.mkv, new Object[]{""}));
                                                                                if (this.f50081f) {
                                                                                    C23309e eVar9 = this.f50080e;
                                                                                    if (eVar9 != null) {
                                                                                        eVar9.mo36786m().setVisibility(0);
                                                                                        C23309e eVar10 = this.f50080e;
                                                                                        if (eVar10 != null) {
                                                                                            eVar10.mo36785l().setText(C0966R.string.mkw);
                                                                                            C23309e eVar11 = this.f50080e;
                                                                                            if (eVar11 != null) {
                                                                                                Button l2 = eVar11.mo36785l();
                                                                                                C87412m.m108593f(l2, "vb.resumeBtn");
                                                                                                mo22701U7(l2);
                                                                                                C23309e eVar12 = this.f50080e;
                                                                                                if (eVar12 != null) {
                                                                                                    eVar12.mo36785l().setOnClickListener(new C107583h(this));
                                                                                                    C23309e eVar13 = this.f50080e;
                                                                                                    if (eVar13 != null) {
                                                                                                        eVar13.mo36781h().setVisibility(0);
                                                                                                        C23309e eVar14 = this.f50080e;
                                                                                                        if (eVar14 != null) {
                                                                                                            eVar14.mo36789p().setText(C0966R.string.mq6);
                                                                                                            C23309e eVar15 = this.f50080e;
                                                                                                            if (eVar15 != null) {
                                                                                                                Button p = eVar15.mo36789p();
                                                                                                                C87412m.m108593f(p, "vb.stopBtn");
                                                                                                                mo22703W7(p);
                                                                                                                C23309e eVar16 = this.f50080e;
                                                                                                                if (eVar16 != null) {
                                                                                                                    eVar16.mo36789p().setOnClickListener(new C107584i(this));
                                                                                                                    C23309e eVar17 = this.f50080e;
                                                                                                                    if (eVar17 != null) {
                                                                                                                        eVar17.mo36781h().setOnClickListener(new C107586j(this));
                                                                                                                    } else {
                                                                                                                        C87412m.m108603p("vb");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    C87412m.m108603p("vb");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                            } else {
                                                                                                                C87412m.m108603p("vb");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            C87412m.m108603p("vb");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        C87412m.m108603p("vb");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    C87412m.m108603p("vb");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                C87412m.m108603p("vb");
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            C87412m.m108603p("vb");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        C87412m.m108603p("vb");
                                                                                        throw null;
                                                                                    }
                                                                                } else if (Util.isTopActivity(this)) {
                                                                                    mo22710d8();
                                                                                }
                                                                                mo22707a8(false);
                                                                                break;
                                                                            case 25:
                                                                                mo22700T7();
                                                                                if (Util.isTopActivity(this)) {
                                                                                    mo22697Q7().mo142628f(24);
                                                                                    mo22715i8(24);
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 26:
                                                                                mo22700T7();
                                                                                C22133b.m25607b(C22133b.f62617a, 4, 1, (String) null, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, 252, (Object) null);
                                                                                mo22702V7(C0966R.C0969drawable.bvf, 80, 80, 0);
                                                                                mo22716j8(C0966R.string.mkx, C0966R.string.adf);
                                                                                mo22714g8(mo22697Q7().f303750d, "");
                                                                                C23309e eVar18 = this.f50080e;
                                                                                if (eVar18 != null) {
                                                                                    eVar18.mo36784k().setVisibility(0);
                                                                                    C23309e eVar19 = this.f50080e;
                                                                                    if (eVar19 != null) {
                                                                                        eVar19.mo36783j().setText(C0966R.string.f360153ml2);
                                                                                        C23309e eVar20 = this.f50080e;
                                                                                        if (eVar20 != null) {
                                                                                            eVar20.mo36783j().setOnClickListener(new C107587k(this));
                                                                                            break;
                                                                                        } else {
                                                                                            C87412m.m108603p("vb");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        C87412m.m108603p("vb");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    C87412m.m108603p("vb");
                                                                                    throw null;
                                                                                }
                                                                            case 27:
                                                                                C87412m.m108594g(4, "value");
                                                                                StringBuilder sb4 = new StringBuilder();
                                                                                sb4.append("reportAndCommit() called with: key = ");
                                                                                sb4.append("Type");
                                                                                sb4.append(", value = ");
                                                                                sb4.append(4);
                                                                                sb4.append(" stack:");
                                                                                int i5 = C77702q0.f226484a;
                                                                                sb4.append(new C77702q0.C77703a());
                                                                                Log.m105918d("BackupReport", sb4.toString());
                                                                                C22133b.m25607b(C22133b.f62617a, 4, 3, (String) null, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, 252, (Object) null);
                                                                                mo22700T7();
                                                                                mo22702V7(C0966R.raw.icons_outlined_done3, 80, 80, C0966R.color.f2955ab);
                                                                                mo22717k8(C0966R.string.mki, getString(C0966R.string.mkm, new Object[]{C102913k.m136058w((float) mo22698R7().f58059e)}));
                                                                                mo22718q();
                                                                                break;
                                                                            default:
                                                                                if (!mo22695O7().f58032i) {
                                                                                    mo22700T7();
                                                                                    mo22702V7(C0966R.raw.icons_outlined_error, 80, 80, C0966R.color.f2966ao);
                                                                                    mo22717k8(C0966R.string.mkf, "");
                                                                                    C23309e eVar21 = this.f50080e;
                                                                                    if (eVar21 != null) {
                                                                                        eVar21.mo36788o().setVisibility(0);
                                                                                        C23309e eVar22 = this.f50080e;
                                                                                        if (eVar22 != null) {
                                                                                            eVar22.mo36781h().setVisibility(0);
                                                                                            C23309e eVar23 = this.f50080e;
                                                                                            if (eVar23 != null) {
                                                                                                eVar23.mo36787n().setText(C0966R.string.ae5);
                                                                                                C23309e eVar24 = this.f50080e;
                                                                                                if (eVar24 != null) {
                                                                                                    Button n = eVar24.mo36787n();
                                                                                                    C87412m.m108593f(n, "vb.startBtn");
                                                                                                    mo22704X7(n);
                                                                                                    C23309e eVar25 = this.f50080e;
                                                                                                    if (eVar25 != null) {
                                                                                                        eVar25.mo36787n().setOnClickListener(new C107590m(this));
                                                                                                        C23309e eVar26 = this.f50080e;
                                                                                                        if (eVar26 != null) {
                                                                                                            eVar26.mo36776c().setText(C0966R.string.f360153ml2);
                                                                                                            C23309e eVar27 = this.f50080e;
                                                                                                            if (eVar27 != null) {
                                                                                                                eVar27.mo36776c().setOnClickListener(new C8210n(this));
                                                                                                                C23309e eVar28 = this.f50080e;
                                                                                                                if (eVar28 != null) {
                                                                                                                    Button c = eVar28.mo36776c();
                                                                                                                    C87412m.m108593f(c, "vb.bottomBtn");
                                                                                                                    mo22703W7(c);
                                                                                                                    break;
                                                                                                                } else {
                                                                                                                    C87412m.m108603p("vb");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                            } else {
                                                                                                                C87412m.m108603p("vb");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            C87412m.m108603p("vb");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        C87412m.m108603p("vb");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    C87412m.m108603p("vb");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                C87412m.m108603p("vb");
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            C87412m.m108603p("vb");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        C87412m.m108603p("vb");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    return;
                                                                                }
                                                                        }
                                                                }
                                                            } else {
                                                                mo22712f8();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        mo22695O7().f58032i = false;
                                        mo22700T7();
                                        mo22708b8();
                                        mo22716j8(C0966R.string.mkr, C0966R.string.mks);
                                        int a2 = C20842c.f58882p.mo32560a();
                                        String string2 = getString(C0966R.string.mkq, new Object[]{C20842c.m22883s1(), C20842c.m22882p1()});
                                        C87412m.m108593f(string2, "getString(\n             …                        )");
                                        mo22714g8(a2, string2);
                                        mo22707a8(true);
                                    }
                                } else if (!mo22695O7().f58032i) {
                                    mo22700T7();
                                    mo22702V7(C0966R.raw.icons_outlined_error, 80, 80, C0966R.color.f2966ao);
                                    mo22716j8(C0966R.string.acp, C0966R.string.ad5);
                                    C23309e eVar29 = this.f50080e;
                                    if (eVar29 != null) {
                                        eVar29.mo36790q().setOnClickListener(new C2063h(this));
                                        C23309e eVar30 = this.f50080e;
                                        if (eVar30 != null) {
                                            eVar30.mo36790q().setTextAppearance(this, C0966R.style.a86);
                                            mo22706Z7();
                                        } else {
                                            C87412m.m108603p("vb");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("vb");
                                        throw null;
                                    }
                                } else {
                                    return;
                                }
                            } else if (mo22695O7().f58029f == 1) {
                                mo22695O7().mo32287k();
                            } else {
                                mo22700T7();
                                mo22708b8();
                                mo22716j8(C0966R.string.mkg, C0966R.string.mkc);
                                mo22707a8(false);
                                mo22706Z7();
                            }
                        }
                        mo22700T7();
                        mo22702V7(C0966R.raw.icons_outlined_error, 80, 80, C0966R.color.f2966ao);
                        mo22716j8(C0966R.string.mkd, C0966R.string.f360144ad0);
                        String A = C102913k.m136029A(this);
                        String str = mo22695O7().f58025b;
                        if (Util.isNullOrNil(A)) {
                            A = getString(C0966R.string.mjy);
                        }
                        if (Util.isNullOrNil(str)) {
                            str = getString(C0966R.string.mjy);
                        }
                        C23309e eVar31 = this.f50080e;
                        if (eVar31 != null) {
                            eVar31.mo36782i().setVisibility(0);
                            C23309e eVar32 = this.f50080e;
                            if (eVar32 != null) {
                                eVar32.mo36782i().setText(getString(C0966R.string.f360135mk2, new Object[]{A, str}));
                                C23309e eVar33 = this.f50080e;
                                if (eVar33 != null) {
                                    eVar33.mo36788o().setVisibility(0);
                                    C23309e eVar34 = this.f50080e;
                                    if (eVar34 != null) {
                                        eVar34.mo36781h().setVisibility(0);
                                        C23309e eVar35 = this.f50080e;
                                        if (eVar35 != null) {
                                            eVar35.mo36787n().setText(C0966R.string.ae5);
                                            C23309e eVar36 = this.f50080e;
                                            if (eVar36 != null) {
                                                Button n2 = eVar36.mo36787n();
                                                C87412m.m108593f(n2, "vb.startBtn");
                                                mo22704X7(n2);
                                                C23309e eVar37 = this.f50080e;
                                                if (eVar37 != null) {
                                                    eVar37.mo36787n().setOnClickListener(new C107591o(this));
                                                    C23309e eVar38 = this.f50080e;
                                                    if (eVar38 != null) {
                                                        eVar38.mo36776c().setText(C0966R.string.a_u);
                                                        C23309e eVar39 = this.f50080e;
                                                        if (eVar39 != null) {
                                                            eVar39.mo36776c().setOnClickListener(new C8211p(this));
                                                            C23309e eVar40 = this.f50080e;
                                                            if (eVar40 != null) {
                                                                Button c2 = eVar40.mo36776c();
                                                                C87412m.m108593f(c2, "vb.bottomBtn");
                                                                mo22703W7(c2);
                                                            } else {
                                                                C87412m.m108603p("vb");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C87412m.m108603p("vb");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C87412m.m108603p("vb");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("vb");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("vb");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("vb");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("vb");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("vb");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("vb");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("vb");
                            throw null;
                        }
                    } else if (!this.f50082g) {
                        mo22700T7();
                        mo22708b8();
                        C8479f0 f0Var = new C8479f0();
                        f0Var.f27484d = ".  ";
                        C8478d0 d0Var = new C8478d0();
                        d0Var.f27483d = 1;
                        this.f50086n.postDelayed(new C20720a(this, new C20724s(d0Var, f0Var, this)), 400);
                        C20726v vVar = new C20726v(this);
                        this.f50083h = true;
                        C20721b bVar = new C20721b(this, System.currentTimeMillis(), vVar);
                        CancellationSignal cancellationSignal = new CancellationSignal();
                        ((C119157j) C119157j.f356862d).mo183875f(new C98044q(cancellationSignal, bVar));
                    } else {
                        return;
                    }
                }
                if (i2 != this.f50084i) {
                    mo22700T7();
                    mo22707a8(false);
                    C23309e eVar41 = this.f50080e;
                    if (eVar41 != null) {
                        eVar41.mo36780g().setVisibility(0);
                        mo22716j8(C0966R.string.mk8, C0966R.string.f360144ad0);
                        mo22706Z7();
                        if (1 == i2 || 12 == i2) {
                            C119179t tVar = C119157j.f356862d;
                            C18118g gVar = new C18118g(this);
                            C119157j jVar = (C119157j) tVar;
                            jVar.getClass();
                            jVar.mo183892w(gVar, 10000, false);
                        }
                    } else {
                        C87412m.m108603p("vb");
                        throw null;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 != this.f50084i) {
            mo22695O7().f58032i = true;
            mo22700T7();
            mo22708b8();
            mo22717k8(C0966R.string.mka, getString(C0966R.string.mkb));
            mo22695O7().f58029f = 2;
            C20612a.m22480i().mo32273h().mo37036e();
            if (this.f50083h) {
                C20612a.m22480i().mo32276l().mo32307e(true);
            }
            C23309e eVar42 = this.f50080e;
            if (eVar42 != null) {
                eVar42.mo36774a().setVisibility(0);
                C23309e eVar43 = this.f50080e;
                if (eVar43 != null) {
                    eVar43.mo36774a().setProgressDrawable(getResources().getDrawable(C0966R.C0969drawable.cj9));
                    C23309e eVar44 = this.f50080e;
                    if (eVar44 != null) {
                        eVar44.mo36774a().setProgress(C20842c.f58882p.mo32560a());
                        C23309e eVar45 = this.f50080e;
                        if (eVar45 != null) {
                            eVar45.mo36786m().setVisibility(0);
                            C23309e eVar46 = this.f50080e;
                            if (eVar46 != null) {
                                eVar46.mo36785l().setOnClickListener(new C107582f(this));
                                C23309e eVar47 = this.f50080e;
                                if (eVar47 != null) {
                                    eVar47.mo36781h().setVisibility(0);
                                    C23309e eVar48 = this.f50080e;
                                    if (eVar48 != null) {
                                        Button h = eVar48.mo36781h();
                                        C87412m.m108593f(h, "vb.mini");
                                        mo22703W7(h);
                                        if (mo22695O7().f58030g == 100) {
                                            C22133b.m25607b(C22133b.f62617a, 2, 4, (String) null, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, 252, (Object) null);
                                        } else {
                                            C22133b.m25607b(C22133b.f62617a, 3, 4, (String) null, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, 252, (Object) null);
                                        }
                                        C23309e eVar49 = this.f50080e;
                                        if (eVar49 != null) {
                                            eVar49.mo36789p().setOnClickListener(new C20722g(this));
                                            mo22707a8(false);
                                        } else {
                                            C87412m.m108603p("vb");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("vb");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("vb");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("vb");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("vb");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("vb");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("vb");
                    throw null;
                }
            } else {
                C87412m.m108603p("vb");
                throw null;
            }
        } else {
            return;
        }
        this.f50084i = i2;
    }

    /* renamed from: j8 */
    public final void mo22716j8(int i, int i2) {
        mo22717k8(i, i2 == 0 ? null : getString(i2));
    }

    /* renamed from: k8 */
    public final void mo22717k8(int i, String str) {
        C23309e eVar = this.f50080e;
        if (eVar != null) {
            if (eVar.f67010s == null) {
                eVar.f67010s = (TextView) eVar.f66992a.findViewById(C0966R.C0970id.nbv);
            }
            eVar.f67010s.setVisibility(0);
            C23309e eVar2 = this.f50080e;
            if (eVar2 != null) {
                if (eVar2.f67010s == null) {
                    eVar2.f67010s = (TextView) eVar2.f66992a.findViewById(C0966R.C0970id.nbv);
                }
                eVar2.f67010s.setText(i);
                if (str == null) {
                    C23309e eVar3 = this.f50080e;
                    if (eVar3 != null) {
                        eVar3.mo36790q().setVisibility(8);
                    } else {
                        C87412m.m108603p("vb");
                        throw null;
                    }
                } else {
                    C23309e eVar4 = this.f50080e;
                    if (eVar4 != null) {
                        eVar4.mo36790q().setVisibility(0);
                        C23309e eVar5 = this.f50080e;
                        if (eVar5 != null) {
                            eVar5.mo36790q().setText(str);
                            C23309e eVar6 = this.f50080e;
                            if (eVar6 != null) {
                                eVar6.mo36790q().setTextColor(getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
                                C23309e eVar7 = this.f50080e;
                                if (eVar7 != null) {
                                    eVar7.mo36790q().setBackgroundColor(getResources().getColor(C0966R.color.ahe));
                                } else {
                                    C87412m.m108603p("vb");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("vb");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("vb");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("vb");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("vb");
                throw null;
            }
        } else {
            C87412m.m108603p("vb");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50080e = new C23309e(getContentView());
        ActionBar supportActionBar = getSupportActionBar();
        C87412m.m108591d(supportActionBar);
        supportActionBar.mo91104o();
        C23309e eVar = this.f50080e;
        if (eVar != null) {
            eVar.mo36777d().setOnClickListener(new C8208c(this));
            mo22707a8(false);
            C23309e eVar2 = this.f50080e;
            if (eVar2 != null) {
                eVar2.mo36781h().setOnClickListener(new C107581d(this));
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).getClass();
                MMAppMgr.m85986f();
                if (C20612a.m22480i().mo32274j().f58039p) {
                    C20612a.m22480i().mo32274j().f58039p = false;
                    int d = C102913k.m136039d();
                    if (d < 20) {
                        C115669n nVar = C115669n.INSTANCE;
                        nVar.idkeyStat(400, 4, 1, false);
                        nVar.mo160131h(13736, 4, C20612a.m22480i().mo32274j().f58025b, C102913k.m136029A(this), 0, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
                        C76879j.m92741l(this, C0966R.string.act, C0966R.string.acs, C0966R.string.aei, 0, false, new C39174j(d), (DialogInterface.OnClickListener) null, C0966R.color.f3113fp);
                    }
                }
                if (((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101185qq()) {
                    C75604z3.m90829a();
                    return;
                }
                return;
            }
            C87412m.m108603p("vb");
            throw null;
        }
        C87412m.m108603p("vb");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f50086n.removeCallbacksAndMessages((Object) null);
        if (mo22697Q7().mo142623a() != -25) {
            int a = mo22697Q7().mo142623a();
            if (a == 27 || a == 15) {
                int i = C20612a.m22480i().mo32274j().f58024a;
                Log.m105925i("MicroMsg.BackupMigratePCUI", "exitBackupPc. commandMode:%d", Integer.valueOf(i));
                mo22697Q7().mo142628f(100);
                C20612a.m22480i().mo32276l().mo32309g(100);
                if (1 == i || 3 == i) {
                    mo22694N7().mo140765b();
                    mo22694N7().mo140766c();
                    C20612a.m22480i().mo32276l().mo32307e(true);
                    C20612a.m22480i().mo32273h().mo37036e();
                } else if (2 == i || 4 == i) {
                    C20612a.m22480i().mo32275k().mo32292b(true, true, -100);
                    C20612a.m22480i().mo32273h().mo37036e();
                }
                mo22695O7().mo32284h();
                ((C87121j) C86312j.m106911c(C87121j.class)).mo71215V9("weixin", 19);
                return;
            }
            if (a == 100 ? true : C110818d0.m150903D(new C61593h(-1, -101, -1), Integer.valueOf(a))) {
                mo22697Q7().mo142628f(100);
                C20612a.m22480i().mo32276l().mo32307e(true);
                C20612a.m22480i().mo32273h().mo37036e();
                mo22695O7().mo32284h();
            }
        }
    }

    public void onPause() {
        super.onPause();
        C20633g l = C20612a.m22480i().mo32276l();
        synchronized (l.f58092d) {
            ((HashSet) l.f58092d).remove(this);
        }
        C20625e R7 = mo22698R7();
        synchronized (R7.f58065n) {
            ((HashSet) R7.f58065n).remove(this);
        }
        mo22694N7().f296794e = null;
    }

    public void onResume() {
        super.onResume();
        mo22694N7().f296794e = this;
        C20633g l = C20612a.m22480i().mo32276l();
        synchronized (l.f58092d) {
            ((HashSet) l.f58092d).add(this);
        }
        C20625e R7 = mo22698R7();
        synchronized (R7.f58065n) {
            ((HashSet) R7.f58065n).add(this);
        }
        if (mo22697Q7().mo142623a() == -100) {
            mo22697Q7().mo142628f(100);
        }
        mo22715i8(mo22697Q7().mo142623a());
    }

    public void onStart() {
        super.onStart();
        this.f50081f = getIntent().getBooleanExtra("isRecoverTransferFinishFromBanner", false);
    }

    /* renamed from: q */
    public final void mo22718q() {
        mo22702V7(C0966R.raw.icons_outlined_done3, 80, 80, C0966R.color.f2939n);
        C18120b bVar = C18120b.f50090d;
        C87412m.m108594g(bVar, "callback");
        C23309e eVar = this.f50080e;
        if (eVar != null) {
            eVar.mo36779f().setVisibility(0);
            C23309e eVar2 = this.f50080e;
            if (eVar2 != null) {
                Button f = eVar2.mo36779f();
                C87412m.m108593f(f, "vb.knowBtn");
                mo22704X7(f);
                C23309e eVar3 = this.f50080e;
                if (eVar3 != null) {
                    eVar3.mo36779f().setTextColor(getResources().getColor(C0966R.color.f3113fp));
                    C23309e eVar4 = this.f50080e;
                    if (eVar4 != null) {
                        eVar4.mo36779f().setText(C0966R.string.f8028zq);
                        C23309e eVar5 = this.f50080e;
                        if (eVar5 != null) {
                            eVar5.mo36779f().setOnClickListener(new C8212r(this, bVar));
                        } else {
                            C87412m.m108603p("vb");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("vb");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("vb");
                    throw null;
                }
            } else {
                C87412m.m108603p("vb");
                throw null;
            }
        } else {
            C87412m.m108603p("vb");
            throw null;
        }
    }
}
