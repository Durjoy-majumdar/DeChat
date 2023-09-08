package com.tencent.p014mm.plugin.emoji.p040ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.EmojiUpdatePanelEvent;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.smiley.C96954m;
import com.tencent.p014mm.storage.C30764p2;
import com.tencent.p014mm.storage.C30777t2;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import i61.C98602h;
import j61.C46439j;
import java.util.ArrayList;
import java.util.Iterator;
import jg3.C98942a;
import jp3.C46566c;
import jp3.C9486a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p384tk.C101897a;
import p441aq.C92054g;
import p490dl.C97489o;
import p490dl.C97491p;
import p595ll.C61303b;
import p911ml.C99914f;
import qo3.C77398g;
import te3.C101800k70;
import te3.a64;
import te3.z54;
import u61.C101964h;
import z51.C39315g;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI */
public class EmojiAddCustomDialogUI extends MMBaseActivity implements C11385n {

    /* renamed from: t */
    public static final /* synthetic */ int f268385t = 0;

    /* renamed from: e */
    public String f268386e;

    /* renamed from: f */
    public boolean f268387f;

    /* renamed from: g */
    public int f268388g;

    /* renamed from: h */
    public String f268389h;

    /* renamed from: i */
    public EmojiInfo f268390i;

    /* renamed from: j */
    public boolean f268391j;

    /* renamed from: n */
    public C99914f f268392n;

    /* renamed from: o */
    public Context f268393o;

    /* renamed from: p */
    public ProgressDialog f268394p;

    /* renamed from: q */
    public C77398g f268395q;

    /* renamed from: r */
    public C46566c<C9486a> f268396r;

    /* renamed from: s */
    public Runnable f268397s = new EmojiAddCustomDialogUI$$c(this);

    /* renamed from: E7 */
    public static void m117579E7(EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        if (!emojiAddCustomDialogUI.isFinishing()) {
            Context context = emojiAddCustomDialogUI.f268393o;
            C76879j.m92754y(context, context.getString(C0966R.string.c5m), "", emojiAddCustomDialogUI.getString(C0966R.string.fmz), new C93214t(emojiAddCustomDialogUI));
        }
    }

