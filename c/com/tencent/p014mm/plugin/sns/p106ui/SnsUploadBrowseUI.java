package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import i21.C60242i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k21.C60960c;
import nj3.C76879j;
import te3.C101804kv2;
import te3.C101829pp1;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI */
public class SnsUploadBrowseUI extends SnsBaseGalleryUI {

    /* renamed from: P */
    public ArrayList<String> f278882P = new ArrayList<>();

    /* renamed from: Q */
    public int f278883Q = 0;

    /* renamed from: R */
    public HashMap<Integer, Boolean> f278884R = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$a */
    public class C95670a implements MenuItem.OnMenuItemClickListener {
        public C95670a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$1");
            SnsUploadBrowseUI.this.mo133056c8();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$1");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$b */
    public class C95671b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$b$a */
        public class C95672a implements DialogInterface.OnClickListener {
            public C95672a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                int i2;
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2$1");
                SnsInfoFlip snsInfoFlip = SnsUploadBrowseUI.this.f277761o;
                snsInfoFlip.getClass();
                SnsMethodCalculate.markStartTimeMs("removeSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                MMViewPager mMViewPager = snsInfoFlip.f278147U;
                if (mMViewPager == null || snsInfoFlip.f278149V == null) {
                    i2 = -1;
                    SnsMethodCalculate.markEndTimeMs("removeSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                } else {
                    int currentItem = mMViewPager.getCurrentItem();
                    if (currentItem >= 0 && snsInfoFlip.f278153X0.size() > currentItem) {
                        snsInfoFlip.f278153X0.remove(currentItem);
                        snsInfoFlip.f278149V.notifyDataSetChanged();
                        snsInfoFlip.mo132769D();
                    }
                    i2 = snsInfoFlip.f278149V.getCount();
                    SnsMethodCalculate.markEndTimeMs("removeSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                }
                if (i2 == 0) {
                    SnsUploadBrowseUI.this.mo133056c8();
                }
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$b$b */
        public class C95673b implements DialogInterface.OnClickListener {
            public C95673b(C95671b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2$2");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2$2");
            }
        }

        public C95671b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2");
            C76879j.m92743n(SnsUploadBrowseUI.this, C0966R.string.jcr, C0966R.string.a3h, new C95672a(), new C95673b(this));
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2");
            return true;
        }
    }

    /* renamed from: c8 */
    public void mo133056c8() {
        SnsMethodCalculate.markStartTimeMs("finishWithIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        Intent intent = new Intent();
        List<C101829pp1> flipList = this.f277761o.getFlipList();
        if (flipList == null) {
            SnsMethodCalculate.markEndTimeMs("finishWithIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
            return;
        }
        this.f278882P.clear();
        for (C101829pp1 next : flipList) {
            String str = C94866e1.m120263iU() + next.f299180d.f298689d;
            if (next.f299180d.f298689d.startsWith("pre_temp_extend_pic")) {
                str = next.f299180d.f298689d.substring(19);
            }
            this.f278882P.add(str);
        }
        intent.putExtra("sns_gallery_temp_paths", this.f278882P);
        intent.putExtra("sns_update_preview_image_count", this.f278884R.size());
        this.f278884R.clear();
        setResult(-1, intent);
        finish();
        SnsMethodCalculate.markEndTimeMs("finishWithIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            Log.m105918d("MicroMsg.SnsUploadBrowseUI", "dispatchKeyEvent");
            mo133056c8();
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        return dispatchKeyEvent;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        return C0966R.C0971layout.c2b;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        boolean booleanExtra = getIntent().getBooleanExtra("k_need_delete", true);
        String nullAs = Util.nullAs(getIntent().getStringExtra("sns_gallery_userName"), "");
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("sns_gallery_temp_paths");
        this.f278882P = stringArrayListExtra;
        if (stringArrayListExtra == null) {
            SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
            return;
        }
        this.f278883Q = getIntent().getIntExtra("sns_gallery_position", 0);
        SnsInfoFlip snsInfoFlip = new SnsInfoFlip(this);
        this.f277761o = snsInfoFlip;
        snsInfoFlip.setEnableHorLongBmpMode(false);
        this.f277761o.setShowTitle(true);
        C94866e1.m120263iU();
        ArrayList<String> arrayList = this.f278882P;
        int i = C94897n1.f274990d;
        SnsMethodCalculate.markStartTimeMs("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        ArrayList arrayList2 = new ArrayList();
        if (arrayList == null) {
            SnsMethodCalculate.markEndTimeMs("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        } else {
            arrayList2.clear();
            int i2 = 0;
            for (String str : arrayList) {
                C101829pp1 pp12 = new C101829pp1();
                C101804kv2 kv22 = new C101804kv2();
                kv22.f298689d = "pre_temp_extend_pic" + str;
                pp12.f299180d = kv22;
                pp12.f299181e = "";
                pp12.f299183g = i2;
                arrayList2.add(pp12);
                i2++;
            }
            SnsMethodCalculate.markEndTimeMs("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        }
        if (this.f277753d) {
            this.f277761o.mo132797z(arrayList2, nullAs, this.f278883Q, mo132587P7(), this);
        } else {
            this.f277761o.mo132797z(arrayList2, nullAs, this.f278883Q, mo132586O7(), this);
        }
        this.f277761o.setOnPageSelectListener(this);
        addView(this.f277761o);
        setBackBtn(new C95670a());
        if (booleanExtra) {
            addIconOptionMenu(0, (int) C0966R.string.f7944x1, (int) C0966R.raw.icons_outlined_delete, (MenuItem.OnMenuItemClickListener) new C95671b());
        }
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    /* renamed from: m1 */
    public void mo132030m1(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        SnsMethodCalculate.markEndTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    /* renamed from: o2 */
    public void mo132031o2(boolean z, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            if (z) {
                snsInfoFlip.mo132768C(true);
            } else {
                snsInfoFlip.mo132796y();
            }
        }
        SnsMethodCalculate.markEndTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        Log.m105924i("MicroMsg.SnsUploadBrowseUI", "onAcvityResult requestCode:" + i);
        if (i2 != -1) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        } else {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        }
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        C85875k4.m106195m0(this);
        super.onCreate(bundle);
        initView();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        C94866e1.Fx0().mo131089I(this);
        super.onDestroy();
        C60960c.f173618a.mo85927k("SnsPublishProcess", "mediaPreviewPageStaytime_", Long.valueOf(getActivityBrowseTimeMs()), C60242i.APPEND);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            snsInfoFlip.mo132767B();
        }
        super.onPause();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        super.onResume();
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            snsInfoFlip.mo132768C(false);
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    /* renamed from: s5 */
    public void mo132601s5(C101804kv2 kv22, int i, String str) {
        SnsMethodCalculate.markStartTimeMs("onPageChange", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        super.mo132601s5(kv22, i, str);
        this.f278884R.put(Integer.valueOf(i), Boolean.TRUE);
        SnsMethodCalculate.markEndTimeMs("onPageChange", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }
}
