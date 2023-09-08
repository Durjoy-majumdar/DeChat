package com.tencent.p014mm.plugin.gallery.p473ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew;
import com.tencent.p014mm.plugin.gallery.model.C93951d;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.gallery.p473ui.C94070m;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.VideoCaptureReportInfo;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ew1.C97754e;
import fw1.C98050a;
import fw1.C98052c;
import fw1.C98055d;
import gw1.C98253a;
import h81.C32735h;
import hd0.C98429r0;
import hh2.C8532a;
import hw1.C60223w;
import i21.C60242i;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import k20.C60958c;
import k20.C9556a;
import k21.C60960c;
import kg3.C76577a;
import nj3.C88989a;
import ow1.C100577n;
import ow1.C100580o;
import ow1.q$$b;
import ow1.q$$d;
import ow1.q$$e;
import ow1.q$$f;
import ow1.q$$g;
import p166hy.C98561h0;
import p166hy.C98567o0;
import p273xw.C15905b;
import p511ew.C58849b;
import p903ij.C76359b;
import q90.C101062d;
import qo3.C77426q;
import qw1.C101316l;
import qw1.C63339b;
import rx3.C13604l;
import vo3.C90852c;
import xb0.C102609h;
import xg2.C102635b;
import zt3.C119157j;

@C88989a(19)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI */
public class ImagePreviewUI extends MMActivity {

    /* renamed from: h1 */
    public static final /* synthetic */ int f271368h1 = 0;

    /* renamed from: A */
    public float f271369A = 0.0f;

    /* renamed from: B */
    public ImageButton f271370B;

    /* renamed from: C */
    public boolean f271371C;

    /* renamed from: D */
    public TextView f271372D;

    /* renamed from: E */
    public ViewGroup f271373E;

    /* renamed from: F */
    public ViewGroup f271374F;

    /* renamed from: G */
    public boolean f271375G = true;

    /* renamed from: H */
    public boolean f271376H = true;

    /* renamed from: I */
    public boolean f271377I = true;

    /* renamed from: J */
    public int f271378J = 0;

    /* renamed from: K */
    public long f271379K = 0;

    /* renamed from: L */
    public int f271380L = 10;

    /* renamed from: M */
    public TextView f271381M;

    /* renamed from: N */
    public TextView f271382N;

    /* renamed from: P */
    public TextView f271383P;

    /* renamed from: Q */
    public TextView f271384Q;

    /* renamed from: Q0 */
    public boolean f271385Q0;

    /* renamed from: R */
    public View f271386R;

    /* renamed from: R0 */
    public boolean f271387R0;

    /* renamed from: S */
    public TextView f271388S;

    /* renamed from: S0 */
    public boolean f271389S0 = false;

    /* renamed from: T */
    public ProgressBar f271390T;

    /* renamed from: T0 */
    public boolean f271391T0 = false;

    /* renamed from: U */
    public String f271392U;

    /* renamed from: U0 */
    public boolean f271393U0 = false;

    /* renamed from: V */
    public int f271394V;

    /* renamed from: V0 */
    public boolean f271395V0 = false;

    /* renamed from: W */
    public int f271396W;

    /* renamed from: W0 */
    public final C98253a f271397W0 = new C94015i();

    /* renamed from: X */
    public boolean f271398X = false;

    /* renamed from: X0 */
    public boolean f271399X0 = false;

    /* renamed from: Y */
    public int f271400Y = 0;

    /* renamed from: Y0 */
    public C93951d.C93956e f271401Y0 = null;