    /* renamed from: F7 */
    public static void m117580F7(EmojiAddCustomDialogUI emojiAddCustomDialogUI, String str, C101800k70 k702) {
        boolean z;
        Class cls = C92054g.class;
        if (str == null) {
            emojiAddCustomDialogUI.getClass();
        } else if (!str.equals(emojiAddCustomDialogUI.f268390i.getMd5())) {
            ((C92054g) C86312j.m106911c(cls)).getClass();
            emojiAddCustomDialogUI.f268390i = C30790w2.m39221h().mo57717d().mo142044TO(str);
        }
        Log.m105918d("MicroMsg.emoji.EmojiAddCustomDialogUI", "dealSaveSuccess");
        if (k702 != null) {
            C101964h.m134219a(k702, emojiAddCustomDialogUI.f268390i);
            Log.m105929w("MicroMsg.emoji.EmojiAddCustomDialogUI", "update emoji info for %s", str);
            z = true;
        } else {
            z = false;
        }
        EmojiInfo emojiInfo = emojiAddCustomDialogUI.f268390i;
        int i = emojiInfo.field_catalog;
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
        if (i != 81) {
            emojiInfo.field_catalog = 81;
            C101897a.m134075e().mo141394c(emojiAddCustomDialogUI.f268390i, false);
            ((C92054g) C86312j.m106911c(cls)).getClass();
            emojiAddCustomDialogUI.f268390i.field_reserved3 = C30790w2.m39221h().mo57717d().mo142062nP() + 1;
            C115669n nVar = C115669n.INSTANCE;
            EmojiInfo emojiInfo2 = emojiAddCustomDialogUI.f268390i;
            nVar.mo160131h(10431, Integer.valueOf(emojiAddCustomDialogUI.f268388g), emojiAddCustomDialogUI.f268390i.getMd5(), emojiInfo2.field_designerID, emojiInfo2.field_groupId, 0, 0, Integer.valueOf(emojiAddCustomDialogUI.f268390i.field_size), emojiAddCustomDialogUI.f268389h, emojiAddCustomDialogUI.f268390i.field_activityid);
            z = true;
        }
        if (z) {
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57717d().r50(emojiAddCustomDialogUI.f268390i);
        }
        if (C30777t2.f82756d.wx0()) {
            C96954m mVar = C96954m.f284033a;
            Log.m105924i("MicroMsg.EmojiOcrService", "restart");
            mVar.mo135540d();
            mVar.mo135539c(false);
        } else if (!TextUtils.isEmpty(emojiAddCustomDialogUI.f268390i.field_meanings)) {
            C30764p2 p2Var = C30764p2.f82718j;
            if (p2Var.mo57678e()) {
                p2Var.mo57680g();
            }
        }
        if (emojiAddCustomDialogUI.f268387f) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(emojiAddCustomDialogUI.f268390i.getMd5());
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57717d().c40(0, arrayList);
        }
        String coverPath = emojiAddCustomDialogUI.f268390i.getCoverPath();
        if (!Util.isNullOrNil(emojiAddCustomDialogUI.f268390i.field_thumbUrl) && !C86013q1.m106450k(coverPath)) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59350f = coverPath;
            bVar.f59346b = true;
            bVar.f59345a = false;
            C20828a.m22825b().mo32519h(emojiAddCustomDialogUI.f268390i.field_thumbUrl, (ImageView) null, bVar.mo32666a());
        }
        EmojiUpdatePanelEvent emojiUpdatePanelEvent = new EmojiUpdatePanelEvent();
        emojiUpdatePanelEvent.f193547d.f193549a = 1;
        emojiUpdatePanelEvent.publish();
        if (!emojiUpdatePanelEvent.f193548e.f193550a) {
            ((C92054g) C86312j.m106911c(cls)).getClass();
            z54 qq = C30790w2.m39221h().mo57720g().mo61547qq();
            if (qq != null) {
                Iterator<a64> it = qq.f145713d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a64 next = it.next();
                    if (next.f130331d.equals(String.valueOf(18))) {
                        next.f130332e = 0;
                        break;
                    }
                }
            }
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57720g().mo61544Ow(qq);
            C98942a.f290038b.mo122420a(-29414086, String.valueOf(18));
        }
        emojiAddCustomDialogUI.mo127688H7();
        C119179t tVar = C119157j.f356862d;
        EmojiAddCustomDialogUI$$a emojiAddCustomDialogUI$$a = new EmojiAddCustomDialogUI$$a(emojiAddCustomDialogUI, str);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(emojiAddCustomDialogUI$$a, 300, false);
    }

    /* renamed from: G7 */
    public static void m117581G7(EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        emojiAddCustomDialogUI.getClass();
        Log.m105924i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd error.");
        emojiAddCustomDialogUI.mo127688H7();
        emojiAddCustomDialogUI.runOnUiThread(new C93209r(emojiAddCustomDialogUI));
        C115669n nVar = C115669n.INSTANCE;
        EmojiInfo emojiInfo = emojiAddCustomDialogUI.f268390i;
        nVar.mo160131h(10431, Integer.valueOf(emojiAddCustomDialogUI.f268388g), emojiAddCustomDialogUI.f268390i.getMd5(), emojiInfo.field_designerID, emojiInfo.field_groupId, 1, 3, Integer.valueOf(emojiAddCustomDialogUI.f268390i.field_size), emojiAddCustomDialogUI.f268389h, emojiAddCustomDialogUI.f268390i.field_activityid);
        emojiAddCustomDialogUI.setResult(1);
        emojiAddCustomDialogUI.finish();
    }

    /* renamed from: H7 */
    public void mo127688H7() {
        MMHandlerThread.removeRunnable(this.f268397s);
        ProgressDialog progressDialog = this.f268394p;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f268394p.dismiss();
        }
    }

    /* renamed from: I7 */
    public final void mo127689I7(EmojiInfo emojiInfo) {
        Log.m105924i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji start.do NetSceneBackupEmojiOperate");
        ArrayList arrayList = new ArrayList();
        arrayList.add(emojiInfo.getMd5());
        C61303b bVar = new C61303b(0, 4, arrayList);
        bVar.f256791h = true;
        bVar.mo9225i().mo11397F(this.f268396r).mo123062e(new EmojiAddCustomDialogUI$$d(this, emojiInfo));
    }

    /* renamed from: J7 */
    public final void mo127690J7(String str) {
        if (!isFinishing()) {
            C77398g F = C76879j.m92712F(this, str, "", true);
            this.f268395q = F;
            F.setOnDismissListener(new EmojiAddCustomDialogUI$$b(this));
        }
    }

    /* renamed from: K7 */
    public final void mo127691K7() {
        C77398g j;
        if (!isFinishing() && (j = C76879j.m92739j(this.f268393o, C0966R.string.f360376ca0, C0966R.string.f7961xj, C0966R.string.c8w, C0966R.string.f7926wf, new EmojiAddCustomDialogUI$$e(this), new EmojiAddCustomDialogUI$$f(this))) != null) {
            j.setOnDismissListener(new EmojiAddCustomDialogUI$$g(this));
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        getWindow().setStatusBarColor(0);
        this.f268393o = this;
        this.f268396r = new C46566c<>();
        this.f268386e = getIntent().getStringExtra("extra_id");
        this.f268388g = getIntent().getIntExtra("extra_scence", -1);
        this.f268389h = getIntent().getStringExtra("extra_username");
        if (getIntent().getBooleanExtra("extra_current", false) && this.f268389h == null) {
            this.f268389h = C75592q0.m90789s();
        }
        this.f268387f = getIntent().getBooleanExtra("extra_move_to_top", true);
        this.f268391j = getIntent().getBooleanExtra("key_is_selfie", false);
        if (Util.isNullOrNil(this.f268386e)) {
            Log.m105924i("MicroMsg.emoji.EmojiAddCustomDialogUI", "md5 is null.");
            setResult(1);
            finish();
        }
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        this.f268390i = C30790w2.m39221h().mo57717d().mo142044TO(this.f268386e);
        C86709a0.m107529k().f251779b.mo123455a(v2helper.EMethodSetNgStrength, this);
        MMHandlerThread.postToMainThreadDelayed(this.f268397s, 300);
        Context context = this.f268393o;
        EmojiInfo emojiInfo = this.f268390i;
        if (context == null) {
            Log.m105920e("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. context is null");
        } else if (emojiInfo == null) {
            Log.m105920e("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. emoji is null");
        } else {
            C97491p pVar = C97491p.f286143a;
            pVar.mo136773a(false);
            if (pVar.mo136774c().getBoolean("custom_full", false)) {
                Log.m105924i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. over max size.");
                mo127688H7();
                mo127691K7();
                C115669n nVar = C115669n.INSTANCE;
                EmojiInfo emojiInfo2 = this.f268390i;
                nVar.mo160131h(10431, Integer.valueOf(this.f268388g), this.f268390i.getMd5(), emojiInfo2.field_designerID, emojiInfo2.field_groupId, 1, 2, Integer.valueOf(this.f268390i.field_size), this.f268389h, this.f268390i.field_activityid);
                return;
            }
            int i = emojiInfo.field_catalog;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
            if (i != 81 && !Util.isNullOrNil(emojiInfo.field_groupId) && !Util.isEqual(emojiInfo.field_groupId, "capture")) {
                String str = emojiInfo.field_groupId;
                C87412m.m108594g(str, "groupId");
                if (!C97489o.m125592g().mo136766h().f143906d.contains(str)) {
                    if (!((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138006M(emojiInfo.field_groupId)) {
                        C86709a0.m107529k().f251779b.mo123460f(new C46439j(emojiInfo.field_groupId, (String) null, "", (String) null, (String) null, (EmojiGroupInfo) null, 1, 1, 0, (String) null));
                        return;
                    }
                }
            }
            mo127689I7(emojiInfo);
        }
    }

    public void onDestroy() {
        C86709a0.m107529k().f251779b.mo123470p(v2helper.EMethodSetNgStrength, this);
        MMHandlerThread.removeRunnable(this.f268397s);
        super.onDestroy();
        this.f268396r.dead();
        C99914f fVar = this.f268392n;
        if (fVar != null) {
            fVar.f292775e = null;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        EmojiInfo emojiInfo;
        if (yVar.getType() == 423 && (yVar instanceof C46439j)) {
            C46439j jVar = (C46439j) yVar;
            if (Util.isNullOrNil(jVar.f125078f) || (emojiInfo = this.f268390i) == null || Util.isNullOrNil(emojiInfo.field_groupId) || !this.f268390i.field_groupId.equalsIgnoreCase(jVar.f125078f)) {
                Log.m105924i("MicroMsg.emoji.EmojiAddCustomDialogUI", "no the same product ID");
            } else if (i == 0 && i2 == 0) {
                mo127689I7(this.f268390i);
            } else if (i2 == 4) {
                mo127688H7();
                if (this.f268388g == 0) {
                    String str2 = this.f268390i.field_groupId;
                    if (!isFinishing()) {
                        C77398g F = C76879j.m92712F(this, getString(C0966R.string.c4i), "", true);
                        this.f268395q = F;
                        F.mo107534s(C0966R.string.f7926wf, new C93205p(this));
                        this.f268395q.mo107541v(C0966R.string.c4k, new C93207q(this, str2));
                        return;
                    }
                    return;
                }
                mo127690J7(getString(C0966R.string.c4i));
            } else if (i2 == 8) {
                mo127688H7();
                mo127690J7(getString(C0966R.string.c4h));
            } else if (i2 == 9) {
                mo127688H7();
                mo127690J7(getString(C0966R.string.c4g));
            } else if (i2 == -2) {
                mo127688H7();
                mo127690J7(getString(C0966R.string.c4j));
            } else if (i2 == -100000) {
                mo127688H7();
                mo127690J7(getString(C0966R.string.c4f));
            } else {
                mo127688H7();
                mo127690J7(getString(C0966R.string.c4e));
            }
        }
    }
}
