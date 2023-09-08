package com.tencent.p014mm.plugin.fav.p047ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.fav.p047ui.C93687q;
import com.tencent.p014mm.plugin.fav.p047ui.PhotoTransControl;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93622c;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93624e;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.scanner.C30391y;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.scanner.word.C94533d;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C86493v0;
import f40.C86709a0;
import hh2.C8532a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C88989a;
import p159gw.C98250h;
import p200lx.C46896e0;
import p200lx.C46900z;
import p206nj.C11171e;
import pb1.C100695a0;
import pb1.C100703e0;
import pb1.C100718j1;
import pb1.C100723m0;
import pb1.C100734q;
import pb1.C100746u;
import pb1.C100755z;
import qo3.C77407n;
import te3.C101801kd0;
import te3.C101834rc0;
import vo3.C90852c;
import xb1.C102612a;
import xb1.C102614d;
import xl2.C102690c;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI */
public class FavImgGalleryUI extends MMActivity implements AdapterView.OnItemSelectedListener, C100723m0, C94533d.C94534a<String, C102690c>, PhotoTransControl.C93478b, C93687q.C93688a {

    /* renamed from: v */
    public static final /* synthetic */ int f269719v = 0;

    /* renamed from: d */
    public int f269720d = 0;

    /* renamed from: e */
    public MMGestureGallery f269721e;

    /* renamed from: f */
    public C93434j f269722f;

    /* renamed from: g */
    public ArrayList<C93624e> f269723g;

    /* renamed from: h */
    public C77407n f269724h;

    /* renamed from: i */
    public boolean f269725i = true;

    /* renamed from: j */
    public C93687q f269726j;

    /* renamed from: n */
    public Map<String, C93435k> f269727n = new HashMap();

    /* renamed from: o */
    public boolean f269728o;

    /* renamed from: p */
    public boolean f269729p = C30391y.f81992d;

    /* renamed from: q */
    public PhotoTransControl f269730q;

    /* renamed from: r */
    public C46900z f269731r;

    /* renamed from: s */
    public C11184p0 f269732s = new C93433i();

    /* renamed from: t */
    public long f269733t;

