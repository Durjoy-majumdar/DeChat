package com.tencent.p014mm.plugin.clean.p036ui.fileindexui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.gridviewheaders.GridHeadersGridView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import f40.C86737h0;
import j11.C98894c;
import k11.C99085s;
import k11.s$$d;
import k11.s$$h;
import k11.t$$a;
import k11.t$$b;
import k11.t$$c;
import k11.t$$d;
import k11.t$$f;
import nj3.C76879j;
import qo3.C89779i0;

@C86737h0
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI */
public class CleanChattingDetailUI extends MMActivity implements C98894c {

    /* renamed from: s */
    public static final /* synthetic */ int f267875s = 0;

    /* renamed from: d */
    public C99085s f267876d;

    /* renamed from: e */
    public Button f267877e;

    /* renamed from: f */
    public TextView f267878f;

    /* renamed from: g */
    public Button f267879g;

    /* renamed from: h */
    public ProgressDialog f267880h;

    /* renamed from: i */
    public String f267881i;

    /* renamed from: j */
    public long f267882j;

    /* renamed from: n */
    public long f267883n;

    /* renamed from: o */
    public long f267884o;

    /* renamed from: p */
    public long f267885p;

    /* renamed from: q */
    public long f267886q;

    /* renamed from: r */
    public long f267887r;

    /* renamed from: W1 */
    public void mo127430W1(int i, int i2) {
        MMHandlerThread.postToMainThread(new t$$f(this, i2, i));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7005up;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C75339i.class;
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f267881i = intent.getStringExtra("key_username");
        int[] intArrayExtra = intent.getIntArrayExtra("key_subtype");
        long longExtra = intent.getLongExtra("key_min_time", Long.MIN_VALUE);
        long longExtra2 = intent.getLongExtra("key_max_time", MAlarmHandler.NEXT_FIRE_INTERVAL);
        if (Util.isNullOrNil(this.f267881i)) {
            Log.m105928w("MicroMsg.CleanChattingDetailUI", "username is null");
            finish();
            return;
        }
        this.f267877e = (Button) mo176895$(C0966R.C0970id.mll);
        this.f267878f = (TextView) mo176895$(C0966R.C0970id.c1f);
        Button button = (Button) mo176895$(C0966R.C0970id.c0a);
        this.f267879g = button;
        button.setEnabled(false);
        if (C72996z1.m85820U5(this.f267881i)) {
            String str = this.f267881i;
            setMMTitle(((C75339i) C86312j.m106911c(cls)).mo62519pb(str, str));
        } else {
            setMMTitle(((C75339i) C86312j.m106911c(cls)).getDisplayName(this.f267881i));
        }
        GridHeadersGridView gridHeadersGridView = (GridHeadersGridView) findViewById(C0966R.C0970id.bda);
        gridHeadersGridView.setNumColumns(3);
        C99085s sVar = new C99085s(this, this.f267881i, intArrayExtra, longExtra, longExtra2);
        this.f267876d = sVar;
        gridHeadersGridView.setOnHeaderClickListener(sVar.f290463p);
        gridHeadersGridView.setOnItemClickListener(this.f267876d.f290464q);
        gridHeadersGridView.setOnScrollListener(this.f267876d.f290466s);
        gridHeadersGridView.setAdapter((ListAdapter) this.f267876d);
        setBackBtn(new t$$a(this));
        this.f267877e.setOnClickListener(new t$$b(this));
        this.f267879g.setOnClickListener(new t$$c(this));
        C89779i0 Q = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.bea), false, false, new t$$d());
        this.f267880h = Q;
        Q.dismiss();
        C99085s sVar2 = this.f267876d;
        if (sVar2 != null) {
            ThreadPool.post(new s$$h(sVar2, (s$$d) null), "load_clean_detail");
        }
        C115669n.INSTANCE.idkeyStat(714, 30, 1, false);
    }

    public void onDestroy() {
        ProgressDialog progressDialog = this.f267880h;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f267880h.dismiss();
        }
        C99085s sVar = this.f267876d;
        if (sVar != null) {
            sVar.f290462o = true;
        }
        super.onDestroy();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 113 */
    /* renamed from: q7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo127431q7(boolean r9, long r10) {
        /*
            r8 = this;
            java.lang.String r9 = "MicroMsg.CleanChattingDetailUI"
            java.lang.String r0 = "%s onDeleteEnd [%d] "
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            int r3 = r8.hashCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r1[r3] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r3 = 1
            r1[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r1)
            j11.e r9 = j11.C98896e.wx0()
            java.lang.Class<j11.e> r0 = j11.C98896e.class
            monitor-enter(r0)
            long r1 = r9.f289907e     // Catch:{ all -> 0x0056 }
            long r1 = r1 - r10
            r9.f289907e = r1     // Catch:{ all -> 0x0056 }
            long r1 = r9.f289906d     // Catch:{ all -> 0x0056 }
            long r1 = r1 - r10
            r9.f289906d = r1     // Catch:{ all -> 0x0056 }
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            long r0 = r8.f267887r
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r8.f267886q
            long r4 = r4 - r6
            long r0 = r0 + r4
            r8.f267887r = r0
            k11.t$$e r9 = new k11.t$$e
            r9.<init>(r8, r10)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r9)
            wy0.a r9 = wy0.C102506a.f301832a
            wy0.C102506a.f301840i = r3
            return
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0056:
            r9 = move-exception
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingDetailUI.mo127431q7(boolean, long):void");
    }
}
