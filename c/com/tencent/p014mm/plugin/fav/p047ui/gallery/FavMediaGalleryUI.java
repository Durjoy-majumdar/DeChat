package com.tencent.p014mm.plugin.fav.p047ui.gallery;

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
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.plugin.fav.p047ui.C93594f1;
import com.tencent.p014mm.plugin.fav.p047ui.C93687q;
import com.tencent.p014mm.plugin.fav.p047ui.PhotoTransControl;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.scanner.C30391y;
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
import f40.C86709a0;
import hh2.C8532a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
import p200lx.C61416x;
import p206nj.C11171e;
import pb1.C100695a0;
import pb1.C100703e0;
import pb1.C100705f0;
import pb1.C100718j1;
import pb1.C100723m0;
import pb1.C100734q;
import pb1.C100746u;
import pb1.C100752x0;
import pb1.C100755z;
import qo3.C77407n;
import qo3.C89779i0;
import te3.C101801kd0;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101835rd0;
import xb1.C102612a;
import xb1.C102614d;
import xl2.C102690c;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI */
public class FavMediaGalleryUI extends MMActivity implements AdapterView.OnItemSelectedListener, C100723m0, C94533d.C94534a<String, C102690c>, PhotoTransControl.C93478b, C93687q.C93688a {

    /* renamed from: C */
    public static final /* synthetic */ int f270302C = 0;

    /* renamed from: A */
    public long f270303A;