    /* renamed from: Z */
    public SimpleDateFormat f271402Z = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());

    /* renamed from: Z0 */
    public String f271403Z0;

    /* renamed from: a1 */
    public String f271404a1;

    /* renamed from: b1 */
    public String f271405b1 = "";

    /* renamed from: c1 */
    public HashMap<String, Long> f271406c1 = new HashMap<>();

    /* renamed from: d */
    public MMViewPager f271407d;

    /* renamed from: d1 */
    public int f271408d1 = 300000;

    /* renamed from: e */
    public C94061h f271409e;

    /* renamed from: e1 */
    public String f271410e1;

    /* renamed from: f */
    public RecyclerView f271411f;

    /* renamed from: f1 */
    public int f271412f1 = 1000;

    /* renamed from: g */
    public ArrayList<String> f271413g;

    /* renamed from: g1 */
    public String f271414g1;

    /* renamed from: h */
    public ArrayList<GalleryItem$MediaItem> f271415h;

    /* renamed from: i */
    public ArrayList<String> f271416i;

    /* renamed from: j */
    public ArrayList<GalleryItem$MediaItem> f271417j;

    /* renamed from: n */
    public Integer f271418n;

    /* renamed from: o */
    public boolean f271419o;

    /* renamed from: p */
    public boolean f271420p;

    /* renamed from: p0 */
    public String f271421p0;

    /* renamed from: q */
    public boolean f271422q;

    /* renamed from: r */
    public boolean f271423r;

    /* renamed from: s */
    public boolean f271424s;

    /* renamed from: t */
    public ImageButton f271425t;

    /* renamed from: u */
    public TextView f271426u;

    /* renamed from: v */
    public TextView f271427v;

    /* renamed from: w */
    public TextView f271428w;

    /* renamed from: x */
    public MTimerHandler f271429x;

    /* renamed from: x0 */
    public String f271430x0;

    /* renamed from: y */
    public int f271431y;

    /* renamed from: y0 */
    public boolean f271432y0;

    /* renamed from: z */
    public boolean f271433z;

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$a */
    public class C94007a implements View.OnClickListener {
        public C94007a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c4, code lost:
            r12 = r11.f271434d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r12) {
            /*
                r11 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r12)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$10"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r11
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                com.tencent.mm.plugin.gallery.ui.h r1 = r0.f271409e
                java.lang.Integer r0 = r0.f271418n
                int r0 = r0.intValue()
                java.lang.String r0 = r1.mo129062j(r0)
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                r2 = 0
                java.lang.String r3 = "(Landroid/view/View;)V"
                java.lang.String r4 = "onClick"
                java.lang.String r5 = "android/view/View$OnClickListener"
                java.lang.String r6 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$10"
                r7 = 1
                if (r1 != 0) goto L_0x011b
                boolean r12 = r12.isEnabled()
                if (r12 != 0) goto L_0x0043
                goto L_0x011b
            L_0x0043:
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r12 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                r12.mo128994S7(r0)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r12 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                java.lang.Integer r1 = r12.f271418n
                int r1 = r1.intValue()
                com.tencent.mm.plugin.gallery.ui.h r8 = r12.f271409e
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r8.mo129063k(r1)
                if (r1 == 0) goto L_0x005b
                r12.mo129007f8(r1)
            L_0x005b:
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r12 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                java.util.ArrayList<java.lang.String> r1 = r12.f271416i
                int r1 = r1.size()
                java.lang.Class<hg.d> r8 = p548hg.C98450d.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                hg.d r8 = (p548hg.C98450d) r8
                android.content.Intent r9 = r12.getIntent()
                java.lang.String r10 = "GalleryUI_ToUser"
                java.lang.String r9 = r9.getStringExtra(r10)
                boolean r8 = r8.mo137798ep(r9)
                if (r8 == 0) goto L_0x0086
                int r8 = r12.f271431y
                r9 = 9
                if (r8 != r9) goto L_0x0082
                goto L_0x0086
            L_0x0082:
                if (r1 > r7) goto L_0x0086
                r12.f271395V0 = r2
            L_0x0086:
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r12 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                android.widget.TextView r1 = r12.f271426u
                androidx.appcompat.app.AppCompatActivity r12 = r12.getContext()
                r8 = 2131830617(0x7f112759, float:1.9294236E38)
                java.lang.String r12 = r12.getString(r8)
                r1.setText(r12)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r12 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                java.lang.String r1 = r12.mo128989N7()
                r12.updateOptionMenuText(r2, r1)
                ew1.e r12 = ew1.C97754e.C97756b.f286807a
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                android.content.Intent r1 = r1.getIntent()
                r8 = 3
                java.lang.String r9 = "select_type_tag"
                int r1 = r1.getIntExtra(r9, r8)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r9 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                java.lang.Integer r9 = r9.f271418n
                int r9 = r9.intValue()
                r12.mo137083b(r0, r1, r9)
                boolean r12 = hd0.C98429r0.m127830u()
                r0 = 8
                if (r12 == 0) goto L_0x00f8
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r12 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                int r1 = r12.f271378J
                if (r1 == r8) goto L_0x00ce
                r8 = 16
                if (r1 != r8) goto L_0x00f8
            L_0x00ce:
                boolean r1 = r12.f271420p
                if (r1 == 0) goto L_0x00f8
                java.lang.String r12 = r12.mo128987L7()
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                android.widget.TextView r1 = r1.f271427v
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r8 == 0) goto L_0x00e1
                goto L_0x00e2
            L_0x00e1:
                r0 = 0
            L_0x00e2:
                r1.setVisibility(r0)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                android.widget.TextView r1 = r0.f271427v
                r8 = 2131830576(0x7f112730, float:1.9294153E38)
                java.lang.Object[] r9 = new java.lang.Object[r7]
                r9[r2] = r12
                java.lang.String r12 = r0.getString(r8, r9)
                r1.setText(r12)
                goto L_0x00ff
            L_0x00f8:
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r12 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                android.widget.TextView r12 = r12.f271427v
                r12.setVisibility(r0)
            L_0x00ff:
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r12 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                r12.mo128983H7(r2)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r12 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                boolean r0 = r12.f271377I
                if (r0 == 0) goto L_0x0117
                java.util.ArrayList<java.lang.String> r0 = r12.f271416i
                int r0 = r0.size()
                if (r0 == 0) goto L_0x0113
                goto L_0x0114
            L_0x0113:
                r7 = 0
            L_0x0114:
                r12.enableOptionMenu(r2, r7)
            L_0x0117:
                j20.C117292a.m165361g(r11, r6, r5, r4, r3)
                return
            L_0x011b:
                java.lang.Object[] r12 = new java.lang.Object[r7]
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                java.lang.Integer r0 = r0.f271418n
                r12[r2] = r0
                java.lang.String r0 = "MicroMsg.ImagePreviewUI"
                java.lang.String r1 = "get path error, position %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r1, r12)
                j20.C117292a.m165361g(r11, r6, r5, r4, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.C94007a.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$b */
    public class C94008b implements View.OnClickListener {
        public C94008b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ImagePreviewUI.this.f271370B.performClick();
            ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
            if (imagePreviewUI.f271371C) {
                imagePreviewUI.f271372D.setContentDescription(imagePreviewUI.getResources().getString(C0966R.string.f4o));
            } else {
                imagePreviewUI.f271372D.setContentDescription(imagePreviewUI.getResources().getString(C0966R.string.f4q));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$c */
    public class C94009c implements View.OnClickListener {
        public C94009c(ImagePreviewUI imagePreviewUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$d */
    public class C94010d implements View.OnClickListener {
        public C94010d(ImagePreviewUI imagePreviewUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$e */
    public class C94011e implements View.OnClickListener {
        public C94011e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
            int i = ImagePreviewUI.f271368h1;
            String stringExtra = imagePreviewUI.getIntent().getStringExtra("GalleryUI_FromUser");
            String stringExtra2 = imagePreviewUI.getIntent().getStringExtra("GalleryUI_ToUser");
            Intent intent = new Intent();
            Integer num = imagePreviewUI.f271418n;
            Boolean bool = Boolean.TRUE;
            Log.m105925i("MicroMsg.ImagePreviewUI", "edit image path:%s mPosition:%s", imagePreviewUI.f271409e.mo129062j(imagePreviewUI.f271418n.intValue()), num);
            intent.putExtra("GalleryUI_FromUser", stringExtra);
            intent.putExtra("GalleryUI_ToUser", stringExtra2);
            intent.putExtra("from_scene", C93958f.m118750j().f271196f);
            intent.putExtra("preview_image_list", ((C94070m) imagePreviewUI.f271411f.getAdapter()).f271612h);
            if (C93958f.m118750j().f271196f == 4) {
                intent.putExtra("from_scene", 289);
            } else if (C93958f.m118750j().f271196f == 3) {
                intent.putExtra("from_scene", C82086j.CTRL_INDEX);
            }
            intent.putExtra("preview_select_image_list", imagePreviewUI.f271416i);
            GalleryItem$MediaItem k = imagePreviewUI.f271409e.mo129063k(imagePreviewUI.f271418n.intValue());
            if (k != null) {
                Log.m105925i("MicroMsg.ImagePreviewUI", "[gotoPhotoEditUI] raw:%s orignal:%s", k.f162748e, k.f162747d);
                String str = k.f162748e;
                imagePreviewUI.f271403Z0 = str;
                if (Util.isNullOrNil(str) || imagePreviewUI.f271419o) {
                    imagePreviewUI.f271403Z0 = k.f162747d;
                    intent.putExtra("after_photo_edit", "");
                    imagePreviewUI.f271404a1 = "";
                } else {
                    intent.putExtra("after_photo_edit", k.f162747d);
                    imagePreviewUI.f271404a1 = k.f162747d;
                }
            } else {
                Log.m105925i("MicroMsg.ImagePreviewUI", "[gotoPhotoEditUI] item == null mPosition:%s", imagePreviewUI.f271418n);
                imagePreviewUI.f271403Z0 = imagePreviewUI.f271409e.mo129062j(imagePreviewUI.f271418n.intValue());
                long intValue = (long) imagePreviewUI.f271418n.intValue();
                String str2 = imagePreviewUI.f271403Z0;
                GalleryItem$MediaItem c = GalleryItem$MediaItem.m65488c(1, intValue, str2, str2, "edit");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c);
                C93958f.m118755o(arrayList2);
            }
            RecordConfigProvider b = RecordConfigProvider.m119432b(Util.isNullOrNil(imagePreviewUI.f271404a1) ? imagePreviewUI.f271403Z0 : imagePreviewUI.f271404a1, "");
            b.f272905F = C93958f.m118750j().f271196f;
            VideoCaptureReportInfo videoCaptureReportInfo = new VideoCaptureReportInfo();
            int i2 = b.f272905F;
            if (i2 == 4) {
                b.f272938z = false;
                videoCaptureReportInfo.f272940d = 1;
                if (imagePreviewUI.mo128992Q7() && imagePreviewUI.f271432y0) {
                    videoCaptureReportInfo.f272940d = 10;
                }
                b.f272912M.putBoolean("key_edit_enable_emoji_search", true);
            } else if (i2 == 3) {
                videoCaptureReportInfo.f272940d = 3;
                b.f272912M.putBoolean("key_edit_enable_emoji_search", true);
            }
            b.f272908I = videoCaptureReportInfo;
            UICustomParam uICustomParam = new UICustomParam();
            ((HashMap) uICustomParam.f266575h).put("plugin_filter", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool);
            b.f272927o = uICustomParam;
            if (!imagePreviewUI.f271387R0) {
                C60960c.f173618a.mo85927k("SnsPublishProcess", "actionTrace_", 5, C60242i.ACTIONTRACE);
                imagePreviewUI.f271387R0 = true;
            }
            C8532a.f27585a.mo9446e(imagePreviewUI.getContext(), 4372, C0966R.C0968anim.f2492eg, -1, b, 1, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$f */
    public class C94012f extends RecyclerView.C0129l {
        public C94012f(ImagePreviewUI imagePreviewUI) {
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            int dimension = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3895i6);
            int i = dimension / 2;
            rect.left = i;
            rect.bottom = dimension;
            rect.top = dimension;
            rect.right = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$g */
    public class C94013g implements Runnable {
        public C94013g() {
        }

        public void run() {
            ImagePreviewUI.this.f271411f.getLayoutParams().height = (((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3895i6)) * 2) + (ImagePreviewUI.this.getResources().getDisplayMetrics().widthPixels / 7);
            ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
            RecyclerView recyclerView = imagePreviewUI.f271411f;
            int intValue = imagePreviewUI.f271418n.intValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(intValue));
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$16", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$16", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$h */
    public class C94014h implements C94070m.C94076d {
        public C94014h() {
        }

        /* renamed from: a */
        public void mo129014a(View view, int i) {
            Log.m105925i("MicroMsg.ImagePreviewUI", "[onItemClick] position:%s %s", Integer.valueOf(i), Boolean.valueOf(ImagePreviewUI.this.f271419o));
            C94070m mVar = (C94070m) ImagePreviewUI.this.f271411f.getAdapter();
            mVar.f271620s = i;
            mVar.f271619r = i;
            ImagePreviewUI.this.f271407d.setCurrentItem(i, false);
            if (!ImagePreviewUI.this.f271419o) {
                C93958f.f271152p = true;
            } else {
                C93958f.f271150n = true;
            }
        }

        /* renamed from: b */
        public void mo129015b(int i, int i2, int i3) {
            Log.m105925i("MicroMsg.ImagePreviewUIChangelcai", "[onItemMoved] fromPos:%s, toPos:%s,visiblePos:%s, mPosition:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), ImagePreviewUI.this.f271418n);
            ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
            if (!imagePreviewUI.f271419o) {
                C101316l.m132916o(imagePreviewUI.f271413g, i, i2);
                ImagePreviewUI imagePreviewUI2 = ImagePreviewUI.this;
                C94061h hVar = imagePreviewUI2.f271409e;
                int intValue = imagePreviewUI2.f271418n.intValue();
                hVar.getClass();
                Log.m105925i("MicroMsg.ImageAdapter", "[swapPosition]from:%s to:%s curPos:%s visiblePos:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(intValue), Integer.valueOf(i3));
                if (!hVar.f271578j) {
                    C101316l.m132916o(hVar.f271576h, i, i2);
                    hVar.f271580o = i3;
                    View view = (View) hVar.f293276f.get(intValue);
                    hVar.f271581p = view;
                    ((LinkedList) hVar.f293274d).remove(view);
                    hVar.f293275e.clear();
                    hVar.f293276f.clear();
                    hVar.f271582q = true;
                    hVar.notifyDataSetChanged();
                }
                ImagePreviewUI.this.f271407d.setCurrentItem(i3, false);
                C94070m mVar = (C94070m) ImagePreviewUI.this.f271411f.getAdapter();
                mVar.f271620s = i3;
                mVar.f271619r = i3;
                C93958f.f271151o = true;
                return;
            }
            C101316l.m132916o(imagePreviewUI.f271416i, i, i2);
            C93958f.f271149m = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$i */
    public class C94015i implements C98253a {
        public C94015i() {
        }

        /* renamed from: a */
        public ArrayList<GalleryItem$MediaItem> mo80212a() {
            return ImagePreviewUI.this.f271417j;
        }

        /* renamed from: b */
        public boolean mo80213b() {
            return false;
        }

        /* renamed from: c */
        public void mo80214c(int i) {
            ImagePreviewUI.this.mo129006e8(i);
        }

        public AppCompatActivity getActivity() {
            return ImagePreviewUI.this;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$j */
    public class C94016j implements MTimerHandler.CallBack {
        public C94016j() {
        }

        public boolean onTimerExpired() {
            ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
            boolean z = !imagePreviewUI.f271376H;
            imagePreviewUI.f271376H = z;
            if (z) {
                imagePreviewUI.fullScreenNoTitleBar(false);
                imagePreviewUI.mo128997V7(z);
                imagePreviewUI.mo128996U7(true);
            } else {
                imagePreviewUI.fullScreenNoTitleBar(true);
                imagePreviewUI.mo128997V7(z);
                imagePreviewUI.mo128996U7(false);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$k */
    public class C94017k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ GalleryItem$MediaItem f271441d;

        public C94017k(GalleryItem$MediaItem galleryItem$MediaItem) {
            this.f271441d = galleryItem$MediaItem;
        }

        public void run() {
            ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
            GalleryItem$MediaItem galleryItem$MediaItem = this.f271441d;
            int i = ImagePreviewUI.f271368h1;
            imagePreviewUI.mo129007f8(galleryItem$MediaItem);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$l */
    public class C94018l implements C60223w.C60225b {

        /* renamed from: a */
        public final /* synthetic */ GalleryItem$VideoMediaItem f271443a;

        public C94018l(GalleryItem$VideoMediaItem galleryItem$VideoMediaItem) {
            this.f271443a = galleryItem$VideoMediaItem;
        }

        /* renamed from: a */
        public void mo85218a(C60223w wVar) {
            if (wVar.equals(ImagePreviewUI.this.f271390T.getTag())) {
                ImagePreviewUI.this.f271390T.setTag((Object) null);
            }
            if (wVar.f171725e == ImagePreviewUI.this.f271418n.intValue()) {
                ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
                boolean a8 = imagePreviewUI.mo129002a8(wVar.f171724d, wVar.f171728h, imagePreviewUI.f271398X);
                ImagePreviewUI imagePreviewUI2 = ImagePreviewUI.this;
                imagePreviewUI2.mo129001Z7(imagePreviewUI2.f271398X, a8, this.f271443a);
                ImagePreviewUI.this.mo128991P7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$m */
    public class C94019m implements C60223w.C60225b {

        /* renamed from: a */
        public final /* synthetic */ GalleryItem$MediaItem f271445a;

        public C94019m(GalleryItem$MediaItem galleryItem$MediaItem) {
            this.f271445a = galleryItem$MediaItem;
        }

        /* renamed from: a */
        public void mo85218a(C60223w wVar) {
            C60223w wVar2 = wVar;
            if (wVar2.equals(ImagePreviewUI.this.f271390T.getTag())) {
                ImagePreviewUI.this.f271390T.setTag((Object) null);
            }
            if (wVar2.f171725e == ImagePreviewUI.this.f271418n.intValue()) {
                boolean isEmpty = TextUtils.isEmpty(wVar2.f171728h.f162764u);
                int i = C0966R.color.ala;
                if (isEmpty) {
                    String string = ImagePreviewUI.this.getString(C0966R.string.f5w);
                    View view = ImagePreviewUI.this.f271386R;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$25", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$25", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ImagePreviewUI.this.f271384Q.setText(string);
                    ImagePreviewUI.this.f271372D.setEnabled(false);
                    ImagePreviewUI.this.f271370B.setEnabled(false);
                    ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
                    imagePreviewUI.f271372D.setTextColor(imagePreviewUI.getResources().getColor(C0966R.color.ala));
                    if (ImagePreviewUI.this.f271416i.size() == 0) {
                        ImagePreviewUI.this.enableOptionMenu(false);
                        return;
                    }
                    return;
                }
                int i2 = wVar2.f171728h.f162766w;
                ImagePreviewUI imagePreviewUI2 = ImagePreviewUI.this;
                if (i2 >= imagePreviewUI2.f271408d1 || (i2 > 0 && i2 < imagePreviewUI2.f271412f1)) {
                    View view2 = imagePreviewUI2.f271386R;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$25", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$25", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ImagePreviewUI imagePreviewUI3 = ImagePreviewUI.this;
                    imagePreviewUI3.f271384Q.setText(wVar2.f171728h.f162766w >= imagePreviewUI3.f271408d1 ? imagePreviewUI3.f271410e1 : imagePreviewUI3.f271414g1);
                    ImagePreviewUI.this.f271372D.setEnabled(false);
                    ImagePreviewUI.this.f271370B.setEnabled(false);
                    ImagePreviewUI imagePreviewUI4 = ImagePreviewUI.this;
                    imagePreviewUI4.f271372D.setTextColor(imagePreviewUI4.getResources().getColor(C0966R.color.ala));
                    if (ImagePreviewUI.this.f271416i.size() == 0) {
                        ImagePreviewUI.this.enableOptionMenu(false);
                    }
                } else {
                    imagePreviewUI2.f271372D.setEnabled(true);
                    ImagePreviewUI.this.f271370B.setEnabled(true);
                    ImagePreviewUI imagePreviewUI5 = ImagePreviewUI.this;
                    imagePreviewUI5.f271372D.setTextColor(imagePreviewUI5.getResources().getColor(C0966R.color.al_));
                    View view4 = ImagePreviewUI.this.f271386R;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$25", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$25", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (C98429r0.m127830u()) {
                    ImagePreviewUI imagePreviewUI6 = ImagePreviewUI.this;
                    if (imagePreviewUI6.f271378J == 3 && imagePreviewUI6.f271420p && C86013q1.m106451l(this.f271445a.f162747d) > C101316l.m132908g()) {
                        boolean contains = ImagePreviewUI.this.f271417j.contains(this.f271445a);
                        ImagePreviewUI.this.f271372D.setEnabled(contains);
                        ImagePreviewUI.this.f271370B.setEnabled(contains);
                        ImagePreviewUI imagePreviewUI7 = ImagePreviewUI.this;
                        TextView textView = imagePreviewUI7.f271372D;
                        Resources resources = imagePreviewUI7.getResources();
                        if (contains) {
                            i = C0966R.color.al_;
                        }
                        textView.setTextColor(resources.getColor(i));
                        View view6 = ImagePreviewUI.this.f271386R;
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(8);
                        View view7 = view6;
                        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$25", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$25", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (ImagePreviewUI.this.f271416i.size() == 0) {
                            ImagePreviewUI.this.enableOptionMenu(false);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$n */
    public class C94020n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f271447d;

        public C94020n(long j) {
            this.f271447d = j;
        }

        public void run() {
            ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
            int i = ImagePreviewUI.f271368h1;
            imagePreviewUI.fullScreenNoTitleBar(false);
            imagePreviewUI.mo128997V7(true);
            imagePreviewUI.mo128996U7(true);
            Log.m105927v("MicroMsg.ImagePreviewUI", "test oncreate post: %d", Long.valueOf(Util.ticksToNow(this.f271447d)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$o */
    public class C94021o implements Runnable {
        public C94021o() {
        }

        public void run() {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ImagePreviewUI.this.f271386R.getLayoutParams();
            marginLayoutParams.topMargin = (int) (((float) KeyBoardUtil.getStatusHeight(ImagePreviewUI.this)) + ImagePreviewUI.this.getResources().getDimension(C0966R.dimen.f3679b9));
            ImagePreviewUI.this.f271386R.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$p */
    public class C94022p implements View.OnClickListener {
        public C94022p() {
        }

        public void onClick(View view) {
            ImagePreviewUI imagePreviewUI;
            int i;
            C94070m mVar;
            ImagePreviewUI imagePreviewUI2;
            int i2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ImagePreviewUI imagePreviewUI3 = ImagePreviewUI.this;
            boolean z = !imagePreviewUI3.f271420p;
            imagePreviewUI3.f271420p = z;
            int i3 = 8;
            if (z) {
                imagePreviewUI3.f271425t.setImageResource(C0966R.raw.radio_on);
                ImagePreviewUI imagePreviewUI4 = ImagePreviewUI.this;
                imagePreviewUI4.f271425t.setContentDescription(imagePreviewUI4.getResources().getString(C0966R.string.f4o));
                if (ImagePreviewUI.this.f271416i.size() == 0 && !C98429r0.m127830u()) {
                    ImagePreviewUI.this.f271370B.performClick();
                }
                if (!C98429r0.m127830u() || (!((i2 = imagePreviewUI2.f271378J) == 3 || i2 == 16) || !(imagePreviewUI2 = ImagePreviewUI.this).f271420p)) {
                    ImagePreviewUI.this.f271427v.setVisibility(8);
                } else {
                    imagePreviewUI2.mo128983H7(true);
                    ImagePreviewUI imagePreviewUI5 = ImagePreviewUI.this;
                    imagePreviewUI5.updateOptionMenuText(0, imagePreviewUI5.mo128989N7());
                    String L7 = ImagePreviewUI.this.mo128987L7();
                    TextView textView = ImagePreviewUI.this.f271427v;
                    if (!Util.isNullOrNil(L7)) {
                        i3 = 0;
                    }
                    textView.setVisibility(i3);
                    ImagePreviewUI imagePreviewUI6 = ImagePreviewUI.this;
                    imagePreviewUI6.f271427v.setText(imagePreviewUI6.getString(C0966R.string.luu, new Object[]{L7}));
                }
            } else {
                imagePreviewUI3.f271425t.setImageResource(C0966R.raw.radio_off);
                ImagePreviewUI imagePreviewUI7 = ImagePreviewUI.this;
                imagePreviewUI7.f271425t.setContentDescription(imagePreviewUI7.getResources().getString(C0966R.string.f4q));
                ImagePreviewUI.this.f271427v.setVisibility(8);
                ImagePreviewUI.this.enableOptionMenu(true);
            }
            ImagePreviewUI imagePreviewUI8 = ImagePreviewUI.this;
            imagePreviewUI8.f271426u.setText(imagePreviewUI8.getContext().getString(C0966R.string.f5p));
            ImagePreviewUI imagePreviewUI9 = ImagePreviewUI.this;
            GalleryItem$MediaItem k = imagePreviewUI9.f271409e.mo129063k(imagePreviewUI9.f271418n.intValue());
            if (k != null) {
                imagePreviewUI9.mo129007f8(k);
            }
            if (C98429r0.m127830u() && (((i = (imagePreviewUI = ImagePreviewUI.this).f271378J) == 3 || i == 16) && (mVar = (C94070m) imagePreviewUI.f271411f.getAdapter()) != null)) {
                mVar.f271616o = ImagePreviewUI.this.f271420p;
                mVar.notifyDataSetChanged();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$q */
    public class C94023q implements View.OnClickListener {
        public C94023q() {
        }

        public void onClick(View view) {
            RecordConfigProvider recordConfigProvider;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
            GalleryItem$MediaItem k = imagePreviewUI.f271409e.mo129063k(imagePreviewUI.f271418n.intValue());
            if (k != null) {
                Log.m105925i("MicroMsg.ImagePreviewUI", "[mEditVideoBtnInNormalFooter click] raw:%s orignal:%s", k.f162748e, k.f162747d);
                ImagePreviewUI imagePreviewUI2 = ImagePreviewUI.this;
                String str = k.f162748e;
                imagePreviewUI2.f271421p0 = str;
                if (!Util.isNullOrNil(str)) {
                    ImagePreviewUI imagePreviewUI3 = ImagePreviewUI.this;
                    if (!imagePreviewUI3.f271419o) {
                        imagePreviewUI3.f271430x0 = k.f162747d;
                    }
                }
                ImagePreviewUI imagePreviewUI4 = ImagePreviewUI.this;
                imagePreviewUI4.f271421p0 = k.f162747d;
                imagePreviewUI4.f271430x0 = "";
            } else {
                Log.m105921e("MicroMsg.ImagePreviewUI", "[mEditVideoBtnInNormalFooter click] item == null mPosition:%s", ImagePreviewUI.this.f271418n);
                ImagePreviewUI imagePreviewUI5 = ImagePreviewUI.this;
                imagePreviewUI5.f271421p0 = imagePreviewUI5.f271409e.mo129062j(imagePreviewUI5.f271418n.intValue());
                long intValue = (long) ImagePreviewUI.this.f271418n.intValue();
                String str2 = ImagePreviewUI.this.f271403Z0;
                GalleryItem$MediaItem c = GalleryItem$MediaItem.m65488c(2, intValue, str2, str2, "video_edit");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c);
                C93958f.m118755o(arrayList2);
            }
            String str3 = Util.isNullOrNil(ImagePreviewUI.this.f271430x0) ? ImagePreviewUI.this.f271421p0 : ImagePreviewUI.this.f271430x0;
            Log.m105925i("MicroMsg.ImagePreviewUI", "editVideoMaxTimeLength : %d", Integer.valueOf(ImagePreviewUI.this.f271380L));
            C13604l<String, String> qa02 = ((C98567o0) C86312j.m106911c(C98567o0.class)).qa0();
            Log.m105925i("MicroMsg.ImagePreviewUI", "edit video path:%s thumb path:%s", qa02.f38555d, qa02.f38556e);
            String str4 = (String) qa02.f38555d;
            String str5 = (String) qa02.f38556e;
            if (ImagePreviewUI.this.f271377I) {
                recordConfigProvider = ((C98561h0) C86312j.m106911c(C98561h0.class)).rs0(str3, ImagePreviewUI.this.f271380L * 1000, str4, str5, 34);
                recordConfigProvider.f272938z = false;
                recordConfigProvider.f272933u = Boolean.TRUE;
                recordConfigProvider.f272935w = 600000;
            } else {
                recordConfigProvider = RecordConfigProvider.m119433c(str3, str4, str5);
                recordConfigProvider.f272935w = ImagePreviewUI.this.f271380L * 1000;
                recordConfigProvider.f272905F = C93958f.m118750j().f271196f;
            }
            RecordConfigProvider recordConfigProvider2 = recordConfigProvider;
            recordConfigProvider2.f272926n = C102609h.Fx0().Gx0();
            UICustomParam uICustomParam = new UICustomParam();
            ((HashMap) uICustomParam.f266575h).put("plugin_filter", Boolean.TRUE);
            ((HashMap) uICustomParam.f266575h).put("plugin_poi", true);
            ((HashMap) uICustomParam.f266575h).put("plugin_tip", true);
            ((HashMap) uICustomParam.f266575h).put("plugin_menu", true);
            recordConfigProvider2.f272927o = uICustomParam;
            if (!ImagePreviewUI.this.f271387R0) {
                C60960c.f173618a.mo85927k("SnsPublishProcess", "actionTrace_", 5, C60242i.ACTIONTRACE);
                ImagePreviewUI.this.f271387R0 = true;
            }
            C8532a.f27585a.mo9446e(ImagePreviewUI.this.getContext(), 4370, C0966R.C0968anim.f2492eg, -1, recordConfigProvider2, 2, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$r */
    public class C94024r implements View.OnClickListener {
        public C94024r() {
        }

        public void onClick(View view) {
            RecordConfigProvider recordConfigProvider;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
            String j = imagePreviewUI.f271409e.mo129062j(imagePreviewUI.f271418n.intValue());
            if (Util.isNullOrNil(j)) {
                Log.m105929w("MicroMsg.ImagePreviewUI", "get path error, position %d", ImagePreviewUI.this.f271418n);
                C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C13604l<String, String> qa02 = ((C98567o0) C86312j.m106911c(C98567o0.class)).qa0();
            Log.m105925i("MicroMsg.ImagePreviewUI", "edit video path:%s thumb path:%s", qa02.f38555d, qa02.f38556e);
            String str = (String) qa02.f38555d;
            String str2 = (String) qa02.f38556e;
            if (ImagePreviewUI.this.f271377I) {
                recordConfigProvider = ((C98561h0) C86312j.m106911c(C98561h0.class)).rs0(j, ImagePreviewUI.this.f271380L * 1000, str, str2, 33);
            } else {
                recordConfigProvider = RecordConfigProvider.m119433c(j, str, str2);
                recordConfigProvider.f272935w = ImagePreviewUI.this.f271380L * 1000;
                recordConfigProvider.f272905F = C93958f.m118750j().f271196f;
            }
            recordConfigProvider.f272926n = C102609h.Fx0().Gx0();
            UICustomParam uICustomParam = new UICustomParam();
            ((HashMap) uICustomParam.f266575h).put("plugin_filter", Boolean.TRUE);
            ((HashMap) uICustomParam.f266575h).put("plugin_poi", true);
            ((HashMap) uICustomParam.f266575h).put("plugin_tip", true);
            ((HashMap) uICustomParam.f266575h).put("plugin_menu", true);
            recordConfigProvider.f272927o = uICustomParam;
            ImagePreviewUI imagePreviewUI2 = ImagePreviewUI.this;
            int i = ((GalleryItem$VideoMediaItem) imagePreviewUI2.f271409e.mo129063k(imagePreviewUI2.f271418n.intValue())).f162766w;
            ImagePreviewUI imagePreviewUI3 = ImagePreviewUI.this;
            if (i >= (imagePreviewUI3.f271380L * 1000) + 500) {
                imagePreviewUI3.f271389S0 = true;
            }
            if (!imagePreviewUI3.f271387R0) {
                C60960c.f173618a.mo85927k("SnsPublishProcess", "actionTrace_", 5, C60242i.ACTIONTRACE);
                ImagePreviewUI.this.f271387R0 = true;
            }
            C8532a.f27585a.mo9446e(ImagePreviewUI.this.getContext(), 4370, C0966R.C0968anim.f2492eg, -1, recordConfigProvider, 2, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$s */
    public class C94025s implements View.OnClickListener {
        public C94025s() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ImagePreviewUI.this.f271425t.performClick();
            ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
            if (imagePreviewUI.f271420p) {
                imagePreviewUI.f271426u.setContentDescription(imagePreviewUI.getResources().getString(C0966R.string.f4o));
            } else {
                imagePreviewUI.f271426u.setContentDescription(imagePreviewUI.getResources().getString(C0966R.string.f4q));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$t */
    public class C94026t implements MenuItem.OnMenuItemClickListener {
        public C94026t() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
            int i = ImagePreviewUI.f271368h1;
            imagePreviewUI.mo128990O7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$u */
    public class C94027u implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$u$a */
        public class C94028a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Intent f271456d;

            /* renamed from: e */
            public final /* synthetic */ boolean f271457e;

            /* renamed from: f */
            public final /* synthetic */ boolean f271458f;

            public C94028a(Intent intent, boolean z, boolean z2) {
                this.f271456d = intent;
                this.f271457e = z;
                this.f271458f = z2;
            }

            public void run() {
                ImagePreviewUI imagePreviewUI = ImagePreviewUI.this;
                Intent intent = this.f271456d;
                boolean z = this.f271457e;
                boolean z2 = this.f271458f;
                int i = ImagePreviewUI.f271368h1;
                imagePreviewUI.mo128984I7(intent, z, z2);
            }

            public String toString() {
                return super.toString() + "|addTextOptionMenu";
            }
        }

        public C94027u() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00cf  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0108  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x010c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onMenuItemClick(android.view.MenuItem r8) {
            /*
                r7 = this;
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r8 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                int r0 = r8.f271378J
                r1 = 6
                r2 = 3
                java.lang.String r3 = "select_type_tag"
                r4 = 1
                if (r0 != r1) goto L_0x003f
                r8.setResult(r4)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r8 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                com.tencent.mm.plugin.gallery.ui.h r0 = r8.f271409e
                java.lang.Integer r8 = r8.f271418n
                int r8 = r8.intValue()
                java.lang.String r8 = r0.mo129062j(r8)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r0 != 0) goto L_0x003a
                ew1.e r0 = ew1.C97754e.C97756b.f286807a
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                android.content.Intent r1 = r1.getIntent()
                int r1 = r1.getIntExtra(r3, r2)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r5 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                java.lang.Integer r5 = r5.f271418n
                int r5 = r5.intValue()
                r0.mo137083b(r8, r1, r5)
            L_0x003a:
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r8 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                r8.finish()
            L_0x003f:
                android.content.Intent r8 = new android.content.Intent
                r8.<init>()
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r1 = "isPreviewPhoto"
                r5 = 0
                boolean r0 = r0.getBooleanExtra(r1, r5)
                r8.putExtra(r1, r0)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                java.util.ArrayList r0 = r0.mo128988M7()
                if (r0 == 0) goto L_0x00c1
                int r0 = r0.size()
                if (r0 != 0) goto L_0x00c1
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                com.tencent.mm.plugin.gallery.ui.h r1 = r0.f271409e
                java.lang.Integer r0 = r0.f271418n
                int r0 = r0.intValue()
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r0 = r1.mo129063k(r0)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                boolean r6 = r1.f271377I
                if (r6 == 0) goto L_0x00b7
                com.tencent.mm.plugin.gallery.ui.h r1 = r1.f271409e
                if (r1 == 0) goto L_0x00b7
                if (r0 == 0) goto L_0x00b7
                int r1 = r0.getType()
                r6 = 2
                if (r1 != r6) goto L_0x00b7
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                java.lang.String r0 = r0.f162747d
                r1.mo128994S7(r0)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                com.tencent.mm.plugin.gallery.ui.h r1 = r0.f271409e
                java.lang.Integer r0 = r0.f271418n
                int r0 = r0.intValue()
                java.lang.String r0 = r1.mo129062j(r0)
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r1 != 0) goto L_0x00c1
                ew1.e r1 = ew1.C97754e.C97756b.f286807a
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r6 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                android.content.Intent r6 = r6.getIntent()
                int r2 = r6.getIntExtra(r3, r2)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r3 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                java.lang.Integer r3 = r3.f271418n
                int r3 = r3.intValue()
                r1.mo137083b(r0, r2, r3)
                goto L_0x00c1
            L_0x00b7:
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r0 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                android.widget.ImageButton r0 = r0.f271370B
                r0.performClick()
                r0 = 300(0x12c, float:4.2E-43)
                goto L_0x00c2
            L_0x00c1:
                r0 = 0
            L_0x00c2:
                com.tencent.mm.plugin.gallery.model.n r1 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
                int r1 = r1.f271196f
                java.lang.String r2 = "preview_image_list"
                r3 = 25
                if (r1 != r3) goto L_0x00e2
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                java.util.ArrayList r1 = r1.mo128988M7()
                r8.putStringArrayListExtra(r2, r1)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                r1.setResult(r3, r8)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                r1.finish()
            L_0x00e2:
                com.tencent.mm.plugin.gallery.model.n r1 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
                int r1 = r1.f271196f
                r3 = 34
                if (r1 != r3) goto L_0x00ff
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                java.util.ArrayList r1 = r1.mo128988M7()
                r8.putStringArrayListExtra(r2, r1)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                r1.setResult(r3, r8)
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                r1.finish()
            L_0x00ff:
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI r1 = com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.this
                boolean r2 = r1.f271420p
                r2 = r2 ^ r4
                boolean r3 = r1.f271377I
                if (r0 != 0) goto L_0x010c
                r1.mo128984I7(r8, r3, r2)
                return r4
            L_0x010c:
                com.tencent.mm.plugin.gallery.model.i r1 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118753m()
                com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$u$a r6 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$u$a
                r6.<init>(r8, r3, r2)
                if (r0 >= 0) goto L_0x0118
                goto L_0x0119
            L_0x0118:
                r5 = r0
            L_0x0119:
                com.tencent.mm.sdk.platformtools.MMHandler r8 = r1.mo128893a()
                long r0 = (long) r5
                r8.postDelayed(r6, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.C94027u.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* renamed from: H7 */
    public final void mo128983H7(boolean z) {
        if (this.f271417j == null || !C98429r0.m127830u() || this.f271378J != 3 || !this.f271420p) {
            enableOptionMenu(true);
            return;
        }
        Iterator<GalleryItem$MediaItem> it = this.f271417j.iterator();
        while (it.hasNext()) {
            GalleryItem$MediaItem next = it.next();
            long l = C86013q1.m106451l(next.f162747d);
            if (next.getType() == 2 && l > C101316l.m132908g()) {
                enableOptionMenu(false);
                if (z) {
                    mo128998W7(getString(C0966R.string.luq, new Object[]{C101316l.m132906e(C101316l.m132908g())}));
                    return;
                }
                return;
            } else if (next.getType() == 1 && l > 26214400) {
                enableOptionMenu(false);
                if (z) {
                    mo128998W7(getString(C0966R.string.lup, new Object[]{C101316l.m132906e(26214400)}));
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: I7 */
    public final void mo128984I7(Intent intent, boolean z, boolean z2) {
        int i;
        LinkedHashSet<GalleryItem$MediaItem> l;
        Iterator<GalleryItem$MediaItem> it;
        Intent intent2 = intent;
        boolean z3 = z;
        boolean z4 = z2;
        Boolean bool = Boolean.TRUE;
        intent2.putExtra("CropImage_Compress_Img", z3 ? true : z4);
        ArrayList<String> M7 = mo128988M7();
        if (z3) {
            C93958f.m118744d(M7);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        intent2.putExtra("KSEGMENTMEDIAEDITID", this.f271405b1);
        if (M7 == null || M7.size() <= 0) {
            Log.m105924i("MicroMsg.ImagePreviewUI", "no img selected. keep current ui.");
            return;
        }
        Iterator<String> it4 = M7.iterator();
        while (it4.hasNext()) {
            String next = it4.next();
            GalleryItem$MediaItem e = C93958f.m118745e(next);
            if (e == null) {
                if (next != null && (l = C93958f.m118752l()) != null && (it = l.iterator()) != null) {
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        GalleryItem$MediaItem next2 = it.next();
                        if (next.equals(next2.f162747d)) {
                            e = next2;
                            break;
                        }
                    }
                }
                e = null;
            }
            if (e == null || e.getType() != 2) {
                if (e != null && e.getType() != 2 && e.f162755o.equals("edit") && !Util.isNullOrNil(e.f162749f)) {
                    next = e.f162749f;
                }
                arrayList.add(next);
                arrayList3.add(next);
            } else {
                if (e.f162755o.equals("video_edit")) {
                    next = e.f162747d;
                }
                arrayList2.add(next);
                arrayList3.add(next);
            }
        }
        Log.m105925i("MicroMsg.ImagePreviewUI", "dealWithSend, enableVLog:%s, forTimeline:%s", Boolean.valueOf(this.f271398X), Boolean.valueOf(z));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int[] iArr = new int[this.f271431y];
        ArrayList<GalleryItem$MediaItem> arrayList6 = this.f271417j;
        if (arrayList6 != null) {
            Iterator<GalleryItem$MediaItem> it5 = arrayList6.iterator();
            int i2 = 0;
            while (it5.hasNext()) {
                GalleryItem$MediaItem next3 = it5.next();
                Iterator<GalleryItem$MediaItem> it6 = it5;
                if (next3.getType() == 1) {
                    if (!next3.f162755o.equals("edit") || Util.isNullOrNil(next3.f162749f)) {
                        arrayList4.add(next3.f162747d);
                    } else {
                        arrayList4.add(next3.f162749f);
                    }
                    i = i2 + 1;
                    iArr[i2] = 1;
                } else if (next3.getType() == 2) {
                    arrayList5.add(next3.f162747d);
                    i = i2 + 1;
                    iArr[i2] = 2;
                } else {
                    it5 = it6;
                }
                i2 = i;
                it5 = it6;
            }
        }
        if (this.f271398X && C101316l.m132910i(this.f271417j, true)) {
            Log.m105925i("MicroMsg.ImagePreviewUI", "try send vlog, videoList:%s, imageList:%s", Integer.valueOf(arrayList5.size()), Integer.valueOf(arrayList4.size()));
            if (C102635b.f302228j.mo142293a(-1, arrayList4, arrayList5) == 4) {
                VLogPreloadUI.f162815d.mo80225a(this, arrayList5, arrayList4, iArr, (Point) null);
                return;
            }
        }
        ArrayList<GalleryItem$MediaItem> arrayList7 = new ArrayList<>();
        if (this.f271432y0) {
            ArrayList<GalleryItem$MediaItem> arrayList8 = this.f271417j;
            if (arrayList8 != null) {
                Iterator<GalleryItem$MediaItem> it7 = arrayList8.iterator();
                while (it7.hasNext()) {
                    GalleryItem$MediaItem next4 = it7.next();
                    if (next4 != null) {
                        GalleryItem$MediaItem f = C93958f.m118746f(next4.f162747d);
                        if (f == null) {
                            arrayList7.add(next4);
                        } else {
                            arrayList7.add(f);
                        }
                    }
                }
            }
        } else {
            arrayList7 = this.f271417j;
        }
        if (this.f271393U0) {
            if (z3 && MJTemplateHandleNew.f271075d.mo128851d(arrayList7, new q$$d(this, intent2, z3, z4))) {
                mo128990O7();
                return;
            } else if (z3 && MJTemplateHandleNew.f271075d.mo128851d(arrayList7, new q$$e(this, intent2, z3, z4))) {
                mo128990O7();
                return;
            }
        } else if (z3 && C98052c.f287486a.mo137357c(arrayList7, new q$$f(this, intent2, z3, z4))) {
            mo128990O7();
            return;
        } else if (z3 && C98052c.f287486a.mo137357c(arrayList7, new q$$g(this, intent2, z3, z4))) {
            mo128990O7();
            return;
        }
        boolean z5 = C93958f.m118750j().f271196f == 14;
        if ((z3 || z5) && arrayList.size() == 0 && arrayList2.size() == 1) {
            int intExtra = (getIntent().getIntExtra("key_edit_video_max_time_length", 10) * 1000) + 500;
            Log.m105925i("MicroMsg.ImagePreviewUI", "maxDuration=%s", Integer.valueOf(intExtra));
            GalleryItem$MediaItem e2 = C93958f.m118745e((String) arrayList2.get(0));
            if (e2 != null && (e2 instanceof GalleryItem$VideoMediaItem)) {
                GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (GalleryItem$VideoMediaItem) e2;
                if (galleryItem$VideoMediaItem.f162766w != -1) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(e2.f162747d);
                    C93958f.m118744d(arrayList9);
                    Intent intent3 = new Intent();
                    intent3.putExtra("K_SEGMENTVIDEOPATH", e2.f162747d);
                    intent3.putExtra("KSEGMENTVIDEOTHUMBPATH", e2.f162750g);
                    if (z3) {
                        Log.m105925i("MicroMsg.ImagePreviewUI", "goto edit video path:%s", galleryItem$VideoMediaItem.f162747d);
                        C13604l<String, String> qa02 = ((C98567o0) C86312j.m106911c(C98567o0.class)).qa0();
                        Log.m105925i("MicroMsg.ImagePreviewUI", "edit video path:%s thumb path:%s", qa02.f38555d, qa02.f38556e);
                        RecordConfigProvider rs02 = ((C98561h0) C86312j.m106911c(C98561h0.class)).rs0(galleryItem$VideoMediaItem.f162747d, intExtra, (String) qa02.f38555d, (String) qa02.f38556e, 35);
                        rs02.f272926n = C102609h.Fx0().Gx0();
                        UICustomParam uICustomParam = new UICustomParam();
                        ((HashMap) uICustomParam.f266575h).put("plugin_filter", Boolean.TRUE);
                        ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool);
                        ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool);
                        ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool);
                        rs02.f272927o = uICustomParam;
                        if (galleryItem$VideoMediaItem.f162766w >= (this.f271380L * 1000) + 500) {
                            this.f271389S0 = true;
                            C8532a.f27585a.mo9446e(getContext(), 4370, C0966R.C0968anim.f2492eg, -1, rs02, 2, 0);
                            return;
                        }
                        boolean contains = ((ArrayList) C93958f.m118749i().f271165k).contains(galleryItem$VideoMediaItem.f162747d);
                        Log.m105924i("MicroMsg.ImagePreviewUI", "haveDoEdit = " + contains);
                        if (!contains) {
                            ((C15905b) C86312j.m106911c(C15905b.class)).mo8351pX(this, 4370, rs02);
                            this.f271391T0 = true;
                            return;
                        }
                        setResult(-1, intent3);
                        finish();
                        return;
                    }
                    setResult(-1, intent3);
                    finish();
                    return;
                }
            }
            Log.m105920e("MicroMsg.ImagePreviewUI", "dealWithSend VideoMediaItem not found.");
        }
        intent2.putStringArrayListExtra("CropImage_OutputPath_List", arrayList);
        intent2.putStringArrayListExtra("key_select_video_list", arrayList2);
        intent2.putStringArrayListExtra("key_select_mix_media_list", arrayList3);
        boolean booleanExtra = getIntent().getBooleanExtra("isTakePhoto", false);
        C97754e eVar = C97754e.C97756b.f286807a;
        eVar.f286795n = this.f271395V0 ? 1 : 0;
        eVar.f286791j = arrayList4.size();
        C97754e.C97756b.f286807a.f286792k = arrayList5.size();
        C97754e.C97756b.f286807a.f286796o = 1;
        int i3 = 3;
        Log.m105919d("MicroMsg.ImagePreviewUI", "summersafecdn send image, previewImageCount:%d, chooseForTimeline:%b, forTimeline:%b, beCompress:%b", Integer.valueOf(C93958f.m118749i().f271162h.size()), Boolean.valueOf(this.f271377I), Boolean.valueOf(z), Boolean.valueOf(z2));
        if (!this.f271377I) {
            i3 = 2;
        }
        C101316l.m132914m(11610, i3 + "," + C93958f.m118749i().f271162h.size());
        C93958f.m118749i().f271162h.clear();
        Log.m105918d("MicroMsg.ImagePreviewUI", "isTaskPhoto ? " + booleanExtra + " | isPreviewPhoto ? " + intent2.getBooleanExtra("isPreviewPhoto", false));
        intent2.putExtra("isTakePhoto", booleanExtra);
        String stringExtra = getIntent().getStringExtra("GalleryUI_ToUser");
        if (Util.isNullOrNil(getIntent().getStringExtra("GalleryUI_FromUser")) || "medianote".equals(stringExtra)) {
            setResult(-1, intent2);
            finish();
            return;
        }
        ArrayList arrayList10 = arrayList2;
        if (Util.currentTicks() - this.f271379K < 1000) {
            Log.m105928w("MicroMsg.ImagePreviewUI", "sendimg btn event frequence limit");
            return;
        }
        this.f271379K = Util.currentTicks();
        Log.m105924i("MicroMsg.ImagePreviewUI", "switch to SendImgProxyUI");
        if (this.f271395V0) {
            intent2.setClassName(this, "com.tencent.mm.ui.chatting.SendImgProxyUI");
            intent2.putExtra("GalleryUI_FromUser", getIntent().getStringExtra("GalleryUI_FromUser"));
            intent2.putExtra("GalleryUI_ToUser", getIntent().getStringExtra("GalleryUI_ToUser"));
            intent2.putExtra("key_select_media_idex_list", iArr);
            intent2.putExtra("isSelectAlbum", getIntent().getBooleanExtra("isSelectAlbum", false));
            intent2.putExtra("CropImage_limit_Img_Size", 26214400);
            Log.m105925i("MicroMsg.ImagePreviewUI", "QUERY_TYPE_IMAGE_AND_VIDEO switch to SendImgProxyUI, send img size: %d, video size: %d", Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList10.size()));
            startActivityForResult(intent2, 4382);
            return;
        }
        intent2.setClassName(this, "com.tencent.mm.ui.chatting.SendImgProxyUI");
        intent2.putExtra("GalleryUI_FromUser", getIntent().getStringExtra("GalleryUI_FromUser"));
        intent2.putExtra("GalleryUI_ToUser", getIntent().getStringExtra("GalleryUI_ToUser"));
        intent2.putExtra("isSelectAlbum", getIntent().getBooleanExtra("isSelectAlbum", false));
        intent2.putExtra("CropImage_limit_Img_Size", 26214400);
        startActivityForResult(intent2, 4369);
    }

    /* renamed from: J7 */
    public final void mo128985J7() {
        MTimerHandler mTimerHandler = this.f271429x;
        if (mTimerHandler == null || mTimerHandler.stopped()) {
            MTimerHandler mTimerHandler2 = new MTimerHandler(new C94016j(), false);
            this.f271429x = mTimerHandler2;
            mTimerHandler2.startTimer(350);
            return;
        }
        this.f271429x.stopTimer();
    }

    /* renamed from: K7 */
    public final int mo128986K7() {
        return C93958f.m118750j().f271196f == 15 ? C0966R.raw.checkbox_selected_game : C93958f.m118750j().f271196f == 28 ? C0966R.raw.checkbox_selected_finder_live : C0966R.raw.checkbox_selected_small;
    }

    /* renamed from: L7 */
    public final String mo128987L7() {
        Iterator<String> it = this.f271416i.iterator();
        long j = 0;
        while (it.hasNext()) {
            String next = it.next();
            if (!this.f271406c1.containsKey(next)) {
                long l = C86013q1.m106451l(next);
                this.f271406c1.put(next, Long.valueOf(l));
                j += l;
            } else {
                j += this.f271406c1.get(next).longValue();
            }
        }
        if (j > 1073741824) {
            return String.format("%.1fGB", new Object[]{Float.valueOf(((((float) j) / 1024.0f) / 1024.0f) / 1024.0f)});
        } else if (j > 1048576) {
            return String.format("%dMB", new Object[]{Integer.valueOf((int) ((((float) j) / 1024.0f) / 1024.0f))});
        } else if (j <= 0) {
            return "";
        } else {
            return String.format("%dKB", new Object[]{Long.valueOf(j / 1024)});
        }
    }

    /* renamed from: M7 */
    public final ArrayList<String> mo128988M7() {
        if (this.f271419o) {
            return this.f271416i;
        }
        if (this.f271416i == null) {
            return new ArrayList<>(1);
        }
        ArrayList<String> arrayList = new ArrayList<>(this.f271416i.size());
        Iterator<String> it = this.f271413g.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (this.f271416i.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: N7 */
    public final String mo128989N7() {
        int i = C93958f.m118750j().f271196f;
        if (i != 4) {
            if (i != 11) {
                if (!(i == 19 || i == 22)) {
                    if (i != 7) {
                        if (i != 8) {
                            if (i != 28) {
                                if (i != 29) {
                                    if (i == 33) {
                                        return getString(C0966R.string.f5r);
                                    }
                                    if (i == 34) {
                                        return getString(C0966R.string.f360089a13);
                                    }
                                    switch (i) {
                                        case 13:
                                        case 14:
                                            break;
                                        case 15:
                                        case 16:
                                            break;
                                        default:
                                            switch (i) {
                                                case 24:
                                                    break;
                                                case 25:
                                                case 26:
                                                    break;
                                                default:
                                                    if (this.f271416i.size() == 0 || this.f271431y <= 1) {
                                                        return getString(C0966R.string.a2s);
                                                    }
                                                    if (this.f271395V0) {
                                                        return getString(C0966R.string.nbo, new Object[]{Integer.valueOf(this.f271416i.size()), Integer.valueOf(this.f271431y)});
                                                    }
                                                    return getString(C0966R.string.f5i, new Object[]{Integer.valueOf(this.f271416i.size()), Integer.valueOf(this.f271431y)});
                                            }
                                    }
                                }
                            }
                        }
                    }
                    if ((Util.isNullOrNil(this.f271392U) || !this.f271392U.equals("album_business_bubble_media_by_coordinate")) && C93958f.m118750j().f271196f != 25) {
                        if (this.f271416i.size() == 0 || this.f271431y <= 1) {
                            return getString(C0966R.string.f5r);
                        }
                        return getString(C0966R.string.f5r) + "(" + this.f271416i.size() + "/" + this.f271431y + ")";
                    } else if (this.f271416i.size() == 0 || this.f271431y <= 1) {
                        return getString(C0966R.string.f360089a13);
                    } else {
                        return getString(C0966R.string.f360089a13) + "(" + this.f271416i.size() + "/" + this.f271431y + ")";
                    }
                }
            }
            return getString(C0966R.string.c_a);
        }
        if (this.f271398X && C101316l.m132910i(this.f271417j, true)) {
            return getString(C0966R.string.f5u) + "(" + this.f271416i.size() + "/" + this.f271431y + ")";
        } else if (this.f271416i.size() == 0 || this.f271431y <= 1) {
            return getString(C0966R.string.f5r);
        } else {
            return getString(C0966R.string.f5r) + "(" + this.f271416i.size() + "/" + this.f271431y + ")";
        }
    }

    /* renamed from: O7 */
    public final void mo128990O7() {
        Intent intent = new Intent();
        boolean z = true;
        boolean z2 = !this.f271420p;
        if (!this.f271377I) {
            z = z2;
        }
        intent.putExtra("CropImage_Compress_Img", z);
        intent.putStringArrayListExtra("preview_image_list", mo128988M7());
        intent.putExtra("show_photo_edit_tip", this.f271399X0);
        setResult(0, intent);
        finish();
    }

    /* renamed from: P7 */
    public final void mo128991P7() {
        if (this.f271433z) {
            Log.m105924i("MicroMsg.ImagePreviewUI", "hideVideoEditUI");
            this.f271382N.setVisibility(8);
            this.f271388S.setVisibility(8);
            this.f271383P.setVisibility(8);
            this.f271428w.setVisibility(4);
            this.f271373E.setVisibility(0);
            this.f271425t.setVisibility(4);
            this.f271426u.setVisibility(4);
            this.f271427v.setVisibility(4);
        } else if (mo128992Q7() && this.f271432y0) {
            Log.m105918d("MicroMsg.ImagePreviewUI", "[hideVideoEditUIIfNeed]: isEditWithOutputTemplate() = " + mo128992Q7() + ", enableTemplateEdit = " + this.f271432y0);
            this.f271382N.setVisibility(8);
            this.f271388S.setVisibility(8);
            this.f271383P.setVisibility(8);
            this.f271428w.setVisibility(0);
            this.f271373E.setVisibility(0);
            this.f271425t.setVisibility(4);
            this.f271426u.setVisibility(4);
            this.f271427v.setVisibility(4);
        }
    }

    /* renamed from: Q7 */
    public final boolean mo128992Q7() {
        if (!this.f271393U0) {
            return C98052c.f287486a.mo137356b();
        }
        return MJTemplateHandleNew.f271089u && MJTemplateHandleNew.f271075d.mo128850c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0179 A[Catch:{ Exception -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017a A[Catch:{ Exception -> 0x0182 }] */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo128993R7(int r18, int r19, java.lang.String r20, int r21) {
        /*
            r17 = this;
            r8 = r17
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            r6 = 0
            r4[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            r7 = 1
            r4[r7] = r5
            java.lang.String r5 = "MicroMsg.ImagePreviewUI"
            java.lang.String r9 = "count:%s selectPosition:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r4)
            r4 = -1
            if (r4 == r0) goto L_0x0036
            boolean r9 = r8.f271419o
            if (r9 != 0) goto L_0x0036
            androidx.recyclerview.widget.RecyclerView r1 = r8.f271411f
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r1.notifyItemChanged(r0, r4)
            goto L_0x00d3
        L_0x0036:
            if (r4 == r0) goto L_0x00d3
            if (r2 != 0) goto L_0x00ab
            if (r18 <= 0) goto L_0x00ab
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            com.tencent.mm.plugin.gallery.ui.m r0 = (com.tencent.p014mm.plugin.gallery.p473ui.C94070m) r0
            java.util.ArrayList<java.lang.String> r0 = r0.f271612h
            r0.add(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            com.tencent.mm.plugin.gallery.ui.m r0 = (com.tencent.p014mm.plugin.gallery.p473ui.C94070m) r0
            int r1 = r18 + -1
            java.lang.Integer r4 = r8.f271418n
            int r4 = r4.intValue()
            r0.f271620s = r1
            r0.f271619r = r4
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            r0.notifyItemInserted(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.mo10233c(r1)
            java.lang.Object[] r10 = r4.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r12 = "notifyRecycleViewWhenSelected"
            java.lang.String r13 = "(IILjava/lang/String;I)V"
            java.lang.String r14 = "Undefined"
            java.lang.String r15 = "smoothScrollToPosition"
            java.lang.String r16 = "(I)V"
            r9 = r0
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r4.mo10231a(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.mo17149t1(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r11 = "notifyRecycleViewWhenSelected"
            java.lang.String r12 = "(IILjava/lang/String;I)V"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "smoothScrollToPosition"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00d3
        L_0x00ab:
            if (r2 != r7) goto L_0x00d3
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            com.tencent.mm.plugin.gallery.ui.m r0 = (com.tencent.p014mm.plugin.gallery.p473ui.C94070m) r0
            java.util.ArrayList<java.lang.String> r0 = r0.f271612h
            int r0 = r0.indexOf(r1)
            if (r4 == r0) goto L_0x00d3
            androidx.recyclerview.widget.RecyclerView r1 = r8.f271411f
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            com.tencent.mm.plugin.gallery.ui.m r1 = (com.tencent.p014mm.plugin.gallery.p473ui.C94070m) r1
            java.util.ArrayList<java.lang.String> r1 = r1.f271612h
            r1.remove(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r8.f271411f
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            r1.notifyItemRemoved(r0)
        L_0x00d3:
            com.tencent.mm.plugin.gallery.model.n r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r0 = r0.f271196f
            r1 = 13
            if (r0 != r1) goto L_0x00df
            r0 = 1
            goto L_0x00e0
        L_0x00df:
            r0 = 0
        L_0x00e0:
            com.tencent.mm.plugin.gallery.ui.h r1 = r8.f271409e
            java.lang.Integer r4 = r8.f271418n
            int r4 = r4.intValue()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r1.mo129063k(r4)
            r4 = 26
            com.tencent.mm.plugin.gallery.model.n r9 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r9 = r9.f271196f
            if (r4 == r9) goto L_0x0111
            if (r18 == 0) goto L_0x0111
            boolean r4 = r8.f271377I
            if (r4 == 0) goto L_0x0100
            boolean r4 = r8.f271398X
            if (r4 == 0) goto L_0x0102
        L_0x0100:
            if (r0 == 0) goto L_0x010f
        L_0x0102:
            com.tencent.mm.plugin.gallery.ui.h r0 = r8.f271409e
            if (r0 == 0) goto L_0x010f
            if (r1 == 0) goto L_0x010f
            int r0 = r1.getType()
            if (r0 != r3) goto L_0x010f
            goto L_0x0111
        L_0x010f:
            r0 = 0
            goto L_0x0112
        L_0x0111:
            r0 = 1
        L_0x0112:
            boolean r4 = r8.f271393U0
            if (r4 == 0) goto L_0x0119
            boolean r9 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271089u
            goto L_0x0124
        L_0x0119:
            fw1.a r9 = fw1.C98052c.f287487b
            if (r9 == 0) goto L_0x0123
            boolean r9 = r9.f287475f
            if (r9 != r7) goto L_0x0123
            r9 = 1
            goto L_0x0124
        L_0x0123:
            r9 = 0
        L_0x0124:
            if (r9 == 0) goto L_0x0138
            if (r4 == 0) goto L_0x0130
            com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew r0 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271075d
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r4 = r8.f271417j
            r0.mo128854g(r4)
            goto L_0x0137
        L_0x0130:
            fw1.c r0 = fw1.C98052c.f287486a
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r4 = r8.f271417j
            r0.mo137359e(r4)
        L_0x0137:
            r0 = 0
        L_0x0138:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r4[r6] = r9
            java.lang.String r9 = "gonePreview:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r4)
            if (r0 == 0) goto L_0x014f
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            r4 = 8
            r0.setVisibility(r4)
            goto L_0x0154
        L_0x014f:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            r0.setVisibility(r6)
        L_0x0154:
            if (r1 == 0) goto L_0x0182
            int r0 = r1.getType()
            if (r0 == r3) goto L_0x0182
            android.content.Intent r0 = r17.getIntent()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r3 = "GalleryUI_FromUser"
            java.lang.String r4 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x0182 }
            long r9 = r1.f162751h     // Catch:{ Exception -> 0x0182 }
            java.lang.String r3 = r1.f162747d     // Catch:{ Exception -> 0x0182 }
            boolean r0 = r8.f271377I     // Catch:{ Exception -> 0x0182 }
            if (r0 != 0) goto L_0x0175
            boolean r0 = r8.f271420p     // Catch:{ Exception -> 0x0182 }
            if (r0 != 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            r5 = 0
            goto L_0x0176
        L_0x0175:
            r5 = 1
        L_0x0176:
            r11 = 0
            if (r2 != 0) goto L_0x017a
            goto L_0x017b
        L_0x017a:
            r7 = 0
        L_0x017b:
            r0 = r17
            r1 = r9
            r6 = r11
            qw1.C101316l.m132911j(r0, r1, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0182 }
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.mo128993R7(int, int, java.lang.String, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem} */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v38 */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0352, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0352, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0110, code lost:
        if (r9 >= (1.0f / r12)) goto L_0x0112;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0151  */
    /* renamed from: S7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo128994S7(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.Class<bq.z0> r0 = p008bq.C92293z0.class
            java.util.ArrayList<java.lang.String> r1 = r14.f271416i
            boolean r1 = r1.contains(r15)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r15
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r6 = 1
            r3[r6] = r5
            java.lang.String r5 = "MicroMsg.ImagePreviewUI"
            java.lang.String r7 = "selectImage %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r3)
            r3 = 0
            r7 = 2131830561(0x7f112721, float:1.9294123E38)
            r8 = 2131756874(0x7f10074a, float:1.9144668E38)
            if (r1 != 0) goto L_0x032d
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118745e(r15)
            java.util.ArrayList<java.lang.String> r5 = r14.f271416i
            int r5 = r5.size()
            int r9 = r14.f271431y
            java.lang.String r10 = "album_business_bubble_media_by_coordinate"
            if (r5 < r9) goto L_0x00ad
            int r15 = r14.f271400Y
            if (r15 == r2) goto L_0x007b
            java.lang.String r15 = r14.f271392U
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x004b
            java.lang.String r15 = r14.f271392U
            boolean r15 = r15.equals(r10)
            if (r15 == 0) goto L_0x004b
            goto L_0x007b
        L_0x004b:
            int r15 = r14.f271400Y
            if (r15 != r6) goto L_0x0065
            android.content.res.Resources r15 = r14.getResources()
            r0 = 2131689489(0x7f0f0011, float:1.9007995E38)
            int r1 = r14.f271431y
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2[r4] = r3
            java.lang.String r15 = r15.getQuantityString(r0, r1, r2)
            goto L_0x0090
        L_0x0065:
            android.content.res.Resources r15 = r14.getResources()
            r0 = 2131689486(0x7f0f000e, float:1.9007989E38)
            int r1 = r14.f271431y
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2[r4] = r3
            java.lang.String r15 = r15.getQuantityString(r0, r1, r2)
            goto L_0x0090
        L_0x007b:
            android.content.res.Resources r15 = r14.getResources()
            r0 = 2131689487(0x7f0f000f, float:1.900799E38)
            int r1 = r14.f271431y
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2[r4] = r3
            java.lang.String r15 = r15.getQuantityString(r0, r1, r2)
        L_0x0090:
            androidx.appcompat.app.AppCompatActivity r0 = r14.getContext()
            nj3.C76879j.m92726T(r0, r15)
            android.widget.ImageButton r15 = r14.f271370B
            r15.setImageResource(r8)
            android.widget.ImageButton r15 = r14.f271370B
            android.content.res.Resources r0 = r14.getResources()
            java.lang.String r0 = r0.getString(r7)
            r15.setContentDescription(r0)
            r14.f271371C = r4
            goto L_0x03ac
        L_0x00ad:
            boolean r2 = r14.mo128992Q7()
            if (r2 == 0) goto L_0x00d5
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r2 == 0) goto L_0x00d5
            com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew r2 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271075d
            boolean r2 = r2.mo128849b(r1)
            if (r2 != 0) goto L_0x00d5
            android.widget.ImageButton r15 = r14.f271370B
            r15.setImageResource(r8)
            android.widget.ImageButton r15 = r14.f271370B
            android.content.res.Resources r0 = r14.getResources()
            java.lang.String r0 = r0.getString(r7)
            r15.setContentDescription(r0)
            r14.f271371C = r4
            goto L_0x03ac
        L_0x00d5:
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem
            if (r2 == 0) goto L_0x00ea
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r5.inJustDecodeBounds = r6
            java.lang.String r9 = r1.f162747d
            com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r9, r5)
            int r9 = r5.outWidth
            int r5 = r5.outHeight
            goto L_0x00ec
        L_0x00ea:
            r5 = 0
            r9 = 0
        L_0x00ec:
            boolean r11 = r1 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r11 == 0) goto L_0x00f7
            r5 = r1
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r5 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r5
            int r9 = r5.f162768y
            int r5 = r5.f162767x
        L_0x00f7:
            float r12 = r14.f271369A
            r13 = 0
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x00ff
            goto L_0x0112
        L_0x00ff:
            if (r9 == 0) goto L_0x0114
            if (r5 != 0) goto L_0x0104
            goto L_0x0114
        L_0x0104:
            float r9 = (float) r9
            float r5 = (float) r5
            float r9 = r9 / r5
            int r5 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x0114
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 / r12
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0114
        L_0x0112:
            r5 = 1
            goto L_0x0115
        L_0x0114:
            r5 = 0
        L_0x0115:
            if (r5 != 0) goto L_0x0151
            if (r2 == 0) goto L_0x0125
            android.content.res.Resources r15 = r14.getResources()
            r0 = 2131830645(0x7f112775, float:1.9294293E38)
            java.lang.String r3 = r15.getString(r0)
            goto L_0x0132
        L_0x0125:
            if (r11 == 0) goto L_0x0132
            android.content.res.Resources r15 = r14.getResources()
            r0 = 2131830650(0x7f11277a, float:1.9294303E38)
            java.lang.String r3 = r15.getString(r0)
        L_0x0132:
            if (r3 == 0) goto L_0x013b
            androidx.appcompat.app.AppCompatActivity r15 = r14.getContext()
            nj3.C76879j.m92726T(r15, r3)
        L_0x013b:
            android.widget.ImageButton r15 = r14.f271370B
            r15.setImageResource(r8)
            android.widget.ImageButton r15 = r14.f271370B
            android.content.res.Resources r0 = r14.getResources()
            java.lang.String r0 = r0.getString(r7)
            r15.setContentDescription(r0)
            r14.f271371C = r4
            goto L_0x03ac
        L_0x0151:
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_sns_video_enable_hdr_lut
            int r2 = r2.mo58779Qe(r3, r6)
            if (r2 != r6) goto L_0x0170
            int r2 = r14.f271378J
            r3 = 4
            if (r2 != r3) goto L_0x0170
            fw1.c r2 = fw1.C98052c.f287486a
            boolean r2 = r2.mo137356b()
            if (r2 != 0) goto L_0x0170
            r2 = 1
            goto L_0x0171
        L_0x0170:
            r2 = 0
        L_0x0171:
            android.content.Intent r3 = r14.getIntent()
            java.lang.String r5 = "key_filter_hdr_video"
            boolean r3 = r3.getBooleanExtra(r5, r4)
            if (r3 == 0) goto L_0x0189
            if (r2 != 0) goto L_0x0189
            qw1.i r2 = qw1.C63340i.f179709a
            java.lang.String r3 = r1.f162747d
            boolean r2 = r2.mo88238b(r3)
            goto L_0x018a
        L_0x0189:
            r2 = 1
        L_0x018a:
            if (r2 != 0) goto L_0x01ac
            r15 = 2131830648(0x7f112778, float:1.92943E38)
            java.lang.String r15 = r14.getString(r15)
            nj3.C76879j.m92729W(r14, r15)
            android.widget.ImageButton r15 = r14.f271370B
            r15.setImageResource(r8)
            android.widget.ImageButton r15 = r14.f271370B
            android.content.res.Resources r0 = r14.getResources()
            java.lang.String r0 = r0.getString(r7)
            r15.setContentDescription(r0)
            r14.f271371C = r4
            goto L_0x03ac
        L_0x01ac:
            if (r1 == 0) goto L_0x02fc
            java.lang.String r2 = r1.f162755o
            java.lang.String r3 = "image/gif"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0201
            di3.d r2 = di3.C86312j.m106911c(r0)
            bq.z0 r2 = (p008bq.C92293z0) r2
            boolean r2 = r2.mo126039l1(r15)
            if (r2 != 0) goto L_0x0201
            boolean r0 = hd0.C98429r0.m127830u()
            if (r0 == 0) goto L_0x01f6
            int r0 = r14.f271378J
            r1 = 3
            if (r0 != r1) goto L_0x01f6
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106451l(r15)
            java.lang.String[] r15 = qw1.C101316l.f296815a
            int r15 = p645pj.C77092c.m93039a()
            long r2 = (long) r15
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x01f6
            r15 = 2131830564(0x7f112724, float:1.9294129E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            int r1 = p645pj.C77092c.m93039a()
            long r1 = (long) r1
            java.lang.String r1 = qw1.C101316l.m132906e(r1)
            r0[r4] = r1
            java.lang.String r15 = r14.getString(r15, r0)
            r14.mo128998W7(r15)
            goto L_0x0200
        L_0x01f6:
            r15 = 2131830637(0x7f11276d, float:1.9294277E38)
            java.lang.String r15 = r14.getString(r15)
            nj3.C76879j.m92726T(r14, r15)
        L_0x0200:
            return
        L_0x0201:
            java.lang.String r2 = r1.f162755o
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0234
            java.lang.String r2 = r14.f271392U
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0234
            java.lang.String r2 = r14.f271392U
            java.lang.String r3 = "album_business_byp"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0234
            di3.d r0 = di3.C86312j.m106911c(r0)
            bq.z0 r0 = (p008bq.C92293z0) r0
            java.lang.String r2 = r1.f162747d
            boolean r0 = r0.mo126036N1(r2)
            if (r0 != 0) goto L_0x02d2
            r15 = 2131830605(0x7f11274d, float:1.9294212E38)
            java.lang.String r15 = r14.getString(r15)
            nj3.C76879j.m92726T(r14, r15)
            return
        L_0x0234:
            boolean r0 = r1 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r0 == 0) goto L_0x02d2
            java.lang.String r0 = r14.f271392U
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r2 = 2131830665(0x7f112789, float:1.9294334E38)
            if (r0 != 0) goto L_0x0276
            java.lang.String r0 = r14.f271392U
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0276
            r0 = r1
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r0 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r0
            int r0 = r0.f162766w
            int r3 = r14.f271394V
            int r3 = r3 * 1000
            int r3 = r3 + 500
            if (r0 < r3) goto L_0x02d2
            androidx.appcompat.app.AppCompatActivity r15 = r14.getContext()
            androidx.appcompat.app.AppCompatActivity r0 = r14.getContext()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r3 = r14.f271394V
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r4] = r3
            java.lang.String r0 = r0.getString(r2, r1)
            nj3.C76879j.m92726T(r15, r0)
            return
        L_0x0276:
            com.tencent.mm.plugin.gallery.model.n r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r0 = r0.f271196f
            r3 = 25
            if (r0 != r3) goto L_0x02d2
            r0 = r1
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r0 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r0
            int r0 = r0.f162766w
            int r3 = r14.f271394V
            int r3 = r3 * 1000
            int r3 = r3 + 500
            if (r0 <= r3) goto L_0x02ab
            androidx.appcompat.app.AppCompatActivity r15 = r14.getContext()
            androidx.appcompat.app.AppCompatActivity r0 = r14.getContext()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r3 = r14.f271394V
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r4] = r3
            java.lang.String r0 = r0.getString(r2, r1)
            nj3.C76879j.m92726T(r15, r0)
            return
        L_0x02ab:
            int r2 = r14.f271396W
            int r2 = r2 * 1000
            if (r0 >= r2) goto L_0x02d2
            androidx.appcompat.app.AppCompatActivity r15 = r14.getContext()
            androidx.appcompat.app.AppCompatActivity r0 = r14.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131830664(0x7f112788, float:1.9294332E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r3 = r14.f271396W
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r4] = r3
            java.lang.String r0 = r0.getString(r1, r2)
            nj3.C76879j.m92726T(r15, r0)
            return
        L_0x02d2:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r0 = r14.f271417j
            if (r0 == 0) goto L_0x02fc
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x02db:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02f5
            java.lang.Object r3 = r0.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r3 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r3
            if (r3 == 0) goto L_0x02db
            java.lang.String r3 = r3.f162747d
            java.lang.String r5 = r1.f162747d
            boolean r3 = r3.equalsIgnoreCase(r5)
            if (r3 == 0) goto L_0x02db
            r2 = 1
            goto L_0x02db
        L_0x02f5:
            if (r2 != 0) goto L_0x02fc
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r0 = r14.f271417j
            r0.add(r1)
        L_0x02fc:
            java.util.ArrayList<java.lang.String> r0 = r14.f271416i
            r0.add(r15)
            android.widget.ImageButton r0 = r14.f271370B
            int r1 = r14.mo128986K7()
            r0.setImageResource(r1)
            android.widget.ImageButton r0 = r14.f271370B
            android.content.res.Resources r1 = r14.getResources()
            r2 = 2131830559(0x7f11271f, float:1.9294119E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setContentDescription(r1)
            r14.f271371C = r6
            java.util.ArrayList<java.lang.String> r0 = r14.f271416i
            int r0 = r0.size()
            java.lang.Integer r1 = r14.f271418n
            int r1 = r1.intValue()
            r14.mo128993R7(r0, r1, r15, r4)
            goto L_0x03ac
        L_0x032d:
            android.widget.ImageButton r0 = r14.f271370B
            r0.setImageResource(r8)
            android.widget.ImageButton r0 = r14.f271370B
            android.content.res.Resources r1 = r14.getResources()
            java.lang.String r1 = r1.getString(r7)
            r0.setContentDescription(r1)
            r14.f271371C = r4
        L_0x0341:
            java.util.ArrayList<java.lang.String> r0 = r14.f271416i
            boolean r0 = r0.remove(r15)
            if (r0 == 0) goto L_0x034a
            goto L_0x0341
        L_0x034a:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r0 = r14.f271417j
            if (r0 == 0) goto L_0x039d
            java.util.Iterator r0 = r0.iterator()
        L_0x0352:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0384
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r1
            boolean r2 = r14.mo128992Q7()
            if (r2 == 0) goto L_0x0379
            if (r1 == 0) goto L_0x0379
            java.lang.String r2 = r1.f162747d
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r2 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118746f(r2)
            if (r2 != 0) goto L_0x036f
            goto L_0x0352
        L_0x036f:
            java.lang.String r2 = r2.f162747d
            boolean r2 = r2.equalsIgnoreCase(r15)
            if (r2 == 0) goto L_0x0352
        L_0x0377:
            r3 = r1
            goto L_0x0352
        L_0x0379:
            if (r1 == 0) goto L_0x0352
            java.lang.String r2 = r1.f162747d
            boolean r2 = r2.equalsIgnoreCase(r15)
            if (r2 == 0) goto L_0x0352
            goto L_0x0377
        L_0x0384:
            if (r3 != 0) goto L_0x038a
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r3 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118745e(r15)
        L_0x038a:
            if (r3 == 0) goto L_0x039d
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r1 = r3.f162747d
            r0[r4] = r1
            java.lang.String r1 = "unselect item: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r0 = r14.f271417j
            r0.remove(r3)
        L_0x039d:
            java.util.ArrayList<java.lang.String> r0 = r14.f271416i
            int r0 = r0.size()
            java.lang.Integer r1 = r14.f271418n
            int r1 = r1.intValue()
            r14.mo128993R7(r0, r1, r15, r6)
        L_0x03ac:
            java.util.ArrayList<java.lang.String> r15 = r14.f271416i
            com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.mo128994S7(java.lang.String):void");
    }

    /* renamed from: T7 */
    public final void mo128995T7(GalleryItem$MediaItem galleryItem$MediaItem) {
        String str;
        if (galleryItem$MediaItem != null) {
            String format = this.f271402Z.format(new Date(galleryItem$MediaItem.f162752i));
            if (2 == galleryItem$MediaItem.getType()) {
                str = C76577a.m92166q(this, C0966R.string.f6i) + format;
            } else {
                str = C76577a.m92166q(this, C0966R.string.f6e) + format;
            }
            this.f271407d.setContentDescription(str);
        }
    }

    /* renamed from: U7 */
    public void mo128996U7(boolean z) {
        View view;
        Log.m105918d("MicroMsg.ImagePreviewUI", "setFooterVisibility() called with: visible = [" + z + "], selectedNormalFooter = " + this.f271375G);
        if (this.f271375G) {
            view = findViewById(C0966R.C0970id.bx_);
        } else {
            view = findViewById(C0966R.C0970id.ehl);
            if (C93958f.m118750j().f271196f == 15) {
                return;
            }
        }
        if (view == null) {
            Object[] objArr = new Object[2];
            objArr[0] = this.f271375G ? "normal" : "edit_tips";
            objArr[1] = Boolean.valueOf(z);
            Log.m105929w("MicroMsg.ImagePreviewUI", "set footer[%s] visibility[%B], but footerbar null", objArr);
        } else if (z && view.getVisibility() == 0) {
        } else {
            if (z || view.getVisibility() != 8) {
                if (this.f271433z && !this.f271375G) {
                    Log.m105924i("MicroMsg.ImagePreviewUI", "setFooterVisibility hideVideoEditButton");
                    z = false;
                }
                if (z) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "setFooterVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "setFooterVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2393bw));
                } else {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "setFooterVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "setFooterVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2394bx));
                }
                if (z && this.f271411f.getVisibility() == 8 && this.f271416i.size() > 0 && 26 != C93958f.m118750j().f271196f) {
                    this.f271411f.setVisibility(0);
                    this.f271411f.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2393bw));
                } else if (!z && this.f271411f.getVisibility() == 0) {
                    this.f271411f.setVisibility(8);
                    this.f271411f.startAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2394bx));
                }
            }
        }
    }

    /* renamed from: V7 */
    public final void mo128997V7(boolean z) {
        if (C93958f.m118750j().f271196f != 4) {
            C94061h hVar = this.f271409e;
            if (hVar == null) {
                Log.m105924i("MicroMsg.ImagePreviewUI", "[setTopTipVisibility] adapter == null");
                return;
            }
            GalleryItem$MediaItem k = hVar.mo129063k(this.f271418n.intValue());
            if (!z || k == null) {
                View view = this.f271386R;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "setTopTipVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "setTopTipVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            this.f271386R.postDelayed(new C94017k(k), 400);
        }
    }

    /* renamed from: W7 */
    public final void mo128998W7(String str) {
        C77426q qVar = new C77426q(this);
        qVar.mo107606r(str);
        qVar.mo107602n(getString(C0966R.string.f5b));
        qVar.mo107600l(new q$$b());
        qVar.mo107603o();
    }

    /* renamed from: X7 */
    public final void mo128999X7(String str, GalleryItem$MediaItem galleryItem$MediaItem) {
        boolean z;
        String str2 = str;
        GalleryItem$MediaItem galleryItem$MediaItem2 = galleryItem$MediaItem;
        if (galleryItem$MediaItem2 != null && galleryItem$MediaItem.getType() == 2 && (C93958f.m118750j().f271196f == 4 || C93958f.m118750j().f271196f == 14 || C93958f.m118750j().f271196f == 13)) {
            if (galleryItem$MediaItem.getType() != 1 || galleryItem$MediaItem2.f162755o.equalsIgnoreCase("image/gif")) {
                this.f271381M.setVisibility(4);
            } else {
                this.f271381M.setVisibility(0);
            }
            if (C93958f.m118750j().f271196f == 25) {
                this.f271381M.setVisibility(4);
            }
            mo129003b8(str);
            GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (GalleryItem$VideoMediaItem) galleryItem$MediaItem2;
            enableOptionMenu(false);
            this.f271375G = false;
            this.f271373E.setVisibility(8);
            this.f271374F.setVisibility(0);
            this.f271388S.setVisibility(8);
            if (C86013q1.m106451l(str) > 1073741824) {
                this.f271382N.setText(getString(C0966R.string.f360833f60));
                this.f271383P.setText(getString(C0966R.string.f5z));
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (!Util.isNullOrNil(galleryItem$VideoMediaItem.f162764u)) {
                    Log.m105919d("MicroMsg.ImagePreviewUI", "got MediaItem directly path [%s], durationMs [%d], videoHeight[%d], videoWidth [%d]", galleryItem$VideoMediaItem.f162747d, Integer.valueOf(galleryItem$VideoMediaItem.f162766w), Integer.valueOf(galleryItem$VideoMediaItem.f162767x), Integer.valueOf(galleryItem$VideoMediaItem.f162768y));
                    mo129001Z7(this.f271398X, mo129002a8(str2, galleryItem$VideoMediaItem, this.f271398X), galleryItem$VideoMediaItem);
                    mo128991P7();
                    return;
                }
                enableOptionMenu(false);
                this.f271375G = true;
                this.f271373E.setVisibility(0);
                this.f271374F.setVisibility(8);
                this.f271428w.setVisibility(8);
                mo129005d8(str2, galleryItem$MediaItem2, false);
                mo129004c8(str);
                C60223w wVar = new C60223w(str2, this.f271418n.intValue(), galleryItem$VideoMediaItem, new C94018l(galleryItem$VideoMediaItem));
                if (wVar.equals(this.f271390T.getTag())) {
                    Log.m105919d("MicroMsg.ImagePreviewUI", "analysis of path[%s] has already been added in ThreadPool", str2);
                    return;
                }
                this.f271390T.setTag(wVar);
                ((C119157j) C119157j.f356862d).mo183875f(wVar);
                if (C93958f.m118750j().f271196f == 15) {
                    this.f271381M.setVisibility(4);
                }
                if (this.f271422q) {
                    this.f271381M.setVisibility(4);
                    return;
                }
                return;
            }
            return;
        }
        this.f271375G = true;
        this.f271373E.setVisibility(0);
        this.f271374F.setVisibility(8);
        this.f271390T.setVisibility(8);
        mo129005d8(str2, galleryItem$MediaItem2, false);
        mo129004c8(str);
        enableOptionMenu(true);
        this.f271428w.setVisibility(8);
        if (galleryItem$MediaItem2 == null || galleryItem$MediaItem.getType() != 1 || galleryItem$MediaItem2.f162755o.equalsIgnoreCase("image/gif")) {
            Log.m105925i("MicroMsg.ImagePreviewUI", "QuerySource:%s isPreViewImage:%s  path:%s", Integer.valueOf(C93958f.m118750j().f271196f), Boolean.valueOf(getIntent().getBooleanExtra("preview_image", false)), str2);
            if (galleryItem$MediaItem2 != null || Util.isNullOrNil(str)) {
                this.f271381M.setVisibility(4);
            } else {
                this.f271381M.setVisibility(0);
            }
        } else {
            this.f271381M.setVisibility(0);
        }
        if (C93958f.m118750j().f271196f == 15 || C93958f.m118750j().f271196f == 28) {
            this.f271381M.setVisibility(4);
        }
        if (this.f271422q) {
            this.f271381M.setVisibility(4);
        }
        mo129003b8(str);
    }

    /* renamed from: Y7 */
    public final boolean mo129000Y7(GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, boolean z) {
        Log.m105919d("MicroMsg.ImagePreviewUI", "updateBottomLayoutCheckFormat() called with: item = [%s]", galleryItem$VideoMediaItem);
        if (galleryItem$VideoMediaItem != null) {
            if (C63339b.f179706a.mo88236b(C93958f.m118750j().f271196f, galleryItem$VideoMediaItem) == 0) {
                return false;
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = galleryItem$VideoMediaItem == null ? null : galleryItem$VideoMediaItem.f162764u;
        Log.m105925i("MicroMsg.ImagePreviewUI", "check video format failed, dst format [video/avc], video format [%s]", objArr);
        this.f271382N.setText(getString(C0966R.string.f5v));
        this.f271383P.setText(getString(C0966R.string.f5w));
        return true;
    }

    /* renamed from: Z7 */
    public final void mo129001Z7(boolean z, boolean z2, GalleryItem$MediaItem galleryItem$MediaItem) {
        if (z2 && z && C101316l.m132910i(this.f271417j, true)) {
            this.f271388S.setVisibility(8);
            this.f271428w.setVisibility(8);
            this.f271374F.setVisibility(8);
            enableOptionMenu(true);
            mo129005d8(this.f271403Z0, galleryItem$MediaItem, z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012d A[RETURN] */
    /* renamed from: a8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo129002a8(java.lang.String r9, com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            r8.enableOptionMenu(r0)
            r8.f271375G = r0
            android.view.ViewGroup r1 = r8.f271373E
            r2 = 8
            r1.setVisibility(r2)
            android.view.ViewGroup r1 = r8.f271374F
            r1.setVisibility(r0)
            android.widget.TextView r1 = r8.f271388S
            r1.setVisibility(r2)
            com.tencent.mm.plugin.gallery.model.n r1 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r1 = r1.f271196f
            r3 = 13
            r4 = 1
            if (r1 != r3) goto L_0x003a
            android.view.ViewGroup r9 = r8.f271374F
            r9.setVisibility(r2)
            android.view.ViewGroup r9 = r8.f271373E
            r9.setVisibility(r2)
            android.widget.TextView r9 = r8.f271382N
            r9.setVisibility(r2)
            android.widget.TextView r9 = r8.f271383P
            r9.setVisibility(r2)
            r8.enableOptionMenu(r4)
            return r4
        L_0x003a:
            java.lang.String r1 = "MicroMsg.ImagePreviewUI"
            r5 = 2
            if (r10 == 0) goto L_0x005a
            int r6 = r10.f162768y
            if (r6 <= 0) goto L_0x005a
            int r7 = r10.f162767x
            if (r7 <= 0) goto L_0x005a
            float r6 = (float) r6
            float r7 = (float) r7
            float r6 = r6 / r7
            r7 = 1077936128(0x40400000, float:3.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x005a
            r7 = 1050253722(0x3e99999a, float:0.3)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r6 = 0
            goto L_0x008c
        L_0x005a:
            if (r10 == 0) goto L_0x0073
            java.lang.Object[] r6 = new java.lang.Object[r5]
            int r7 = r10.f162768y
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r0] = r7
            int r7 = r10.f162767x
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r4] = r7
            java.lang.String r7 = "check ratio faild width = [%d], height = [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r7, r6)
        L_0x0073:
            android.widget.TextView r6 = r8.f271382N
            r7 = 2131830625(0x7f112761, float:1.9294253E38)
            java.lang.String r7 = r8.getString(r7)
            r6.setText(r7)
            android.widget.TextView r6 = r8.f271383P
            r7 = 2131830626(0x7f112762, float:1.9294255E38)
            java.lang.String r7 = r8.getString(r7)
            r6.setText(r7)
            r6 = 1
        L_0x008c:
            if (r6 == 0) goto L_0x008f
            return r0
        L_0x008f:
            boolean r6 = r8.mo129000Y7(r10, r0)
            if (r6 == 0) goto L_0x0096
            return r0
        L_0x0096:
            if (r11 != 0) goto L_0x012e
            java.lang.Object[] r11 = new java.lang.Object[r5]
            int r5 = r10.f162766w
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11[r0] = r5
            int r5 = r8.f271380L
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11[r4] = r5
            java.lang.String r5 = "check duration %d, editVideoMaxTimeLength:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r5, r11)
            com.tencent.mm.plugin.gallery.model.n r11 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r11 = r11.f271196f
            if (r11 != r3) goto L_0x00b9
        L_0x00b7:
            r11 = 0
            goto L_0x012b
        L_0x00b9:
            int r11 = r10.f162766w
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r11 > r1) goto L_0x00d9
            android.widget.TextView r11 = r8.f271382N
            r1 = 2131830634(0x7f11276a, float:1.929427E38)
            java.lang.String r1 = r8.getString(r1)
            r11.setText(r1)
            android.widget.TextView r11 = r8.f271383P
            r1 = 2131830632(0x7f112768, float:1.9294267E38)
            java.lang.String r1 = r8.getString(r1)
            r11.setText(r1)
        L_0x00d7:
            r11 = 1
            goto L_0x012b
        L_0x00d9:
            r3 = 300000(0x493e0, float:4.2039E-40)
            if (r11 < r3) goto L_0x00f7
            android.widget.TextView r11 = r8.f271382N
            r1 = 2131830631(0x7f112767, float:1.9294265E38)
            java.lang.String r1 = r8.getString(r1)
            r11.setText(r1)
            android.widget.TextView r11 = r8.f271383P
            r1 = 2131830630(0x7f112766, float:1.9294263E38)
            java.lang.String r1 = r8.getString(r1)
            r11.setText(r1)
            goto L_0x00d7
        L_0x00f7:
            int r3 = r8.f271380L
            int r3 = r3 * 1000
            int r3 = r3 + 500
            if (r11 < r3) goto L_0x00b7
            boolean r11 = r8.f271377I
            if (r11 != 0) goto L_0x00b7
            android.widget.TextView r11 = r8.f271382N
            r1 = 2131830616(0x7f112758, float:1.9294234E38)
            java.lang.String r1 = r8.getString(r1)
            r11.setText(r1)
            android.widget.TextView r11 = r8.f271383P
            r1 = 2131830615(0x7f112757, float:1.9294232E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            int r5 = r8.f271380L
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r0] = r5
            java.lang.String r1 = r8.getString(r1, r3)
            r11.setText(r1)
            android.widget.TextView r11 = r8.f271388S
            r11.setVisibility(r0)
            goto L_0x00d7
        L_0x012b:
            if (r11 == 0) goto L_0x012e
            return r0
        L_0x012e:
            r8.enableOptionMenu(r4)
            r8.f271375G = r4
            android.view.ViewGroup r11 = r8.f271373E
            r11.setVisibility(r0)
            android.view.ViewGroup r11 = r8.f271374F
            r11.setVisibility(r2)
            android.widget.TextView r11 = r8.f271428w
            r11.setVisibility(r0)
            android.widget.ProgressBar r11 = r8.f271390T
            r11.setVisibility(r2)
            r8.mo129005d8(r9, r10, r0)
            r8.mo129004c8(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.mo129002a8(java.lang.String, com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem, boolean):boolean");
    }

    /* renamed from: b8 */
    public final void mo129003b8(String str) {
        if (this.f271416i.size() < 9 || this.f271416i.contains(str) || mo128992Q7() || this.f271432y0) {
            this.f271381M.setEnabled(true);
            this.f271381M.setTextColor(getContext().getResources().getColor(C0966R.color.al_));
            return;
        }
        this.f271381M.setTextColor(getContext().getResources().getColor(C0966R.color.ala));
        this.f271381M.setEnabled(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0097  */
    /* renamed from: c8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo129004c8(java.lang.String r8) {
        /*
            r7 = this;
            com.tencent.mm.plugin.gallery.model.n r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r0 = r0.f271196f
            r1 = 4
            if (r0 == r1) goto L_0x001e
            r1 = 7
            if (r0 == r1) goto L_0x001e
            r1 = 26
            if (r0 == r1) goto L_0x001e
            r1 = 28
            if (r0 == r1) goto L_0x001e
            r1 = 29
            if (r0 == r1) goto L_0x001e
            switch(r0) {
                case 13: goto L_0x001e;
                case 14: goto L_0x001e;
                case 15: goto L_0x001e;
                case 16: goto L_0x001e;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0020
        L_0x001e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x0020:
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118745e(r8)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0032
            int r4 = r1.getType()
            r5 = 2
            if (r4 != r5) goto L_0x0032
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x003c
        L_0x0032:
            if (r1 == 0) goto L_0x003c
            int r4 = r1.getType()
            if (r4 != r2) goto L_0x003c
            r4 = 1
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            r5 = 3
            r6 = 16
            if (r1 != 0) goto L_0x004b
            boolean r8 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((java.lang.String) r8)
            if (r8 == 0) goto L_0x004b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0073
        L_0x004b:
            if (r1 == 0) goto L_0x005a
            java.lang.String r8 = r1.f162755o
            java.lang.String r1 = "image/gif"
            boolean r8 = r8.equalsIgnoreCase(r1)
            if (r8 == 0) goto L_0x005a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0073
        L_0x005a:
            boolean r8 = r7.f271423r
            if (r8 != 0) goto L_0x0065
            int r8 = r7.f271378J
            if (r8 != r6) goto L_0x0065
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0073
        L_0x0065:
            boolean r8 = hd0.C98429r0.m127830u()
            if (r8 == 0) goto L_0x0073
            int r8 = r7.f271378J
            if (r8 == r5) goto L_0x0071
            if (r8 != r6) goto L_0x0073
        L_0x0071:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x0073:
            boolean r8 = r7.f271423r
            r1 = 8
            if (r8 == 0) goto L_0x0086
            if (r4 == 0) goto L_0x0086
            android.widget.ImageButton r8 = r7.f271425t
            r8.setVisibility(r3)
            android.widget.TextView r8 = r7.f271426u
            r8.setVisibility(r3)
            goto L_0x00a1
        L_0x0086:
            boolean r8 = r0.booleanValue()
            if (r8 == 0) goto L_0x0097
            android.widget.ImageButton r8 = r7.f271425t
            r8.setVisibility(r1)
            android.widget.TextView r8 = r7.f271426u
            r8.setVisibility(r1)
            goto L_0x00a1
        L_0x0097:
            android.widget.ImageButton r8 = r7.f271425t
            r8.setVisibility(r3)
            android.widget.TextView r8 = r7.f271426u
            r8.setVisibility(r3)
        L_0x00a1:
            boolean r8 = hd0.C98429r0.m127830u()
            if (r8 == 0) goto L_0x00d9
            int r8 = r7.f271378J
            if (r8 == r5) goto L_0x00ad
            if (r8 != r6) goto L_0x00d9
        L_0x00ad:
            boolean r8 = r7.f271420p
            if (r8 == 0) goto L_0x00d9
            boolean r8 = r0.booleanValue()
            if (r8 != 0) goto L_0x00d9
            java.lang.String r8 = r7.mo128987L7()
            android.widget.TextView r0 = r7.f271427v
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r4 == 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            r0.setVisibility(r1)
            android.widget.TextView r0 = r7.f271427v
            r1 = 2131830576(0x7f112730, float:1.9294153E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r8
            java.lang.String r8 = r7.getString(r1, r2)
            r0.setText(r8)
            goto L_0x00de
        L_0x00d9:
            android.widget.TextView r8 = r7.f271427v
            r8.setVisibility(r1)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.mo129004c8(java.lang.String):void");
    }

    /* renamed from: d8 */
    public final void mo129005d8(String str, GalleryItem$MediaItem galleryItem$MediaItem, boolean z) {
        int i = C93958f.m118750j().f271197g;
        int i2 = C93958f.m118750j().f271196f;
        boolean z2 = i2 != 16 && (i == 2 || i == 3);
        if (galleryItem$MediaItem == null || galleryItem$MediaItem.getType() != 2 || i2 != 4 || z || z2) {
            if (this.f271431y != 1) {
                this.f271370B.setVisibility(0);
                this.f271372D.setVisibility(0);
            } else if (this.f271393U0) {
                this.f271370B.setVisibility(0);
                this.f271372D.setVisibility(0);
            } else {
                this.f271370B.setVisibility(8);
                this.f271372D.setVisibility(8);
            }
            if (!this.f271416i.contains(str)) {
                this.f271370B.setImageResource(C0966R.raw.radio_off);
                this.f271370B.setContentDescription(getResources().getString(C0966R.string.f4p));
                return;
            }
            this.f271370B.setImageResource(mo128986K7());
            this.f271370B.setContentDescription(getResources().getString(C0966R.string.f4n));
            return;
        }
        this.f271370B.setVisibility(8);
        this.f271372D.setVisibility(8);
    }

    public void dealContentView(View view) {
        if (C76359b.m91786c(this)) {
            setContentView(view);
            return;
        }
        C85875k4.m106179e0(C85875k4.m106172b(getWindow(), (View) null), getBodyView());
        ((ViewGroup) getBodyView().getParent()).removeView(getBodyView());
        ((ViewGroup) getWindow().getDecorView()).addView(getBodyView(), 0);
    }

    /* renamed from: e8 */
    public void mo129006e8(int i) {
        if (i > 0) {
            this.f271431y = i;
            updateOptionMenuText(0, mo128989N7());
            if (mo128992Q7() && !this.f271432y0) {
                this.f271433z = true;
                this.f271422q = true;
                this.f271381M.setVisibility(4);
                mo128991P7();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x04d7, code lost:
        if (r4 <= ((long) p645pj.C77092c.m93039a())) goto L_0x04d9;
     */
    /* renamed from: f8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo129007f8(com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem r27) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            java.lang.String r2 = "MicroMsg.ImagePreviewUI"
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "[updateTopTip] null == item"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            return
        L_0x000e:
            int r3 = r27.getType()
            r4 = 2
            r5 = 8
            r6 = 3
            r7 = 2131101838(0x7f06088e, float:1.7816097E38)
            r8 = 2131101837(0x7f06088d, float:1.7816095E38)
            r9 = 1
            r10 = 0
            if (r3 != r4) goto L_0x031e
            r3 = r0
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r3
            r11 = 300000(0x493e0, float:4.2039E-40)
            r1.f271408d1 = r11
            r11 = 2131830630(0x7f112766, float:1.9294263E38)
            java.lang.String r11 = r1.getString(r11)
            r1.f271410e1 = r11
            int r11 = r1.f271378J
            r12 = 2131830629(0x7f112765, float:1.929426E38)
            r13 = 4
            r14 = 1000(0x3e8, float:1.401E-42)
            if (r11 != r6) goto L_0x005a
            pj.a r11 = p645pj.C35511a.f94971a
            int r15 = r11.mo60283a()
            int r15 = r15 * 1000
            r1.f271408d1 = r15
            int r11 = r11.mo60283a()
            int r11 = r11 / 60
            java.lang.Object[] r15 = new java.lang.Object[r9]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r15[r10] = r11
            java.lang.String r11 = r1.getString(r12, r15)
            r1.f271410e1 = r11
            goto L_0x0075
        L_0x005a:
            if (r11 != r13) goto L_0x0075
            pj.a r11 = p645pj.C35511a.f94971a
            int r11 = r11.mo60284b()
            r1.f271408d1 = r11
            int r11 = r11 / r14
            int r11 = r11 / 60
            java.lang.Object[] r15 = new java.lang.Object[r9]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r15[r10] = r11
            java.lang.String r11 = r1.getString(r12, r15)
            r1.f271410e1 = r11
        L_0x0075:
            r1.f271412f1 = r14
            r11 = 2131830632(0x7f112768, float:1.9294267E38)
            java.lang.String r11 = r1.getString(r11)
            r1.f271414g1 = r11
            java.lang.String r11 = r1.f271392U
            if (r11 == 0) goto L_0x0096
            java.lang.String r12 = "album_business_bubble_media_by_coordinate"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00a0
            java.lang.String r11 = r1.f271392U
            java.lang.String r12 = "album_business_bubble_media_by_jsapi_choosevideo"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00a0
        L_0x0096:
            com.tencent.mm.plugin.gallery.model.n r11 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r11 = r11.f271196f
            r12 = 25
            if (r11 != r12) goto L_0x00d2
        L_0x00a0:
            int r11 = r1.f271394V
            int r12 = r11 * 1000
            int r12 = r12 + 500
            r1.f271408d1 = r12
            r12 = 2131830665(0x7f112789, float:1.9294334E38)
            java.lang.Object[] r14 = new java.lang.Object[r9]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14[r10] = r11
            java.lang.String r11 = r1.getString(r12, r14)
            r1.f271410e1 = r11
            int r11 = r1.f271396W
            if (r11 == 0) goto L_0x00d2
            int r12 = r11 * 1000
            r1.f271412f1 = r12
            r12 = 2131830664(0x7f112788, float:1.9294332E38)
            java.lang.Object[] r14 = new java.lang.Object[r9]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14[r10] = r11
            java.lang.String r11 = r1.getString(r12, r14)
            r1.f271414g1 = r11
        L_0x00d2:
            java.lang.String r11 = r3.f162764u
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x02e6
            java.lang.Object[] r11 = new java.lang.Object[r13]
            java.lang.String r12 = r3.f162747d
            r11[r10] = r12
            int r12 = r3.f162766w
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r9] = r12
            int r12 = r3.f162767x
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r4] = r12
            int r4 = r3.f162768y
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11[r6] = r4
            java.lang.String r4 = "path [%s], durationMs [%d], videoHeight[%d], videoWidth [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r11)
            int r2 = r3.f162766w
            int r4 = r1.f271408d1
            if (r2 >= r4) goto L_0x01e2
            if (r2 <= 0) goto L_0x010c
            int r4 = r1.f271412f1
            if (r2 >= r4) goto L_0x010c
            goto L_0x01e2
        L_0x010c:
            boolean r2 = r1.mo129000Y7(r3, r9)
            if (r2 == 0) goto L_0x0186
            android.view.View r2 = r1.f271386R
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r4)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r14 = "updateTopTip"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r13 = "updateTopTip"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.widget.TextView r2 = r1.f271384Q
            r3 = 2131830624(0x7f112760, float:1.929425E38)
            java.lang.String r3 = r1.getString(r3)
            r2.setText(r3)
            android.widget.TextView r2 = r1.f271372D
            r2.setEnabled(r10)
            android.widget.ImageButton r2 = r1.f271370B
            r2.setEnabled(r10)
            android.widget.TextView r2 = r1.f271372D
            android.content.res.Resources r3 = r26.getResources()
            int r3 = r3.getColor(r7)
            r2.setTextColor(r3)
            java.util.ArrayList<java.lang.String> r2 = r1.f271416i
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0259
            r1.enableOptionMenu(r10)
            goto L_0x0259
        L_0x0186:
            android.widget.TextView r2 = r1.f271372D
            r2.setEnabled(r9)
            android.widget.ImageButton r2 = r1.f271370B
            r2.setEnabled(r9)
            android.widget.TextView r2 = r1.f271372D
            android.content.res.Resources r3 = r26.getResources()
            int r3 = r3.getColor(r8)
            r2.setTextColor(r3)
            android.view.View r2 = r1.f271386R
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r4)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r14 = "updateTopTip"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r13 = "updateTopTip"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0259
        L_0x01e2:
            android.view.View r2 = r1.f271386R
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r4.mo10233c(r9)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r21 = "updateTopTip"
            java.lang.String r22 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r4 = r4.mo10231a(r10)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r20 = "updateTopTip"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            android.widget.TextView r2 = r1.f271384Q
            int r3 = r3.f162766w
            int r4 = r1.f271408d1
            if (r3 < r4) goto L_0x0232
            java.lang.String r3 = r1.f271410e1
            goto L_0x0234
        L_0x0232:
            java.lang.String r3 = r1.f271414g1
        L_0x0234:
            r2.setText(r3)
            android.widget.TextView r2 = r1.f271372D
            r2.setEnabled(r10)
            android.widget.ImageButton r2 = r1.f271370B
            r2.setEnabled(r10)
            android.widget.TextView r2 = r1.f271372D
            android.content.res.Resources r3 = r26.getResources()
            int r3 = r3.getColor(r7)
            r2.setTextColor(r3)
            java.util.ArrayList<java.lang.String> r2 = r1.f271416i
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0259
            r1.enableOptionMenu(r10)
        L_0x0259:
            boolean r2 = hd0.C98429r0.m127830u()
            if (r2 == 0) goto L_0x0596
            int r2 = r1.f271378J
            if (r2 != r6) goto L_0x0596
            boolean r2 = r1.f271420p
            if (r2 == 0) goto L_0x0596
            java.lang.String r2 = r0.f162747d
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            long r11 = qw1.C101316l.m132908g()
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0596
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r1.f271417j
            boolean r0 = r2.contains(r0)
            android.widget.TextView r2 = r1.f271372D
            r2.setEnabled(r0)
            android.widget.ImageButton r2 = r1.f271370B
            r2.setEnabled(r0)
            android.widget.TextView r2 = r1.f271372D
            android.content.res.Resources r3 = r26.getResources()
            if (r0 == 0) goto L_0x0290
            r7 = 2131101837(0x7f06088d, float:1.7816095E38)
        L_0x0290:
            int r0 = r3.getColor(r7)
            r2.setTextColor(r0)
            android.view.View r0 = r1.f271386R
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.mo10233c(r3)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r14 = "updateTopTip"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r13 = "updateTopTip"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            java.util.ArrayList<java.lang.String> r0 = r1.f271416i
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0596
            r1.enableOptionMenu(r10)
            goto L_0x0596
        L_0x02e6:
            hw1.w r4 = new hw1.w
            java.lang.String r5 = r0.f162747d
            java.lang.Integer r6 = r1.f271418n
            int r6 = r6.intValue()
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$m r7 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$m
            r7.<init>(r0)
            r4.<init>(r5, r6, r3, r7)
            android.widget.ProgressBar r0 = r1.f271390T
            java.lang.Object r0 = r0.getTag()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0310
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r3 = r1.f271403Z0
            r0[r10] = r3
            java.lang.String r3 = "analysis of path[%s] has already been added in ThreadPool"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r0)
            return
        L_0x0310:
            android.widget.ProgressBar r0 = r1.f271390T
            r0.setTag(r4)
            zt3.t r0 = zt3.C119157j.f356862d
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r4)
            goto L_0x0596
        L_0x031e:
            int r3 = r27.getType()
            java.lang.String r4 = "image/gif"
            if (r3 != r9) goto L_0x04a3
            java.lang.String r3 = r0.f162755o
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 != 0) goto L_0x04a3
            android.widget.TextView r2 = r1.f271372D
            r2.setEnabled(r9)
            android.widget.ImageButton r2 = r1.f271370B
            r2.setEnabled(r9)
            android.widget.TextView r2 = r1.f271372D
            android.content.res.Resources r3 = r26.getResources()
            int r3 = r3.getColor(r8)
            r2.setTextColor(r3)
            boolean r2 = r1.f271420p
            r3 = 26214400(0x1900000, double:1.29516345E-316)
            if (r2 == 0) goto L_0x03ba
            java.util.ArrayList<java.lang.String> r2 = r1.f271416i
            java.lang.String r11 = r0.f162747d
            boolean r2 = r2.contains(r11)
            if (r2 == 0) goto L_0x03ba
            java.lang.String r2 = r0.f162747d
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x03ba
            android.view.View r2 = r1.f271386R
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r15.mo10233c(r11)
            java.lang.Object[] r12 = r15.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r14 = "updateTopTip"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r11 = r2
            r7 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r7 = r7.mo10231a(r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r12 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r13 = "updateTopTip"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.widget.TextView r2 = r1.f271384Q
            r7 = 2131830639(0x7f11276f, float:1.9294281E38)
            java.lang.String r7 = r1.getString(r7)
            r2.setText(r7)
            goto L_0x03fe
        L_0x03ba:
            android.view.View r2 = r1.f271386R
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r7.mo10233c(r11)
            java.lang.Object[] r12 = r7.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r14 = "updateTopTip"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r7 = r7.mo10231a(r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r12 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r13 = "updateTopTip"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x03fe:
            boolean r2 = hd0.C98429r0.m127830u()
            if (r2 == 0) goto L_0x0596
            boolean r2 = r1.f271420p
            if (r2 == 0) goto L_0x0596
            int r2 = r1.f271378J
            if (r2 != r6) goto L_0x0596
            java.lang.String r2 = r0.f162747d
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0448
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r1.f271417j
            boolean r0 = r2.contains(r0)
            android.widget.TextView r2 = r1.f271372D
            r2.setEnabled(r0)
            android.widget.ImageButton r2 = r1.f271370B
            r2.setEnabled(r0)
            android.widget.TextView r2 = r1.f271372D
            android.content.res.Resources r3 = r26.getResources()
            if (r0 == 0) goto L_0x0432
            r7 = 2131101837(0x7f06088d, float:1.7816095E38)
            goto L_0x0435
        L_0x0432:
            r7 = 2131101838(0x7f06088e, float:1.7816097E38)
        L_0x0435:
            int r0 = r3.getColor(r7)
            r2.setTextColor(r0)
            java.util.ArrayList<java.lang.String> r0 = r1.f271416i
            int r0 = r0.size()
            if (r0 != 0) goto L_0x045f
            r1.enableOptionMenu(r10)
            goto L_0x045f
        L_0x0448:
            android.widget.TextView r0 = r1.f271372D
            r0.setEnabled(r9)
            android.widget.ImageButton r0 = r1.f271370B
            r0.setEnabled(r9)
            android.widget.TextView r0 = r1.f271372D
            android.content.res.Resources r2 = r26.getResources()
            int r2 = r2.getColor(r8)
            r0.setTextColor(r2)
        L_0x045f:
            android.view.View r0 = r1.f271386R
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.mo10233c(r3)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r14 = "updateTopTip"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r13 = "updateTopTip"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0596
        L_0x04a3:
            int r3 = r27.getType()
            if (r3 != r9) goto L_0x0596
            java.lang.String r3 = r0.f162755o
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x0596
            qz1.f r3 = new qz1.f     // Catch:{ all -> 0x0524 }
            java.lang.String r4 = r0.f162747d     // Catch:{ all -> 0x0524 }
            r3.<init>(r4)     // Catch:{ all -> 0x0524 }
            java.lang.String r4 = r0.f162747d     // Catch:{ all -> 0x0524 }
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)     // Catch:{ all -> 0x0524 }
            java.util.ArrayList<java.lang.String> r6 = r1.f271416i     // Catch:{ all -> 0x0524 }
            java.lang.String r0 = r0.f162747d     // Catch:{ all -> 0x0524 }
            boolean r0 = r6.contains(r0)     // Catch:{ all -> 0x0524 }
            if (r0 == 0) goto L_0x04d9
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x04d9
            java.lang.String[] r0 = qw1.C101316l.f296815a     // Catch:{ all -> 0x0524 }
            int r0 = p645pj.C77092c.m93039a()     // Catch:{ all -> 0x0524 }
            long r6 = (long) r0     // Catch:{ all -> 0x0524 }
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0509
        L_0x04d9:
            int[] r0 = r3.f296869a     // Catch:{ all -> 0x0524 }
            r0 = r0[r10]     // Catch:{ all -> 0x0524 }
            java.lang.String[] r4 = qw1.C101316l.f296815a     // Catch:{ all -> 0x0524 }
            int r4 = p645pj.C77092c.m93041c()     // Catch:{ all -> 0x0524 }
            if (r0 > r4) goto L_0x0509
            int[] r0 = r3.f296869a     // Catch:{ all -> 0x0524 }
            r0 = r0[r9]     // Catch:{ all -> 0x0524 }
            int r3 = p645pj.C77092c.m93041c()     // Catch:{ all -> 0x0524 }
            if (r0 <= r3) goto L_0x04f0
            goto L_0x0509
        L_0x04f0:
            android.widget.TextView r0 = r1.f271372D     // Catch:{ all -> 0x0524 }
            android.content.res.Resources r3 = r26.getResources()     // Catch:{ all -> 0x0524 }
            int r3 = r3.getColor(r8)     // Catch:{ all -> 0x0524 }
            r0.setTextColor(r3)     // Catch:{ all -> 0x0524 }
            android.widget.TextView r0 = r1.f271372D     // Catch:{ all -> 0x0524 }
            r0.setEnabled(r9)     // Catch:{ all -> 0x0524 }
            android.widget.ImageButton r0 = r1.f271370B     // Catch:{ all -> 0x0524 }
            r0.setEnabled(r9)     // Catch:{ all -> 0x0524 }
            goto L_0x0596
        L_0x0509:
            android.widget.TextView r0 = r1.f271372D     // Catch:{ all -> 0x0524 }
            android.content.res.Resources r3 = r26.getResources()     // Catch:{ all -> 0x0524 }
            r4 = 2131101838(0x7f06088e, float:1.7816097E38)
            int r3 = r3.getColor(r4)     // Catch:{ all -> 0x0524 }
            r0.setTextColor(r3)     // Catch:{ all -> 0x0524 }
            android.widget.TextView r0 = r1.f271372D     // Catch:{ all -> 0x0524 }
            r0.setEnabled(r10)     // Catch:{ all -> 0x0524 }
            android.widget.ImageButton r0 = r1.f271370B     // Catch:{ all -> 0x0524 }
            r0.setEnabled(r10)     // Catch:{ all -> 0x0524 }
            goto L_0x0596
        L_0x0524:
            r0 = move-exception
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            android.view.View r3 = r1.f271386R
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r0.mo10233c(r2)
            java.lang.Object[] r12 = r0.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r14 = "updateTopTip"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r3
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r0.mo10231a(r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.setVisibility(r0)
            java.lang.String r4 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r5 = "updateTopTip"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            android.widget.TextView r0 = r1.f271384Q
            r2 = 2131830636(0x7f11276c, float:1.9294275E38)
            java.lang.String r2 = r1.getString(r2)
            r0.setText(r2)
            android.widget.TextView r0 = r1.f271372D
            android.content.res.Resources r2 = r26.getResources()
            r3 = 2131101838(0x7f06088e, float:1.7816097E38)
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
            android.widget.TextView r0 = r1.f271372D
            r0.setEnabled(r10)
            android.widget.ImageButton r0 = r1.f271370B
            r0.setEnabled(r10)
        L_0x0596:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.mo129007f8(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem):void");
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return (!this.f271393U0 || !this.f271377I) ? C0966R.C0971layout.b0_ : C0966R.C0971layout.d2n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0746  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r30 = this;
            r8 = r30
            android.content.res.Resources r0 = r30.getResources()
            r1 = 2131100808(0x7f060488, float:1.7814008E38)
            int r0 = r0.getColor(r1)
            r8.setActionbarColor(r0)
            android.content.res.Resources r0 = r30.getResources()
            int r0 = r0.getColor(r1)
            r8.setNavigationbarColor(r0)
            r9 = 2131305329(0x7f092371, float:1.8228826E38)
            android.view.View r0 = r8.findViewById(r9)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f271382N = r0
            r10 = 2131305331(0x7f092373, float:1.822883E38)
            android.view.View r0 = r8.findViewById(r10)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f271383P = r0
            r0 = 2131306627(0x7f092883, float:1.8231458E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f271384Q = r0
            r0 = 2131306628(0x7f092884, float:1.823146E38)
            android.view.View r0 = r8.findViewById(r0)
            r8.f271386R = r0
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$o r1 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$o
            r1.<init>()
            r2 = 100
            r0.postDelayed(r1, r2)
            r11 = 2131305330(0x7f092372, float:1.8228828E38)
            android.view.View r0 = r8.findViewById(r11)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f271388S = r0
            r0 = 2131316166(0x7f094dc6, float:1.8250806E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r8.f271390T = r0
            android.content.Intent r0 = r30.getIntent()
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.String r1 = "isSelectAlbum"
            boolean r0 = r0.getBooleanExtra(r1, r12)
            r8.f271395V0 = r0
            android.content.Intent r0 = r30.getIntent()
            java.lang.String r1 = "max_select_count"
            r2 = 9
            int r0 = r0.getIntExtra(r1, r2)
            r8.f271431y = r0
            android.content.Intent r0 = r30.getIntent()
            java.lang.String r1 = "key_edit_video_max_time_length"
            r14 = 10
            int r0 = r0.getIntExtra(r1, r14)
            r8.f271380L = r0
            android.content.Intent r15 = r30.getIntent()
            java.lang.String r0 = "preview_image_list"
            java.util.ArrayList r0 = r15.getStringArrayListExtra(r0)
            r8.f271413g = r0
            java.lang.String r0 = "preview_media_item_list"
            java.util.ArrayList r0 = r15.getParcelableArrayListExtra(r0)
            r8.f271417j = r0
            int r0 = r8.f271400Y
            java.lang.String r1 = "media_type"
            int r0 = r15.getIntExtra(r1, r0)
            r8.f271400Y = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.f271416i = r0
            java.lang.String r0 = "key_support_max_ratio"
            r1 = 0
            float r0 = r15.getFloatExtra(r0, r1)
            r8.f271369A = r0
            java.util.ArrayList<java.lang.String> r0 = r8.f271413g
            if (r0 == 0) goto L_0x00d0
            java.util.ArrayList<java.lang.String> r1 = r8.f271416i
            r1.addAll(r0)
        L_0x00d0:
            java.util.ArrayList r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118751k()
            r8.f271415h = r0
            java.lang.String r0 = "preview_all"
            boolean r0 = r15.getBooleanExtra(r0, r12)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1[r12] = r2
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r8.f271415h
            r7 = 1
            if (r2 != 0) goto L_0x00ed
            r2 = 1
            goto L_0x00ee
        L_0x00ed:
            r2 = 0
        L_0x00ee:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1[r7] = r2
            java.lang.String r2 = "MicroMsg.ImagePreviewUI"
            java.lang.String r3 = "preview all[%B] mediaitems is null[%B]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            if (r0 == 0) goto L_0x0126
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r0 = r8.f271415h
            if (r0 == 0) goto L_0x0126
            r8.f271419o = r7
            java.lang.String r0 = "preview_position"
            int r0 = r15.getIntExtra(r0, r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.f271418n = r0
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r12] = r0
            java.lang.String r0 = "start position=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r1)
            java.lang.Integer r0 = r8.f271418n
            int r0 = r0.intValue()
            if (r0 >= 0) goto L_0x0128
            r8.f271418n = r13
            goto L_0x0128
        L_0x0126:
            r8.f271418n = r13
        L_0x0128:
            java.lang.Integer r0 = r8.f271418n
            int r0 = r0.intValue()
            com.tencent.mm.plugin.gallery.model.f r1 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118749i()
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r1 = r1.f271162h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r1.put(r0, r3)
            boolean r0 = r8.f271419o
            if (r0 != 0) goto L_0x0155
            java.util.ArrayList<java.lang.String> r0 = r8.f271416i
            if (r0 == 0) goto L_0x014b
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0155
        L_0x014b:
            java.lang.String r0 = "not preview all items and image paths is null or empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r30.finish()
            return
        L_0x0155:
            r0 = 2131310650(0x7f09383a, float:1.8239618E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r8.f271425t = r0
            r0 = 2131310653(0x7f09383d, float:1.8239624E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f271426u = r0
            r0 = 2131310652(0x7f09383c, float:1.8239622E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f271427v = r0
            r6 = 2131316165(0x7f094dc5, float:1.8250804E38)
            android.view.View r0 = r8.findViewById(r6)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f271428w = r0
            java.lang.String r0 = "send_raw_img"
            boolean r0 = r15.getBooleanExtra(r0, r12)
            r8.f271420p = r0
            java.lang.String r0 = "key_force_hide_edit_image_button"
            boolean r0 = r15.getBooleanExtra(r0, r12)
            r8.f271422q = r0
            java.lang.String r0 = "key_force_show_raw_image_button"
            boolean r0 = r15.getBooleanExtra(r0, r12)
            r8.f271423r = r0
            java.lang.String r0 = "key_is_raw_image_button_disable"
            boolean r0 = r15.getBooleanExtra(r0, r12)
            r8.f271424s = r0
            java.lang.String r0 = "query_source_type"
            int r0 = r15.getIntExtra(r0, r12)
            r8.f271378J = r0
            java.lang.String r0 = "key_force_hide_edit_video_button"
            boolean r0 = r15.getBooleanExtra(r0, r12)
            r8.f271433z = r0
            java.lang.String[] r0 = qw1.C101316l.f296815a
            com.tencent.mm.plugin.gallery.model.n r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r0 = r0.f271196f
            r5 = 4
            if (r0 == r5) goto L_0x01d1
            r1 = 14
            if (r0 == r1) goto L_0x01cc
            r1 = 22
            if (r0 == r1) goto L_0x01cc
            r0 = 0
            goto L_0x01d5
        L_0x01cc:
            boolean r0 = qw1.C101316l.m132913l()
            goto L_0x01d5
        L_0x01d1:
            boolean r0 = qw1.C101316l.m132912k()
        L_0x01d5:
            r8.f271398X = r0
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1[r12] = r0
            java.lang.String r0 = "initView, enableVLog:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r1)
            boolean r0 = r8.f271420p
            r4 = 8
            if (r0 == 0) goto L_0x023f
            android.widget.ImageButton r0 = r8.f271425t
            r1 = 2131756876(0x7f10074c, float:1.9144672E38)
            r0.setImageResource(r1)
            android.widget.ImageButton r0 = r8.f271425t
            android.content.res.Resources r1 = r30.getResources()
            r2 = 2131830560(0x7f112720, float:1.929412E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setContentDescription(r1)
            boolean r0 = hd0.C98429r0.m127830u()
            if (r0 == 0) goto L_0x0239
            int r0 = r8.f271378J
            r1 = 3
            if (r0 == r1) goto L_0x0211
            r1 = 16
            if (r0 != r1) goto L_0x0239
        L_0x0211:
            boolean r0 = r8.f271420p
            if (r0 == 0) goto L_0x0239
            java.lang.String r0 = r30.mo128987L7()
            android.widget.TextView r1 = r8.f271427v
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x0224
            r2 = 8
            goto L_0x0225
        L_0x0224:
            r2 = 0
        L_0x0225:
            r1.setVisibility(r2)
            android.widget.TextView r1 = r8.f271427v
            r2 = 2131830576(0x7f112730, float:1.9294153E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r12] = r0
            java.lang.String r0 = r8.getString(r2, r3)
            r1.setText(r0)
            goto L_0x025c
        L_0x0239:
            android.widget.TextView r0 = r8.f271427v
            r0.setVisibility(r4)
            goto L_0x025c
        L_0x023f:
            android.widget.ImageButton r0 = r8.f271425t
            r1 = 2131756874(0x7f10074a, float:1.9144668E38)
            r0.setImageResource(r1)
            android.widget.ImageButton r0 = r8.f271425t
            android.content.res.Resources r1 = r30.getResources()
            r2 = 2131830562(0x7f112722, float:1.9294125E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setContentDescription(r1)
            android.widget.TextView r0 = r8.f271427v
            r0.setVisibility(r4)
        L_0x025c:
            boolean r0 = r8.f271424s
            if (r0 == 0) goto L_0x0268
            android.widget.ImageButton r0 = r8.f271425t
            r1 = 2131756872(0x7f100748, float:1.9144664E38)
            r0.setImageResource(r1)
        L_0x0268:
            android.widget.ImageButton r0 = r8.f271425t
            boolean r1 = r8.f271424s
            r1 = r1 ^ r7
            r0.setEnabled(r1)
            android.widget.TextView r0 = r8.f271426u
            boolean r1 = r8.f271424s
            r1 = r1 ^ r7
            r0.setEnabled(r1)
            java.util.ArrayList<java.lang.String> r0 = r8.f271416i
            if (r0 == 0) goto L_0x02ba
            int r0 = r0.size()
            if (r0 != r7) goto L_0x02ba
            java.util.ArrayList<java.lang.String> r0 = r8.f271416i
            java.lang.Object r0 = r0.get(r12)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            r1 = 0
            android.content.Intent r0 = r30.getIntent()
            java.lang.String r4 = "GalleryUI_ToUser"
            java.lang.String r4 = r0.getStringExtra(r4)
            boolean r0 = r8.f271377I
            if (r0 != 0) goto L_0x02a3
            boolean r0 = r8.f271420p
            if (r0 != 0) goto L_0x02a0
            goto L_0x02a3
        L_0x02a0:
            r17 = 0
            goto L_0x02a5
        L_0x02a3:
            r17 = 1
        L_0x02a5:
            r18 = 0
            r19 = 1
            r0 = r30
            r11 = 8
            r16 = 4
            r5 = r17
            r6 = r18
            r9 = 1
            r7 = r19
            qw1.C101316l.m132911j(r0, r1, r3, r4, r5, r6, r7)
            goto L_0x02bf
        L_0x02ba:
            r9 = 1
            r11 = 8
            r16 = 4
        L_0x02bf:
            android.widget.TextView r0 = r8.f271426u
            androidx.appcompat.app.AppCompatActivity r1 = r30.getContext()
            r2 = 2131830617(0x7f112759, float:1.9294236E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setText(r1)
            android.widget.ImageButton r0 = r8.f271425t
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$p r1 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$p
            r1.<init>()
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r8.f271428w
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$q r1 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$q
            r1.<init>()
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r8.f271388S
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$r r1 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$r
            r1.<init>()
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r8.f271426u
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$s r1 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$s
            r1.<init>()
            r0.setOnClickListener(r1)
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$t r0 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$t
            r0.<init>()
            r8.setBackBtn(r0)
            java.lang.String r0 = "album_business_tag"
            java.lang.String r0 = r15.getStringExtra(r0)
            r8.f271392U = r0
            java.lang.String r0 = "album_video_max_duration"
            int r0 = r15.getIntExtra(r0, r14)
            r8.f271394V = r0
            java.lang.String r0 = "album_video_min_duration"
            int r0 = r15.getIntExtra(r0, r12)
            r8.f271396W = r0
            com.tencent.mm.ui.MMActivityController$r r0 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.DARK_GREEN_MODE
            com.tencent.mm.plugin.gallery.model.n r1 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r1 = r1.f271196f
            r2 = 15
            r7 = 25
            if (r1 == r2) goto L_0x0332
            if (r1 == r7) goto L_0x032f
            r2 = 28
            if (r1 == r2) goto L_0x032c
            goto L_0x0334
        L_0x032c:
            com.tencent.mm.ui.MMActivityController$r r0 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.FINDER_LIVE
            goto L_0x0334
        L_0x032f:
            com.tencent.mm.ui.MMActivityController$r r0 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.ORANGE
            goto L_0x0334
        L_0x0332:
            com.tencent.mm.ui.MMActivityController$r r0 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.YELLOW
        L_0x0334:
            r5 = r0
            r1 = 0
            java.lang.String r2 = r30.mo128989N7()
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$u r3 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$u
            r3.<init>()
            r4 = 0
            r0 = r30
            r0.addTextOptionMenu(r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.gallery.model.n r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r0 = r0.f271196f
            r14 = 26
            if (r14 != r0) goto L_0x0352
            r8.removeOptionMenu(r12)
        L_0x0352:
            r0 = 2131310965(0x7f093975, float:1.8240257E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r8.f271370B = r0
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$a r1 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$a
            r1.<init>()
            r0.setOnClickListener(r1)
            r0 = 2131310967(0x7f093977, float:1.824026E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f271372D = r0
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$b r1 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$b
            r1.<init>()
            r0.setOnClickListener(r1)
            int r0 = r8.f271431y
            if (r0 != r9) goto L_0x038a
            boolean r0 = r8.f271393U0
            if (r0 != 0) goto L_0x038a
            android.widget.ImageButton r0 = r8.f271370B
            r0.setVisibility(r11)
            android.widget.TextView r0 = r8.f271372D
            r0.setVisibility(r11)
        L_0x038a:
            r0 = 2131300609(0x7f091101, float:1.8219252E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f271373E = r0
            r0 = 2131305328(0x7f092370, float:1.8228824E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f271374F = r0
            android.view.ViewGroup r0 = r8.f271373E
            if (r0 == 0) goto L_0x03b1
            r0.setVisibility(r11)
            android.view.ViewGroup r0 = r8.f271373E
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$c r1 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$c
            r1.<init>(r8)
            r0.setOnClickListener(r1)
        L_0x03b1:
            android.view.ViewGroup r0 = r8.f271374F
            if (r0 == 0) goto L_0x03c2
            r0.setVisibility(r11)
            android.view.ViewGroup r0 = r8.f271374F
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$d r1 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$d
            r1.<init>(r8)
            r0.setOnClickListener(r1)
        L_0x03c2:
            r15 = 2131310956(0x7f09396c, float:1.8240239E38)
            android.view.View r0 = r8.findViewById(r15)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f271381M = r0
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$e r1 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$e
            r1.<init>()
            r0.setOnClickListener(r1)
            r0 = 2131306323(0x7f092753, float:1.8230842E38)
            android.view.View r0 = r8.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r8.f271411f = r0
            androidx.recyclerview.widget.RecyclerView$j r0 = r0.getItemAnimator()
            r1 = 66
            r0.f44809e = r1
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$f r1 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$f
            r1.<init>(r8)
            r0.mo17085h0(r1)
            com.tencent.mm.plugin.gallery.ui.SpeedyLinearLayoutManager r0 = new com.tencent.mm.plugin.gallery.ui.SpeedyLinearLayoutManager
            r0.<init>(r8)
            r0.mo16974W(r12)
            androidx.recyclerview.widget.RecyclerView r1 = r8.f271411f
            r1.setLayoutManager(r0)
            android.content.res.Resources r0 = r30.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r3 = r0 / 7
            com.tencent.mm.plugin.gallery.ui.m r6 = new com.tencent.mm.plugin.gallery.ui.m
            java.util.ArrayList<java.lang.String> r2 = r8.f271416i
            boolean r4 = r8.f271419o
            int r5 = r8.f271378J
            boolean r1 = r8.f271385Q0
            r0 = r6
            r18 = r1
            r1 = r30
            r15 = r6
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            boolean r0 = r8.f271420p
            r15.f271616o = r0
            r15.notifyDataSetChanged()
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            r0.setAdapter(r15)
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$g r1 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$g
            r1.<init>()
            r0.post(r1)
            java.util.ArrayList<java.lang.String> r0 = r8.f271416i
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x044c
            com.tencent.mm.plugin.gallery.model.n r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r0 = r0.f271196f
            if (r14 == r0) goto L_0x044c
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            r0.setVisibility(r12)
            goto L_0x0451
        L_0x044c:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            r0.setVisibility(r11)
        L_0x0451:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            androidx.recyclerview.widget.f r1 = new androidx.recyclerview.widget.f
            r1.<init>()
            r0.setItemAnimator(r1)
            androidx.recyclerview.widget.p r0 = r15.f271624w
            androidx.recyclerview.widget.RecyclerView r1 = r8.f271411f
            r0.mo17527j(r1)
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$h r0 = new com.tencent.mm.plugin.gallery.ui.ImagePreviewUI$h
            r0.<init>()
            r15.f271613i = r0
            r0 = 2131305324(0x7f09236c, float:1.8228816E38)
            android.view.View r0 = r8.findViewById(r0)
            com.tencent.mm.ui.base.MMViewPager r0 = (com.tencent.p014mm.p136ui.base.MMViewPager) r0
            r8.f271407d = r0
            r0.setVerticalFadingEdgeEnabled(r12)
            com.tencent.mm.ui.base.MMViewPager r0 = r8.f271407d
            r0.setHorizontalFadingEdgeEnabled(r12)
            com.tencent.mm.ui.base.MMViewPager r0 = r8.f271407d
            ow1.t r1 = new ow1.t
            r1.<init>(r8)
            r0.setOnPageChangeListener(r1)
            com.tencent.mm.ui.base.MMViewPager r0 = r8.f271407d
            ow1.u r1 = new ow1.u
            r1.<init>(r8)
            r0.setSingleClickOverListener(r1)
            com.tencent.mm.plugin.gallery.ui.h r0 = new com.tencent.mm.plugin.gallery.ui.h
            r0.<init>(r8)
            r8.f271409e = r0
            ow1.q$$a r1 = new ow1.q$$a
            r1.<init>(r8)
            r0.f271583r = r1
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            com.tencent.mm.plugin.gallery.ui.m r0 = (com.tencent.p014mm.plugin.gallery.p473ui.C94070m) r0
            com.tencent.mm.plugin.gallery.ui.h r1 = r8.f271409e
            r0.f271608d = r1
            boolean r0 = r8.f271419o
            if (r0 != 0) goto L_0x04ce
            java.util.ArrayList<java.lang.String> r0 = r8.f271413g
            r1.mo129065m(r0)
            com.tencent.mm.plugin.gallery.ui.h r0 = r8.f271409e
            r0.f271578j = r12
            java.util.ArrayList<java.lang.String> r0 = r8.f271413g
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x050d
            java.util.ArrayList<java.lang.String> r0 = r8.f271413g
            java.lang.Integer r1 = r8.f271418n
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x050f
        L_0x04ce:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r0 = r8.f271415h
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r1.f271577i
            r2.clear()
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r1.f271577i
            r2.addAll(r0)
            r1.mo139421i()
            r1.notifyDataSetChanged()
            com.tencent.mm.plugin.gallery.ui.h r0 = r8.f271409e
            r0.f271578j = r9
            java.lang.Integer r0 = r8.f271418n
            int r0 = r0.intValue()
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r8.f271415h
            int r1 = r1.size()
            if (r0 < r1) goto L_0x04f4
            r8.f271418n = r13
        L_0x04f4:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r0 = r8.f271415h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x050d
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r0 = r8.f271415h
            java.lang.Integer r1 = r8.f271418n
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.get(r1)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r0 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r0
            java.lang.String r0 = r0.f162747d
            goto L_0x050f
        L_0x050d:
            java.lang.String r0 = ""
        L_0x050f:
            com.tencent.mm.ui.base.MMViewPager r1 = r8.f271407d
            com.tencent.mm.plugin.gallery.ui.h r2 = r8.f271409e
            r1.setAdapter(r2)
            com.tencent.mm.ui.base.MMViewPager r1 = r8.f271407d
            java.lang.Integer r2 = r8.f271418n
            int r2 = r2.intValue()
            r1.setCurrentItem(r2)
            com.tencent.mm.plugin.gallery.ui.h r1 = r8.f271409e
            java.lang.Integer r2 = r8.f271418n
            r2.intValue()
            r1.getClass()
            java.util.ArrayList r1 = r30.mo128988M7()
            com.tencent.mm.plugin.gallery.ui.h r2 = r8.f271409e
            java.lang.Integer r3 = r8.f271418n
            int r3 = r3.intValue()
            java.lang.String r2 = r2.mo129062j(r3)
            int r1 = r1.indexOf(r2)
            androidx.recyclerview.widget.RecyclerView r2 = r8.f271411f
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            com.tencent.mm.plugin.gallery.ui.m r2 = (com.tencent.p014mm.plugin.gallery.p473ui.C94070m) r2
            java.lang.Integer r3 = r8.f271418n
            int r3 = r3.intValue()
            r2.f271620s = r1
            r2.f271619r = r3
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118745e(r0)
            r8.mo128999X7(r0, r1)
            r8.mo129007f8(r1)
            r8.mo128995T7(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Integer r1 = r8.f271418n
            int r1 = r1.intValue()
            int r1 = r1 + r9
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            com.tencent.mm.plugin.gallery.ui.h r1 = r8.f271409e
            int r1 = r1.getCount()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.setMMTitle((java.lang.String) r0)
            com.tencent.mm.plugin.gallery.model.n r0 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r0 = r0.f271196f
            if (r0 != r7) goto L_0x073f
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            androidx.recyclerview.widget.RecyclerView r1 = r8.f271411f
            r0.removeView(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r8.f271411f
            r0.setVisibility(r11)
            r0 = 2131310673(0x7f093851, float:1.8239665E38)
            android.view.View r1 = r8.findViewById(r0)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r0.mo10233c(r2)
            java.lang.Object[] r23 = r0.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r25 = "initView"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r1
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r0 = r0.mo10231a(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r3 = "initView"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            android.view.View r0 = r8.findViewById(r10)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1.mo10233c(r2)
            java.lang.Object[] r23 = r1.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r25 = "initView"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r0
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r1 = r1.mo10231a(r12)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r23 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r24 = "initView"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            r0 = 2131310956(0x7f09396c, float:1.8240239E38)
            android.view.View r1 = r8.findViewById(r0)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r0.mo10233c(r2)
            java.lang.Object[] r23 = r0.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r25 = "initView"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r1
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r0 = r0.mo10231a(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r3 = "initView"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r0 = 2131305329(0x7f092371, float:1.8228826E38)
            android.view.View r1 = r8.findViewById(r0)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r0.mo10233c(r2)
            java.lang.Object[] r23 = r0.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r25 = "initView"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r1
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r0 = r0.mo10231a(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r3 = "initView"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r0 = 2131316165(0x7f094dc5, float:1.8250804E38)
            android.view.View r1 = r8.findViewById(r0)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r0.mo10233c(r2)
            java.lang.Object[] r22 = r0.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r24 = "initView"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r1
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r0 = r0.mo10231a(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r3 = "initView"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r0 = 2131305330(0x7f092372, float:1.8228828E38)
            android.view.View r1 = r8.findViewById(r0)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r0.mo10233c(r2)
            java.lang.Object[] r18 = r0.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r20 = "initView"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r0 = r0.mo10231a(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r3 = "initView"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x073f:
            r8.mo128983H7(r12)
            boolean r0 = r8.f271377I
            if (r0 == 0) goto L_0x0754
            java.util.ArrayList<java.lang.String> r0 = r8.f271416i
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0750
            r7 = 1
            goto L_0x0751
        L_0x0750:
            r7 = 0
        L_0x0751:
            r8.enableOptionMenu(r12, r7)
        L_0x0754:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.initView():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x024b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r32, int r33, android.content.Intent r34) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            java.lang.Class<hy.o0> r4 = p166hy.C98567o0.class
            java.lang.String r5 = "MicroMsg.ImagePreviewUI"
            java.lang.String r6 = "test onActivityResult"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r12 = 1
            java.lang.String r13 = "key_edit_safe_strategy_emotion_info_list"
            java.lang.String r14 = "KEY_EDIT_PUBLISHID_INT"
            java.lang.String r15 = "KSEGMENTMEDIAINFO"
            java.lang.String r10 = ""
            java.lang.String r9 = "key_extra_data"
            r11 = 4371(0x1113, float:6.125E-42)
            if (r1 != r11) goto L_0x0061
            if (r2 != r6) goto L_0x0034
            r0.setResult(r6, r3)
            r31.finish()
            goto L_0x0242
        L_0x0034:
            java.util.ArrayList<java.lang.String> r11 = r0.f271416i
            int r11 = r11.size()
            if (r11 < r12) goto L_0x004a
            java.util.ArrayList<java.lang.String> r11 = r0.f271416i
            r6 = 0
            java.lang.Object r11 = r11.get(r6)
            java.lang.String r11 = (java.lang.String) r11
            r0.mo128994S7(r11)
            goto L_0x0242
        L_0x004a:
            r6 = 0
            java.lang.Object[] r11 = new java.lang.Object[r12]
            java.util.ArrayList<java.lang.String> r12 = r0.f271416i
            int r12 = r12.size()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r6] = r12
            java.lang.String r6 = "selectedPath has unexpected size() [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r11)
            goto L_0x0242
        L_0x0061:
            r6 = 4370(0x1112, float:6.124E-42)
            if (r1 != r6) goto L_0x0242
            r6 = -1
            if (r2 != r6) goto L_0x0242
            android.os.Parcelable r6 = r3.getParcelableExtra(r15)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r6 = (com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.CaptureVideoNormalModel) r6
            android.os.Bundle r11 = r3.getBundleExtra(r9)
            r3.putExtra(r9, r11)
            java.lang.String r11 = r6.f272894e
            java.lang.String r12 = "K_SEGMENTVIDEOPATH"
            r3.putExtra(r12, r11)
            java.lang.String r11 = r6.f272895f
            java.lang.String r12 = "KSEGMENTVIDEOTHUMBPATH"
            r3.putExtra(r12, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r12 = r6.mo129798a()
            java.lang.Object r12 = r12.mo129811b(r14, r7)
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "KSEGMENTMEDIAEDITID"
            r3.putExtra(r12, r11)
            boolean r11 = r0.f271377I
            if (r11 == 0) goto L_0x00b5
            di3.d r11 = di3.C86312j.m106911c(r4)
            hy.o0 r11 = (p166hy.C98567o0) r11
            java.lang.String r12 = r6.f272894e
            r16 = r8
            android.os.Bundle r8 = r3.getBundleExtra(r9)
            r11.mo137592an(r12, r8, r13)
            goto L_0x00b7
        L_0x00b5:
            r16 = r8
        L_0x00b7:
            boolean r8 = r0.f271432y0
            if (r8 == 0) goto L_0x0239
            boolean r8 = r0.f271391T0
            if (r8 != 0) goto L_0x0239
            androidx.recyclerview.widget.RecyclerView r8 = r0.f271411f
            if (r8 == 0) goto L_0x0239
            java.lang.String r8 = r6.f272894e
            java.lang.String r6 = r6.f272895f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r27 = r10
            androidx.recyclerview.widget.RecyclerView r10 = r0.f271411f
            androidx.recyclerview.widget.RecyclerView$e r10 = r10.getAdapter()
            if (r10 != 0) goto L_0x00e4
            java.util.ArrayList r10 = new java.util.ArrayList
            r28 = r13
            r13 = 1
            r10.<init>(r13)
            goto L_0x00f0
        L_0x00e4:
            r28 = r13
            androidx.recyclerview.widget.RecyclerView r10 = r0.f271411f
            androidx.recyclerview.widget.RecyclerView$e r10 = r10.getAdapter()
            com.tencent.mm.plugin.gallery.ui.m r10 = (com.tencent.p014mm.plugin.gallery.p473ui.C94070m) r10
            java.util.ArrayList<java.lang.String> r10 = r10.f271612h
        L_0x00f0:
            java.util.ArrayList<java.lang.String> r13 = r0.f271416i
            r29 = r9
            r9 = 0
        L_0x00f5:
            r30 = r4
            if (r10 == 0) goto L_0x012a
            int r4 = r10.size()
            if (r9 >= r4) goto L_0x012a
            java.lang.Object r4 = r10.get(r9)
            java.lang.String r4 = (java.lang.String) r4
            r17 = r10
            java.lang.String r10 = r0.f271421p0
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            boolean r10 = r4.equalsIgnoreCase(r10)
            if (r10 != 0) goto L_0x011f
            java.lang.String r10 = r0.f271430x0
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            boolean r10 = r4.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0120
        L_0x011f:
            r4 = r8
        L_0x0120:
            r11.add(r4)
            int r9 = r9 + 1
            r10 = r17
            r4 = r30
            goto L_0x00f5
        L_0x012a:
            r4 = 0
        L_0x012b:
            if (r13 == 0) goto L_0x0158
            int r9 = r13.size()
            if (r4 >= r9) goto L_0x0158
            java.lang.Object r9 = r13.get(r4)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r0.f271421p0
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            boolean r10 = r9.equalsIgnoreCase(r10)
            if (r10 != 0) goto L_0x0151
            java.lang.String r10 = r0.f271430x0
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            boolean r10 = r9.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0152
        L_0x0151:
            r9 = r8
        L_0x0152:
            r12.add(r9)
            int r4 = r4 + 1
            goto L_0x012b
        L_0x0158:
            java.lang.String r4 = r0.f271430x0
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x017b
            java.lang.String r4 = r0.f271430x0
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106447h(r4)
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r9 = r0.f271430x0
            r13 = 0
            r10[r13] = r9
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r9 = 1
            r10[r9] = r4
            java.lang.String r4 = "delete lastVideoPath = %s, delete result = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r4, r10)
            goto L_0x0181
        L_0x017b:
            java.lang.String r4 = "lastVideoPath isNullOrNil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)
        L_0x0181:
            java.util.ArrayList<java.lang.String> r4 = r0.f271413g
            if (r4 == 0) goto L_0x0247
            r4.clear()
            java.util.ArrayList<java.lang.String> r4 = r0.f271413g
            r4.addAll(r11)
            com.tencent.mm.plugin.gallery.ui.h r4 = r0.f271409e
            java.lang.Integer r9 = r0.f271418n
            int r9 = r9.intValue()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r4 = r4.mo129063k(r9)
            if (r4 != 0) goto L_0x01a2
            java.lang.String r4 = "[handleVideoEditResult]: item is null!!! return;"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)
            goto L_0x0247
        L_0x01a2:
            java.lang.String r9 = r0.f271421p0
            r4.f162748e = r9
            r4.f162747d = r8
            r4.f162750g = r6
            r9 = -1
            r4.f162751h = r9
            java.lang.String r6 = "video_edit"
            r4.f162755o = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "[handleVideoEditResult] videoPath = "
            r6.append(r9)
            java.lang.String r9 = r0.f271421p0
            r6.append(r9)
            java.lang.String r9 = ", editVideoPath = "
            r6.append(r9)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN
            r10 = 1
            boolean r6 = r6.mo119686g(r9, r10)
            if (r6 == 0) goto L_0x01fb
            boolean r6 = r0.f271377I
            if (r6 == 0) goto L_0x01fb
            java.lang.String r6 = r0.f271421p0
            r9 = 2
            java.lang.String r6 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118741a(r6, r8, r9)
            if (r6 == 0) goto L_0x01fb
            zt3.t r9 = zt3.C119157j.f356862d
            ow1.q$$h r10 = new ow1.q$$h
            r10.<init>(r6)
            zt3.j r9 = (zt3.C119157j) r9
            r9.mo183884o(r10)
        L_0x01fb:
            java.util.HashSet r6 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118748h()
            r6.add(r4)
            com.tencent.mm.plugin.gallery.model.d$e r6 = r0.f271401Y0
            if (r6 == 0) goto L_0x020f
            com.tencent.mm.plugin.gallery.model.c r6 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118747g()
            com.tencent.mm.plugin.gallery.model.d$e r9 = r0.f271401Y0
            r6.mo128878f(r9)
        L_0x020f:
            com.tencent.mm.plugin.gallery.model.c r6 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118747g()
            ow1.r r9 = new ow1.r
            r9.<init>(r0, r12, r8)
            r0.f271401Y0 = r9
            r6.mo128873a(r9)
            com.tencent.mm.plugin.gallery.model.c r17 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118747g()
            int r19 = r4.getType()
            long r9 = r4.f162751h
            long r11 = r4.f162752i
            r23 = 0
            r24 = -1
            r18 = r8
            r20 = r8
            r21 = r9
            r25 = r11
            r17.mo128876d(r18, r19, r20, r21, r23, r24, r25)
            goto L_0x0247
        L_0x0239:
            r30 = r4
        L_0x023b:
            r29 = r9
            r27 = r10
            r28 = r13
            goto L_0x0247
        L_0x0242:
            r30 = r4
            r16 = r8
            goto L_0x023b
        L_0x0247:
            r4 = 4372(0x1114, float:6.126E-42)
            if (r1 != r4) goto L_0x0464
            if (r3 == 0) goto L_0x0463
            androidx.recyclerview.widget.RecyclerView r1 = r0.f271411f
            if (r1 != 0) goto L_0x0253
            goto L_0x0463
        L_0x0253:
            android.os.Parcelable r1 = r3.getParcelableExtra(r15)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r1 = (com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.CaptureVideoNormalModel) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            androidx.recyclerview.widget.RecyclerView r8 = r0.f271411f
            androidx.recyclerview.widget.RecyclerView$e r8 = r8.getAdapter()
            com.tencent.mm.plugin.gallery.ui.m r8 = (com.tencent.p014mm.plugin.gallery.p473ui.C94070m) r8
            java.util.ArrayList<java.lang.String> r8 = r8.f271612h
            java.util.ArrayList<java.lang.String> r9 = r0.f271416i
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r0.f271405b1
            r10.append(r11)
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r11 = r1.mo129798a()
            java.lang.Object r7 = r11.mo129811b(r14, r7)
            r10.append(r7)
            java.lang.String r7 = ";"
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r0.f271405b1 = r7
            r7 = 0
        L_0x0290:
            if (r8 == 0) goto L_0x02be
            int r10 = r8.size()
            if (r7 >= r10) goto L_0x02be
            java.lang.Object r10 = r8.get(r7)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = r0.f271403Z0
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            boolean r11 = r10.equalsIgnoreCase(r11)
            if (r11 != 0) goto L_0x02b6
            java.lang.String r11 = r0.f271404a1
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            boolean r11 = r10.equalsIgnoreCase(r11)
            if (r11 == 0) goto L_0x02b8
        L_0x02b6:
            java.lang.String r10 = r1.f272895f
        L_0x02b8:
            r4.add(r10)
            int r7 = r7 + 1
            goto L_0x0290
        L_0x02be:
            r7 = 0
        L_0x02bf:
            if (r9 == 0) goto L_0x02ed
            int r8 = r9.size()
            if (r7 >= r8) goto L_0x02ed
            java.lang.Object r8 = r9.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = r0.f271403Z0
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            boolean r10 = r8.equalsIgnoreCase(r10)
            if (r10 != 0) goto L_0x02e5
            java.lang.String r10 = r0.f271404a1
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            boolean r10 = r8.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x02e7
        L_0x02e5:
            java.lang.String r8 = r1.f272895f
        L_0x02e7:
            r6.add(r8)
            int r7 = r7 + 1
            goto L_0x02bf
        L_0x02ed:
            java.lang.String r7 = r0.f271404a1
            com.tencent.p014mm.vfs.C86013q1.m106447h(r7)
            r7 = 9
            java.lang.String r8 = "max_select_count"
            r3.putExtra(r8, r7)
            java.lang.String r7 = "isPreviewPhoto"
            r8 = 1
            r3.putExtra(r7, r8)
            java.lang.String r7 = r0.f271403Z0
            java.lang.String r8 = "raw_photo_path"
            r3.putExtra(r8, r7)
            java.lang.String r7 = r1.f272895f
            java.lang.String r9 = "after_photo_edit"
            r3.putExtra(r9, r7)
            java.lang.String r7 = "preview_image_list"
            r3.putStringArrayListExtra(r7, r4)
            java.lang.String r4 = "preview_select_image_list"
            r3.putStringArrayListExtra(r4, r6)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = r0.f271403Z0
            r4.putString(r8, r6)
            java.lang.String r1 = r1.f272895f
            r4.putString(r9, r1)
            java.lang.String r1 = "report_info"
            r3.putExtra(r1, r4)
            r4 = -1
            if (r2 != r4) goto L_0x0518
            r2 = 1
            r0.f271399X0 = r2
            java.lang.String r2 = r3.getStringExtra(r8)
            com.tencent.mm.plugin.gallery.model.f r4 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118749i()
            java.util.ArrayList<android.os.Bundle> r4 = r4.f271161g
            java.util.Iterator r4 = r4.iterator()
        L_0x0345:
            if (r2 == 0) goto L_0x0361
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0361
            java.lang.Object r6 = r4.next()
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.String r6 = r6.getString(r8)
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x0345
            r4.remove()
            goto L_0x0345
        L_0x0361:
            com.tencent.mm.plugin.gallery.model.f r4 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118749i()
            java.util.ArrayList<android.os.Bundle> r4 = r4.f271161g
            android.os.Bundle r1 = r3.getBundleExtra(r1)
            r4.add(r1)
            java.lang.String r1 = r3.getStringExtra(r9)
            java.lang.String r4 = "tmp_photo_edit"
            java.lang.String r4 = r3.getStringExtra(r4)
            r6 = 2
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r6 = 0
            r8[r6] = r2
            r6 = 1
            r8[r6] = r1
            java.lang.String r6 = "rawEditPhotoPath:%s lastEditPhotoPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r8)
            java.util.ArrayList<java.lang.String> r6 = r0.f271413g
            if (r6 == 0) goto L_0x0518
            r6.clear()
            java.util.ArrayList r6 = r3.getStringArrayListExtra(r7)
            if (r6 == 0) goto L_0x039a
            java.util.ArrayList<java.lang.String> r7 = r0.f271413g
            r7.addAll(r6)
        L_0x039a:
            com.tencent.mm.plugin.gallery.ui.h r6 = r0.f271409e
            java.lang.Integer r7 = r0.f271418n
            int r7 = r7.intValue()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r6 = r6.mo129063k(r7)
            if (r6 != 0) goto L_0x03be
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = r0.f271418n
            r6 = 0
            r3[r6] = r4
            r4 = 1
            r3[r4] = r2
            r2 = 2
            r3[r2] = r1
            java.lang.String r1 = "item is null!!! mPosition:%s rawEditPhotoPath:%s lastEditPhotoPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r3)
            goto L_0x0518
        L_0x03be:
            r6.f162748e = r2
            r6.f162747d = r1
            r6.f162750g = r1
            r6.f162749f = r4
            java.lang.String r4 = "edit"
            r6.f162755o = r4
            java.util.HashSet r4 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118748h()
            r4.add(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "[handleVideoEditResult] rawEditPhotoPath = "
            r4.append(r7)
            r4.append(r2)
            java.lang.String r7 = ", lastEditPhotoPath = "
            r4.append(r7)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN
            r8 = 1
            boolean r4 = r4.mo119686g(r7, r8)
            if (r4 == 0) goto L_0x0425
            boolean r4 = r0.f271377I
            if (r4 == 0) goto L_0x0425
            java.lang.String r2 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118741a(r2, r1, r8)
            if (r2 == 0) goto L_0x0414
            zt3.t r4 = zt3.C119157j.f356862d
            ow1.q$$c r7 = new ow1.q$$c
            r7.<init>(r2)
            zt3.j r4 = (zt3.C119157j) r4
            r4.mo183884o(r7)
        L_0x0414:
            di3.d r2 = di3.C86312j.m106911c(r30)
            hy.o0 r2 = (p166hy.C98567o0) r2
            r4 = r29
            android.os.Bundle r4 = r3.getBundleExtra(r4)
            r7 = r28
            r2.mo137592an(r1, r4, r7)
        L_0x0425:
            com.tencent.mm.plugin.gallery.model.d$e r2 = r0.f271401Y0
            if (r2 == 0) goto L_0x0432
            com.tencent.mm.plugin.gallery.model.c r2 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118747g()
            com.tencent.mm.plugin.gallery.model.d$e r4 = r0.f271401Y0
            r2.mo128878f(r4)
        L_0x0432:
            com.tencent.mm.plugin.gallery.model.c r2 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118747g()
            ow1.s r4 = new ow1.s
            r4.<init>(r0, r3, r1)
            r0.f271401Y0 = r4
            r2.mo128873a(r4)
            com.tencent.mm.plugin.gallery.model.c r16 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118747g()
            int r18 = r6.getType()
            long r2 = r6.f162751h
            long r6 = r6.f162752i
            r22 = 0
            r23 = -1
            r17 = r1
            r19 = r1
            r20 = r2
            r24 = r6
            r16.mo128876d(r17, r18, r19, r20, r22, r23, r24)
            java.lang.String r1 = "photo_edit_back!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            goto L_0x0518
        L_0x0463:
            return
        L_0x0464:
            r4 = 4381(0x111d, float:6.139E-42)
            if (r1 != r4) goto L_0x04f6
            r4 = -1
            if (r2 != r4) goto L_0x04ea
            boolean r1 = r0.f271377I
            if (r1 == 0) goto L_0x04d8
            r1 = r27
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r7 = com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider.m119434d(r1, r1)
            android.content.Intent r1 = r31.getIntent()
            r2 = 10
            java.lang.String r3 = "key_edit_video_max_time_length"
            int r1 = r1.getIntExtra(r3, r2)
            int r1 = r1 * 1000
            r7.f272935w = r1
            r1 = 2
            r7.f272905F = r1
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo r1 = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo
            r1.<init>()
            r2 = 1
            r1.f272940d = r2
            r7.f272908I = r1
            com.tencent.mm.component.api.jumper.UICustomParam r1 = new com.tencent.mm.component.api.jumper.UICustomParam
            r1.<init>()
            java.util.Map<java.lang.String, java.lang.Boolean> r2 = r1.f266575h
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r4 = "plugin_filter"
            r2.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.Boolean> r2 = r1.f266575h
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r3 = "plugin_poi"
            r4 = r16
            r2.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.Boolean> r2 = r1.f266575h
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r3 = "plugin_tip"
            r2.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.Boolean> r2 = r1.f266575h
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r3 = "plugin_menu"
            r2.put(r3, r4)
            r7.f272927o = r1
            hh2.a r2 = hh2.C8532a.f27585a
            androidx.appcompat.app.AppCompatActivity r3 = r31.getContext()
            r4 = 4370(0x1112, float:6.124E-42)
            r5 = 2130772171(0x7f0100cb, float:1.7147453E38)
            r6 = -1
            r8 = 4
            r9 = 0
            r2.mo9446e(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x04d8:
            r1 = 22
            com.tencent.mm.plugin.gallery.model.n r2 = com.tencent.p014mm.plugin.gallery.model.C93958f.m118750j()
            int r2 = r2.f271196f
            if (r1 != r2) goto L_0x0518
            r1 = -1
            r0.setResult(r1, r3)
            r31.finish()
            return
        L_0x04ea:
            r1 = 2131832195(0x7f112d83, float:1.9297437E38)
            r2 = 1
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r1, (int) r2)
            r1.show()
            goto L_0x0518
        L_0x04f6:
            if (r3 == 0) goto L_0x0518
            boolean r2 = r31.mo128992Q7()
            if (r2 != 0) goto L_0x0518
            boolean r2 = r0.f271389S0
            if (r2 != 0) goto L_0x050a
            boolean r2 = r0.f271391T0
            if (r2 != 0) goto L_0x050a
            r2 = 4370(0x1112, float:6.124E-42)
            if (r1 == r2) goto L_0x0518
        L_0x050a:
            java.lang.String r1 = "GalleryUI_IsSendImgBackground"
            r2 = 1
            android.content.Intent r1 = r3.putExtra(r1, r2)
            r2 = -1
            r0.setResult(r2, r1)
            r31.finish()
        L_0x0518:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        Class cls = C32735h.class;
        long currentTicks = Util.currentTicks();
        boolean z2 = true;
        this.f271377I = C93958f.m118750j().f271196f == 4;
        MJTemplateHandleNew mJTemplateHandleNew = MJTemplateHandleNew.f271075d;
        this.f271393U0 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_mj_template_handle_refactor_update, true) && this.f271377I;
        super.onCreate(bundle);
        fullScreenNoTitleBar(true);
        C85875k4.m106195m0(this);
        new MMHandler().post(new C94020n(currentTicks));
        Log.m105927v("MicroMsg.ImagePreviewUI", "test oncreate: %d", Long.valueOf(Util.ticksToNow(currentTicks)));
        C98052c cVar = C98052c.f287486a;
        this.f271432y0 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_template_video_edit_enable, true);
        this.f271385Q0 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_gallery_image_edit_icon_hide, true);
        initView();
        C60960c.f173618a.mo85927k("SnsPublishProcess", "actionTrace_", 6, C60242i.ACTIONTRACE);
        boolean z3 = this.f271393U0;
        if (z3) {
            z = MJTemplateHandleNew.f271089u;
        } else {
            C98050a aVar = C98052c.f287487b;
            if (aVar == null || !aVar.f287475f) {
                z2 = false;
            }
            z = z2;
        }
        if (!z) {
            return;
        }
        if (!z3 || !this.f271377I) {
            Log.m105924i("MicroMsg.MJTemplateHandle", '[' + cVar.hashCode() + " bindPreviewUI:" + Integer.valueOf(hashCode()) + ']');
            WeakReference<ImagePreviewUI> weakReference = new WeakReference<>(this);
            C98052c.f287490e = weakReference;
            C98052c.f287488c = new C98055d(weakReference);
            return;
        }
        View findViewById = findViewById(C0966R.C0970id.glg);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mJTemplateHandleNew.mo128848a(this.f271397W0);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105925i("MicroMsg.ImagePreviewUI", "onDestroy, %s.", this);
        C60960c.f173618a.mo85927k("SnsPublishProcess", "mediaEditPageStaytime_", Long.valueOf(getActivityBrowseTimeMs()), C60242i.APPEND);
        if (C93958f.m118750j().f271196f == 3 && getIntent().getBooleanExtra("preview_image", false) && getIntent().getIntExtra("max_select_count", 0) == 1) {
            Log.m105924i("MicroMsg.ImagePreviewUI", "clear photo edit cache!");
            C93958f.m118748h().clear();
        }
        C94061h hVar = this.f271409e;
        if (hVar != null) {
            hVar.mo129067o();
            hVar.mo139421i();
            C100577n nVar = hVar.f271588w;
            nVar.f294684j = null;
            nVar.f294676b.clear();
            nVar.f294679e.clear();
            nVar.f294678d.clear();
            nVar.f294677c.clear();
            ((C101062d) nVar.f294681g).mo122812a(new C100580o(nVar));
            hVar.f271586u.clear();
            hVar.f271579n.clear();
        }
        C93958f.m118755o((ArrayList<GalleryItem$MediaItem>) null);
        ((C58849b) C86312j.m106911c(C58849b.class)).mo58069ZD().mo162892a();
        if (this.f271401Y0 != null) {
            C93958f.m118747g().mo128878f(this.f271401Y0);
        }
        if (this.f271393U0) {
            MJTemplateHandleNew.f271075d.mo128853f(this.f271397W0, false);
            return;
        }
        C98052c cVar = C98052c.f287486a;
        Log.m105924i("MicroMsg.MJTemplateHandle", "unbindPreviewUI");
        C98052c.f287490e = null;
        C98052c.f287488c = null;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo128990O7();
        return true;
    }

    public void onPause() {
        MTimerHandler mTimerHandler = this.f271429x;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        this.f271409e.mo129067o();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C60960c.f173618a.mo85927k("SnsPublishProcess", "mediaPreviewPagetimes", 1, C60242i.APPEND);
    }
}
