package com.tencent.p014mm.plugin.game.media;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import jy1.C46587e;
import k20.C60958c;
import k20.C9556a;
import ly1.C46911q;
import ly1.C99723d;
import ly1.C99776u;
import nj3.C76879j;
import org.json.JSONArray;
import org.json.JSONException;
import p143ds.C97526j;
import p447aw.C103918d;
import w10.C15032a;

/* renamed from: com.tencent.mm.plugin.game.media.GamePublishGalleryUI */
public class GamePublishGalleryUI extends MMActivity {

    /* renamed from: d */
    public TextViewWithBottomLine f271728d;

    /* renamed from: e */
    public TextViewWithBottomLine f271729e;

    /* renamed from: f */
    public ViewPager f271730f;

    /* renamed from: g */
    public GameLocalGalleryView f271731g;

    /* renamed from: h */
    public C99776u f271732h;

    /* renamed from: i */
    public int f271733i;

    /* renamed from: com.tencent.mm.plugin.game.media.GamePublishGalleryUI$a */
    public class C69012a implements View.OnClickListener {
        public C69012a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/GamePublishGalleryUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            GamePublishGalleryUI.this.f271728d.setSelected(true);
            GamePublishGalleryUI.this.f271729e.setSelected(false);
            GamePublishGalleryUI.this.mo129152H7(0, false);
            GamePublishGalleryUI.this.f271731g.mo129142a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GamePublishGalleryUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GamePublishGalleryUI$b */
    public class C69013b implements View.OnClickListener {
        public C69013b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/GamePublishGalleryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            GamePublishGalleryUI.this.f271729e.setSelected(true);
            GamePublishGalleryUI.this.f271728d.setSelected(false);
            GamePublishGalleryUI.this.mo129152H7(1, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GamePublishGalleryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GamePublishGalleryUI$c */
    public class C69014c implements View.OnClickListener {
        public C69014c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/media/GamePublishGalleryUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            GamePublishGalleryUI.this.setResult(0);
            GamePublishGalleryUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GamePublishGalleryUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GamePublishGalleryUI$d */
    public class C69015d implements ViewPager.OnPageChangeListener {
        public C69015d() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            if (i % 2 == 0) {
                GamePublishGalleryUI.this.f271728d.setSelected(true);
                GamePublishGalleryUI.this.f271729e.setSelected(false);
                GamePublishGalleryUI.this.f271731g.mo129142a();
            } else {
                GamePublishGalleryUI.this.f271729e.setSelected(true);
                GamePublishGalleryUI.this.f271728d.setSelected(false);
            }
            GamePublishGalleryUI.this.mo129152H7(i, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GamePublishGalleryUI$e */
    public class C69016e implements DialogInterface.OnClickListener {
        public C69016e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(GamePublishGalleryUI.this.getContext());
            GamePublishGalleryUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.media.GamePublishGalleryUI$f */
    public class C69017f implements DialogInterface.OnClickListener {
        public C69017f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GamePublishGalleryUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public void mo129152H7(int i, boolean z) {
        C99776u uVar;
        int i2 = i % 2;
        if (i2 != 0 || (uVar = this.f271732h) == null) {
            GameLocalGalleryView gameLocalGalleryView = this.f271731g;
            if (!gameLocalGalleryView.f271703i) {
                gameLocalGalleryView.mo129144c(0, 1, (Map) null);
            }
            gameLocalGalleryView.f271703i = true;
            C99776u uVar2 = this.f271732h;
            if (uVar2 != null) {
                uVar2.f292429p.dismiss();
                MTimerHandler mTimerHandler = uVar2.f292435v;
                if (mTimerHandler != null) {
                    mTimerHandler.stopTimer();
                }
            }
        } else {
            if (!uVar.f292430q) {
                uVar.mo139137f(0, 1, new HashMap());
            }
            uVar.f292430q = true;
            this.f271732h.mo139135d();
        }
        this.f271730f.setCurrentItem(i);
        if (z) {
            C40314g.m43484c(MMApplicationContext.getContext(), 87, i2 == 0 ? 8762 : 8767, 0, 2, this.f271733i, C15032a.m14200a(7, new HashMap()));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.awj;
    }

    public final void init() {
        int i;
        TextView textView;
        View view;
        getController().mo177059O0(this, getResources().getColor(C0966R.color.al6));
        TextViewWithBottomLine textViewWithBottomLine = (TextViewWithBottomLine) findViewById(C0966R.C0970id.emq);
        this.f271728d = textViewWithBottomLine;
        textViewWithBottomLine.setOnClickListener(new C69012a());
        TextViewWithBottomLine textViewWithBottomLine2 = (TextViewWithBottomLine) findViewById(C0966R.C0970id.em8);
        this.f271729e = textViewWithBottomLine2;
        textViewWithBottomLine2.setOnClickListener(new C69013b());
        ((TextView) findViewById(C0966R.C0970id.ekk)).setOnClickListener(new C69014c());
        this.f271730f = (ViewPager) findViewById(C0966R.C0970id.eob);
        ArrayList arrayList = new ArrayList();
        int intExtra = getIntent().getIntExtra("query_media_type", 3);
        boolean booleanExtra = getIntent().getBooleanExtra("game_haowan_force_select", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("game_straight_to_publish", false);
        this.f271733i = getIntent().getIntExtra("game_haowan_source_scene_id", 0);
        GameGalleryFragment gameGalleryFragment = new GameGalleryFragment();
        int i2 = MultiProcessMMKV.getMMKV(C99723d.m130164b("game_haowan_mmkv_key")).getInt("game_last_choose_gallery", 0);
        if (intExtra == 1) {
            gameGalleryFragment.f162843d = new FrameLayout(this);
            i = 1;
        } else {
            int intExtra2 = getIntent().getIntExtra("game_media_default_type", 0);
            if (intExtra2 == 1 || intExtra2 == 2) {
                i2 = intExtra2;
            }
            i = (i2 != 1 && i2 == 2) ? 1 : 0;
            this.f271732h = new C99776u(this);
            getIntent().getBooleanExtra("game_haowan_ignore_video_preview", true);
            C99776u uVar = this.f271732h;
            int i3 = this.f271733i;
            uVar.f292431r = booleanExtra;
            if (booleanExtra && (view = uVar.f292427n) != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "setConfig", "(ZZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "setConfig", "(ZZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            uVar.f292432s = booleanExtra2;
            uVar.f292433t = i3;
            String stringExtra = getIntent().getStringExtra("game_haowan_local_albums_info");
            JSONArray jSONArray = new JSONArray();
            if (!Util.isNullOrNil(stringExtra)) {
                try {
                    jSONArray = new JSONArray(stringExtra);
                } catch (JSONException unused) {
                }
            }
            if (jSONArray.length() == 0) {
                jSONArray = C41853c.m45370d();
            }
            this.f271732h.setLocalAlbumInfos(jSONArray);
            this.f271732h.setBackgroundColor(getResources().getColor(C0966R.color.al6));
            gameGalleryFragment.f162843d = this.f271732h;
        }
        arrayList.add(gameGalleryFragment);
        GameGalleryFragment gameGalleryFragment2 = new GameGalleryFragment();
        GameLocalGalleryView gameLocalGalleryView = new GameLocalGalleryView(this);
        this.f271731g = gameLocalGalleryView;
        int i4 = this.f271733i;
        gameLocalGalleryView.f271704j = booleanExtra;
        if (booleanExtra && (textView = gameLocalGalleryView.f271700f) != null) {
            textView.setVisibility(8);
        }
        gameLocalGalleryView.f271705n = booleanExtra2;
        gameLocalGalleryView.f271706o = i4;
        this.f271731g.setQueryType(intExtra);
        this.f271731g.setSelectLimitCount(getIntent().getIntExtra("max_select_count", 9));
        gameGalleryFragment2.f162843d = this.f271731g;
        arrayList.add(gameGalleryFragment2);
        this.f271730f.setAdapter(new C46911q(getSupportFragmentManager(), arrayList));
        this.f271730f.addOnPageChangeListener(new C69015d());
        C46587e eVar = C46587e.f125495a;
        if (C46587e.m51909b() != 4) {
            this.f271728d.setSelected(false);
            this.f271729e.setSelected(true);
            mo129152H7(1, false);
            return;
        }
        this.f271728d.setSelected(true);
        this.f271729e.setSelected(false);
        mo129152H7(i, false);
    }

    public boolean noActionBar() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0149 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r20, int r21, android.content.Intent r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            com.tencent.mm.plugin.game.media.GameLocalGalleryView r4 = r0.f271731g
            r5 = -1
            r6 = 1
            if (r4 == 0) goto L_0x014a
            r4.getClass()
            r7 = 2
            r8 = 25690(0x645a, float:3.6E-41)
            if (r1 != r8) goto L_0x0030
            if (r2 != r5) goto L_0x002d
            ly1.C99723d.m130165g(r7)
            android.content.Context r7 = r4.getContext()
            android.app.Activity r7 = (android.app.Activity) r7
            r7.setResult(r5, r3)
            android.content.Context r4 = r4.getContext()
            android.app.Activity r4 = (android.app.Activity) r4
            r4.finish()
        L_0x002d:
            r9 = 1
            goto L_0x0147
        L_0x0030:
            r8 = 63802(0xf93a, float:8.9406E-41)
            r9 = 0
            if (r1 != r8) goto L_0x0147
            r8 = -2
            java.lang.String r10 = "MicroMsg.GameLocalMediaView"
            if (r2 == r8) goto L_0x0137
            if (r2 == r5) goto L_0x0105
            if (r2 == 0) goto L_0x0040
            goto L_0x002d
        L_0x0040:
            if (r3 == 0) goto L_0x002d
            java.lang.String r8 = "preview_image_list"
            java.util.ArrayList r8 = r3.getStringArrayListExtra(r8)
            if (r8 == 0) goto L_0x002d
            com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r4 = r4.f271699e
            if (r4 == 0) goto L_0x002d
            java.lang.Class<ds.j> r11 = p143ds.C97526j.class
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r13 = r4.f271712e
            r12[r9] = r13
            java.lang.String r13 = "before set selected paths, selected[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r13, r12)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r12 = r4.f271712e
            r12.clear()
            java.util.Iterator r8 = r8.iterator()
        L_0x0065:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x00e1
            java.lang.Object r12 = r8.next()
            java.lang.String r12 = (java.lang.String) r12
            r13 = 0
            r14 = 0
            java.lang.String r18 = ""
            r16 = r12
            r17 = r12
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r13 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.m65488c(r13, r14, r16, r17, r18)
            di3.d r14 = di3.C86312j.m106911c(r11)
            ds.j r14 = (p143ds.C97526j) r14
            java.util.ArrayList r14 = r14.mo136639hA()
            if (r14 == 0) goto L_0x00c7
            di3.d r14 = di3.C86312j.m106911c(r11)
            ds.j r14 = (p143ds.C97526j) r14
            java.util.ArrayList r14 = r14.mo136639hA()
            int r13 = r14.indexOf(r13)
            if (r13 < 0) goto L_0x00c7
            di3.d r14 = di3.C86312j.m106911c(r11)
            ds.j r14 = (p143ds.C97526j) r14
            java.util.ArrayList r14 = r14.mo136639hA()
            java.lang.Object r13 = r14.get(r13)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r13 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r13
            if (r13 == 0) goto L_0x00c7
            int r13 = r13.getType()
            if (r13 != r7) goto L_0x00c7
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r14 = r4.f271712e
            r13 = 2
            r15 = 0
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            r5 = r14
            r14 = r15
            r16 = r12
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r12 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.m65488c(r13, r14, r16, r17, r18)
            r5.add(r12)
            goto L_0x00df
        L_0x00c7:
            java.lang.String r5 = "media item no exist on preview items."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r5)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r5 = r4.f271712e
            r13 = 1
            r14 = 0
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            r16 = r12
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r12 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.m65488c(r13, r14, r16, r17, r18)
            r5.add(r12)
        L_0x00df:
            r5 = -1
            goto L_0x0065
        L_0x00e1:
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r7 = r4.f271712e
            r5[r9] = r7
            java.lang.String r7 = "after set selected paths, selected[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r7, r5)
            com.tencent.mm.plugin.game.media.GameLocalGalleryView$e r5 = r4.f271716i
            if (r5 == 0) goto L_0x00fb
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r7 = r4.f271712e
            int r7 = r7.size()
            com.tencent.mm.plugin.game.media.GameLocalGalleryView$c r5 = (com.tencent.p014mm.plugin.game.media.GameLocalGalleryView.C94090c) r5
            r5.mo129149a(r7)
        L_0x00fb:
            com.tencent.mm.plugin.game.media.e r5 = new com.tencent.mm.plugin.game.media.e
            r5.<init>(r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r5)
            goto L_0x002d
        L_0x0105:
            ly1.C99723d.m130165g(r7)
            if (r3 != 0) goto L_0x011b
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            com.tencent.mm.plugin.game.media.GameLocalGalleryView$f r7 = r4.f271699e
            java.util.ArrayList r7 = r7.mo129150F4()
            java.lang.String r8 = "CropImage_OutputPath_List"
            r5.putStringArrayListExtra(r8, r7)
            goto L_0x011c
        L_0x011b:
            r5 = r3
        L_0x011c:
            java.lang.String r7 = "onActivity Result ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r7)
            android.content.Context r7 = r4.getContext()
            android.app.Activity r7 = (android.app.Activity) r7
            r8 = -1
            r7.setResult(r8, r5)
            android.content.Context r4 = r4.getContext()
            android.app.Activity r4 = (android.app.Activity) r4
            r4.finish()
            goto L_0x002d
        L_0x0137:
            java.lang.String r5 = "WTF!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r5)
            android.content.Context r4 = r4.getContext()
            android.app.Activity r4 = (android.app.Activity) r4
            r4.finish()
            goto L_0x002d
        L_0x0147:
            if (r9 == 0) goto L_0x014a
            return
        L_0x014a:
            ly1.u r4 = r0.f271732h
            if (r4 == 0) goto L_0x01a2
            int r5 = r4.hashCode()
            r7 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r7
            if (r1 != r5) goto L_0x01a2
            r1 = -1
            if (r2 != r1) goto L_0x019f
            ly1.C99723d.m130165g(r6)
            vw1.l r1 = r4.f292434u
            if (r1 == 0) goto L_0x018c
            java.lang.String r1 = "key_game_video_appid"
            boolean r2 = r3.hasExtra(r1)
            if (r2 == 0) goto L_0x0172
            vw1.l r2 = r4.f292434u
            java.lang.String r2 = r2.f301307s
            r3.putExtra(r1, r2)
        L_0x0172:
            java.lang.String r2 = "key_game_video_appname"
            boolean r2 = r3.hasExtra(r2)
            if (r2 == 0) goto L_0x0182
            vw1.l r2 = r4.f292434u
            java.lang.String r2 = r2.f301308t
            r3.putExtra(r1, r2)
        L_0x0182:
            vw1.l r1 = r4.f292434u
            java.lang.String r1 = r1.f301313y
            java.lang.String r2 = "key_game_trans_info"
            r3.putExtra(r2, r1)
        L_0x018c:
            android.content.Context r1 = r4.getContext()
            android.app.Activity r1 = (android.app.Activity) r1
            r2 = -1
            r1.setResult(r2, r3)
            android.content.Context r1 = r4.getContext()
            android.app.Activity r1 = (android.app.Activity) r1
            r1.finish()
        L_0x019f:
            r1 = 0
            r4.f292434u = r1
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.media.GamePublishGalleryUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(C0966R.string.hif), getString(C0966R.string.f9e))) {
            init();
        }
        C41864d.m45384a(this);
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(10);
        supportRequestWindowFeature(1);
    }

    public void onDestroy() {
        super.onDestroy();
        GameLocalGalleryView gameLocalGalleryView = this.f271731g;
        if (gameLocalGalleryView != null) {
            gameLocalGalleryView.getClass();
            ((C97526j) C86312j.m106911c(C97526j.class)).Ww0().mo128910i0(gameLocalGalleryView);
        }
        C41864d.m45388e(this);
    }

    public void onPause() {
        super.onPause();
        C103928o.m138642b();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.GamePublishGalleryUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.GamePublishGalleryUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 145) {
            if (iArr[0] == 0) {
                init();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.fb9), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f360830f51), false, new C69016e(), new C69017f());
        }
    }

    public void onResume() {
        super.onResume();
        C103928o.m138641a(true, true, true);
    }
}
