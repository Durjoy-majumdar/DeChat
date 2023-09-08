package com.tencent.p014mm.plugin.dbbackup;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import p156gj.C87203t;
import p823sg.C90193h;
import q41.C118169f;
import q41.f$$f;
import q41.f$$h;

/* renamed from: com.tencent.mm.plugin.dbbackup.DBRecoveryUI */
public class DBRecoveryUI extends MMActivity implements f$$h {

    /* renamed from: q */
    public static final int[] f345810q = {0, 5, 60, 75, 95, 100, 100};

    /* renamed from: d */
    public C118169f f345811d;

    /* renamed from: e */
    public View f345812e;

    /* renamed from: f */
    public View f345813f;

    /* renamed from: g */
    public ProgressBar f345814g;

    /* renamed from: h */
    public TextView f345815h;

    /* renamed from: i */
    public View f345816i;

    /* renamed from: j */
    public int f345817j;

    /* renamed from: n */
    public int f345818n;

    /* renamed from: o */
    public boolean f345819o;

    /* renamed from: p */
    public final DialogInterface.OnClickListener f345820p = new DBRecoveryUI$$b(this);

    /* renamed from: H7 */
    public final void mo175204H7() {
        this.f345816i.setEnabled(false);
        C118169f fVar = this.f345811d;
        if (fVar != null) {
            fVar.f353235t.cancel();
            Log.m105924i("MicroMsg.DBRecoveryTask", "Recovery cancel triggered.");
            this.f345811d = null;
            return;
        }
        Log.m105920e("MicroMsg.DBRecoveryUI", "Recovery task is not running.");
    }

    /* renamed from: I7 */
    public final void mo175205I7() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        i.mo119676J(89, 2);
        i.mo119681a(true);
    }

    /* renamed from: J7 */
    public final void mo175206J7() {
        if (this.f345811d != null) {
            Log.m105920e("MicroMsg.DBRecoveryUI", "Recovery task has already started.");
            return;
        }
        Log.m105924i("MicroMsg.DBRecoveryUI", "Start DB recovery");
        View view = this.f345812e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/dbbackup/DBRecoveryUI", "startRecover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI", "startRecover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f345813f;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/dbbackup/DBRecoveryUI", "startRecover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI", "startRecover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f345816i.setEnabled(true);
        byte[] bytes = C90193h.m112878f((C87203t.m108270f(true) + C86709a0.m107523b().mo121110g()).getBytes()).substring(0, 7).getBytes();
        String o = C86709a0.m107535s().mo121148o();
        String j = C86709a0.m107535s().f251811i.mo125620j();
        String str = j + "-recovery";
        this.f345818n = 0;
        String str2 = C86709a0.m107535s().f251806d + "dbback/";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        byte[] copyOf = Arrays.copyOf(bytes, bytes.length);
        byte[] copyOf2 = Arrays.copyOf(bytes, bytes.length);
        DBRecoveryUI$$f dBRecoveryUI$$f = new DBRecoveryUI$$f(this);
        String str3 = C86709a0.m107535s().f251807e + "heavyDetailInfo";
        boolean z = this.f345817j == 0;
        StringBuilder sb = new StringBuilder();
        sb.append(o);
        boolean z2 = z;
        sb.append(".sm");
        arrayList.add(sb.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        LinkedHashSet linkedHashSet3 = linkedHashSet2;
        sb4.append("corrupted/");
        sb4.append("EnMicroMsg.db");
        sb4.append(".sm");
        arrayList.add(sb4.toString());
        arrayList.add(str2 + "EnMicroMsg.db" + ".sm");
        if (!"0".equals(((C32735h) C86312j.m106911c(C32735h.class)).mo58776F5("clicfg_db_recovery_use_leaf_backup_android", "0"))) {
            arrayList2.add(o + ".li");
            Log.m105924i("MicroMsg.DBRecoveryUI", "Recovery using leaf backup enabled.");
        }
        C118169f fVar = new C118169f((f$$f) null);
        fVar.f353217b = str;
        fVar.f353218c = j;
        fVar.f353219d = o;
        fVar.f353220e = str3;
        fVar.f353221f = new ArrayList(arrayList);
        fVar.f353222g = new ArrayList(arrayList2);
        fVar.f353223h = new ArrayList(arrayList3);
        fVar.f353224i = copyOf;
        fVar.f353225j = copyOf2;
        fVar.f353228m = dBRecoveryUI$$f;
        fVar.f353226k = new ArrayList(linkedHashSet);
        fVar.f353227l = new ArrayList(linkedHashSet3);
        fVar.f353229n = z2;
        fVar.f353230o = this;
        this.f345811d = fVar;
        fVar.execute(new Void[0]);
        this.f345819o = true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7118yu;
    }

    public void onBackPressed() {
        if (this.f345819o) {
            mo175204H7();
        } else {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f345817j = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        this.f345819o = false;
        setMMTitle((int) C0966R.string.bww);
        this.f345812e = findViewById(C0966R.C0970id.k0l);
        this.f345813f = findViewById(C0966R.C0970id.c8s);
        this.f345814g = (ProgressBar) findViewById(C0966R.C0970id.i7m);
        this.f345815h = (TextView) findViewById(C0966R.C0970id.i85);
        findViewById(C0966R.C0970id.k0c).setOnClickListener(new DBRecoveryUI$$c(this));
        View findViewById = findViewById(C0966R.C0970id.apy);
        this.f345816i = findViewById;
        findViewById.setOnClickListener(new DBRecoveryUI$$d(this));
        setBackBtn(new DBRecoveryUI$$e(this));
        if (this.f345817j == 0) {
            mo175206J7();
        }
        C117407d dVar = C117407d.INSTANCE;
        C117407d dVar2 = dVar;
        dVar2.idkeyStat(181, (long) (this.f345817j + 51), 1, true);
        dVar2.idkeyStat(873, 14, 1, false);
        if (this.f345817j == 2) {
            dVar.idkeyStat(873, 15, 1, false);
        }
    }
}
