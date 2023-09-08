package com.tencent.p014mm.plugin.product.p087ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.plugin.product.p087ui.C94307j;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import java.util.ArrayList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import p140cw.C7138g;
import p823sg.C90193h;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.product.ui.MallGalleryUI */
public class MallGalleryUI extends MallBaseUI {

    /* renamed from: e */
    public ViewPager f272460e;

    /* renamed from: f */
    public C94307j f272461f;

    /* renamed from: g */
    public List<String> f272462g;

    /* renamed from: h */
    public int f272463h = 0;

    /* renamed from: i */
    public boolean f272464i;

    /* renamed from: com.tencent.mm.plugin.product.ui.MallGalleryUI$a */
    public class C94302a implements ViewPager.OnPageChangeListener {
        public C94302a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public synchronized void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            Log.m105919d("MicroMsg.MallGalleryUI", "Page Selected postion: %d", Integer.valueOf(i));
            MallGalleryUI mallGalleryUI = MallGalleryUI.this;
            mallGalleryUI.f272463h = i;
            if (mallGalleryUI.f272464i) {
                mallGalleryUI.hideTitleView();
                MallGalleryUI.this.f272464i = false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallGalleryUI$b */
    public class C94303b implements C94307j.C94308a {
        public C94303b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallGalleryUI$c */
    public class C94304c implements MenuItem.OnMenuItemClickListener {
        public C94304c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MallGalleryUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallGalleryUI$d */
    public class C94305d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.product.ui.MallGalleryUI$d$a */
        public class C94306a implements C76879j.C11180n {
            public C94306a() {
            }

            /* renamed from: j */
            public void mo782j(int i) {
                if (i == 0) {
                    MallGalleryUI mallGalleryUI = MallGalleryUI.this;
                    mallGalleryUI.getClass();
                    Intent intent = new Intent();
                    intent.putExtra("Retr_Msg_content", "");
                    intent.putExtra("Retr_Msg_Type", 0);
                    if (!Util.isNullOrNil(mallGalleryUI.mo129643H7())) {
                        intent.putExtra("Retr_File_Name", mallGalleryUI.mo129643H7());
                        intent.putExtra("Retr_go_to_chattingUI", false);
                        intent.putExtra("Retr_show_success_tips", true);
                        C88144b.m109801s(mallGalleryUI, ".ui.transmit.MsgRetransmitUI", intent, (Bundle) null);
                        return;
                    }
                    Log.m105920e("MicroMsg.MallGalleryUI", "url is null or nil");
                } else if (i == 1) {
                    MallGalleryUI mallGalleryUI2 = MallGalleryUI.this;
                    String H7 = mallGalleryUI2.mo129643H7();
                    if (!Util.isNullOrNil(H7)) {
                        Log.m105919d("MicroMsg.MallGalleryUI", "can save. img path: %s", H7);
                        ((C7138g) C86312j.m106911c(C7138g.class)).he0(H7, mallGalleryUI2);
                        return;
                    }
                    Log.m105928w("MicroMsg.MallGalleryUI", "save error.");
                } else if (i == 2) {
                    MallGalleryUI mallGalleryUI3 = MallGalleryUI.this;
                    String H72 = mallGalleryUI3.mo129643H7();
                    if (!Util.isNullOrNil(H72)) {
                        Log.m105918d("MicroMsg.MallGalleryUI", "file path valid");
                        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                        if (Util.isNullOrNil(H72)) {
                            Log.m105928w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
                            doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
                        } else {
                            Log.m105925i("MicroMsg.GetFavDataSource", "do fill event info(fav simple image), path %s sourceType %d", H72, 9);
                            C101801kd0 kd02 = new C101801kd0();
                            C101835rd0 rd02 = new C101835rd0();
                            C101834rc0 rc02 = new C101834rc0();
                            rc02.mo141260p(2);
                            rc02.f299284V = H72;
                            rc02.mo141257m(C90193h.m112878f((rc02.toString() + 2 + System.currentTimeMillis()).getBytes()));
                            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
                            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
                            aVar.f264835a = 27;
                            aVar.f264840f = rc02;
                            favoriteOperationEvent.publish();
                            String str = favoriteOperationEvent.f264834e.f264858d;
                            BitmapUtil.createThumbNail(H72, 150, 150, Bitmap.CompressFormat.JPEG, 90, str, true);
                            rc02.f299286W = str;
                            rd02.mo141275k(C75592q0.m90789s());
                            rd02.mo141279o(C75592q0.m90789s());
                            rd02.mo141277m(9);
                            rd02.mo141273f(Util.nowMilliSecond());
                            kd02.mo141219q(rd02);
                            kd02.f298618f.add(rc02);
                            DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                            aVar2.f264679d = rc02.f299297d;
                            aVar2.f264676a = kd02;
                            aVar2.f264678c = 2;
                        }
                        DoFavoriteEvent.C92474a aVar3 = doFavoriteEvent.f264674d;
                        aVar3.f264688m = 4;
                        aVar3.f264684i = mallGalleryUI3;
                        doFavoriteEvent.publish();
                        return;
                    }
                    Log.m105928w("MicroMsg.MallGalleryUI", "file path invalid");
                }
            }
        }

        public C94305d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C88144b.m109788f("favorite");
            C76879j.m92737h(MallGalleryUI.this.getContext(), (String) null, MallGalleryUI.this.getResources().getStringArray(C0966R.array.f2584z), (String) null, false, new C94306a());
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo129643H7() {
        /*
            r5 = this;
            java.util.List<java.lang.String> r0 = r5.f272462g
            r1 = 0
            java.lang.String r2 = "MicroMsg.MallGalleryUI"
            if (r0 == 0) goto L_0x001b
            int r0 = r0.size()
            int r3 = r5.f272463h
            int r4 = r3 + 1
            if (r0 >= r4) goto L_0x0012
            goto L_0x001b
        L_0x0012:
            java.util.List<java.lang.String> r0 = r5.f272462g
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0021
        L_0x001b:
            java.lang.String r0 = "data not ready.retransmit failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r0 = r1
        L_0x0021:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "invoke error. No current url"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            return r1
        L_0x002e:
            java.lang.String r0 = com.tencent.p014mm.plugin.product.p087ui.C70106c.m82576m(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.product.p087ui.MallGalleryUI.mo129643H7():java.lang.String");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bnz;
    }

    public void initView() {
        ViewPager viewPager = (ViewPager) findViewById(C0966R.C0970id.gll);
        this.f272460e = viewPager;
        viewPager.setOnPageChangeListener(new C94302a());
        C94307j jVar = new C94307j(this);
        this.f272461f = jVar;
        jVar.f272473g = new C94303b();
        this.f272460e.setAdapter(jVar);
        setBackBtn(new C94304c());
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C94305d());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f272462g = getIntent().getStringArrayListExtra("keys_img_urls");
        hideTitleView();
        this.f272464i = false;
        initView();
    }

    public void onResume() {
        super.onResume();
        C94307j jVar = this.f272461f;
        List<String> list = this.f272462g;
        jVar.getClass();
        if (list != null) {
            if (list.size() > 0) {
                jVar.f272471e = list;
            }
            ArrayList<C94307j.C94309b> arrayList = jVar.f272472f;
            if (arrayList == null) {
                jVar.f272472f = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            for (String bVar : jVar.f272471e) {
                jVar.f272472f.add(new C94307j.C94309b(jVar, bVar));
            }
        }
        this.f272461f.notifyDataSetChanged();
        List<String> list2 = this.f272462g;
        if (list2 != null) {
            list2.size();
        }
    }
}