    /* renamed from: B */
    public IListener f270304B = new IListener<RecogQBarOfImageFileResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 812146647;
        }

        public boolean callback(IEvent iEvent) {
            RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
            ((HashMap) FavMediaGalleryUI.this.f270320v).put(recogQBarOfImageFileResultEvent.f265015d.f265016a, recogQBarOfImageFileResultEvent);
            C77407n nVar = FavMediaGalleryUI.this.f270310i;
            if (nVar == null || !nVar.mo107563h()) {
                return true;
            }
            FavMediaGalleryUI.this.mo128496J7(false);
            return true;
        }
    };

    /* renamed from: d */
    public int f270305d = 0;

    /* renamed from: e */
    public FavVideoView f270306e = null;

    /* renamed from: f */
    public MMGestureGallery f270307f;

    /* renamed from: g */
    public C93617j f270308g;

    /* renamed from: h */
    public ArrayList<C93624e> f270309h;

    /* renamed from: i */
    public C77407n f270310i;

    /* renamed from: j */
    public boolean f270311j = true;

    /* renamed from: n */
    public List<FavVideoView> f270312n = new ArrayList();

    /* renamed from: o */
    public HashMap<String, List<View>> f270313o = new HashMap<>();

    /* renamed from: p */
    public boolean f270314p = false;

    /* renamed from: q */
    public int f270315q = 0;

    /* renamed from: r */
    public C101811md0 f270316r = new C101811md0();

    /* renamed from: s */
    public boolean f270317s;

    /* renamed from: t */
    public boolean f270318t = C30391y.f81992d;

    /* renamed from: u */
    public PhotoTransControl f270319u;

    /* renamed from: v */
    public Map<String, RecogQBarOfImageFileResultEvent> f270320v = new HashMap();

    /* renamed from: w */
    public C93687q f270321w;

    /* renamed from: x */
    public boolean f270322x = false;

    /* renamed from: y */
    public int f270323y = 0;

    /* renamed from: z */
    public C11184p0 f270324z = new C93616i();

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$a */
    public class C93608a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100746u f270326d;

        public C93608a(C100746u uVar) {
            this.f270326d = uVar;
        }

        public void run() {
            View selectedView = FavMediaGalleryUI.this.f270307f.getSelectedView();
            if (selectedView != null && selectedView.getTag() != null && (selectedView.getTag() instanceof C93619k)) {
                C93619k kVar = (C93619k) selectedView.getTag();
                C100746u uVar = this.f270326d;
                int i = uVar.field_totalLen;
                int i2 = 0;
                int i3 = i > 0 ? ((uVar.field_offset * 100) / i) - 1 : 0;
                if (i3 >= 0) {
                    i2 = i3;
                }
                kVar.f270343d.setProgress(i2);
                TextView textView = kVar.f270344e;
                textView.setText(i2 + "%");
                if (i2 >= 100 || this.f270326d.mo140168o2()) {
                    FavMediaGalleryUI.this.f270308g.notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$b */
    public class C93609b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f270328d;

        public C93609b(FavMediaGalleryUI favMediaGalleryUI, Dialog dialog) {
            this.f270328d = dialog;
        }

        public void run() {
            this.f270328d.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$c */
    public class C93610c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f270329d;

        public C93610c(FavMediaGalleryUI favMediaGalleryUI, Dialog dialog) {
            this.f270329d = dialog;
        }

        public void run() {
            this.f270329d.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$d */
    public class C93611d implements MMGestureGallery.C19842g {
        public C93611d() {
        }

        /* renamed from: a */
        public void mo26370a() {
            List<View> list;
            FavMediaGalleryUI favMediaGalleryUI = FavMediaGalleryUI.this;
            C93624e b = favMediaGalleryUI.f270308g.getItem(favMediaGalleryUI.f270305d);
            if (b != null && b.mo128526l() == 0 && b.mo128525k() != 2 && C86013q1.m106450k(b.mo128524j()) && (list = FavMediaGalleryUI.this.f270313o.get(b.mo128524j())) != null && list.size() > 0) {
                for (View view : list) {
                    if (view instanceof FavVideoView) {
                        ((FavVideoView) view).mo128626a();
                    }
                }
            } else if (FavMediaGalleryUI.this.mo128495I7()) {
                FavMediaGalleryUI favMediaGalleryUI2 = FavMediaGalleryUI.this;
                if (favMediaGalleryUI2.f270319u.f269948d != 1) {
                    favMediaGalleryUI2.mo128494H7();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$e */
    public class C93612e implements MMGestureGallery.C19841d {
        public C93612e() {
        }

        /* renamed from: a */
        public void mo26369a() {
            if (!FavMediaGalleryUI.this.isFinishing() && !FavMediaGalleryUI.this.activityHasDestroyed()) {
                FavMediaGalleryUI favMediaGalleryUI = FavMediaGalleryUI.this;
                int i = FavMediaGalleryUI.f270302C;
                if (favMediaGalleryUI.mo128495I7()) {
                    FavMediaGalleryUI favMediaGalleryUI2 = FavMediaGalleryUI.this;
                    int i2 = favMediaGalleryUI2.f270319u.f269948d;
                    if (i2 != 1) {
                        if (i2 == 0 || i2 == 2) {
                            favMediaGalleryUI2.mo128496J7(C30391y.m39058c());
                        } else {
                            favMediaGalleryUI2.mo128496J7(false);
                        }
                    }
                } else {
                    FavMediaGalleryUI.this.mo128496J7(false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$f */
    public class C93613f implements MenuItem.OnMenuItemClickListener {
        public C93613f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FavMediaGalleryUI favMediaGalleryUI = FavMediaGalleryUI.this;
            int i = FavMediaGalleryUI.f270302C;
            favMediaGalleryUI.mo128494H7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$g */
    public class C93614g implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ List f270333d;

        /* renamed from: e */
        public final /* synthetic */ List f270334e;

        public C93614g(FavMediaGalleryUI favMediaGalleryUI, List list, List list2) {
            this.f270333d = list;
            this.f270334e = list2;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.clear();
            e0Var.setHeaderTitle((CharSequence) "");
            for (int i = 0; i < this.f270333d.size(); i++) {
                e0Var.mo107142f(((Integer) this.f270333d.get(i)).intValue(), (CharSequence) this.f270334e.get(i));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$h */
    public class C93615h implements C77407n.C47880p {
        public C93615h() {
        }

        public void onDismiss() {
            FavMediaGalleryUI.this.f270310i = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$i */
    public class C93616i implements C11184p0 {
        public C93616i() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C101801kd0 kd02;
            C101835rd0 rd02;
            Class cls = C98250h.class;
            FavMediaGalleryUI favMediaGalleryUI = FavMediaGalleryUI.this;
            C93624e b = favMediaGalleryUI.f270308g.getItem(favMediaGalleryUI.f270305d);
            if (b != null) {
                String j = b.mo128524j();
                if (C86013q1.m106450k(j) || menuItem.getItemId() == 4) {
                    switch (menuItem.getItemId()) {
                        case 0:
                            C100695a0.m131729d(FavMediaGalleryUI.this.f270303A, 1, 0, -1);
                            if (b.mo128525k() != 2) {
                                String w = b.mo128537w();
                                String j2 = b.mo128524j();
                                Intent intent = new Intent();
                                intent.putExtra("Select_Conv_Type", 3);
                                intent.putExtra("select_is_ret", true);
                                intent.putExtra("mutil_select_is_ret", true);
                                if (C86013q1.m106450k(w)) {
                                    intent.putExtra("image_path", w);
                                } else {
                                    intent.putExtra("image_path", j2);
                                }
                                intent.putExtra("Retr_Msg_Type", 1);
                                C88144b.m109802t(FavMediaGalleryUI.this.getContext(), ".ui.transmit.SelectConversationUI", intent, 1);
                                return;
                            } else if (ImgUtil.isGif(j)) {
                                Intent intent2 = new Intent();
                                intent2.putExtra("Select_Conv_Type", 3);
                                intent2.putExtra("select_is_ret", true);
                                C88144b.m109802t(FavMediaGalleryUI.this, ".ui.transmit.SelectConversationUI", intent2, 1);
                                return;
                            } else {
                                C100734q.m131871r0(j, FavMediaGalleryUI.this, b.mo128534t());
                                return;
                            }
                        case 1:
                            C100734q.m131873s0(j, FavMediaGalleryUI.this);
                            C100695a0.m131729d(FavMediaGalleryUI.this.f270303A, 0, 0, -1);
                            return;
                        case 2:
                            if (b.mo128525k() == 2) {
                                FavMediaGalleryUI favMediaGalleryUI2 = FavMediaGalleryUI.this;
                                favMediaGalleryUI2.getClass();
                                if (Util.isNullOrNil(j)) {
                                    Log.m105928w("MicroMsg.FavMediaGalleryUI", "save image fail, path is null");
                                    return;
                                } else {
                                    ((C98250h) C86312j.m106911c(cls)).mo137346Zv(favMediaGalleryUI2, j, new C93625g(favMediaGalleryUI2));
                                    return;
                                }
                            } else {
                                FavMediaGalleryUI favMediaGalleryUI3 = FavMediaGalleryUI.this;
                                favMediaGalleryUI3.getClass();
                                ((C98250h) C86312j.m106911c(cls)).mo137342Lm(favMediaGalleryUI3.getContext(), j, new C2295f(favMediaGalleryUI3, j));
                                return;
                            }
                        case 3:
                            RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) ((HashMap) FavMediaGalleryUI.this.f270320v).get(j);
                            if (recogQBarOfImageFileResultEvent != null) {
                                DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
                                C96874n1 n1Var = C96874n1.f283849a;
                                String d = n1Var.mo135195d(recogQBarOfImageFileResultEvent);
                                int b2 = n1Var.mo135193b(recogQBarOfImageFileResultEvent);
                                int c = n1Var.mo135194c(recogQBarOfImageFileResultEvent);
                                DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
                                aVar.f264650b = FavMediaGalleryUI.this;
                                aVar.f264649a = d;
                                aVar.f264651c = b2;
                                aVar.f264653e = 7;
                                aVar.f264657i = 39;
                                aVar.f264658j = b.mo128520f();
                                dealQBarStrEvent.f264648d.f264659k = b.mo128519e();
                                dealQBarStrEvent.f264648d.f264652d = c;
                                Bundle bundle = new Bundle(1);
                                bundle.putInt("stat_scene", 5);
                                C100755z p = b.mo128530p();
                                Log.m105924i("MicroMsg.FavMediaGalleryUI", "addStatInfo4AppBrand, from fav");
                                bundle.putInt("LaunchCodeScene_ScanScene", 4);
                                if (!(p == null || (kd02 = p.field_favProto) == null || (rd02 = kd02.f298616d) == null)) {
                                    bundle.putString("stat_chat_talker_username", C100705f0.m131751b(rd02));
                                    bundle.putString("stat_send_msg_user", rd02.f299348f);
                                    bundle.putString("stat_msg_id", rd02.f299358s);
                                }
                                dealQBarStrEvent.f264648d.f264660l = bundle;
                                dealQBarStrEvent.publish();
                                return;
                            }
                            return;
                        case 4:
                            FavMediaGalleryUI favMediaGalleryUI4 = FavMediaGalleryUI.this;
                            favMediaGalleryUI4.f270316r.f298815f = favMediaGalleryUI4.f270308g.getCount() - FavMediaGalleryUI.this.f270305d;
                            ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(FavMediaGalleryUI.this.getContext(), b.mo128530p(), FavMediaGalleryUI.this.f270316r);
                            FavMediaGalleryUI.this.finish();
                            return;
                        case 5:
                            if (WeChatBrands.Business.Entries.ContextTranslate.checkAvailable(FavMediaGalleryUI.this.getContext())) {
                                FavMediaGalleryUI.this.f270319u.mo128354a();
                                return;
                            }
                            return;
                        case 6:
                            FavMediaGalleryUI favMediaGalleryUI5 = FavMediaGalleryUI.this;
                            String u5 = favMediaGalleryUI5.mo86627u5();
                            Boolean bool = Boolean.TRUE;
                            Log.m105925i("MicroMsg.FavMediaGalleryUI", "edit image path:%s msgId:%s", u5, 0L);
                            RecordConfigProvider b3 = RecordConfigProvider.m119432b(u5, "");
                            b3.f272905F = 0;
                            UICustomParam uICustomParam = new UICustomParam();
                            ((HashMap) uICustomParam.f266575h).put("plugin_filter", bool);
                            ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool);
                            ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool);
                            ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool);
                            b3.f272927o = uICustomParam;
                            C8532a.f27585a.mo9446e(favMediaGalleryUI5.getContext(), 4369, C0966R.C0968anim.f2492eg, -1, b3, 1, 2);
                            return;
                        default:
                            return;
                    }
                } else {
                    Log.m105928w("MicroMsg.FavMediaGalleryUI", "file not exists");
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$j */
    public class C93617j extends BaseAdapter {

        /* renamed from: d */
        public SparseBooleanArray f270337d = new SparseBooleanArray();

        /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$j$a */
        public class C93618a implements FavVideoView.C93722g {
            public C93618a() {
            }

            public void finish() {
                FavMediaGalleryUI.this.finish();
            }
        }

        public C93617j(C93611d dVar) {
        }

        /* renamed from: a */
        public final void mo128503a(C93619k kVar, Bitmap bitmap, String str) {
            kVar.f270343d.setVisibility(8);
            kVar.f270344e.setVisibility(8);
            kVar.f270342c.setVisibility(8);
            View view = kVar.f270340a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealSuc", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter", "dealSuc", "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            kVar.f270345f.setVisibility(8);
            mo128506f(kVar, bitmap, str);
        }

        /* renamed from: b */
        public C93624e getItem(int i) {
            if (i < FavMediaGalleryUI.this.f270309h.size()) {
                return FavMediaGalleryUI.this.f270309h.get(i);
            }
            Log.m105929w("MicroMsg.FavMediaGalleryUI", "get item fail, position %d error", Integer.valueOf(i));
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r3 = r3.mo128535u();
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.graphics.Bitmap mo128505d(com.tencent.p014mm.plugin.fav.p047ui.gallery.C93624e r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L_0x0009
                android.graphics.Bitmap r3 = r3.mo128535u()
                if (r3 == 0) goto L_0x0009
                return r3
            L_0x0009:
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r3 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this
                android.content.res.Resources r3 = r3.getResources()
                r0 = 2131755519(0x7f1001ff, float:1.914192E38)
                r1 = 0
                android.graphics.Bitmap r3 = p996kj.C88155a.decodeResource(r3, r0, r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.C93617j.mo128505d(com.tencent.mm.plugin.fav.ui.gallery.e):android.graphics.Bitmap");
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0160  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0166 A[SYNTHETIC, Splitter:B:31:0x0166] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo128506f(com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.C93619k r17, android.graphics.Bitmap r18, java.lang.String r19) {
            /*
                r16 = this;
                r1 = r16
                r2 = r17
                r3 = r18
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f270341b
                int r4 = r18.getWidth()
                int r5 = r18.getHeight()
                com.tencent.p014mm.sdk.platformtools.ForceGpuUtil.decideLayerType(r0, r4, r5)
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f270341b
                int r0 = r0.getWidth()
                com.tencent.mm.ui.base.MultiTouchImageView r4 = r2.f270341b
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
                java.lang.String r9 = "MicroMsg.FavMediaGalleryUI"
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
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f270341b
                r0.setImageMatrix(r5)
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f270341b
                int r4 = r18.getWidth()
                int r5 = r18.getHeight()
                r0.f348280o = r4
                r0.f348281p = r5
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f270341b
                r4 = 1
                r0.setMaxZoomDoubleTab(r4)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
                if (r0 == 0) goto L_0x0166
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f270341b
                r0.setImageBitmap(r3)
                goto L_0x01bc
            L_0x0166:
                qz1.d r0 = new qz1.d     // Catch:{ Exception -> 0x01af }
                r4 = r19
                r0.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x01af }
                com.tencent.mm.ui.base.MultiTouchImageView r4 = r2.f270341b     // Catch:{ Exception -> 0x01af }
                r4.setGifDrawable(r0)     // Catch:{ Exception -> 0x01af }
                com.tencent.mm.ui.base.MultiTouchImageView r4 = r2.f270341b     // Catch:{ Exception -> 0x01af }
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r5 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this     // Catch:{ Exception -> 0x01af }
                androidx.appcompat.app.AppCompatActivity r5 = r5.getContext()     // Catch:{ Exception -> 0x01af }
                int r5 = kg3.C76577a.m92145A(r5)     // Catch:{ Exception -> 0x01af }
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r6 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this     // Catch:{ Exception -> 0x01af }
                androidx.appcompat.app.AppCompatActivity r6 = r6.getContext()     // Catch:{ Exception -> 0x01af }
                int r6 = kg3.C76577a.m92159j(r6)     // Catch:{ Exception -> 0x01af }
                r4.f348286u = r6     // Catch:{ Exception -> 0x01af }
                r4.f348285t = r5     // Catch:{ Exception -> 0x01af }
                com.tencent.mm.ui.base.MultiTouchImageView r4 = r2.f270341b     // Catch:{ Exception -> 0x01af }
                int r5 = r0.getIntrinsicWidth()     // Catch:{ Exception -> 0x01af }
                int r0 = r0.getIntrinsicHeight()     // Catch:{ Exception -> 0x01af }
                r4.f348280o = r5     // Catch:{ Exception -> 0x01af }
                r4.f348281p = r0     // Catch:{ Exception -> 0x01af }
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f270341b     // Catch:{ Exception -> 0x01af }
                boolean r4 = r0.f348270M     // Catch:{ Exception -> 0x01af }
                if (r4 == 0) goto L_0x01a9
                android.graphics.drawable.Drawable r0 = r0.f348271N     // Catch:{ Exception -> 0x01af }
                if (r0 == 0) goto L_0x01a9
                ul3.b r0 = (ul3.C102053b) r0     // Catch:{ Exception -> 0x01af }
                r0.start()     // Catch:{ Exception -> 0x01af }
            L_0x01a9:
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f270341b     // Catch:{ Exception -> 0x01af }
                r0.mo26058c()     // Catch:{ Exception -> 0x01af }
                goto L_0x01bc
            L_0x01af:
                r0 = move-exception
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
                com.tencent.mm.ui.base.MultiTouchImageView r0 = r2.f270341b
                r0.setImageBitmap(r3)
            L_0x01bc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.C93617j.mo128506f(com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$k, android.graphics.Bitmap, java.lang.String):void");
        }

        public int getCount() {
            return FavMediaGalleryUI.this.f270309h.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            if (i > FavMediaGalleryUI.this.f270309h.size()) {
                return 2;
            }
            return FavMediaGalleryUI.this.f270309h.get(i).mo128525k();
        }

        /* JADX WARNING: type inference failed for: r6v8 */
        /* JADX WARNING: type inference failed for: r6v9 */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x041b, code lost:
            if (r3.field_status != 1) goto L_0x0421;
         */
        /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r6v7, types: [boolean, int] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x045e  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0462  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0475  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x047b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r20, android.view.View r21, android.view.ViewGroup r22) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                java.lang.Class<pb1.j1> r3 = pb1.C100718j1.class
                com.tencent.mm.plugin.fav.ui.gallery.e r4 = r19.getItem(r20)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "getView() called with: position = ["
                r5.append(r6)
                r5.append(r1)
                java.lang.String r6 = "], convertView = ["
                r5.append(r6)
                r5.append(r2)
                java.lang.String r6 = "], parent = ["
                r5.append(r6)
                r6 = r22
                r5.append(r6)
                java.lang.String r6 = "] item:%s"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]
                int r8 = r4.mo128525k()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r9 = 0
                r7[r9] = r8
                java.lang.String r8 = "MicroMsg.FavMediaGalleryUI"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r5, r7)
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r5 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this
                int r5 = r5.f270305d
                r13 = 2131315201(0x7f094a01, float:1.8248849E38)
                r14 = 2131301196(0x7f09134c, float:1.8220443E38)
                r15 = 2131306251(0x7f09270b, float:1.8230696E38)
                r9 = 2131306295(0x7f092737, float:1.8230785E38)
                r7 = 2131494359(0x7f0c05d7, float:1.8612224E38)
                r10 = 15
                r11 = 4
                r12 = 0
                if (r5 == r1) goto L_0x00f9
                int r5 = r5 - r1
                int r5 = java.lang.Math.abs(r5)
                if (r5 <= r6) goto L_0x00f9
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "getView not selected, "
                r3.append(r5)
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r5 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this
                int r5 = r5.f270305d
                r3.append(r5)
                java.lang.String r5 = ", "
                r3.append(r5)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                if (r2 != 0) goto L_0x00f8
                int r1 = r4.mo128525k()
                if (r1 == r10) goto L_0x00ec
                int r1 = r4.mo128525k()
                if (r1 != r11) goto L_0x0096
                goto L_0x00ec
            L_0x0096:
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$k r1 = new com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$k
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r2 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this
                r1.<init>(r2, r12)
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                android.view.View r2 = android.view.View.inflate(r2, r7, r12)
                android.view.View r3 = r2.findViewById(r9)
                r1.f270340a = r3
                android.view.View r3 = r2.findViewById(r15)
                com.tencent.mm.ui.base.MultiTouchImageView r3 = (com.tencent.p014mm.p136ui.base.MultiTouchImageView) r3
                r1.f270341b = r3
                android.view.View r3 = r2.findViewById(r14)
                android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
                r1.f270343d = r3
                android.view.View r3 = r2.findViewById(r13)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                r1.f270342c = r3
                r3 = 2131301197(0x7f09134d, float:1.8220445E38)
                android.view.View r3 = r2.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r1.f270344e = r3
                r3 = 2131302140(0x7f0916fc, float:1.8222358E38)
                android.view.View r3 = r2.findViewById(r3)
                android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
                r1.f270345f = r3
                r3 = 2131302141(0x7f0916fd, float:1.822236E38)
                android.view.View r3 = r2.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r4 = 2131825632(0x7f1113e0, float:1.9284126E38)
                r3.setText(r4)
                r2.setTag(r1)
                goto L_0x00f8
            L_0x00ec:
                com.tencent.mm.plugin.fav.ui.widget.FavVideoView r1 = new com.tencent.mm.plugin.fav.ui.widget.FavVideoView
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r2 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                r1.<init>(r2, r12)
                r2 = r1
            L_0x00f8:
                return r2
            L_0x00f9:
                int r5 = r4.mo128525k()
                r6 = 8
                if (r5 == r10) goto L_0x03b0
                int r5 = r4.mo128525k()
                if (r5 != r11) goto L_0x0109
                goto L_0x03b0
            L_0x0109:
                if (r2 != 0) goto L_0x0166
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$k r2 = new com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$k
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r5 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this
                r2.<init>(r5, r12)
                androidx.appcompat.app.AppCompatActivity r5 = r5.getContext()
                android.view.View r5 = android.view.View.inflate(r5, r7, r12)
                android.view.View r7 = r5.findViewById(r9)
                r2.f270340a = r7
                android.view.View r7 = r5.findViewById(r15)
                com.tencent.mm.ui.base.MultiTouchImageView r7 = (com.tencent.p014mm.p136ui.base.MultiTouchImageView) r7
                r2.f270341b = r7
                android.view.View r7 = r5.findViewById(r14)
                android.widget.ProgressBar r7 = (android.widget.ProgressBar) r7
                r2.f270343d = r7
                android.view.View r7 = r5.findViewById(r13)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r2.f270342c = r7
                r7 = 2131301197(0x7f09134d, float:1.8220445E38)
                android.view.View r7 = r5.findViewById(r7)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r2.f270344e = r7
                r7 = 2131302140(0x7f0916fc, float:1.8222358E38)
                android.view.View r7 = r5.findViewById(r7)
                android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
                r2.f270345f = r7
                r7 = 2131302141(0x7f0916fd, float:1.822236E38)
                android.view.View r7 = r5.findViewById(r7)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r9 = 2131825632(0x7f1113e0, float:1.9284126E38)
                r7.setText(r9)
                r5.setTag(r2)
                r18 = r5
                r5 = r2
                r2 = r18
                goto L_0x016c
            L_0x0166:
                java.lang.Object r5 = r21.getTag()
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$k r5 = (com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.C93619k) r5
            L_0x016c:
                android.widget.Gallery$LayoutParams r7 = new android.widget.Gallery$LayoutParams
                r9 = -1
                r7.<init>(r9, r9)
                r2.setLayoutParams(r7)
                android.util.SparseBooleanArray r7 = r0.f270337d
                r10 = 1
                boolean r7 = r7.get(r1, r10)
                android.util.SparseBooleanArray r12 = r0.f270337d
                r13 = 0
                r12.put(r1, r13)
                android.graphics.Bitmap r7 = r4.mo128518d(r7)
                java.lang.Object[] r12 = new java.lang.Object[r11]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
                r12[r13] = r1
                int r1 = r4.mo128529o()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r12[r10] = r1
                long r13 = r4.mo128533s()
                java.lang.Long r1 = java.lang.Long.valueOf(r13)
                r10 = 2
                r12[r10] = r1
                int r1 = r4.mo128532r()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r13 = 3
                r12[r13] = r1
                java.lang.String r1 = "index %d item favid %d, localid %d, itemStatus %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r12)
                r1 = 7
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r12 = r4.mo128523i()
                r14 = 0
                r1[r14] = r12
                java.lang.String r12 = r4.mo128520f()
                r14 = 1
                r1[r14] = r12
                java.lang.String r12 = r4.mo128519e()
                r1[r10] = r12
                long r14 = r4.mo128531q()
                java.lang.Long r10 = java.lang.Long.valueOf(r14)
                r1[r13] = r10
                java.lang.String r10 = r4.mo128522h()
                r1[r11] = r10
                r10 = 5
                java.lang.String r11 = r4.mo128521g()
                r1[r10] = r11
                r10 = 6
                long r11 = r4.mo128536v()
                java.lang.Long r11 = java.lang.Long.valueOf(r11)
                r1[r10] = r11
                java.lang.String r10 = "item dataId %s, item data url %s, key %s, fullsize %d, thumb url %s, key %s, thumb size %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r1)
                java.lang.String r1 = ""
                if (r7 != 0) goto L_0x0394
                boolean r10 = r4.mo128538x()
                if (r10 == 0) goto L_0x0394
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r7 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this
                r10 = 0
                r7.enableOptionMenu(r10)
                java.lang.String r7 = "get big image fail"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r7)
                di3.d r3 = di3.C86312j.m106911c(r3)
                pb1.j1 r3 = (pb1.C100718j1) r3
                pb1.n0 r3 = r3.mo128198DE()
                java.lang.String r7 = r4.mo128523i()
                xb1.a r3 = (xb1.C102612a) r3
                pb1.u r3 = r3.mo142252Yt(r7)
                if (r3 != 0) goto L_0x02fa
                android.widget.LinearLayout r3 = r5.f270345f
                r3.setVisibility(r6)
                int r3 = r4.mo128529o()
                if (r3 >= 0) goto L_0x0292
                android.widget.ProgressBar r1 = r5.f270343d
                r3 = 0
                r1.setVisibility(r3)
                android.widget.TextView r1 = r5.f270344e
                r1.setVisibility(r3)
                android.widget.ImageView r1 = r5.f270342c
                r1.setVisibility(r3)
                android.view.View r1 = r5.f270340a
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r3.mo10233c(r6)
                java.lang.Object[] r8 = r3.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter"
                java.lang.String r10 = "dealFailed"
                java.lang.String r11 = "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r6 = 0
                java.lang.Object r3 = r3.mo10231a(r6)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1.setVisibility(r3)
                java.lang.String r8 = "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter"
                java.lang.String r9 = "dealFailed"
                java.lang.String r10 = "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                android.widget.ImageView r1 = r5.f270342c
                android.graphics.Bitmap r3 = r0.mo128505d(r4)
                r1.setImageBitmap(r3)
                android.widget.ProgressBar r1 = r5.f270343d
                r3 = 0
                r1.setProgress(r3)
                android.widget.TextView r1 = r5.f270344e
                java.lang.String r3 = "0%"
                r1.setText(r3)
                goto L_0x02f9
            L_0x0292:
                android.widget.ProgressBar r3 = r5.f270343d
                r3.setVisibility(r6)
                android.widget.TextView r3 = r5.f270344e
                r3.setVisibility(r6)
                android.widget.ImageView r3 = r5.f270342c
                r3.setVisibility(r6)
                android.view.View r3 = r5.f270340a
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                r7 = 0
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r6.mo10233c(r8)
                java.lang.Object[] r8 = r6.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter"
                java.lang.String r10 = "dealFailed"
                java.lang.String r11 = "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r3
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r7 = 0
                java.lang.Object r6 = r6.mo10231a(r7)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r3.setVisibility(r6)
                java.lang.String r8 = "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter"
                java.lang.String r9 = "dealFailed"
                java.lang.String r10 = "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r7 = r3
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                int r3 = r4.mo128526l()
                if (r3 == 0) goto L_0x02f2
                android.widget.LinearLayout r3 = r5.f270345f
                r7 = 0
                r3.setVisibility(r7)
            L_0x02f2:
                android.graphics.Bitmap r3 = r0.mo128505d(r4)
                r0.mo128506f(r5, r3, r1)
            L_0x02f9:
                return r2
            L_0x02fa:
                r1 = 1
                r7 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                int r10 = r3.field_status
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r1[r7] = r10
                java.lang.String r10 = "fav cdnInfo status %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r1)
                android.widget.ProgressBar r1 = r5.f270343d
                r1.setVisibility(r7)
                android.widget.TextView r1 = r5.f270344e
                r1.setVisibility(r7)
                android.widget.ImageView r1 = r5.f270342c
                r1.setVisibility(r7)
                android.view.View r1 = r5.f270340a
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r7.mo10233c(r6)
                java.lang.Object[] r11 = r7.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter"
                java.lang.String r13 = "dealDownloading"
                java.lang.String r14 = "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;Lcom/tencent/mm/plugin/fav/api/FavCdnInfo;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r1
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                r6 = 0
                java.lang.Object r7 = r7.mo10231a(r6)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r6 = r7.intValue()
                r1.setVisibility(r6)
                java.lang.String r11 = "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ImageAdapter"
                java.lang.String r12 = "dealDownloading"
                java.lang.String r13 = "(Lcom/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI$ViewHolder;Lcom/tencent/mm/plugin/fav/ui/gallery/FavImgDataItem;Lcom/tencent/mm/plugin/fav/api/FavCdnInfo;)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                android.widget.ImageView r1 = r5.f270342c
                android.graphics.Bitmap r4 = r0.mo128505d(r4)
                r1.setImageBitmap(r4)
                int r1 = r3.field_totalLen
                if (r1 <= 0) goto L_0x0372
                int r3 = r3.field_offset
                int r3 = r3 * 100
                int r3 = r3 / r1
                int r13 = r3 + -1
                goto L_0x0373
            L_0x0372:
                r13 = 0
            L_0x0373:
                if (r13 >= 0) goto L_0x0377
                r9 = 0
                goto L_0x0378
            L_0x0377:
                r9 = r13
            L_0x0378:
                android.widget.ProgressBar r1 = r5.f270343d
                r1.setProgress(r9)
                android.widget.TextView r1 = r5.f270344e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r9)
                java.lang.String r4 = "%"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r1.setText(r3)
                return r2
            L_0x0394:
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r3 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this
                r6 = 1
                r3.enableOptionMenu(r6)
                java.lang.String r3 = r4.mo128524j()
                boolean r3 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((java.lang.String) r3)
                if (r3 == 0) goto L_0x03ac
                java.lang.String r1 = r4.mo128524j()
                r0.mo128503a(r5, r7, r1)
                goto L_0x03af
            L_0x03ac:
                r0.mo128503a(r5, r7, r1)
            L_0x03af:
                return r2
            L_0x03b0:
                if (r2 != 0) goto L_0x03c7
                com.tencent.mm.plugin.fav.ui.widget.FavVideoView r1 = new com.tencent.mm.plugin.fav.ui.widget.FavVideoView
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r2 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                r1.<init>(r2, r12)
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r2 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this
                java.util.List<com.tencent.mm.plugin.fav.ui.widget.FavVideoView> r2 = r2.f270312n
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r2.add(r1)
                goto L_0x03c8
            L_0x03c7:
                r1 = r2
            L_0x03c8:
                java.lang.String r2 = r4.mo128524j()
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r5 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this
                java.util.HashMap<java.lang.String, java.util.List<android.view.View>> r5 = r5.f270313o
                java.lang.Object r5 = r5.get(r2)
                java.util.List r5 = (java.util.List) r5
                if (r5 != 0) goto L_0x03dd
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
            L_0x03dd:
                r7 = r1
                com.tencent.mm.plugin.fav.ui.widget.FavVideoView r7 = (com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView) r7
                r5.add(r7)
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI r9 = com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.this
                java.util.HashMap<java.lang.String, java.util.List<android.view.View>> r9 = r9.f270313o
                r9.put(r2, r5)
                android.widget.LinearLayout r5 = r7.f270533i
                r5.setVisibility(r6)
                com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$j$a r5 = new com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$j$a
                r5.<init>()
                r7.setCallback(r5)
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
                if (r5 == 0) goto L_0x0402
                r7.setVideoData(r2)
                r6 = 1
                goto L_0x041e
            L_0x0402:
                java.lang.String r5 = r4.mo128523i()
                di3.d r3 = di3.C86312j.m106911c(r3)
                pb1.j1 r3 = (pb1.C100718j1) r3
                pb1.n0 r3 = r3.mo128198DE()
                xb1.a r3 = (xb1.C102612a) r3
                pb1.u r3 = r3.mo142252Yt(r5)
                if (r3 == 0) goto L_0x0420
                int r3 = r3.field_status
                r6 = 1
                if (r3 == r6) goto L_0x041e
                goto L_0x0421
            L_0x041e:
                r9 = 0
                goto L_0x0454
            L_0x0420:
                r6 = 1
            L_0x0421:
                java.lang.String r3 = r4.mo128520f()
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x0446
                java.lang.String r3 = r4.mo128519e()
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x0446
                java.lang.Object[] r3 = new java.lang.Object[r6]
                r9 = 0
                r3[r9] = r5
                java.lang.String r10 = "getView, no video, start download, dataId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r10, r3)
                r4.mo128539y()
                r7.mo128635h(r2, r6, r5)
                goto L_0x0454
            L_0x0446:
                r9 = 0
                java.lang.String r3 = "getView, no video, cdn data invalid"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r3)
                r7.mo128635h(r2, r9, r5)
                android.widget.LinearLayout r2 = r7.f270533i
                r2.setVisibility(r9)
            L_0x0454:
                java.lang.String r2 = r4.mo128537w()
                boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
                if (r3 == 0) goto L_0x0462
                r7.setThumbView(r2)
                goto L_0x046f
            L_0x0462:
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r9] = r2
                java.lang.String r2 = "getView, no thumb, start download, path:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r3)
                r4.mo128539y()
            L_0x046f:
                boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
                if (r2 == 0) goto L_0x047b
                com.tencent.mm.pluginsdk.ui.a$e r2 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.CONTAIN
                r7.setVideoScaleType(r2)
                goto L_0x0480
            L_0x047b:
                com.tencent.mm.pluginsdk.ui.a$e r2 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.DEFAULT
                r7.setVideoScaleType(r2)
            L_0x0480:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.gallery.FavMediaGalleryUI.C93617j.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        public int getViewTypeCount() {
            return 2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI$k */
    public class C93619k {

        /* renamed from: a */
        public View f270340a;

        /* renamed from: b */
        public MultiTouchImageView f270341b;

        /* renamed from: c */
        public ImageView f270342c;

        /* renamed from: d */
        public ProgressBar f270343d;

        /* renamed from: e */
        public TextView f270344e;

        /* renamed from: f */
        public LinearLayout f270345f;

        public C93619k(FavMediaGalleryUI favMediaGalleryUI, C93611d dVar) {
        }
    }

    /* renamed from: A4 */
    public void mo86623A4() {
    }

    /* renamed from: H7 */
    public final void mo128494H7() {
        if (this.f270321w == null || !mo128495I7()) {
            finish();
        } else {
            this.f270321w.mo128605a(true);
        }
    }

    /* renamed from: I7 */
    public final boolean mo128495I7() {
        C93624e b = this.f270308g.getItem(this.f270305d);
        return b != null && b.mo128525k() == 2;
    }

    /* renamed from: J7 */
    public final void mo128496J7(boolean z) {
        Class cls = C61416x.class;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C93624e b = this.f270308g.getItem(this.f270305d);
        if (b != null) {
            if (b.mo128526l() != 0) {
                Log.m105924i("MicroMsg.FavMediaGalleryUI", "showMenu, illegalType");
            } else if (b.mo128525k() == 2) {
                if (b.mo128516b()) {
                    arrayList.add(0);
                    arrayList2.add(getString(C0966R.string.crb));
                }
                if (b.mo128517c()) {
                    arrayList.add(1);
                    arrayList2.add(getString(C0966R.string.cpw));
                }
                arrayList.add(2);
                arrayList2.add(getString(C0966R.string.cr5));
                String j = b.mo128524j();
                RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) ((HashMap) this.f270320v).get(j);
                if (recogQBarOfImageFileResultEvent != null) {
                    C96874n1 n1Var = C96874n1.f283849a;
                    String d = n1Var.mo135195d(recogQBarOfImageFileResultEvent);
                    if (!Util.isNullOrNil(d)) {
                        arrayList.add(3);
                        int b2 = n1Var.mo135193b(recogQBarOfImageFileResultEvent);
                        if (((C61416x) C86312j.m106911c(cls)).mo71999h3(b2, d)) {
                            arrayList2.add(getString(C0966R.string.cq6));
                        } else if (((C61416x) C86312j.m106911c(cls)).mo71997TM(b2, d)) {
                            arrayList2.add(getString(C0966R.string.f360431cq3));
                        } else {
                            arrayList2.add(getString(C0966R.string.cq5));
                        }
                    }
                } else {
                    RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
                    recogQBarOfImageFileEvent.f107731d.f107732a = System.currentTimeMillis();
                    recogQBarOfImageFileEvent.f107731d.f107733b = j;
                    recogQBarOfImageFileEvent.publish();
                }
                if ((this.f270318t || this.f270317s) && !Util.isNullOrNil(j)) {
                    arrayList.add(5);
                    arrayList2.add(getString(C0966R.string.b8h));
                }
                arrayList.add(6);
                arrayList2.add(getString(C0966R.string.b8g));
                if (!Util.isNullOrNil(j)) {
                    C86709a0.m107528h();
                    if (C86709a0.m107529k().f251779b.mo123467m() != 0 && z && !this.f270318t) {
                        this.f270319u.mo128357d(j);
                    }
                }
            } else if (C86013q1.m106450k(b.mo128524j())) {
                if (b.mo128516b()) {
                    arrayList.add(0);
                    arrayList2.add(getString(C0966R.string.crb));
                }
                arrayList.add(2);
                arrayList2.add(getString(C0966R.string.iar));
            }
            if (!this.f270322x) {
                arrayList.add(4);
                arrayList2.add(getString(C0966R.string.coq));
            }
            if (this.f270310i == null) {
                this.f270310i = new C77407n((Context) getContext(), 1, false);
            }
            C77407n nVar = this.f270310i;
            nVar.f225771i = new C93614g(this, arrayList, arrayList2);
            nVar.f225782p = this.f270324z;
            nVar.f225761d = new C93615h();
            nVar.mo107573q();
        }
    }

    /* renamed from: R4 */
    public void mo128275R4(C100746u uVar) {
        C93624e b;
        if (uVar != null && (b = this.f270308g.getItem(this.f270305d)) != null && Util.nullAs(uVar.field_dataId, "").equals(b.mo128523i()) && b.mo128525k() == 2) {
            MMHandlerThread.postToMainThread(new C93608a(uVar));
        }
    }

    public void finish() {
        setResult(0, getIntent().putExtra("KEY_VIEW_PIC_CNT", this.f270323y));
        super.finish();
    }

    /* renamed from: g4 */
    public MultiTouchImageView mo127461g4() {
        int selectedItemPosition = this.f270307f.getSelectedItemPosition();
        MMGestureGallery mMGestureGallery = this.f270307f;
        View childAt = mMGestureGallery.getChildAt(selectedItemPosition - mMGestureGallery.getFirstVisiblePosition());
        if (childAt == null) {
            Log.m105925i("MicroMsg.FavMediaGalleryUI", "getCurView() pos:%s firstPos:%s", Integer.valueOf(selectedItemPosition), Integer.valueOf(this.f270307f.getFirstVisiblePosition()));
            return null;
        } else if (childAt instanceof MultiTouchImageView) {
            return (MultiTouchImageView) childAt;
        } else {
            View findViewById = childAt.findViewById(C0966R.C0970id.f39);
            if (findViewById instanceof MultiTouchImageView) {
                return (MultiTouchImageView) findViewById;
            }
            return null;
        }
    }

    public String getAesKey() {
        C93624e b = this.f270308g.getItem(this.f270305d);
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
        return this.f270308g.getItem(this.f270307f.getSelectedItemPosition()).mo128523i();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (1 == i) {
            if (-1 == i2) {
                C93624e b = this.f270308g.getItem(this.f270305d);
                if (b == null) {
                    Log.m105924i("MicroMsg.FavMediaGalleryUI", "dataItem is null.");
                    return;
                }
                String j = b.mo128524j();
                if (b.mo128515a(new C100703e0())) {
                    C76879j.m92726T(getContext(), getString(C0966R.string.f7260k));
                    return;
                }
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                ArrayList<String> stringsToList = Util.stringsToList(stringExtra.split(","));
                Log.m105919d("MicroMsg.FavMediaGalleryUI", "select %s for sending", stringExtra);
                C89779i0 Q = C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null);
                if (ImgUtil.isGif(j)) {
                    for (String f : stringsToList) {
                        C93594f1.m118178f(getContext(), f, b.mo128530p(), b.mo128528n(), new C93609b(this, Q));
                    }
                } else {
                    C93610c cVar = new C93610c(this, Q);
                    for (String k : stringsToList) {
                        C93594f1.m118183k(this, k, b.mo128528n(), cVar);
                    }
                }
            } else {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        super.onCreate(bundle);
        if (C11171e.m11046c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f270319u = new PhotoTransControl(this, this, this);
        this.f270311j = getIntent().getBooleanExtra("show_share", true);
        MMGestureGallery mMGestureGallery = (MMGestureGallery) findViewById(C0966R.C0970id.ehh);
        this.f270307f = mMGestureGallery;
        mMGestureGallery.setVerticalFadingEdgeEnabled(false);
        this.f270307f.setHorizontalFadingEdgeEnabled(false);
        this.f270307f.setOnItemSelectedListener(this);
        this.f270307f.setSingleClickOverListener(new C93611d());
        if (this.f270311j) {
            this.f270307f.setLongClickOverListener(new C93612e());
        }
        fullScreenNoTitleBar(true);
        this.f270309h = new ArrayList<>();
        C93617j jVar = new C93617j((C93611d) null);
        this.f270308g = jVar;
        this.f270307f.setAdapter(jVar);
        Class cls = C100718j1.class;
        long[] longArrayExtra = getIntent().getLongArrayExtra("KEY_MEDIA_FAVID_LIST");
        ArrayList arrayList = new ArrayList();
        String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        this.f270303A = getIntent().getLongExtra("key_detail_info_id", -1);
        boolean booleanExtra = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
        String stringExtra2 = getIntent().getStringExtra("fav_note_xml");
        if (longArrayExtra == null) {
            C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(this.f270303A);
            Object[] objArr = new Object[2];
            objArr[0] = Long.valueOf(this.f270303A);
            objArr[1] = Boolean.valueOf(Yt != null);
            Log.m105925i("MicroMsg.FavMediaGalleryUI", "show one fav info, local id is %d, get from db ok ? %B", objArr);
            if (booleanExtra && !Util.isNullOrNil(stringExtra2)) {
                Yt = C100734q.m131886z(stringExtra2, 18);
            }
            if (Yt != null) {
                arrayList.add(Yt);
            }
        } else {
            for (long Yt2 : longArrayExtra) {
                C100755z Yt3 = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(Yt2);
                if (Yt3 != null && !arrayList.contains(Yt3)) {
                    arrayList.add(Yt3);
                }
            }
            if (arrayList.size() == 0 && booleanExtra && !Util.isNullOrNil(stringExtra2)) {
                arrayList.add(C100734q.m131886z(stringExtra2, 18));
            }
        }
        this.f270309h.clear();
        int i6 = -1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            C100755z zVar = (C100755z) arrayList.get(i7);
            int size2 = zVar.field_favProto.f298618f.size();
            int i8 = 0;
            while (i8 < size2) {
                C101834rc0 rc02 = zVar.field_favProto.f298618f.get(i8);
                if ((rc02.f299258I != 8 || ImgUtil.isGif(C100734q.m131880w(rc02))) && ((i4 = rc02.f299258I) == 2 || i4 == 4 || i4 == 15 || i4 == 8)) {
                    this.f270309h.add(new C93622c(zVar, rc02));
                    if (stringExtra != null && stringExtra.equals(rc02.f299280T)) {
                        long j = zVar.field_localId;
                        if (j != -1) {
                            i3 = i;
                            i2 = size;
                            if (j == this.f270303A) {
                                i5 = this.f270309h.size();
                            }
                            i = i3;
                            i8++;
                            size = i2;
                        } else {
                            i2 = size;
                            i5 = this.f270309h.size();
                        }
                        i = i5 - 1;
                        i8++;
                        size = i2;
                    }
                }
                i3 = i;
                i2 = size;
                i = i3;
                i8++;
                size = i2;
            }
            int i9 = size;
            i6 = (stringExtra == null && zVar.field_localId == this.f270303A) ? this.f270309h.size() - 1 : i;
            i7++;
            size = i9;
        }
        getIntent().removeExtra("key_detail_info_id");
        getIntent().removeExtra("key_detail_data_id");
        this.f270308g.notifyDataSetChanged();
        if (i >= 0) {
            Log.m105925i("MicroMsg.FavMediaGalleryUI", "pre match selection %d", Integer.valueOf(i));
            this.f270307f.setSelection(i);
            this.f270305d = i;
        }
        this.f270315q = i;
        this.f270307f.post(new C93626h(this, i));
        setBackBtn(new C93613f());
        this.f270304B.alive();
        setResult(0, getIntent().putExtra("KEY_VIEW_PIC_CNT", this.f270323y));
        this.f270316r.f298813d = getIntent().getIntExtra("key_detail_fav_scene", 0);
        this.f270316r.f298814e = getIntent().getIntExtra("key_detail_fav_sub_scene", 0);
        this.f270316r.f298815f = getIntent().getIntExtra("key_detail_fav_index", 0);
        this.f270316r.f298817h = getIntent().getStringExtra("key_detail_fav_query");
        this.f270316r.f298816g = getIntent().getStringExtra("key_detail_fav_sessionid");
        this.f270316r.f298818i = getIntent().getStringExtra("key_detail_fav_tags");
        C101811md0 md02 = this.f270316r;
        String str = md02.f298817h;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        md02.f298817h = str;
        String str3 = md02.f298816g;
        if (str3 == null) {
            str3 = str2;
        }
        md02.f298816g = str3;
        String str4 = md02.f298818i;
        if (str4 != null) {
            str2 = str4;
        }
        md02.f298818i = str2;
        if (getIntent().getBooleanExtra("KEY_MEDIA_SUPPORT_DRAG", false)) {
            this.f270321w = new C93687q(this.f270307f, this, this);
        }
        this.f270322x = getIntent().getBooleanExtra("KEY_MEDIA_HIDE_GO_DETAIL", false);
    }

    public void onDestroy() {
        getIntent().putExtra("key_activity_browse_time", getActivityBrowseTimeMs());
        this.f270304B.dead();
        C93687q qVar = this.f270321w;
        if (qVar != null) {
            qVar.f270474b = null;
            qVar.f270473a = null;
            qVar.f270477e = null;
        }
        Iterator it = ((ArrayList) this.f270312n).iterator();
        while (it.hasNext()) {
            FavVideoView favVideoView = (FavVideoView) it.next();
            if (favVideoView != null) {
                favVideoView.mo128629d();
            }
        }
        PhotoTransControl photoTransControl = this.f270319u;
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
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f270323y++;
        this.f270305d = i;
        Log.m105918d("MicroMsg.FavMediaGalleryUI", "pos:" + i);
        if (view instanceof MultiTouchImageView) {
            ((MultiTouchImageView) view).mo26059d();
        }
        FavVideoView favVideoView = this.f270306e;
        if (favVideoView != null) {
            favVideoView.mo128629d();
        }
        if (view instanceof FavVideoView) {
            FavVideoView favVideoView2 = (FavVideoView) view;
            if ((this.f270308g.getItemViewType(i) == 15 || this.f270308g.getItemViewType(i) == 4) && !favVideoView2.mo128628c()) {
                if (i != this.f270315q || this.f270314p) {
                    favVideoView2.setStartAfterPrepared(false);
                } else {
                    favVideoView2.setStartAfterPrepared(true);
                    this.f270314p = true;
                }
                favVideoView2.mo128630e();
                this.f270306e = favVideoView2;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || this.f270321w == null) {
            return super.onKeyDown(i, keyEvent);
        }
        mo128494H7();
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
        C93624e b = this.f270308g.getItem(this.f270305d);
        if (b == null) {
            return null;
        }
        return b.mo128520f();
    }

    /* renamed from: u5 */
    public String mo86627u5() {
        C93624e b = this.f270308g.getItem(this.f270305d);
        return (b != null && b.mo128525k() == 2) ? b.mo128524j() : "";
    }

    /* renamed from: w3 */
    public void mo86628w3(Object obj, Object obj2) {
        C102690c cVar = (C102690c) obj2;
        String u5 = mo86627u5();
        int b = C30391y.m39057b(cVar.f303305a);
        Log.m105925i("MicroMsg.FavMediaGalleryUI", "local translate, img %s, result %s, ratio %d", u5, cVar.f303305a, Integer.valueOf(b));
        if (((String) obj).equals(u5) && C30391y.m39062g(b)) {
            this.f270317s = true;
            mo128496J7(false);
        }
    }

    /* renamed from: x3 */
    public void mo86629x3() {
    }
}
