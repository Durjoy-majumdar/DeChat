package com.tencent.p014mm.plugin.luckymoney.p073ui;

import a42.C39486a;
import a42.C67004b;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import b42.C67149a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69253n2;
import com.tencent.p014mm.plugin.luckymoney.model.C69267u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75097a;
import f32.C75674c;
import f40.C86709a0;
import g32.C75846b;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import te3.C51206s72;
import te3.C77993rp3;
import te3.C77994sf2;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI */
public class LuckyMoneyBeforeDetailUI extends LuckyMoneyBaseUI {

    /* renamed from: t */
    public static final /* synthetic */ int f199663t = 0;

    /* renamed from: g */
    public Dialog f199664g;

    /* renamed from: h */
    public String f199665h;

    /* renamed from: i */
    public int f199666i;

    /* renamed from: j */
    public String f199667j;

    /* renamed from: n */
    public C67004b f199668n;

    /* renamed from: o */
    public int f199669o;

    /* renamed from: p */
    public int f199670p;

    /* renamed from: q */
    public String f199671q;

    /* renamed from: r */
    public String f199672r;

    /* renamed from: s */
    public int f199673s;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI$a */
    public class C69338a implements DialogInterface.OnCancelListener {
        public C69338a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            P p;
            Dialog dialog = LuckyMoneyBeforeDetailUI.this.f199664g;
            if (dialog != null && dialog.isShowing()) {
                LuckyMoneyBeforeDetailUI.this.f199664g.dismiss();
            }
            LuckyMoneyBeforeDetailUI.this.forceCancel();
            C67004b bVar = LuckyMoneyBeforeDetailUI.this.f199668n;
            if (!(bVar == null || (p = bVar.f221004c) == null)) {
                p.mo85581g();
            }
            if (LuckyMoneyBeforeDetailUI.this.getContentView().getVisibility() == 8 || LuckyMoneyBeforeDetailUI.this.getContentView().getVisibility() == 4) {
                Log.m105924i("MicroMsg.LuckyMoneyBeforeDetailUI", "user cancel & finish");
                LuckyMoneyBeforeDetailUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI$b */
    public class C69339b implements C75097a.C75099b<C51206s72> {

        /* renamed from: a */
        public final /* synthetic */ String f199675a;

        public C69339b(String str) {
            this.f199675a = str;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo67542a(Object obj) {
            C51206s72 s722 = (C51206s72) obj;
        }

        /* renamed from: b */
        public void mo67543b(Object obj, int i, int i2) {
            C51206s72 s722 = (C51206s72) obj;
            if (!(s722 == null || s722.f141354d == null)) {
                Log.m105925i("MicroMsg.LuckyMoneyBeforeDetailUI", "response.subtype_id：%s, %s", Integer.valueOf(s722.f141355e), Integer.valueOf(s722.f141354d.f228190u));
                s722.f141354d.f228175C = s722.f141355e;
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_STORY_DISABLE_AUTO_PLAY_INT_SYNC, Integer.valueOf(s722.f141354d.f228190u));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_STORY_AUTO_PLAY_DELAY_INT_SYNC, Integer.valueOf(s722.f141354d.f228191v));
                ((HashMap) C75674c.f222273b).put(this.f199675a, s722.f141354d);
            }
            LuckyMoneyBeforeDetailUI luckyMoneyBeforeDetailUI = LuckyMoneyBeforeDetailUI.this;
            int i3 = LuckyMoneyBeforeDetailUI.f199663t;
            luckyMoneyBeforeDetailUI.mo95527K7(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI$c */
    public class C69340c implements Runnable {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI$c$a */
        public class C69341a implements Runnable {
            public C69341a() {
            }

            public void run() {
                LuckyMoneyBeforeDetailUI.this.finish();
            }
        }

        public C69340c() {
        }

        public void run() {
            Intent intent = new Intent(LuckyMoneyBeforeDetailUI.this.getContext(), LuckyMoneyDetailUI.class);
            intent.putExtras(LuckyMoneyBeforeDetailUI.this.getIntent());
            LuckyMoneyBeforeDetailUI luckyMoneyBeforeDetailUI = LuckyMoneyBeforeDetailUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            LuckyMoneyBeforeDetailUI luckyMoneyBeforeDetailUI2 = luckyMoneyBeforeDetailUI;
            C117292a.m165358d(luckyMoneyBeforeDetailUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBeforeDetailUI$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyBeforeDetailUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(luckyMoneyBeforeDetailUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBeforeDetailUI$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            MMHandlerThread.postToMainThreadDelayed(new C69341a(), 500);
        }
    }

    /* renamed from: J7 */
    public final void mo95526J7() {
        C69158a0 a;
        C69253n2 a2;
        C77994sf2 sf22;
        Log.m105924i("MicroMsg.LuckyMoneyBeforeDetailUI", "try fetch story info");
        if (!getIntent().getBooleanExtra("key_has_story", true)) {
            Log.m105924i("MicroMsg.LuckyMoneyBeforeDetailUI", "no story, don't fetch data");
            mo95527K7(false);
            return;
        }
        String stringExtra = getIntent().getStringExtra("key_packet_id");
        if (!(!Util.isNullOrNil(stringExtra) || (a = C75674c.m90929a(this.f199665h)) == null || (a2 = C69253n2.m81627a(a.f198957T)) == null || (sf22 = a2.f199287b) == null)) {
            stringExtra = sf22.f228202f;
        }
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105924i("MicroMsg.LuckyMoneyBeforeDetailUI", "no packet id");
            mo95527K7(false);
            return;
        }
        C67149a aVar = new C67149a();
        aVar.field_packet_id = stringExtra;
        boolean z = C75846b.zx0().Cx0().get(aVar, new String[0]);
        long j = aVar.field_update_time;
        Log.m105925i("MicroMsg.LuckyMoneyBeforeDetailUI", "has story info: %s, %s", Boolean.valueOf(z), Long.valueOf(j));
        if (System.currentTimeMillis() - j > 86400000) {
            Log.m105928w("MicroMsg.LuckyMoneyBeforeDetailUI", "need refetch story");
            z = false;
        }
        if (z) {
            C77993rp3 l2 = C67149a.m79405l2(aVar);
            l2.f228181i.addAll(C75846b.zx0().Ex0().mo91256jo(stringExtra));
            ((HashMap) C75674c.f222273b).put(stringExtra, l2);
            mo95527K7(false);
            return;
        }
        if (this.f199664g == null) {
            this.f199664g = C76879j.m92721O(getContext(), (String) null, 3, C0966R.style.f8510l3, getString(C0966R.string.gas), true, true, new C69338a());
        }
        C67004b bVar = new C67004b();
        this.f199668n = bVar;
        bVar.f221004c = new C39486a(stringExtra, true, this.f199667j);
        this.f199668n.mo104792c(new C69339b(stringExtra), true);
    }

    /* renamed from: K7 */
    public final void mo95527K7(boolean z) {
        Log.m105924i("MicroMsg.LuckyMoneyBeforeDetailUI", "go to detail ui");
        Dialog dialog = this.f199664g;
        if (dialog != null) {
            dialog.dismiss();
        }
        C69340c cVar = new C69340c();
        if (z) {
            MMHandlerThread.postToMainThreadDelayed(cVar, 100);
        } else {
            cVar.run();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public int getLayoutId() {
        return -1;
    }

    /* JADX WARNING: type inference failed for: r0v35, types: [ob0.y] */
    /* JADX WARNING: type inference failed for: r5v10, types: [w32.d] */
    /* JADX WARNING: type inference failed for: r5v11, types: [com.tencent.mm.plugin.luckymoney.model.u1] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.tencent.mm.plugin.luckymoney.model.v1] */
    /* JADX WARNING: type inference failed for: r5v13, types: [com.tencent.mm.plugin.luckymoney.model.u1] */
    /* JADX WARNING: type inference failed for: r5v14, types: [w32.d] */
    /* JADX WARNING: type inference failed for: r5v15, types: [com.tencent.mm.plugin.luckymoney.model.v1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r1 = r18
            super.onCreate(r19)
            r2 = 0
            r0 = 2130772160(0x7f0100c0, float:1.714743E38)
            r1.overridePendingTransition(r2, r0)
            android.content.res.Resources r0 = r18.getResources()
            r3 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r0 = r0.getColor(r3)
            com.tencent.p014mm.p136ui.C85875k4.m106187i0(r1, r0)
            r0 = 8
            r1.setContentViewVisibility(r0)
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r3 = "key_sendid"
            java.lang.String r0 = r0.getStringExtra(r3)
            r1.f199665h = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r3 = "scene_id"
            int r0 = r0.getIntExtra(r3, r2)
            r1.f199666i = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r3 = "key_username"
            r0.getStringExtra(r3)
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r3 = "key_from_username"
            java.lang.String r0 = r0.getStringExtra(r3)
            r1.f199667j = r0
            android.content.Intent r0 = r18.getIntent()
            r3 = 1
            java.lang.String r4 = "key_hb_kind"
            int r0 = r0.getIntExtra(r4, r3)
            r1.f199669o = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r4 = "key_from"
            int r0 = r0.getIntExtra(r4, r2)
            r1.f199670p = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r4 = "key_live_id"
            java.lang.String r0 = r0.getStringExtra(r4)
            r1.f199671q = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r4 = "key_live_attach"
            java.lang.String r0 = r0.getStringExtra(r4)
            r1.f199672r = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r4 = "key_live_anchor_type"
            int r0 = r0.getIntExtra(r4, r2)
            r1.f199673s = r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r3 = r1.f199670p
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r3 = "MicroMsg.LuckyMoneyBeforeDetailUI"
            java.lang.String r4 = "from scene: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r4 = "key_native_url"
            java.lang.String r9 = r0.getStringExtra(r4)
            android.content.Intent r0 = r18.getIntent()
            r4 = 2
            java.lang.String r5 = "key_jump_from"
            int r0 = r0.getIntExtra(r5, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "sendid="
            r5.append(r6)
            java.lang.String r6 = r1.f199665h
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r5.append(r6)
            java.lang.String r6 = ", nativeurl="
            r5.append(r6)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            r5.append(r6)
            java.lang.String r6 = ", jumpFrom="
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            if (r0 != r4) goto L_0x0128
            java.lang.String r0 = r1.f199665h
            com.tencent.mm.plugin.luckymoney.model.a0 r0 = f32.C75674c.m90929a(r0)
            if (r0 == 0) goto L_0x00ec
            r18.mo95526J7()
            goto L_0x0200
        L_0x00ec:
            android.content.Intent r0 = r18.getIntent()     // Catch:{ Exception -> 0x010f }
            java.lang.String r4 = "key_detail_info"
            byte[] r0 = r0.getByteArrayExtra(r4)     // Catch:{ Exception -> 0x010f }
            if (r0 == 0) goto L_0x0128
            com.tencent.mm.plugin.luckymoney.model.a0 r4 = new com.tencent.mm.plugin.luckymoney.model.a0     // Catch:{ Exception -> 0x010f }
            r4.<init>()     // Catch:{ Exception -> 0x010f }
            pe3.a r0 = r4.parseFrom(r0)     // Catch:{ Exception -> 0x010f }
            com.tencent.mm.plugin.luckymoney.model.a0 r0 = (com.tencent.p014mm.plugin.luckymoney.model.C69158a0) r0     // Catch:{ Exception -> 0x010f }
            if (r0 == 0) goto L_0x0128
            java.lang.String r4 = r1.f199665h     // Catch:{ Exception -> 0x010f }
            f32.C75674c.m90930b(r4, r0)     // Catch:{ Exception -> 0x010f }
            r18.mo95526J7()     // Catch:{ Exception -> 0x010f }
            goto L_0x0200
        L_0x010f:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Parse LuckyMoneyDetail fail!"
            r4.append(r5)
            java.lang.String r0 = r0.getLocalizedMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
        L_0x0128:
            java.lang.String r0 = r1.f199665h
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0144
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r0 != 0) goto L_0x0144
            android.net.Uri r0 = android.net.Uri.parse(r9)
            java.lang.String r4 = "sendid"
            java.lang.String r0 = r0.getQueryParameter(r4)     // Catch:{ Exception -> 0x0143 }
            r1.f199665h = r0     // Catch:{ Exception -> 0x0143 }
            goto L_0x0144
        L_0x0143:
        L_0x0144:
            java.lang.String r0 = r1.f199665h
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01f8
            java.lang.String r6 = r1.f199665h
            java.lang.String r0 = "get recordList"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            androidx.appcompat.app.AppCompatActivity r10 = r18.getContext()
            r0 = 2131832197(0x7f112d85, float:1.9297441E38)
            java.lang.String r14 = r1.getString(r0)
            com.tencent.mm.plugin.luckymoney.ui.e r0 = new com.tencent.mm.plugin.luckymoney.ui.e
            r0.<init>(r1)
            r11 = 0
            r12 = 3
            r13 = 2131886550(0x7f1201d6, float:1.9407682E38)
            r15 = 1
            r16 = 1
            r17 = r0
            qo3.i0 r0 = nj3.C76879j.m92721O(r10, r11, r12, r13, r14, r15, r16, r17)
            r1.f199664g = r0
            int r0 = r1.f199666i
            r3 = 3
            if (r0 == 0) goto L_0x01b5
            boolean r0 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81608n(r0)
            if (r0 == 0) goto L_0x018d
            com.tencent.mm.plugin.luckymoney.model.v1 r0 = new com.tencent.mm.plugin.luckymoney.model.v1
            r7 = 11
            r8 = 0
            java.lang.String r10 = "v1.0"
            java.lang.String r11 = ""
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x01f4
        L_0x018d:
            int r0 = r1.f199670p
            if (r0 != r3) goto L_0x01a6
            w32.d r0 = new w32.d
            r7 = 11
            r8 = 0
            java.lang.String r12 = r1.f199671q
            java.lang.String r13 = r1.f199672r
            int r14 = r1.f199673s
            java.lang.String r10 = "v1.0"
            java.lang.String r11 = ""
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01f4
        L_0x01a6:
            com.tencent.mm.plugin.luckymoney.model.u1 r0 = new com.tencent.mm.plugin.luckymoney.model.u1
            r7 = 11
            r8 = 0
            java.lang.String r10 = "v1.0"
            java.lang.String r11 = ""
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x01f4
        L_0x01b5:
            int r0 = r1.f199669o
            r4 = 5
            if (r0 != r4) goto L_0x01c9
            com.tencent.mm.plugin.luckymoney.model.v1 r0 = new com.tencent.mm.plugin.luckymoney.model.v1
            r7 = 11
            r8 = 0
            java.lang.String r10 = "v1.0"
            java.lang.String r11 = ""
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x01f4
        L_0x01c9:
            int r4 = r1.f199670p
            if (r4 == r3) goto L_0x01e0
            r3 = 7
            if (r0 != r3) goto L_0x01d1
            goto L_0x01e0
        L_0x01d1:
            com.tencent.mm.plugin.luckymoney.model.u1 r0 = new com.tencent.mm.plugin.luckymoney.model.u1
            r7 = 11
            r8 = 0
            java.lang.String r10 = "v1.0"
            java.lang.String r11 = ""
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x01f4
        L_0x01e0:
            w32.d r0 = new w32.d
            r7 = 11
            r8 = 0
            java.lang.String r12 = r1.f199671q
            java.lang.String r13 = r1.f199672r
            int r14 = r1.f199673s
            java.lang.String r10 = "v1.0"
            java.lang.String r11 = ""
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x01f4:
            r1.doSceneProgress(r0, r2)
            goto L_0x0200
        L_0x01f8:
            java.lang.String r0 = "sendid null or nil, finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            r18.finish()
        L_0x0200:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyBeforeDetailUI.onCreate(android.os.Bundle):void");
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.LuckyMoneyBeforeDetailUI", "onSceneEnd() errType:" + i + " errCode:" + i2 + " errMsg:" + str + " netsceneType:" + yVar.getType());
        if (!(yVar instanceof C69267u1)) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            C69267u1 u1Var = (C69267u1) yVar;
            C75674c.m90930b(this.f199665h, u1Var.f199337h);
            getIntent().putExtra("key_process_content", u1Var.f199338i);
            getIntent().putExtra("key_detail_emoji_md5", u1Var.f199339j);
            getIntent().putExtra("key_detail_emoji_type", u1Var.f199340n);
            getIntent().putExtra("key_emoji_switch", u1Var.f199341o);
            C69158a0 a0Var = u1Var.f199337h;
            if (a0Var != null && !Util.isNullOrNil(a0Var.f198954Q)) {
                this.f199667j = u1Var.f199337h.f198954Q;
            }
            mo95526J7();
            return true;
        }
        C76879j.m92726T(this, str);
        finish();
        return true;
    }
}