    /* renamed from: u */
    public IListener f269734u = new IListener<RecogQBarOfImageFileResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 812146647;
        }

        public boolean callback(IEvent iEvent) {
            RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
            String str = recogQBarOfImageFileResultEvent.f265015d.f265016a;
            C93435k kVar = new C93435k();
            kVar.f269752a = recogQBarOfImageFileResultEvent;
            ((HashMap) FavImgGalleryUI.this.f269727n).put(str, kVar);
            C77407n nVar = FavImgGalleryUI.this.f269724h;
            if (nVar == null || !nVar.mo107563h()) {
                return true;
            }
            FavImgGalleryUI.this.mo128274I7(false);
            return true;
        }
    };

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI$a */
    public class C93425a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100746u f269736d;

        public C93425a(C100746u uVar) {
            this.f269736d = uVar;
        }

        public void run() {
            View selectedView = FavImgGalleryUI.this.f269721e.getSelectedView();
            if (selectedView != null) {
                C93436l lVar = (C93436l) selectedView.getTag();
                C100746u uVar = this.f269736d;
                int i = uVar.field_totalLen;
                int i2 = 0;
                int i3 = i > 0 ? ((uVar.field_offset * 100) / i) - 1 : 0;
                if (i3 >= 0) {
                    i2 = i3;
                }
                lVar.f269757d.setProgress(i2);
                TextView textView = lVar.f269758e;
                textView.setText(i2 + "%");
                if (i2 >= 100 || this.f269736d.mo140168o2()) {
                    FavImgGalleryUI.this.f269722f.notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI$b */
    public class C93426b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f269738d;

        public C93426b(Dialog dialog) {
            this.f269738d = dialog;
        }

        public void run() {
            this.f269738d.dismiss();
            FavImgGalleryUI favImgGalleryUI = FavImgGalleryUI.this;
            C75026b.m89951a(favImgGalleryUI, favImgGalleryUI.getString(C0966R.string.cmm));
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI$c */
    public class C93427c implements MMGestureGallery.C19842g {
        public C93427c() {
        }

        /* renamed from: a */
        public void mo26370a() {
            FavImgGalleryUI favImgGalleryUI = FavImgGalleryUI.this;
            if (favImgGalleryUI.f269730q.f269948d != 1) {
                favImgGalleryUI.f269726j.mo128605a(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI$d */
    public class C93428d implements MMGestureGallery.C19841d {
        public C93428d() {
        }

        /* renamed from: a */
        public void mo26369a() {
            FavImgGalleryUI favImgGalleryUI = FavImgGalleryUI.this;
            if (favImgGalleryUI.f269730q.f269948d != 1 && !favImgGalleryUI.isFinishing() && !FavImgGalleryUI.this.activityHasDestroyed()) {
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c("basescanui@datacenter", true);
                c.mo120962i("key_basescanui_screen_position", Boolean.TRUE);
                c.mo120962i("key_basescanui_screen_x", Float.valueOf((float) FavImgGalleryUI.this.f269721e.getXDown()));
                c.mo120962i("key_basescanui_screen_y", Float.valueOf((float) FavImgGalleryUI.this.f269721e.getYDown()));
                FavImgGalleryUI favImgGalleryUI2 = FavImgGalleryUI.this;
                int i = favImgGalleryUI2.f269730q.f269948d;
                if (i == 0 || i == 2) {
                    favImgGalleryUI2.mo128274I7(C30391y.m39058c());
                } else {
                    favImgGalleryUI2.mo128274I7(false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI$e */
    public class C93429e implements MenuItem.OnMenuItemClickListener {
        public C93429e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FavImgGalleryUI.this.f269726j.mo128605a(true);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI$f */
    public class C93430f implements C46900z.C46901a {
        public C93430f() {
        }

        /* renamed from: a */
        public void mo64788a() {
            FavImgGalleryUI favImgGalleryUI = FavImgGalleryUI.this;
            int i = FavImgGalleryUI.f269719v;
            favImgGalleryUI.mo128274I7(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI$g */
    public class C93431g implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ List f269744d;

        /* renamed from: e */
        public final /* synthetic */ C93435k f269745e;

        /* renamed from: f */
        public final /* synthetic */ List f269746f;

        public C93431g(List list, C93435k kVar, List list2) {
            this.f269744d = list;
            this.f269745e = kVar;
            this.f269746f = list2;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            View view;
            FavImgGalleryUI.this.f269724h.mo107567l((View) null);
            e0Var.clear();
            e0Var.setHeaderTitle((CharSequence) "");
            for (int i = 0; i < this.f269744d.size(); i++) {
                if (((Integer) this.f269744d.get(i)).intValue() == 3) {
                    FavImgGalleryUI favImgGalleryUI = FavImgGalleryUI.this;
                    C77407n nVar = favImgGalleryUI.f269724h;
                    C93435k kVar = this.f269745e;
                    favImgGalleryUI.getClass();
                    RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = kVar.f269752a;
                    ArrayList<ImageQBarDataBean> a = C96874n1.f283849a.mo135192a(recogQBarOfImageFileResultEvent);
                    if (a.size() == 0) {
                        view = null;
                    } else {
                        ImageQBarDataBean imageQBarDataBean = a.get(0);
                        C93678n0 n0Var = new C93678n0(favImgGalleryUI, recogQBarOfImageFileResultEvent, imageQBarDataBean);
                        if (!kVar.f269753b) {
                            ((ScanCodeSheetItemLogic) favImgGalleryUI.f269731r).mo67077h(imageQBarDataBean.f273114e, imageQBarDataBean.f273113d);
                            kVar.f269753b = true;
                        }
                        view = ((ScanCodeSheetItemLogic) favImgGalleryUI.f269731r).mo67071b(n0Var, imageQBarDataBean.f273114e, imageQBarDataBean.f273113d, 3);
                    }
                    nVar.mo107567l(view);
                } else {
                    e0Var.mo107142f(((Integer) this.f269744d.get(i)).intValue(), (CharSequence) this.f269746f.get(i));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI$h */
    public class C93432h implements C77407n.C47880p {
        public C93432h() {
        }

        public void onDismiss() {
            FavImgGalleryUI favImgGalleryUI = FavImgGalleryUI.this;
            favImgGalleryUI.f269724h = null;
            ((ScanCodeSheetItemLogic) favImgGalleryUI.f269731r).mo67083n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI$i */
    public class C93433i implements C11184p0 {
        public C93433i() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            FavImgGalleryUI favImgGalleryUI = FavImgGalleryUI.this;
            C93624e b = favImgGalleryUI.f269722f.getItem(favImgGalleryUI.f269720d);
            if (b != null) {
                String j = b.mo128524j();
                if (!C86013q1.m106450k(j)) {
                    Log.m105928w("MicroMsg.FavImgGalleryUI", "file not exists");
                    return;
                }
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    C100695a0.m131729d(FavImgGalleryUI.this.f269733t, 1, 0, -1);
                    if (ImgUtil.isGif(j)) {
                        Intent intent = new Intent();
                        intent.putExtra("Select_Conv_Type", 3);
                        intent.putExtra("select_is_ret", true);
                        C88144b.m109802t(FavImgGalleryUI.this, ".ui.transmit.SelectConversationUI", intent, 1);
                        return;
                    }
                    C100734q.m131871r0(j, FavImgGalleryUI.this, b.mo128534t());
                } else if (itemId == 1) {
                    C100734q.m131873s0(j, FavImgGalleryUI.this);
                    C100695a0.m131729d(FavImgGalleryUI.this.f269733t, 0, 0, -1);
                } else if (itemId == 2) {
                    String string = FavImgGalleryUI.this.getString(C0966R.string.cr4);
                    FavImgGalleryUI favImgGalleryUI2 = FavImgGalleryUI.this;
                    String t = b.mo128534t();
                    if (Util.isNullOrNil(j)) {
                        Log.m105928w("MicroMsg.FavImgGalleryUI", "save image fail, path is null");
                    } else {
                        ((C98250h) C86312j.m106911c(C98250h.class)).mo137346Zv(favImgGalleryUI2, j, new C93681o0(favImgGalleryUI2, t, string));
                    }
                } else if (itemId != 4) {
                    if (itemId == 5) {
                        FavImgGalleryUI favImgGalleryUI3 = FavImgGalleryUI.this;
                        String u5 = favImgGalleryUI3.mo86627u5();
                        Boolean bool = Boolean.TRUE;
                        Log.m105925i("MicroMsg.FavImgGalleryUI", "edit image path:%s msgId:%s", u5, 0L);
                        RecordConfigProvider b2 = RecordConfigProvider.m119432b(u5, "");
                        b2.f272905F = 0;
                        UICustomParam uICustomParam = new UICustomParam();
                        ((HashMap) uICustomParam.f266575h).put("plugin_filter", bool);
                        ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool);
                        ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool);
                        ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool);
                        b2.f272927o = uICustomParam;
                        C8532a.f27585a.mo9446e(favImgGalleryUI3.getContext(), 4369, C0966R.C0968anim.f2492eg, -1, b2, 1, 2);
                    }
                } else if (WeChatBrands.Business.Entries.ContextTranslate.checkAvailable(FavImgGalleryUI.this.getContext())) {
                    FavImgGalleryUI.this.f269730q.mo128354a();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI$j */
    public class C93434j extends BaseAdapter {

        /* renamed from: d */
        public SparseBooleanArray f269750d = new SparseBooleanArray();

        public C93434j(C93427c cVar) {
        }

        /* renamed from: a */
        public final void mo128281a(C93436l lVar, Bitmap bitmap, String str) {
            lVar.f269757d.setVisibility(8);
            lVar.f269758e.setVisibility(8);
            lVar.f269756c.setVisibility(8);
            View view = lVar.f269754a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealSuc", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealSuc", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            lVar.f269759f.setVisibility(8);
            mo128284f(lVar, bitmap, str);
        }

        /* renamed from: b */
        public C93624e getItem(int i) {
            if (i < FavImgGalleryUI.this.f269723g.size()) {
                return FavImgGalleryUI.this.f269723g.get(i);
            }
            Log.m105929w("MicroMsg.FavImgGalleryUI", "get item fail, position %d error", Integer.valueOf(i));
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r3 = r3.mo128535u();
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.graphics.Bitmap mo128283d(com.tencent.p014mm.plugin.fav.p047ui.gallery.C93624e r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L_0x0009
                android.graphics.Bitmap r3 = r3.mo128535u()
                if (r3 == 0) goto L_0x0009
                return r3
            L_0x0009:
                com.tencent.mm.plugin.fav.ui.FavImgGalleryUI r3 = com.tencent.p014mm.plugin.fav.p047ui.FavImgGalleryUI.this
                android.content.res.Resources r3 = r3.getResources()
                r0 = 2131755519(0x7f1001ff, float:1.914192E38)
                r1 = 0
                android.graphics.Bitmap r3 = p996kj.C88155a.decodeResource(r3, r0, r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.FavImgGalleryUI.C93434j.mo128283d(com.tencent.mm.plugin.fav.ui.gallery.e):android.graphics.Bitmap");
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0160  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0166 A[SYNTHETIC, Splitter:B:31:0x0166] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo128284f(com.tencent.p014mm.plugin.fav.p047ui.FavImgGalleryUI.C93436l r17, android.graphics.Bitmap r18, java.lang.String r19) {
            /*
                r16 = this;
                r1 = r16
                r2 = r17
                r3 = r18
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f269755b
                int r4 = r18.getWidth()
                int r5 = r18.getHeight()
                com.tencent.p014mm.sdk.platformtools.ForceGpuUtil.decideLayerType(r0, r4, r5)
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f269755b
                int r0 = r0.getWidth()
                com.tencent.mm.ui.base.MultiTouchImageView r4 = r2.f269755b
                int r4 = r4.getHeight()
                android.graphics.Matrix r5 = new android.graphics.Matrix
                r5.<init>()
                r5.reset()
                int r6 = r18.getWidth()
                float r6 = (float) r6
                int r7 = r18.getHeight()
                float r7 = (float) r7
                float r6 = r6 / r7
                int r7 = r18.getHeight()
                float r7 = (float) r7
                int r8 = r18.getWidth()
                float r8 = (float) r8
                float r7 = r7 / r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "whDiv is "
                r8.append(r9)
                r8.append(r6)
                java.lang.String r9 = " hwDiv is "
                r8.append(r9)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                java.lang.String r9 = "MicroMsg.FavImgGalleryUI"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r9, r8)
                r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r12 = 480(0x1e0, float:6.73E-43)
                r13 = 0
                r14 = 1073741824(0x40000000, float:2.0)
                int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
                if (r7 < 0) goto L_0x00a7
                int r7 = r18.getHeight()
                if (r7 < r12) goto L_0x00a7
                int r4 = r18.getWidth()
                float r4 = (float) r4
                float r6 = (float) r0
                float r4 = r4 / r6
                int r7 = r18.getWidth()
                float r7 = (float) r7
                float r7 = r6 / r7
                r15 = r9
                double r8 = (double) r4
                int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r4 <= 0) goto L_0x0094
                r5.postScale(r7, r7)
                r18.getHeight()
                int r0 = r18.getWidth()
                float r0 = (float) r0
                float r0 = r0 * r7
                float r6 = r6 - r0
                float r6 = r6 / r14
                r5.postTranslate(r6, r13)
                goto L_0x00a4
            L_0x0094:
                r4 = 1065353216(0x3f800000, float:1.0)
                r5.postScale(r4, r4)
                int r4 = r18.getWidth()
                int r0 = r0 - r4
                int r0 = r0 / 2
                float r0 = (float) r0
                r5.postTranslate(r0, r13)
            L_0x00a4:
                r7 = r15
                goto L_0x0141
            L_0x00a7:
                r15 = r9
                int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
                if (r6 < 0) goto L_0x00f6
                int r6 = r18.getWidth()
                if (r6 < r12) goto L_0x00f6
                int r0 = r18.getHeight()
                float r0 = (float) r0
                r6 = 1139802112(0x43f00000, float:480.0)
                float r0 = r0 / r6
                int r7 = r18.getHeight()
                float r7 = (float) r7
                float r6 = r6 / r7
                double r7 = (double) r0
                int r9 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x00d0
                r5.postScale(r0, r6)
                int r4 = r4 - r12
                int r4 = r4 / 2
                float r0 = (float) r4
                r5.postTranslate(r13, r0)
                goto L_0x00a4
            L_0x00d0:
                r6 = 1065353216(0x3f800000, float:1.0)
                r5.postScale(r6, r6)
                int r0 = r18.getHeight()
                int r4 = r4 - r0
                int r4 = r4 / 2
                float r0 = (float) r4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = " offsety "
                r4.append(r6)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                r7 = r15
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r4)
                r5.postTranslate(r13, r0)
                goto L_0x0141
            L_0x00f6:
                r7 = r15
                r6 = 1065353216(0x3f800000, float:1.0)
                float r0 = (float) r0
                int r8 = r18.getWidth()
                float r8 = (float) r8
                float r8 = r0 / r8
                float r4 = (float) r4
                int r9 = r18.getHeight()
                float r9 = (float) r9
                float r9 = r4 / r9
                int r12 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
                if (r12 >= 0) goto L_0x010e
                goto L_0x010f
            L_0x010e:
                r8 = r9
            L_0x010f:
                int r9 = r18.getWidth()
                float r9 = (float) r9
                float r9 = r9 / r0
                int r12 = r18.getHeight()
                float r12 = (float) r12
                float r12 = r12 / r4
                int r13 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r13 <= 0) goto L_0x0120
                goto L_0x0121
            L_0x0120:
                r9 = r12
            L_0x0121:
                double r12 = (double) r9
                int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x012a
                r5.postScale(r8, r8)
                goto L_0x012c
            L_0x012a:
                r8 = 1065353216(0x3f800000, float:1.0)
            L_0x012c:
                int r6 = r18.getWidth()
                float r6 = (float) r6
                float r6 = r6 * r8
                float r0 = r0 - r6
                float r0 = r0 / r14
                int r6 = r18.getHeight()
                float r6 = (float) r6
                float r6 = r6 * r8
                float r4 = r4 - r6
                float r4 = r4 / r14
                r5.postTranslate(r0, r4)
            L_0x0141:
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f269755b
                r0.setImageMatrix(r5)
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f269755b
                int r4 = r18.getWidth()
                int r5 = r18.getHeight()
                r0.f348280o = r4
                r0.f348281p = r5
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f269755b
                r4 = 1
                r0.setMaxZoomDoubleTab(r4)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
                if (r0 == 0) goto L_0x0166
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f269755b
                r0.setImageBitmap(r3)
                goto L_0x01bc
            L_0x0166:
                qz1.d r0 = new qz1.d     // Catch:{ Exception -> 0x01af }
                r4 = r19
                r0.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x01af }
                com.tencent.mm.ui.base.MultiTouchImageView r4 = r2.f269755b     // Catch:{ Exception -> 0x01af }
                r4.setGifDrawable(r0)     // Catch:{ Exception -> 0x01af }
                com.tencent.mm.ui.base.MultiTouchImageView r4 = r2.f269755b     // Catch:{ Exception -> 0x01af }
                com.tencent.mm.plugin.fav.ui.FavImgGalleryUI r5 = com.tencent.p014mm.plugin.fav.p047ui.FavImgGalleryUI.this     // Catch:{ Exception -> 0x01af }
                androidx.appcompat.app.AppCompatActivity r5 = r5.getContext()     // Catch:{ Exception -> 0x01af }
                int r5 = kg3.C76577a.m92145A(r5)     // Catch:{ Exception -> 0x01af }
                com.tencent.mm.plugin.fav.ui.FavImgGalleryUI r6 = com.tencent.p014mm.plugin.fav.p047ui.FavImgGalleryUI.this     // Catch:{ Exception -> 0x01af }
                androidx.appcompat.app.AppCompatActivity r6 = r6.getContext()     // Catch:{ Exception -> 0x01af }
                int r6 = kg3.C76577a.m92159j(r6)     // Catch:{ Exception -> 0x01af }
                r4.f348286u = r6     // Catch:{ Exception -> 0x01af }
                r4.f348285t = r5     // Catch:{ Exception -> 0x01af }
                com.tencent.mm.ui.base.MultiTouchImageView r4 = r2.f269755b     // Catch:{ Exception -> 0x01af }
                int r5 = r0.getIntrinsicWidth()     // Catch:{ Exception -> 0x01af }
                int r0 = r0.getIntrinsicHeight()     // Catch:{ Exception -> 0x01af }
                r4.f348280o = r5     // Catch:{ Exception -> 0x01af }
                r4.f348281p = r0     // Catch:{ Exception -> 0x01af }
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f269755b     // Catch:{ Exception -> 0x01af }
                boolean r4 = r0.f348270M     // Catch:{ Exception -> 0x01af }
                if (r4 == 0) goto L_0x01a9
                android.graphics.drawable.Drawable r0 = r0.f348271N     // Catch:{ Exception -> 0x01af }
                if (r0 == 0) goto L_0x01a9
                ul3.b r0 = (ul3.C102053b) r0     // Catch:{ Exception -> 0x01af }
                r0.start()     // Catch:{ Exception -> 0x01af }
            L_0x01a9:
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f269755b     // Catch:{ Exception -> 0x01af }
                r0.mo26058c()     // Catch:{ Exception -> 0x01af }
                goto L_0x01bc
            L_0x01af:
                r0 = move-exception
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f269755b
                r0.setImageBitmap(r3)
            L_0x01bc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.FavImgGalleryUI.C93434j.mo128284f(com.tencent.mm.plugin.fav.ui.FavImgGalleryUI$l, android.graphics.Bitmap, java.lang.String):void");
        }

        public int getCount() {
            return FavImgGalleryUI.this.f269723g.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C93436l lVar;
            int i2 = i;
            if (view == null) {
                FavImgGalleryUI favImgGalleryUI = FavImgGalleryUI.this;
                lVar = new C93436l(favImgGalleryUI, (C93427c) null);
                view2 = View.inflate(favImgGalleryUI.getContext(), C0966R.C0971layout.a6n, (ViewGroup) null);
                lVar.f269754a = view2.findViewById(C0966R.C0970id.f4c);
                lVar.f269755b = (MultiTouchImageView) view2.findViewById(C0966R.C0970id.f39);
                lVar.f269757d = (ProgressBar) view2.findViewById(C0966R.C0970id.c_q);
                lVar.f269756c = (ImageView) view2.findViewById(C0966R.C0970id.kk6);
                lVar.f269758e = (TextView) view2.findViewById(C0966R.C0970id.c_r);
                lVar.f269759f = (LinearLayout) view2.findViewById(C0966R.C0970id.f357986cv3);
                ((TextView) view2.findViewById(C0966R.C0970id.cv4)).setText(C0966R.string.cnc);
                view2.setTag(lVar);
            } else {
                lVar = (C93436l) view.getTag();
                view2 = view;
            }
            view2.setLayoutParams(new Gallery.LayoutParams(-1, -1));
            C93624e b = getItem(i);
            boolean z = this.f269750d.get(i2, true);
            int i3 = 0;
            this.f269750d.put(i2, false);
            Bitmap d = b.mo128518d(z);
            if (b.mo128530p() != null) {
                Log.m105925i("MicroMsg.FavImgGalleryUI", "index %d item favid %d, localid %d, itemStatus %d", Integer.valueOf(i), Integer.valueOf(b.mo128529o()), Long.valueOf(b.mo128533s()), Integer.valueOf(b.mo128532r()));
            }
            Log.m105925i("MicroMsg.FavImgGalleryUI", "item dataId %s, item data url %s, key %s, fullsize %d, thumb url %s, key %s, thumb size %d", b.mo128523i(), b.mo128520f(), b.mo128519e(), Long.valueOf(b.mo128531q()), b.mo128522h(), b.mo128521g(), Long.valueOf(b.mo128536v()));
            if (d == null) {
                FavImgGalleryUI.this.enableOptionMenu(false);
                Log.m105928w("MicroMsg.FavImgGalleryUI", "get big image fail");
                C100746u Yt = ((C102612a) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128198DE()).mo142252Yt(b.mo128523i());
                if (Yt == null) {
                    lVar.f269759f.setVisibility(8);
                    if (b.mo128529o() < 0) {
                        lVar.f269757d.setVisibility(0);
                        lVar.f269758e.setVisibility(0);
                        lVar.f269756c.setVisibility(0);
                        View view3 = lVar.f269754a;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        lVar.f269756c.setImageBitmap(mo128283d(b));
                        lVar.f269757d.setProgress(0);
                        lVar.f269758e.setText("0%");
                    } else {
                        lVar.f269757d.setVisibility(8);
                        lVar.f269758e.setVisibility(8);
                        lVar.f269756c.setVisibility(8);
                        View view5 = lVar.f269754a;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealFailed", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (b.mo128526l() != 0) {
                            lVar.f269759f.setVisibility(0);
                        }
                        mo128284f(lVar, mo128283d(b), "");
                    }
                    return view2;
                }
                Log.m105925i("MicroMsg.FavImgGalleryUI", "fav cdnInfo status %d", Integer.valueOf(Yt.field_status));
                lVar.f269757d.setVisibility(0);
                lVar.f269758e.setVisibility(0);
                lVar.f269756c.setVisibility(0);
                View view7 = lVar.f269754a;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealDownloading", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;Lcom/tencent/mm/plugin/fav/api/FavCdnInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ImageAdapter", "dealDownloading", "(Lcom/tencent/mm/plugin/fav/ui/FavImgGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;Lcom/tencent/mm/plugin/fav/api/FavCdnInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                lVar.f269756c.setImageBitmap(mo128283d(b));
                int i4 = Yt.field_totalLen;
                int i5 = i4 > 0 ? ((Yt.field_offset * 100) / i4) - 1 : 0;
                if (i5 >= 0) {
                    i3 = i5;
                }
                lVar.f269757d.setProgress(i3);
                TextView textView = lVar.f269758e;
                textView.setText(i3 + "%");
                return view2;
            }
            FavImgGalleryUI.this.enableOptionMenu(true);
            if (ImgUtil.isGif(b.mo128524j())) {
                mo128281a(lVar, d, b.mo128524j());
            } else {
                mo128281a(lVar, d, "");
            }
            return view2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI$k */
    public static final class C93435k {

        /* renamed from: a */
        public RecogQBarOfImageFileResultEvent f269752a;

        /* renamed from: b */
        public boolean f269753b;
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI$l */
    public class C93436l {

        /* renamed from: a */
        public View f269754a;

        /* renamed from: b */
        public MultiTouchImageView f269755b;

        /* renamed from: c */
        public ImageView f269756c;

        /* renamed from: d */
        public ProgressBar f269757d;

        /* renamed from: e */
        public TextView f269758e;

        /* renamed from: f */
        public LinearLayout f269759f;

        public C93436l(FavImgGalleryUI favImgGalleryUI, C93427c cVar) {
        }
    }

    /* renamed from: A4 */
    public void mo86623A4() {
    }

    /* renamed from: H7 */
    public final List<C101834rc0> mo128273H7(C101801kd0 kd02, String str) {
        LinkedList<C101834rc0> linkedList;
        List<C101834rc0> H7;
        if (kd02 == null || (linkedList = kd02.f298618f) == null) {
            return null;
        }
        Iterator<C101834rc0> it = linkedList.iterator();
        while (it.hasNext()) {
            C101834rc0 next = it.next();
            if (next.f299280T.equals(str)) {
                return kd02.f298618f;
            }
            if (C100734q.m131833X(next.f299258I) && (H7 = mo128273H7(next.f299275Q1, str)) != null) {
                return H7;
            }
        }
        return null;
    }

    /* renamed from: I7 */
    public final void mo128274I7(boolean z) {
        RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C93624e b = this.f269722f.getItem(this.f269720d);
        if (b != null && b.mo128526l() == 0) {
            if (b.mo128516b()) {
                arrayList.add(0);
                arrayList2.add(getString(C0966R.string.crb));
            }
            if (b.mo128517c()) {
                arrayList.add(1);
                arrayList2.add(getString(C0966R.string.cpw));
            }
            arrayList.add(2);
            arrayList2.add(getString(C0966R.string.iam));
            String j = b.mo128524j();
            if ((this.f269729p || this.f269728o) && !Util.isNullOrNil(j)) {
                arrayList.add(4);
                arrayList2.add(getString(C0966R.string.b8h));
            }
            arrayList.add(5);
            arrayList2.add(getString(C0966R.string.b8g));
            C93435k kVar = (C93435k) ((HashMap) this.f269727n).get(j);
            if (kVar == null || (recogQBarOfImageFileResultEvent = kVar.f269752a) == null) {
                RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
                recogQBarOfImageFileEvent.f107731d.f107732a = System.currentTimeMillis();
                recogQBarOfImageFileEvent.f107731d.f107733b = j;
                recogQBarOfImageFileEvent.publish();
            } else {
                C96874n1 n1Var = C96874n1.f283849a;
                String d = n1Var.mo135195d(recogQBarOfImageFileResultEvent);
                int b2 = n1Var.mo135193b(recogQBarOfImageFileResultEvent);
                if (!Util.isNullOrNil(d)) {
                    arrayList.add(3);
                    arrayList2.add(((ScanCodeSheetItemLogic) this.f269731r).mo67081l(b2, d));
                }
            }
            if (this.f269724h == null) {
                this.f269724h = new C77407n((Context) getContext(), 1, false);
            }
            C77407n nVar = this.f269724h;
            nVar.f225771i = new C93431g(arrayList, kVar, arrayList2);
            nVar.f225782p = this.f269732s;
            nVar.f225761d = new C93432h();
            if (!getContext().isFinishing()) {
                this.f269724h.mo107573q();
            }
            if (!Util.isNullOrNil(j)) {
                C86709a0.m107528h();
                if (C86709a0.m107529k().f251779b.mo123467m() != 0 && z && !this.f269729p) {
                    this.f269730q.mo128357d(j);
                }
            }
        }
    }

    /* renamed from: R4 */
    public void mo128275R4(C100746u uVar) {
        if (uVar != null) {
            Log.m105925i("MicroMsg.FavImgGalleryUI", "on cdn status changed, status:%d", Integer.valueOf(uVar.field_status));
            C93624e b = this.f269722f.getItem(this.f269720d);
            if (b != null && Util.nullAs(uVar.field_dataId, "").equals(b.mo128523i())) {
                MMHandlerThread.postToMainThread(new C93425a(uVar));
            }
        }
    }

    /* renamed from: g4 */
    public MultiTouchImageView mo127461g4() {
        int selectedItemPosition = this.f269721e.getSelectedItemPosition();
        MMGestureGallery mMGestureGallery = this.f269721e;
        View childAt = mMGestureGallery.getChildAt(selectedItemPosition - mMGestureGallery.getFirstVisiblePosition());
        if (childAt != null) {
            return childAt instanceof MultiTouchImageView ? (MultiTouchImageView) childAt : (MultiTouchImageView) childAt.findViewById(C0966R.C0970id.f39);
        }
        Log.m105925i("MicroMsg.FavImgGalleryUI", "getCurView() pos:%s firstPos:%s", Integer.valueOf(selectedItemPosition), Integer.valueOf(this.f269721e.getFirstVisiblePosition()));
        return null;
    }

    public String getAesKey() {
        C93624e b = this.f269722f.getItem(this.f269720d);
        if (b == null) {
            return null;
        }
        return b.mo128519e();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a6o;
    }

    /* renamed from: j7 */
    public String mo127462j7() {
        return this.f269722f.getItem(this.f269721e.getSelectedItemPosition()).mo128523i();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (1 == i) {
            if (-1 == i2) {
                C93624e b = this.f269722f.getItem(this.f269720d);
                if (b == null) {
                    Log.m105924i("MicroMsg.FavImgGalleryUI", "dataItem is null.");
                    return;
                } else if (b.mo128515a(new C100703e0())) {
                    C76879j.m92726T(getContext(), getString(C0966R.string.f7260k));
                    return;
                } else {
                    String stringExtra = intent.getStringExtra("Select_Conv_User");
                    Log.m105919d("MicroMsg.FavImgGalleryUI", "select %s for sending", stringExtra);
                    C93594f1.m118178f(getContext(), stringExtra, b.mo128530p(), b.mo128528n(), new C93426b(C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null)));
                }
            } else {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        hideTitleView();
        if (C11171e.m11046c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f269730q = new PhotoTransControl(this, this, this);
        this.f269725i = getIntent().getBooleanExtra("show_share", true);
        MMGestureGallery mMGestureGallery = (MMGestureGallery) findViewById(C0966R.C0970id.ehh);
        this.f269721e = mMGestureGallery;
        this.f269726j = new C93687q(mMGestureGallery, this, this);
        this.f269721e.setVerticalFadingEdgeEnabled(false);
        this.f269721e.setHorizontalFadingEdgeEnabled(false);
        this.f269721e.setOnItemSelectedListener(this);
        this.f269721e.setSingleClickOverListener(new C93427c());
        if (this.f269725i) {
            this.f269721e.setLongClickOverListener(new C93428d());
        }
        fullScreenNoTitleBar(true);
        this.f269723g = new ArrayList<>();
        List<C101834rc0> list = null;
        C93434j jVar = new C93434j((C93427c) null);
        this.f269722f = jVar;
        this.f269721e.setAdapter(jVar);
        this.f269733t = getIntent().getLongExtra("key_detail_info_id", -1);
        String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        boolean booleanExtra = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
        String stringExtra2 = getIntent().getStringExtra("fav_note_xml");
        ArrayList arrayList = new ArrayList();
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(this.f269733t);
        Object[] objArr = new Object[2];
        objArr[0] = Long.valueOf(this.f269733t);
        objArr[1] = Boolean.valueOf(Yt != null);
        Log.m105925i("MicroMsg.FavImgGalleryUI", "show one fav info, local id is %d, get from db ok ? %B", objArr);
        if (booleanExtra && !Util.isNullOrNil(stringExtra2)) {
            Yt = C100734q.m131886z(stringExtra2, 18);
        }
        if (Yt != null) {
            arrayList.add(Yt);
        }
        this.f269723g.clear();
        if (arrayList.size() == 1) {
            list = mo128273H7(((C100755z) arrayList.get(0)).field_favProto, stringExtra);
        }
        int i2 = -1;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C100755z zVar = (C100755z) arrayList.get(i3);
            if (list == null) {
                list = zVar.field_favProto.f298618f;
            }
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C101834rc0 rc02 = list.get(i4);
                if ((rc02.f299258I != 8 || ImgUtil.isGif(C100734q.m131880w(rc02))) && ((i = rc02.f299258I) == 2 || i == 8)) {
                    this.f269723g.add(new C93622c(zVar, rc02));
                    if (stringExtra != null && stringExtra.equals(rc02.f299280T)) {
                        i2 = this.f269723g.size() - 1;
                    }
                }
            }
            if (stringExtra == null && zVar.field_localId == this.f269733t) {
                i2 = this.f269723g.size() - 1;
            }
        }
        getIntent().removeExtra("key_detail_info_id");
        getIntent().removeExtra("key_detail_data_id");
        this.f269722f.notifyDataSetChanged();
        this.f269721e.post(new C93675m0(this, i2));
        setBackBtn(new C93429e());
        this.f269731r = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71986Hu(this, new C93430f());
        this.f269734u.alive();
        setResult(0, getIntent());
    }

    public void onDestroy() {
        getIntent().putExtra("key_activity_browse_time", getActivityBrowseTimeMs());
        this.f269734u.dead();
        C93687q qVar = this.f269726j;
        if (qVar != null) {
            qVar.f270474b = null;
            qVar.f270473a = null;
            qVar.f270477e = null;
        }
        PhotoTransControl photoTransControl = this.f269730q;
        if (photoTransControl != null) {
            photoTransControl.mo128356c();
        }
        super.onDestroy();
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavImgGalleryUI", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f269720d = i;
        Log.m105918d("MicroMsg.FavImgGalleryUI", "pos:" + i);
        if (view instanceof MultiTouchImageView) {
            ((MultiTouchImageView) view).mo26059d();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f269726j.mo128605a(true);
        return true;
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void onPause() {
        super.onPause();
        ((C102612a) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128198DE()).mo142250SE(this);
        C103928o.m138642b();
    }

    public void onResume() {
        super.onResume();
        ((C102612a) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128198DE()).mo142255jo(this);
        C103928o.m138641a(true, true, true);
    }

    /* renamed from: s2 */
    public String mo86626s2() {
        C93624e b = this.f269722f.getItem(this.f269720d);
        if (b == null) {
            return null;
        }
        return b.mo128520f();
    }

    /* renamed from: u5 */
    public String mo86627u5() {
        C93624e b = this.f269722f.getItem(this.f269720d);
        return b == null ? "" : b.mo128524j();
    }

    /* renamed from: w3 */
    public void mo86628w3(Object obj, Object obj2) {
        C102690c cVar = (C102690c) obj2;
        String u5 = mo86627u5();
        int b = C30391y.m39057b(cVar.f303305a);
        Log.m105925i("MicroMsg.FavImgGalleryUI", "local translate, img %s, result %s, ratio %d", u5, cVar.f303305a, Integer.valueOf(b));
        if (((String) obj).equals(u5) && C30391y.m39062g(b)) {
            this.f269728o = true;
            mo128274I7(false);
        }
    }

    /* renamed from: x3 */
    public void mo86629x3() {
    }
}
