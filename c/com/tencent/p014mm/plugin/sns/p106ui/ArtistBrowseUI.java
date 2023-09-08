package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C96087o0;
import com.tencent.p014mm.plugin.sns.p106ui.C96158q0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.ArtistBrowseUI */
public class ArtistBrowseUI extends SnsBaseGalleryUI {

    /* renamed from: P */
    public String f276624P = "";

    /* renamed from: Q */
    public String f276625Q = "";

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$a */
    public class C95304a implements MenuItem.OnMenuItemClickListener {
        public C95304a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$1");
            ArtistBrowseUI.this.mo132591T7().mo132171f();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$1");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$b */
    public class C95305b implements C96158q0.C96165j {
        public C95305b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$c */
    public class C95306c implements C96087o0.C96094f {
        public C95306c() {
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            Log.m105918d("MicroMsg.ArtistBrowseUI", "dispatchKeyEvent");
            Intent intent = new Intent();
            intent.putExtra("sns_cmd_list", mo132591T7().mo132173h());
            setResult(-1, intent);
            finish();
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        return dispatchKeyEvent;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        return C0966R.C0971layout.f360005c34;
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [pe3.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r13 = this;
            java.lang.String r0 = "initView"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            android.content.res.Resources r2 = r13.getResources()
            r3 = 2131100166(0x7f060206, float:1.7812706E38)
            int r2 = r2.getColor(r3)
            r13.setActionbarColor(r2)
            android.content.res.Resources r2 = r13.getResources()
            int r2 = r2.getColor(r3)
            r13.setNavigationbarColor(r2)
            android.content.Intent r2 = r13.getIntent()
            java.lang.String r3 = "sns_gallery_artist_lan"
            java.lang.String r2 = r2.getStringExtra(r3)
            r13.f276624P = r2
            android.content.Intent r2 = r13.getIntent()
            java.lang.String r3 = "sns_gallery_position"
            r4 = 0
            int r8 = r2.getIntExtra(r3, r4)
            java.lang.Class<op.j> r2 = p216op.C100370j.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            op.j r2 = (p216op.C100370j) r2
            java.lang.String r2 = r2.mo72329HT()
            r13.f276625Q = r2
            r2 = 2
            r13.mo132582K7(r4, r2)
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r2 = new com.tencent.mm.plugin.sns.ui.SnsInfoFlip
            r2.<init>(r13)
            r13.f277761o = r2
            java.lang.String r2 = r13.f276624P
            java.lang.String r3 = r13.f276625Q
            int r5 = com.tencent.p014mm.plugin.sns.model.C94897n1.f274990d
            java.lang.String r5 = "getArtistMediaList"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r9 = 0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            r10.<init>()     // Catch:{ Exception -> 0x0104 }
            r10.append(r3)     // Catch:{ Exception -> 0x0104 }
            r10.append(r2)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r11 = "_ARTISTF.mm"
            r10.append(r11)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            r11.<init>()     // Catch:{ Exception -> 0x0104 }
            r11.append(r3)     // Catch:{ Exception -> 0x0104 }
            r11.append(r2)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r2 = "_ARTIST.mm"
            r11.append(r2)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r2 = r11.toString()     // Catch:{ Exception -> 0x0104 }
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)     // Catch:{ Exception -> 0x0104 }
            if (r3 == 0) goto L_0x00a8
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r10)     // Catch:{ Exception -> 0x0104 }
            int r3 = (int) r11     // Catch:{ Exception -> 0x0104 }
            byte[] r3 = com.tencent.p014mm.vfs.C86013q1.m106433O(r10, r4, r3)     // Catch:{ Exception -> 0x0104 }
            te3.l4 r9 = new te3.l4     // Catch:{ Exception -> 0x0104 }
            r9.<init>()     // Catch:{ Exception -> 0x0104 }
            pe3.a r3 = r9.parseFrom(r3)     // Catch:{ Exception -> 0x0104 }
            r9 = r3
            te3.l4 r9 = (te3.C64512l4) r9     // Catch:{ Exception -> 0x0104 }
        L_0x00a8:
            if (r9 != 0) goto L_0x00c7
            com.tencent.p014mm.vfs.C86013q1.m106447h(r10)     // Catch:{ Exception -> 0x0104 }
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)     // Catch:{ Exception -> 0x0104 }
            int r3 = (int) r11     // Catch:{ Exception -> 0x0104 }
            byte[] r2 = com.tencent.p014mm.vfs.C86013q1.m106433O(r2, r4, r3)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0104 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0104 }
            te3.l4 r9 = ms2.C99963a.m130602c(r3)     // Catch:{ Exception -> 0x0104 }
            byte[] r2 = r9.toByteArray()     // Catch:{ Exception -> 0x0104 }
            r3 = -1
            com.tencent.p014mm.vfs.C86013q1.m106438T(r10, r2, r4, r3)     // Catch:{ Exception -> 0x0104 }
        L_0x00c7:
            java.util.LinkedList<te3.ae2> r2 = r9.f184029e     // Catch:{ Exception -> 0x0104 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0104 }
            r3 = 0
        L_0x00ce:
            boolean r9 = r2.hasNext()     // Catch:{ Exception -> 0x0104 }
            if (r9 == 0) goto L_0x010b
            java.lang.Object r9 = r2.next()     // Catch:{ Exception -> 0x0104 }
            te3.ae2 r9 = (te3.C64231ae2) r9     // Catch:{ Exception -> 0x0104 }
            java.lang.String r10 = r9.f182080d     // Catch:{ Exception -> 0x0104 }
            java.util.LinkedList<te3.kv2> r9 = r9.f182081e     // Catch:{ Exception -> 0x0104 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0104 }
        L_0x00e2:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x0104 }
            if (r11 == 0) goto L_0x00ce
            java.lang.Object r11 = r9.next()     // Catch:{ Exception -> 0x0104 }
            te3.kv2 r11 = (te3.C101804kv2) r11     // Catch:{ Exception -> 0x0104 }
            r11.f298691f = r10     // Catch:{ Exception -> 0x0104 }
            te3.pp1 r12 = new te3.pp1     // Catch:{ Exception -> 0x0104 }
            r12.<init>()     // Catch:{ Exception -> 0x0104 }
            r12.f299180d = r11     // Catch:{ Exception -> 0x0104 }
            java.lang.String r11 = ""
            r12.f299181e = r11     // Catch:{ Exception -> 0x0104 }
            int r11 = r3 + 1
            r12.f299183g = r3     // Catch:{ Exception -> 0x0104 }
            r7.add(r12)     // Catch:{ Exception -> 0x0104 }
            r3 = r11
            goto L_0x00e2
        L_0x0104:
            java.lang.String r2 = "MicroMsg.SnsInfoStorageLogic"
            java.lang.String r3 = "error initDataArtist"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)
        L_0x010b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r2 = r13.f277761o
            r3 = 1
            r2.setShowTitle(r3)
            boolean r2 = r13.f277753d
            if (r2 == 0) goto L_0x0127
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r5 = r13.f277761o
            com.tencent.mm.plugin.sns.ui.q0 r9 = r13.mo132587P7()
            java.lang.String r2 = ""
            r6 = r7
            r7 = r2
            r10 = r13
            r5.mo132797z(r6, r7, r8, r9, r10)
            goto L_0x0135
        L_0x0127:
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r5 = r13.f277761o
            com.tencent.mm.plugin.sns.ui.o0 r9 = r13.mo132586O7()
            java.lang.String r2 = ""
            r6 = r7
            r7 = r2
            r10 = r13
            r5.mo132797z(r6, r7, r8, r9, r10)
        L_0x0135:
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r2 = r13.f277761o
            r2.setOnPageSelectListener(r13)
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r2 = r13.f277761o
            r13.addView(r2)
            com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$a r2 = new com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$a
            r2.<init>()
            r13.setBackBtn(r2)
            r2 = 2131837233(0x7f114131, float:1.9307655E38)
            r13.setMMTitle((int) r2)
            r13.showOptionMenu(r4)
            boolean r2 = r13.f277753d
            if (r2 == 0) goto L_0x0161
            com.tencent.mm.plugin.sns.ui.q0 r2 = r13.mo132587P7()
            com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$b r3 = new com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$b
            r3.<init>()
            r2.setCallBack(r3)
            goto L_0x016d
        L_0x0161:
            com.tencent.mm.plugin.sns.ui.o0 r2 = r13.mo132586O7()
            com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$c r3 = new com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$c
            r3.<init>()
            r2.setCallBack(r3)
        L_0x016d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.ArtistBrowseUI.initView():void");
    }

    /* renamed from: m1 */
    public void mo132030m1(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        SnsMethodCalculate.markEndTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }

    /* renamed from: o2 */
    public void mo132031o2(boolean z, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            if (z) {
                snsInfoFlip.mo132768C(true);
            } else {
                snsInfoFlip.mo132796y();
            }
        }
        SnsMethodCalculate.markEndTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        Log.m105924i("MicroMsg.ArtistBrowseUI", "onAcvityResult requestCode:" + i);
        if (i2 != -1) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
            return;
        }
        int intExtra = intent.getIntExtra("sns_gallery_op_id", 0);
        GalleryTitleManager T7 = mo132591T7();
        T7.getClass();
        SnsMethodCalculate.markStartTimeMs("addOpCmd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (intExtra == 0) {
            SnsMethodCalculate.markEndTimeMs("addOpCmd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        } else {
            T7.f276838e.mo130689a(intExtra);
            SnsMethodCalculate.markEndTimeMs("addOpCmd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        super.onCreate(bundle);
        initView();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        C94866e1.Fx0().mo131089I(this);
        super.onDestroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            snsInfoFlip.mo132767B();
        }
        super.onPause();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        super.onResume();
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            snsInfoFlip.mo132768C(false);
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }
}
